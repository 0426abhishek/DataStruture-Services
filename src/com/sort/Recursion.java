package com.sort;

/**
 * Method called itself is recursion.
 * n!= n*(n-1)!
 * If there will be no end point for recursive method then call stack will be full and it will throw StackOverflowError
 * If you want to test it out please comment recursiveFactorial num == 0 code.
 * Iterative run faster and use very less memory compared to recursive.
 * Because recursive pushing the method call to callStack.
 * CallStack is referred to RecursionStack.
 */

public class Recursion {

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));
    }

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 0; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
