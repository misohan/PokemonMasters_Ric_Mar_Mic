public class View{
    Card newCard;
    String colour;

    public View(Card newCard, String colour) {
        this.newCard = newCard;
        this.colour = colour;
    }

    public void displayTestCard(){
        System.out.println("This is Pokemon " + newCard.getName());
        System.out.println("It fire attack is " + newCard.getFire());
        System.out.println("It water attack is " + newCard.getWater());
        System.out.println("It leaf attack is " + newCard.getLeaf());
        System.out.println("His colour is " + colour);
    }
}