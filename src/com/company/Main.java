package com.company;

public class Main {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(5);
        printNumberInWord(9);
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2: case 3: case 4: case 5:
                System.out.println("two, three, four or five");
                break;
            default:
                System.out.println("not one, two, three, four or five");
        }
    }
}
