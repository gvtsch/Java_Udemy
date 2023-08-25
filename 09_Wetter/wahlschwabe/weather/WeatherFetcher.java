package wahlschwabe.weather;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.NamedNodeMap;

public class WeatherFetcher {
    
    private static WeatherFetcher instance;
    private WeatherFetcher() {}

    public static WeatherFetcher getInstance() {
        if (instance == null) {
            instance = new WeatherFetcher();
        }
        return instance;
    }
    public WeatherInfo[] fetch(String city) throws Exception {
        String uri = "http://api.openweathermap.org/data/2.5/forecast?q="+city+"&mode=xml&appid=c1ca684670bc9f77f12f529089340369";

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(uri);

        NodeList times = document.getElementsByTagName("time");
        
        WeatherInfo[] weatherInfos = new WeatherInfo[times.getLength()];

        for (int x = 0; x < times.getLength(); x++) {
            Node time = times.item(x);
            NamedNodeMap timeAttributes = time.getAttributes();
            String timestamp = timeAttributes.getNamedItem("from").getNodeValue();
            NodeList children = time.getChildNodes();
            for (int y = 0; y < children.getLength(); y++) {
                Node child = children.item(y);
                if (child.getNodeName() == "temperature") {
                    String temperature = child.getAttributes().getNamedItem("value").getNodeValue();
                    Double temp = Double.parseDouble(temperature);
                    temp -= 273.15;
                    weatherInfos[x] = new WeatherInfo(timestamp, temp);
                }
            }
        }
        return weatherInfos;
    }
}
