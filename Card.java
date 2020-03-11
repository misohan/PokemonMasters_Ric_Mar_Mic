public class Card{
    private String name;
    private String fire;
    private String water;
    private String leaf;

    public String getName() {
        return this.name;
    }

    public String getFire() {
        return this.fire;
    }

    public String getWater() {
        return this.water;
    }

    public String getLeaf() {
        return this.leaf;
    }

    public Card(String name, String fire, String water, String leaf) {
        this.name = name;
        this.fire = fire;
        this.water = water;
        this.leaf = leaf;
    }

    
}