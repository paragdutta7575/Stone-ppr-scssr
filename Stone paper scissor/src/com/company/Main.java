package com.company;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello !! ");
        String name = "Hello , <|name|> , Good morning ,Hope you are having a good day going !!";
        System.out.println(name.replace("<|name|>","Parag Dutta"));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter A NUMBER OF YOUR CHOICE ");
        int a = sc.nextInt();
        System.out.println("Enter a : " + a);

        Double random = Math.random();
        System.out.println("enter Random number : " + random);

        System.out.println("enter your call");

        String enter = sc.next();
        System.out.println(enter.toUpperCase());


        String paper = sc.nextLine();
        String stone = "stone";
        String scissor = "scissor";

        if(paper!=stone){
            System.out.println(" you won because paper can cover stone to the most");
        }
        else if(paper!=scissor){
            System.out.println("you lose cause paper could be cut by scissor");
        }
       else if(paper==paper){
            System.out.println(" Game Draw ");
        }

       else(){
            System.out.println("You should try again ");
        }








    }
