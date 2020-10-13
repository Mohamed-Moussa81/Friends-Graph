package friends;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FriendsDriver {
	public static void main(String[]args) throws FileNotFoundException {
			Scanner sc = new Scanner(new File("friends1.txt"));
			Graph friends  = new Graph(sc);
			System.out.println(Friends.shortestChain(friends, "sam", "aparna"));
		}

}
