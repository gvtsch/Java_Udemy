public class Player {

    private String name;
    private int numberOfCards;

    Player(String n, int c) {
        name = n;
        numberOfCards = c;
    }

    public void printPlayerInfo() {
        System.out.println(name + "(" + numberOfCards + ")");
    }

    public void playCard() {
        numberOfCards --;
    }

    public void setName(String n) { // Setter Methode
        name = n;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }
}
