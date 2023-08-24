public class Player {

    String name;
    int numberOfCards;

    Player(String n, int c) {
        name = n;
        numberOfCards = c;
    }

    public void printPlayerInfo() {
        System.out.println(name + "(" + numberOfCards + ")");
    }
}
