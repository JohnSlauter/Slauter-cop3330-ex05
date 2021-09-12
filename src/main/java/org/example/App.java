package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        int n1, n2;

        String stor = new String();

        Scanner s = new Scanner(System.in);

        System.out.print("What is the first number? ");

        stor = s.nextLine();

        n1 = String_to_int(stor);

        System.out.print("What is the second number? ");

        stor = s.nextLine();

        n2 = String_to_int(stor);

        System.out.print(n1 + " + " + n2 + " = " + (n1+n2) + "\n" + n1 + " - " + n2 + " = " + (n1-n2) + "\n"
                + n1 + " * " + n2 + " = " + (n1*n2) + "\n" + n1 + " / " + n2 + " = " + (n1/n2));

        s.close();

    }

    public static int String_to_int(String s){

        int res = 0;

        for(int i = 0; i < s.length(); i++){

            res += (s.charAt(i)-'0')*pow(10, s.length()-1-i);

        }

        return res;

    }

    public static int pow(int base, int exp){

        int res = 1;

        for(int i = 0; i < exp; i++){

            res *= base;

        }

        return res;

    }

}
