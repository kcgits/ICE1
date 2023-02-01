package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Kevin Barbosa Feb 1 2023
 */
import java.util.Scanner;
import java.util.Random;

public class CardTrick {
    
    public static void main(String[] args) {
        
        //hand array creation
        Card[] hand = new Card[7];
        
        //random creation
        Random random = new Random();
        
        //create boolean variable representing a card that is found, with a default of false
        boolean found = false;
        
        //fill hand
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        //create scanner 
        Scanner newScanner = new Scanner(System.in);
        
        //ask user for input of card value 
        System.out.println("Please enter a card value (1-13): ");
        
        //store user value in Int
        int userValue = newScanner.nextInt();
        
        //ask user for input of card suit 
        System.out.println("Please enter a card suit (1-4): ");
        
        //store user value in Int 
        int userSuit = newScanner.nextInt();
        
        //loop which checks if the card is found within the hand of 7
        for (Card card : hand) 
        {
            if (card.getValue() == userValue && card.getSuit().equals(Card.SUITS[userSuit - 1]));
            {
                found = true;
                break;
            }
        }

        //if else statement which either calls the printInfo method where the program will output the information
        //of the correct card that was chosen, or print a sorry that was wrong statement
        if (found) 
        {
            printInfo();
        } 
        else 
        {
            System.out.println("Sorry, that card is not in the hand.");
        }
    }

    //print info method 
    private static void printInfo() 
    {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
    }
}

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
}
        
/*
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
*/
