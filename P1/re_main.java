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
        int opcion = 0;
        do {

            System.out.println("");
            System.out.println("-----*****-----*****-----*****-----*****");
            System.out.println("1. Ejercicio 1.");
            System.out.println("2. Ejercicio 2.");
            System.out.println("3. Ejercicio 3.");
            System.out.println("4. Ejercicio 4.");
            System.out.println("5. Ejercicio 5.");
            System.out.println("6. Ejercicio 6.");
            System.out.println("7. Ejercicio 7.");
            System.out.println("8. Ejercicio 8.");
            System.out.println("9. Ejercicio 9.");
            System.out.println("10. Ejercicio 10.");
            System.out.println("11. Ejercicio 11.");
            System.out.println("12. Ejercicio 12.");
            System.out.println("13. Ejercicio 13.");
            System.out.println("14. Ejercicio 14.");
            System.out.println("15. Ejercicio 15.");
            System.out.println("16. Ejercicio 16.");
            System.out.println("17. Ejercicio 17.");
            System.out.println("18. Ejercicio 18.");
            System.out.println("19. Ejercicio 19.");
            System.out.println("20. Ejercicio 20.");
            System.out.println("21. Salir.");
            System.out.println("-----*****-----*****-----*****-----*****");
            System.out.println("");

            System.out.print("Selecciona una de las opciones (1-21): ");
            opcion = sc.nextInt();

            switch (opcion) {

                /* Comprobar si una cadena empieza por abc */
                case 1:
                    System.out.println("Opción 1");

                    break;

                /* Comprobar si una cadena empieza por abc o Abc */
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
                    System.out.println("");
            }

        } while (opcion < 21);

    }

}
