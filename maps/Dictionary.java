package threads;

import java.util.Scanner;
import java.util.TreeMap;

public class Dictionary {

    public static void main(String[] args) {

        TreeMap<String, String> dictionary = new TreeMap<>();

        // Insert word-definition pairs into the dictionary
        dictionary.put("Apologize", "to say that you are sorry for something that you have done");
        dictionary.put("Hello", "used when you meet somebody");
        dictionary.put("Arguement", "an angry discussion between two or more people");
        dictionary.put("Pivotal", "being of crucial importance");

        // Retrieve and display the definition of a specific word
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to retrieve its definition: ");
        String word = input.nextLine();

        if (dictionary.containsKey(word)) {
            System.out.println("Definition: " + dictionary.get(word));
        } else {
            System.out.println("The word '" + word + "' is not in the dictionary.");
        }

        // Iterate through the dictionary to display all word-definition pairs in alphabetical order
        System.out.println("\n----- My Dictionary -----");
        for (String key : dictionary.keySet()) {
            System.out.println(key + ": " + dictionary.get(key));
        }

        input.close();
    }
}

/* ------------ OUTPUT --------------------------------------------------

Enter a word to retrieve its definition: 
Arguement
Definition: an angry discussion between two or more people

----- My Dictionary -----
Apologize: to say that you are sorry for something that you have done
Arguement: an angry discussion between two or more people
Hello: used when you meet somebody
Pivotal: being of crucial importance

*/