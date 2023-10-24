package P1;

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.util.Scanner;

public class re_main {

    String text;

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Prueba de menu");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");

        System.out.print("Selecciona una de las opciones (1-20): ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Opción 1");
                break;
            case 2:
                System.out.println("Opción 2");
                break;

            case 3:
                String file = "D:\\crisb\\Documents\\Programacion\\RI_UCA\\P1\\EjercicioExpresiones.txt";

                try (FileInputStream fis = new FileInputStream(file);
                        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                        BufferedReader reader = new BufferedReader(isr)) {

                    String str;
                    while ((str = reader.readLine()) != null) {
                        System.out.println(str);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Opción no válida");
        }

    }

}
