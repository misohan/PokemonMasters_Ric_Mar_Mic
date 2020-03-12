import java.io.IOException;

public class View {
    CardParserImpl cardParser;
    
    
    public void printCard(String name, String fire, String water, String leaf) throws IOException {
        System.out.println("--------------------");
        System.out.println("|    " + name +"     |");
        System.out.println("|     Fire: " + fire+"     |" );
        System.out.println("|    Water: " + water +"     |" );
        System.out.println("|     Leaf: " + leaf+"     |" );
        System.out.println("--------------------");
    }
    
}