import java.io.IOException;
import java.util.List;



public class Main{
	public static void main(String[] args) throws IOException {
		CardParser parser = new CardParser();

		System.out.println(parser.readFileTo2DList("Cards.csv"));
		System.out.println(parser.readFileToList("Cards.csv"));
		
		
	}
	

    
}

		
		
		
		
		


