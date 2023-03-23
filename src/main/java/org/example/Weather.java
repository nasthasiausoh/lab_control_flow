package org.example;
import java.util.Scanner; // Importing the scanner package
public class Weather {
    public static void main(String[] args) {

//        Prompt a user to input the current weather conditions
        System.out.println(" Is it Rainy, Sunny, Cloudy or Snowy?" +
                " Also please input the average temperature");

// Create a scanner for weather conditions
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();


        //        Create a scanner for average temperature for the day
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();


        String rainy = weather.equals("Rainy") ? "It is raining. Bring an umbrella" : "";
        System.out.println(rainy);

        String sunny = weather.equals("Sunny") ? "It is sunny. Wear a sunhat and sunglasses" : "";
        System.out.println(sunny);

        String cloudy = weather.equals("Cloudy") ? "It is cloudy. Wear a light jacket" : "";
        System.out.println(cloudy);

        String snowy = weather.equals("Snowy") ? "It is snowy. Wear a thick coat, hat, scarf, and gloves" : "";
        System.out.println(snowy);

        if (temperature <= 1 ) {
            System.out.println("It is freezing: Wear a thick coat, hat, scarf, and gloves");

        } else if (temperature >= 2 && temperature <= 14) {
            System.out.println("It is cold: Wear a coat");

        } else if (temperature >= 14 && temperature <= 19) {
            System.out.println("It is warm: No need for a coat. A light jacket is advisable.");
        } else {
            System.out.println("It is hot: No need for a coat/jacket.");
        }
    }
}
