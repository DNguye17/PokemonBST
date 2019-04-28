/*Dustin Nguyen
 * Monday, April 15
 * CIS 211-401
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Delaware Technical Community College
 * Starter code
 *
 */
public class Part2HashMap {
	static Pokemon pokemon[] = new Pokemon[800];
	static HashMap<String, Pokemon> pokemonHashMap = new HashMap<>();
	
	public static void main(String[] args) {
		readPokemonCSV();
		
		// TODO: Write test code to retrieve a few pokemon by name
		// Tried various different pokemon, able to retrieve various named pokemon from the csv as well as their speed.

		System.out.println("Retrieved Pokemon: " + pokemonHashMap.get("Darkrai"));
		System.out.println("Retrieved Pokemon: " + pokemonHashMap.get("Infernape"));
		System.out.println("Retrieved Pokemon: " + pokemonHashMap.get("Piplup"));
		System.out.println("Retrieved Pokemon: " + pokemonHashMap.get("Palkia"));
		System.out.println("Retrieved Pokemon: " + pokemonHashMap.get("Dialga"));
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

					pokemon[pokemonCount++] = tempPokemon;
					// TODO: instead of saving pokemon objects into an array
					// save them into a HashMap
					// *Saves the pokemon for the test hashmap
					pokemonHashMap.put(pokemonDetails[1],tempPokemon);
					//pokemonHashMap.put(key, value)
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
