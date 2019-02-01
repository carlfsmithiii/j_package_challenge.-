package com.example.cfsmith;

import java.util.function.IntUnaryOperator;

public class Main {

    public static void main(String[] args) {

        System.out.println("sums: ");
        displayFunctionResults(Series::nSum);

        System.out.println("factorial: ");
        displayFunctionResults(Series::factorial);

        System.out.println("fibonacci: ");
        displayFunctionResults(Series::fibonnaci);
    }

    private static void displayFunctionResults(IntUnaryOperator func) {
        StringBuilder builder = new StringBuilder(40);
        for (int i = 0; i <= 10; i++) {
            builder.append(func.applyAsInt(i));
            if (i < 10) {
                builder.append(", ");
            } else {
                builder.append(".\n");
            }
        }
        System.out.println(builder.toString());
    }
}
