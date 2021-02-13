package assignment01; //project name

public class Assignment01 {

    public static void main(String[] args) { //the main method
        System.out.println("Even number from 1 to 100 are below."); //printing out the text in quotes

        for (int i = 1; i <= 100; i++) { //loop going from 1 to 100
            if (i % 2 == 0) { //if the remainder of i/2 = 0, the number is even
                System.out.println(i); // prints out only even numbers
            }
        }
    }
}
