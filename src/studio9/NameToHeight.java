package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// FIXME
		Map<String, Integer> mapNameToHeight = new HashMap<String, Integer>();
		mapNameToHeight.put("Rachel", 63);
		mapNameToHeight.put("Ari", 61);
		mapNameToHeight.put("Maya", 65);
		mapNameToHeight.put("Ally", 64);
		System.out.println("What is their name?");
		String name = in.next();
		//String name = in.next("What is their name?");
		while(name != null) {
			if(!mapNameToHeight.containsKey(name)) {
				System.out.println("No Such Person");
			}
			System.out.println(name + "'s height is: " + mapNameToHeight.get(name));
			System.out.println("What is their name?");
			name = in.next();
		}
		//throw new NotYetImplementedException();

	}
}
