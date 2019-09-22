package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Skew.countSkew(text);
       /* FileReader stream = new FileReader(fileName);
        BufferedReader input = new BufferedReader(stream);
        String text = input.readLine();
        Skew.countSkew(text); */
    }
}
