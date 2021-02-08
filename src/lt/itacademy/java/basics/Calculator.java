package lt.itacademy.java.basics;

import java.util.Scanner;

//11 uzdavinys
public class Calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        executeCalculator(userInput);
    }

    public static void executeCalculator(Scanner userInput) {
        boolean runCalculator = true;

        while (runCalculator) {
            System.out.println("Hello! Which figure you choose to calculate? If TRIANGLE, press T, if RECTANGLE, press R, if SQUARE, press S");

            String figure = userInput.nextLine();
            System.out.println("You chose: " + figure);

            figureChooser(figure, userInput);

            System.out.println("Would you want to calculate again? Y / N");

            String repeatChoice = userInput.nextLine();
            if (repeatChoice.equals("N")) {
                runCalculator = false;
                System.out.println("Bye Bye!!");
            }
        }
    }

    public static void figureChooser(String figure, Scanner userInput) {
        switch (figure) {
            case "T":
            case "t":
                chooseFigureT(userInput);
                break;
            case "R":
            case "r":
                chooseFigureR(userInput);
                break;
            case "S":
            case "s":
                chooseFigureS(userInput);
                break;
            default:
                System.out.println("Wrong input! Values are incorrect!");
        }
    }

    public static void chooseFigureT(Scanner userInput) {
        System.out.println("Enter triangle base length: ");
        int base = validateNumber(userInput);
        System.out.println("Enter triangle side1 length: ");
        int side1 = validateNumber(userInput);
        System.out.println("Enter triangle side2 length: ");
        int side2 = validateNumber(userInput);
        System.out.println("Enter triangle height: ");
        int height = validateNumber(userInput);
        System.out.println("Triangle area is: " + triangleArea(base, height));
        System.out.println("Triangle perimeter is: " + trianglePerimeter(base, side1, side2));
    }

    public static void chooseFigureR(Scanner userInput) {
        System.out.println("Enter rectangle side1 length: ");
        int side1 = validateNumber(userInput);
        System.out.println("Enter rectangle side2 length: ");
        int side2 = validateNumber(userInput);
        System.out.println("Rectangle area is: " + rectangleArea(side1, side2));
        System.out.println("Rectangle perimeter is: " + rectanglePerimeter(side1, side2));
    }

    public static void chooseFigureS(Scanner userInput) {
        System.out.println("Enter square side length: ");
        int side = validateNumber(userInput);
        System.out.println("Square area is: " + squareArea(side));
        System.out.println("Square perimeter is: " + squarePerimeter(side));
    }

    public static int validateNumber(Scanner userInput) {
        String userValue = userInput.nextLine();
        int value = TryParseInt(userValue);
        boolean badNumber = true;
        while (badNumber) {
            if (value > 0) {
                badNumber = false;
            } else {
                System.out.println("You entered wrong! Please enter positive number!");
                userValue = userInput.nextLine();
                value = TryParseInt(userValue);
            }
        }

        return value;
    }

    public static int TryParseInt(String value) {
        try {
            int parsedValue = Integer.parseInt(value);
            return parsedValue;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int trianglePerimeter(int edge1, int edge2, int edge3) {
        return edge1 + edge2 + edge3;
    }

    public static int rectanglePerimeter(int edge1, int edge2) {
        return (edge1 + edge2) * 2;
    }

    public static int squarePerimeter(int edge) {
        return edge * 4;
    }

    public static int triangleArea(int edge, int stat) {
        return (edge * stat) / 2;
    }

    public static int rectangleArea(int edge1, int edge2) {
        return edge1 * edge2;
    }

    public static int squareArea(int edge) {
        return edge * edge;
    }
}
