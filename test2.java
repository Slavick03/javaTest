import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class test2 {
    public static void main(String[] args) throws IOException { 
              
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   
        String userInput = reader.readLine();
        int user = Integer.parseInt(userInput);
        if (user % 2 == 0){
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
 }

