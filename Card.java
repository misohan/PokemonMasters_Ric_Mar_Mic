public class Card{
    private String name;
    private int fire;
    private int water;
    private int leaf;

    public Card(String name, int fire, int water, int leaf) {
        this.name = name;
        this.fire = fire;
        this.water = water;
        this.leaf = leaf;
    }


    public String getName() {
        return this.name;
    }

    public int getFire() {
        return this.fire;
    }

    public int getWater() {
        return this.water;
    }

    public int getLeaf() {
        return this.leaf;
    }

}