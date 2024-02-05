/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Mayhansh Kaplsh
 * Student Id 991717781
 */
public class CardTrick {
    
    public static void main(String[] args)
    {Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random random = new Random();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i]=c;


            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert value for card");
        int userValue=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the suit");
        String userSuit = sc.nextLine();
        sc.close();
        
        Card userCard = new Card();
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);
        System.out.println(userCard);

        Card magicCard = new Card();
        magicCard.setValue(11);
        magicCard.setSuit("Clubs");
     
        for (Card hand1 : magicHand) {
            
            System.out.println(hand1);
            if (userCard.getSuit()==hand1.getSuit()){
                if (userCard.getValue()==hand1.getValue()){
                    
                printInfo();
                break;
                }
            }
        }
        
        
    }
        
        private static void printInfo() {
            System.out.println("You guessed it right");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
