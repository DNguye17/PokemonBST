
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



/**
 * @author Delaware Technical Community College
 * Binary Search Tree Assignment starter code
 * 
 * NO Changes are needed in the readPokemonCSV
 *
 */

public class Part1PokemonBST {
	static PokemonBST myPokemonTree = new PokemonBST();
	public static void main(String[] args) { 
		//TODO: Add code in the main method to perform desired tests
		readPokemonCSV();
		myPokemonTree.inorder();
		Pokemon found = myPokemonTree.findPokemon("Xatu");
		System.out.println(found);

	} 
	
	static void readPokemonCSV() {
		// The following is adapted from Example 1. Using Buffered Reader and String.split() from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/
		BufferedReader br = null;
		int pokemonCount = 0;
		try
		{
			//Reading the csv file
			br = new BufferedReader(new FileReader("pokemon.csv"));

			//Create List for holding Pokemon objects
			//List<Pokemon> pokemonList = new ArrayList<Pokemon>();

			String line = "";
			//Read to skip the header
			br.readLine();
			//Reading from the second line
			while ((line = br.readLine()) != null) 
			{
				String[] pokemonDetails = line.split(",");
				// When the string is split, it will result in an array with the following information in the corresponding index
				// 0 - #
				// 1 - Name
				// 2 - Type1
				// 3 - Type2
				// 4 - Total
				// 5 - HP
				// 6 - Attack
				// 7 - Defense
				// 8 - Sp. Atk
				// 9 - Sp. Def
				// 10 - Speed
				// 11 - Generation
				// 12 - Legendary
				// *Note that pokemonDetails is an array of strings, so it must be cast to the appropriate data type when used in your program

				if(pokemonDetails.length > 0 )
				{
					//Create a temporary pokemon
					Pokemon tempPokemon = new Pokemon();

					tempPokemon.setName(pokemonDetails[1]);
					tempPokemon.setSpeed(Integer.valueOf(pokemonDetails[10]));
					tempPokemon.setTotal(Integer.valueOf(pokemonDetails[4]));

					// Now we use the insert method in the BST to add in our pokemon
					myPokemonTree.insert(tempPokemon);
				}
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(IOException ie)
			{
				System.out.println("Error occured while closing the BufferedReader");
				ie.printStackTrace();
			}
		}
		// End of code adapted from Example 1. Using Buffered Reader and String.split() from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/

	}
}