package com.tutorialseu.basics;
import java.util.Scanner;

public class Potion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 4: User Inputs
        System.out.print("Enter the potion name: ");
        String potionName = scanner.nextLine();

        System.out.print("Enter the amount of ingredient A: ");
        int ingredientA = scanner.nextInt();

        System.out.print("Enter the amount of ingredient B: ");
        int ingredientB = scanner.nextInt();

        System.out.print("Enter the amount of ingredient C: ");
        int ingredientC = scanner.nextInt();

        // Step 5: Calculations
        int totalIngredients = ingredientA + ingredientB + ingredientC;
        double averageAmount = totalIngredients / 3.0;
        double quality = (ingredientA * 0.5) + (ingredientB * 1.5) + (ingredientC * 2.0) + averageAmount;

        // Step 6: Ternary Operator
        String qualityDescription = (quality > 20) ? "high quality" : "low quality";

        // Step 7: Output
        System.out.println("\nYour potion, " + potionName + ", is ready!");
        System.out.println("It contains:");
        System.out.println(ingredientA + " units of ingredient A");
        System.out.println(ingredientB + " units of ingredient B");
        System.out.println(ingredientC + " units of ingredient C");
        System.out.println("The potion is " + qualityDescription + " with a quality score of " + quality + ".");

        scanner.close();
    }
}
