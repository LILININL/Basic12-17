package com.company;

import java.util.Scanner;

public class Main {
    /*public static void multiplicationTable(int n) {
            for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
            }
            }
    public static void printChar() {
            for (char c = 'A'; c <= 'Z'; c++) {
            System.out.printf("%c", c);
            }
            }
        public static void main(String[] args) { multiplicationTable(5); printChar();
        }
    }
    /*public static void printCharBetter(char fromCh, char toCh) {
            for (char c = fromCh; c <= toCh; c++) { System.out.printf("%d %04X %c\n", (int)c, (int)c, c);
            }
            }
    public static void printChar2() {
            for (int c = 65; c <= 90; c++)
            {
            System.out.printf("%d -> %c\n", c, (char)c); }
            }
    public static void main(String[] args) {
            printCharBetter('ก','ฮ');
            printChar2();
            }
            }*/
/*public static void main(String[] args){
        int a = 1; while(true){System.out.print(a + " "); a++;
        if(a==10)break;
        }}}
        */
       /* public static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number: "); int n = 0; int result = 0; // 2 3 4 -1
        while (n != -1) { result += n; n = in.nextInt(); } System.out.println(result);
}
        public static void main(String[] args) { sum();
        }}*/
    public static void saving() {
        float deposit = 100.0f;
        float rate = .05f;
        int years = 1;
        float balance = deposit * (1 + rate);
        while (balance <= 200.0f) {
            System.out.printf("end of year: %d balance = %.2f\n", years, balance);
            balance = balance * (1 + rate);
            years++;
        }
        System.out.printf("end of year: %d balance = %.2f\n", years, balance);
    }

    public static int saving2(float deposit, float rate, float targetAmount) {
        int years = 1;
        float balance = deposit * (1 + rate);
        while (balance <= targetAmount) {
            System.out.printf("end of year: %d balance = %.2f\n", years, balance);
            balance = balance * (1 + rate);
            years++;
        }
        System.out.printf("end of year: %d balance = %.2f\n", years, balance);
        return years;
    }

    public static void main(String[] args) {
        int n = saving2(100.0f, .05f, 150.0f);
        System.out.printf("years needed = %d", n);
    }
}