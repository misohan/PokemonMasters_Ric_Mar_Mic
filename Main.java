public class Main{
    public static void main(String[] args) {
        Card newCard = new Card("Chardmander", 78, 15, 23);
        View newView = new View(newCard, "red");
        newView.displayTestCard();
    }
}