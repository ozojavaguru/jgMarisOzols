package lv.homework1;

import java.util.Scanner;

public class TriangleAreCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter triangle height");

        double height = scanner.nextDouble();

        System.out.println("Please enter triangle width");

        double width = scanner.nextDouble();

        double area = calculateArea(height, width);

        System.out.println("Triangle area is: " + area);
    }

    private static double calculateArea(double height, double width) {
        return height * width / 2;
    }

}
