package com.tts;
import com.sun.source.tree.WhileLoopTree;

import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

    public static int magicNum;

    public static void main(String[] args) {
        System.out.println("Hello World");

	/*AsciiChars.printNumber();
	AsciiChars.printUpperCase();
	AsciiChars.printLowerCase(); */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName = scanner.next();
        System.out.println("Hello "
                + firstName + "!");
        System.out.print("Do you wish to continue:Yes(Y) or No(N): ");     // type a word and hit enter
        String check = scanner.next();


        if (check.equalsIgnoreCase("Yes") || check.equalsIgnoreCase("Y")) {
            System.out.println("Lets go ahead");

            /*System.out.println("Do you have a red car?(yes,no):");
            String carCheck = scanner.next();
            if (carCheck.equalsIgnoreCase("yes")) {

            }*/
            System.out.println("What is the name of your favorite pet?");
            String petFav = scanner.next();

            System.out.println("Enter the age of your pet?");
            int petAge = scanner.nextInt();


            // //Generate magic ball number using Fav Quarter back or lucky number
            System.out.println("What is the your lucky number?");
            int numLucky = scanner.nextInt();

            /*====== Magic ball number first==== */
            //Generate magic ball number using Fav Quarter back
            System.out.println("Do you have a favorite quarterback,type y(yes) or n(no)");
            String favQB = scanner.next();
            if (favQB.equalsIgnoreCase("yes") || favQB.equalsIgnoreCase("y")) {
                System.out.println("What is their Jersey Number:");
                int jNum = scanner.nextInt();
                Random rand = new Random();
                int rand_int1 = rand.nextInt(50);
                System.out.println(rand_int1);

                //generate magic ball num using jersey number
                magicNum = jNum * rand_int1;
                System.out.println("Magic number generated :" + magicNum);

                int i = 0;
                while (magicNum > 75) {
                    magicNum = magicNum - 75;
                    i++;
                    System.out.println(i);
                }
                System.out.println("Your Grand magic ball number is :" + magicNum);
            } else if (favQB.equalsIgnoreCase("no") || favQB.equalsIgnoreCase("n")) {
                System.out.println("Lets try generating your magic ball number using your lucky number");
                Random rand = new Random();
                int rand_int2 = rand.nextInt(50);
                System.out.println(rand_int2);
                int magicNum = numLucky * rand_int2;
                System.out.println("Magic number generated :" + magicNum);

                int j = 0;
                while (magicNum > 75) {
                    magicNum = magicNum - 75;
                    j++;
                    System.out.println(j);
                }
                System.out.println("Your Grand magic ball number is :" + magicNum);

            } else {
                System.out.println("Please enter either jersey number or your lucky number");
                scanner.close();
            }

            /*====Second Lottery Number generated using Model Year and Lucky number */
            System.out.println("Enter last two digits of Year in 'YY' format");

            SimpleDateFormat sdf = new SimpleDateFormat();
            int modelCarNum = scanner.nextInt();
            boolean isDoubleDigit;
            isDoubleDigit = (modelCarNum > 9 && modelCarNum < 100);
            int num2 = modelCarNum + numLucky;
            if (isDoubleDigit == true) {
                if (!(num2 > 65)) {
                    System.out.println("Second lottery number generated " + num2);
                } else if (isDoubleDigit == false) {
                    System.out.println("Can only accept last two digits of the year");
                    scanner.close();
                }


//                /*String yearString = Integer.toString(year).substring(2);
//                 modelCarNum= Integer.parseInt(yearString);*/

           /* System.out.println("Who is your favorite actor/actress?(first name):");
            String favAct = scanner.next();

            System.out.println("Enter a random number(between 1 n 50)?:");
            int numRandom = scanner.nextInt(); */

                //Generate one lottery number using petname to integer value
                int len = petFav.length();
                char a = petFav.charAt(2);
                System.out.println("the third letter of your favorite pet is :" + a);
                int num1 = (int) a;

                int k =0;
                while (num1 > 65) {
                    num1 = num1 - 65;
                    k++;
                    System.out.println(k);
                }

                System.out.println("Your lotto number 1: " + num1);
                System.out.println("Lotto number 2:"  + num2);
                System.out.println("Magic ball number :" + magicNum);
            }
        }
        else {
                if (check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
                    System.out.println("Please come back later to complete the survey");
                    scanner.close();
                } else
                    System.out.println("Invalid input, please enter Yes(Y) or No(N)");
            }

        }

    }







