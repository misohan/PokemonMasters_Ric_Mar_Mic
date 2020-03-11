public class View{
    Card newCard;
    String colour;

    public View(Card newCard, String colour) {
        this.newCard = newCard;
        this.colour = colour;
    }

    public void displayTestCard(){
        System.out.println("This is Pokemon " + newCard.getName());
        System.out.println("🔥 Fire attack: " + newCard.getFire());
        System.out.println("💧 Water attack: " + newCard.getWater());
        System.out.println("🌿 Leaf attack: " + newCard.getLeaf());
        System.out.println("Its " + colour);
    }
}