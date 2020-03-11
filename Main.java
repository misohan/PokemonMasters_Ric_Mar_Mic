import java.io.IOException;



public class Main{
	public static void main(String[] args) throws IOException {
		CardParser parser = new CardParser();
		View view = new View();
		int index = 1;
		Card newCard = new Card(parser.getName(index), parser.getFire(index), parser.getWater(index), parser.getLeaf(index));
		
		
		view.printCard(newCard.getName(),newCard.getFire(),newCard.getWater(),newCard.getLeaf());

		

		
		
		
		
		
		
	}
	

    
}

		
		
		
		
		


