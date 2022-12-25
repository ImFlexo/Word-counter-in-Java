
package word.counter;

import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your paragraph: ");
        String userInput = sc.nextLine();
        sc.close();
        
        userInput = userInput.trim();
        
        int wordCount = 0;
        
        if(userInput.length() == 0){
        wordCount = 0;
        
        }
      
        else{
        wordCount++;
        
        for(int i = 0; i < userInput.length(); i++){
                if(userInput.charAt(i) == ' ' && userInput.charAt(i + 1) != ' ') {
                
                wordCount++;
                }
        
        }
        
        }
        System.out.println("Word count: " + wordCount);
    }
    
}
