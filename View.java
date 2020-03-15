import java.io.IOException;
import java.util.List;

public class View extends CardParserImpl {
    CardParserImpl cardParser;
    
    
    public void printCard(List<String> card) throws IOException {
        String name = card.get(0);
        String fire = card.get(1);
        String water = card.get(2);
        String leaf = card.get(3);
        System.out.println("--------------------");
        System.out.println("|    " + name +"     |");
        System.out.println("|     Fire: " + fire+"     |" );
        System.out.println("|    Water: " + water +"     |" );
        System.out.println("|     Leaf: " + leaf+"     |" );
        System.out.println("--------------------");
    }
    
}