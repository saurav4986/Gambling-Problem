package com.bridgeLabz;
/*(UC2-Game_Start)
As a Gambler make $1 bet
so either win or loose $1*/

public class Gambling {
    static int STAKE = 100;
    static int BET = 1;
    public static void main(String[] args) {
        System.out.println("!!!Welcome to the world of Gambling!!!");
        int result;
        int opt = (int) (Math.random() * 2);

        System.out.println("Your Initial Balance: $"+STAKE);
        if (opt == 1){
            System.out.println("You Won the Game");
            result = STAKE + BET;
        }
        else {
            System.out.println("You Lost the Game");
            result = STAKE - BET;
        }
        System.out.println("Your Final Balance: $"+result);
    }
}