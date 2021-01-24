package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        int scorePlayer=0;
        int scoreNpc=0;

        while (scorePlayer!=3 && scoreNpc!=3){

           switch (gameround(PlayerChoice(), random.nextInt(3)+1)){
               case 1:
                   scorePlayer++;
                   break;
               case 2:
                   scoreNpc++;
                   break;
           }
            System.out.println("Player score : "+scorePlayer+"  Npc Score :"+scoreNpc);
        }
    }

    public  static  int PlayerChoice(){
        Scanner input= new Scanner(System.in);
        int choice;
        do {
            System.out.println("1 for Rock");
            System.out.println("2 for Paper");
            System.out.println("3 for Scissor");
            System.out.println("Make a selection :");
            choice=input.nextInt();
        }while (choice>3 || choice<1);

        return choice;
    }



    public  static  String playersSelection(int choice){
        String object=null;
        switch (choice){
            case 1:
                object="Rock";
                break;
            case 2:
                object="Paper";
                break;
            case 3:
                object="Scissor";
                break;
        }
        return  object;
    }

    public static int gameround(int playerChoice, int npcChoice){
        int result;
        System.out.println("Your choice is : "+playersSelection(playerChoice)+ "npc choice is " +playersSelection(npcChoice));

        if (playerChoice==1&&npcChoice==3 || playerChoice==2&&npcChoice==1 || playerChoice==3 && npcChoice==2){
            System.out.println("Your win this round");
            result=1;
        }else if (playerChoice==npcChoice){
            System.out.println("It's a draw no winner");
            result =0;
        }else {
            System.out.println("Lost round this round! the npc wins");
            result=2;
        }

        return result;
    }
}
