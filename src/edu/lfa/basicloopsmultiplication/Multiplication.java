/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.basicloopsmultiplication;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, end, count = 0, sum = 0, b = 0;

        System.out.println(" Enter a number upto your desire ");
        end = scanner.nextInt();
        /*System.out.println(" Ending point");
        end = scanner.nextInt();
         */
        do {
            for (int i = 1; i <= end; i++) {
                for (int j = 1; j <= 10; j++) /* for(int k = timesTable; k <=end ; k++)*/ {
                    total = i * j;
                    System.out.println(i + " * " + j + " = " + total);
                    ++count;
                    sum = total + b;
                    b = sum;
                }

            }
            System.out.println("Total sum " + sum);

        } while (count <= end);

    }
}
