package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is the quote?" );
        String quote = input.nextLine(); //Input
        System.out.print("Who said it?");
        String person = input.nextLine();//Input
        String concat = (person + " says " + "\"" + quote + ".\"" );
        System.out.println(concat); //Output


    }
}
