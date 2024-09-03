package org.example;

public class Main {
    public static void main(String[] args) {
        pattern11(5);
    }

    /**
     * * * * * *
     * * * * * *
     * * * * * *
     */
    private static void pattern1(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    /**
     * *
     * * *
     */
    private static void pattern2(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }


    /**
     * * * *
     * * *
     * *
     */
    private static void pattern3(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    /**
     * 1
     * 1 2
     * 1 2 3
     */
    private static void pattern4(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    /**
     * *
     */
    private static void pattern5(int rows) {
        for (int i = 0; i <= rows; i++) {
            if (i < rows / 2) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int j = rows - i - 1; j > 0; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }

    /**
     * *
     * * *
     * * * *
     */
    private static void pattern6(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /**
     * * * * *
     * * * *
     * * *
     * *
     */
    private static void pattern7(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = rows - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /**
     * *
     * ***
     * *****
     */
    private static void pattern8(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print("**");
            }
            System.out.println();
        }

    }

    /**
     *          *****
     *           ***
     *            *
     */
    private static void pattern9(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < rows-i; j++) {
                System.out.print("**");
            }
            System.out.println();

        }

    }


    /**
     *          *
     *         * *
     *        * * *
     */
    private static void pattern10(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    /**
     *         * * *
     *          * *
     *           *
     */
    private static void pattern11(int rows) {
        for (int i = 0; i <=rows ; i++) {
            for (int j = i; j >0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows-i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}