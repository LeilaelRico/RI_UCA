package P1;

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.nio.charset.StandardCharsets;

import java.util.Scanner;

public class re_main {

    String text;

    public static void main(String[] arg) {

        /*
         * Lectura del archivo html
         * IMPORTANTE: Cambiar el path al documento correspondiente.
         */
        String file = "";
        StringBuilder contentBuilder = new StringBuilder();
        String content;

        try (FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr)) {

            String str;
            while ((str = reader.readLine()) != null) {
                contentBuilder.append(str).append('\n');
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        content = contentBuilder.toString();

        /*
         * Lectura del txt
         * IMPORTANTE: Cambiar el path al documento correspondiente.
         */
        String filetxt = "";
        StringBuilder contentBuildertxt = new StringBuilder();
        String contenttxt;

        try (FileInputStream fis = new FileInputStream(filetxt);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr)) {

            String str;
            while ((str = reader.readLine()) != null) {
                contentBuildertxt.append(str).append('\n');
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        contenttxt = contentBuildertxt.toString();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

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
        System.out.println("16. Ejercicios 16 - 20.");
        System.out.println("17. Salir.");
        System.out.println("-----*****-----*****-----*****-----*****");
        System.out.println("");

        do {
            System.out.println("-----*****-----*****-----*****-----*****");
            System.out.println("");
            System.out.print("Selecciona una de las opciones (1-17): ");
            opcion = sc.nextInt();

            switch (opcion) {

                /* Comprobar si una cadena empieza por abc */
                case 1:

                    String cadena = "abc123";

                    Pattern pat = Pattern.compile("^abc.*");
                    Matcher mat = pat.matcher(cadena);

                    if (mat.matches()) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }

                    break;

                /* Comprobar si una cadena empieza por abc o Abc */
                case 2:

                    String cadena2 = "Abc456";

                    Pattern pat2 = Pattern.compile("^(abc|Abc).*");
                    Matcher mat2 = pat2.matcher(cadena2);

                    if (mat2.matches()) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }

                    break;

                /* Comprobar si una cadena no empieza por un dígito */
                case 3:

                    String cadena3 = "1abc";

                    Pattern pat3 = Pattern.compile("^\\d.*");
                    Matcher mat3 = pat3.matcher(cadena3);

                    if (mat3.matches()) {
                        System.out.println("Empieza por un dígito.");
                    } else {
                        System.out.println("NO empieza por un dígito.");
                    }

                    break;

                /* Comprobar si una cadena no acaba con un dígito */
                case 4:

                    String cadena4 = "abc123";

                    Pattern pat4 = Pattern.compile(".*\\d$");
                    Matcher mat4 = pat4.matcher(cadena4);

                    if (mat4.matches()) {
                        System.out.println("Termina con un dígito.");
                    } else {
                        System.out.println("NO termina con un dígito.");
                    }

                    break;

                /* Comprobar si una cadena solo contiene los caracteres l o a */
                case 5:

                    String cadena5 = "lalaba";

                    Pattern pat5 = Pattern.compile(".*^(a|l)*$");
                    Matcher mat5 = pat5.matcher(cadena5);

                    if (mat5.matches()) {
                        System.out.println("La cadena está formada únicamente por l o a.");
                    } else {
                        System.out.println("La cadena no repite los mismos caracteres.");
                    }

                    break;

                /* Comprobar si una cadena contiene un 2 y ese no está seguido por un 6 */
                case 6:

                    String cadena6 = "46427565";

                    Pattern pat6 = Pattern.compile(".*2(?=6).*");
                    Matcher mat6 = pat6.matcher(cadena6);

                    if (mat6.matches()) {
                        System.out.println("Al 2 LE SIGUE un 6.");
                    } else {
                        System.out.println("El 2 NO es seguido de un 6.");
                    }

                    break;

                /*
                 * Comprobar si una cadena está formada por un mínimo de 5 letras mayúsculas o
                 * minúsculas y un máximo de 10
                 */
                case 7:

                    String cadena7 = "asdfghjkluy";

                    Pattern pat7 = Pattern.compile("[a-z]{5,10}?|[A-Z]{5,10}?");
                    Matcher mat7 = pat7.matcher(cadena7);

                    if (mat7.matches()) {
                        System.out.println("Cumple con una de las condiciones.");
                    } else {
                        System.out.println("No cumple con las condiciones.");
                    }

                    break;

                /*
                 * Comprobar si una cadena es una dirección web que comience por www y sea de un
                 * servidor español
                 */
                case 8:

                    String cadena8 = "www.wikimedia124.es";

                    Pattern pat8 = Pattern.compile("^(www.).*(.es)$");
                    Matcher mat8 = pat8.matcher(cadena8);

                    if (mat8.matches()) {
                        System.out.println("Se trata de una página con servidor español.");
                    } else {
                        System.out.println("No cumple con las condiciones de la página.");
                    }

                    break;

                /*
                 * Comprobar si una cadena es una fecha dd/mm/yy. Comprueba que tu patrón
                 * coincida con las siguientes fechas: 25/10/83, 4/11/56, 30/6/71 y 4/3/85
                 */
                case 9:

                    String cadena9 = "4/3/85";

                    Pattern pat9 = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/\\d{2}$");
                    Matcher mat9 = pat9.matcher(cadena9);

                    if (mat9.matches()) {
                        System.out.println("La fecha es válida.");
                    } else {
                        System.out.println("La fecha es inválida.");
                    }

                    break;

                /*
                 * Comprobar si una cadena contiene una dirección IP. Comprueba que tu patrón
                 * coincida con las siguientes IP: 192.168.1.1, 200.36.127.40 y 10.128.1.253
                 */
                case 10:

                    String cadena10 = "10.128.1.253";

                    Pattern pat10 = Pattern.compile(
                            "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
                    Matcher mat10 = pat10.matcher(cadena10);

                    if (mat10.matches()) {
                        System.out.println("La dirección IP es válida.");
                    } else {
                        System.out.println("La dirección IP NO es válida.");
                    }

                    break;

                /*
                 * ¿Qué expresión regular utilizarías para comprobar si un número de teléfono
                 * fijo es español?
                 */
                case 11:

                    String cadena11 = "+34 65 6030466";

                    Pattern pat11 = Pattern.compile("^(\\+34)\\s[9|8|6|7][0-9]\\s[0-9]{7}");
                    Matcher mat11 = pat11.matcher(cadena11);

                    if (mat11.matches()) {
                        System.out.println("SI es un número español.");
                    } else {
                        System.out.println("NO es un número español.");
                    }

                    break;

                /*
                 * ¿Qué expresión regular utilizarías para comprobar el número de pedido de una
                 * empresa?
                 */
                case 12:

                    String cadena12 = "a#54-1111";

                    // Pattern pat12 =
                    // Pattern.compile("^[a-z|A-Z][\\s|\\-|\\#|\\#\\s][\\d]{2}[\\s|\\-]?[\\d]{4,5}?");
                    Pattern pat12 = Pattern.compile("^[a-z|A-Z][\\s|\\-|\\#][\\s]?[\\d]{2}[\\s|\\-]?[\\d]{4,5}?");
                    Matcher mat12 = pat12.matcher(cadena12);

                    if (mat12.matches()) {
                        System.out.println("El ID es válido.");
                    } else {
                        System.out.println("El ID NO es válido.");
                    }

                    break;

                /*
                 * Para evitar el spam, intenta localizar posibles alteraciones que se utilizan
                 * para saltarse los filtros de correo.
                 */
                case 13:
                    String cadena13 = "v1@gr@";

                    Pattern pat13 = Pattern.compile("v[i!1][a@]gr[a@]");
                    Matcher mat13 = pat13.matcher(cadena13);

                    if (mat13.matches()) {
                        System.out.println("ES SPAM.");
                    } else {
                        System.out.println("NO ES SPAM.");
                    }

                    break;

                /* Imágenes de la página web de la UCA */

                case 14:

                    Pattern pat14 = Pattern.compile("\\<(img).*\\>");
                    Matcher mat14 = pat14.matcher(content);

                    int count = 1;
                    while (mat14.find()) {
                        count += 1;
                    }

                    System.out.print("El portal cuenta con ");
                    System.out.print(count);
                    System.out.println(" imágenes.");

                    break;

                /*
                 * Extracción de caracteres de una cadena
                 * Con el regex "\\<[^\\>]*\\>([^\\<]*)\\</[^\\>]*\\>", a la salida el programa
                 * da <a>uno</a>, ..., <e>cinco</e>, todos tras un salto de línea.
                 * 
                 * Con "\\<.*\\>(.*)\\<\\/.*\\>", la consola arroja
                 * <a>uno</a><b>dos</b><c>tres</c><d>cuatro</d><e>cinco</e>.
                 * 
                 * Con "\\<.*?\\>(.*?)\\<\\/.*?\\>" sale un resultado similar al primero. En
                 * caso de agrupar en la línea 363 por 1, la consola solamente arroja los
                 * números sin las tags.
                 */

                case 15:

                    String cadena15 = "<a>uno</a><b>dos</b><c>tres</c><d>cuatro</d><e>cinco</e>";

                    Pattern pat15 = Pattern.compile("<([a-e])>.*?");
                    Matcher mat15 = pat15.matcher(cadena15);

                    while (mat15.find()) {
                        String exit15 = mat15.group(1);
                        System.out.print(exit15);
                        System.out.print(" ");
                    }
                    System.out.println();

                    break;

                /*
                 * Elimina los símbolos (:,.;?¿¡!…'"<<>>) del texto que aparece en el fichero
                 * EjercicioExpresiones.txt
                 */
                case 16:

                    String pat16 = "[\\<\\>:,;.¿\\?¡\\!\"]";
                    String changedText16 = contenttxt.replaceAll(pat16, "");
                    System.out.println(
                            "________________________________________________________________________________________");
                    System.out.println("Cambio inicial");
                    System.out.println();

                    System.out.println(changedText16);
                    System.out.println(
                            "________________________________________________________________________________________");

                    /* Quitar tildes al resultado anterior */

                    String aTildless = changedText16.replaceAll("á", "a");
                    String eTildless = aTildless.replaceAll("é", "e");
                    String iTildless = eTildless.replaceAll("í", "i");
                    String oTildless = iTildless.replaceAll("ó", "o");
                    String textTildless = oTildless.replaceAll("ú", "u");

                    System.out.println(
                            "________________________________________________________________________________________");
                    System.out.println("Sin tildes:");
                    System.out.println();

                    System.out.println(textTildless);
                    System.out.println(
                            "________________________________________________________________________________________");

                    /* Reemplazar del resultado las palabras formadas únicamente por números */
                    String noNumbers = textTildless.replaceAll("\\s\\d+\\s", "  ");

                    System.out.println(
                            "________________________________________________________________________________________");
                    System.out.println("Sin números:");
                    System.out.println();

                    System.out.println(noNumbers);
                    System.out.println(
                            "________________________________________________________________________________________");

                    /* Todo a mayúsculas */
                    String allMayus = noNumbers.toUpperCase();
                    System.out.println(
                            "________________________________________________________________________________________");
                    System.out.println("Todo a Mayúsculas:");
                    System.out.println();

                    System.out.println(allMayus);
                    System.out.println(
                            "________________________________________________________________________________________");

                    /* Eliminar dobles espacios */
                    String noDuoSpaces = allMayus.replaceAll("(\\s\\s)", " ");
                    System.out.println(
                            "________________________________________________________________________________________");
                    System.out.println("Sin dobles espacios:");
                    System.out.println();

                    System.out.println(noDuoSpaces);
                    System.out.println(
                            "________________________________________________________________________________________");

                    break;

                default:
                    System.out.println();
            }

        } while (opcion < 17);

    }

}
