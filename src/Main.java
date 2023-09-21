/*
Y11 CS Quiz 2.1.
Author: Emily Ma
Date: 2023-09-21
 */
public class Main {

    //1. add
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    //2. greeting
    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }

    //3. add
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int sumAB = add(numOne, numTwo);
        int sumCD = add(numThree, numFour);
        return add(sumAB, sumCD);
    }

    //4. printMe
    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }

    public static void main(String[] args) {
        //1. Store & print add method
        int resultOne = add(10,13);
        System.out.println(resultOne);

        //2. Store & print greeting method
        String resultTwo = greeting("Emily");
        System.out.println(resultTwo);

        //3. Store & print add method
        int resultThree = add(1,1,1,1);
        System.out.println(resultThree);

        //4. Call printMe method
        printMe("Thanks! Have a good day!");

    }

}
