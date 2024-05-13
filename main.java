import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class main {
    public static void main(String[] args) {
        try {
            File myObj = new File("valid-wordle-words.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.charAt(data.length()-1)=='n'){
                    if((data.charAt(0)=='c')&&(data.charAt(1)=='u')&&(data.charAt(3)=='i')) //add word conditions in here, try 3 or 4 times to find conditions.
                    System.out.println(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}