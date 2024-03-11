/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_uno_estructura_de_datos;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class FuncionesMatrices {

    //a. Declarar e inicializar una matriz de 5 x 8 de tipo Object en una variable llamada
    //   lenguajes
    static Object[][] lenguajes = new Object[8][5];

    public static Object[][] infoLenguajes() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < lenguajes.length; i++) {
            System.out.println("\n");
            System.out.println("Ingrese los detalles del lenguaje ");
            for (int j = 0; j < lenguajes[i].length; j++) {
                String lenguaje;
                switch (j) {
                    case 0:
                        System.out.println("Ingrese el nombre: ");
                        lenguaje = scanner.nextLine();
                        lenguajes[i][j] = lenguaje;
                        break;
                    case 1:
                        System.out.println("Ingrese el año: ");
                        lenguaje = scanner.nextLine();
                        lenguajes[i][j] = lenguaje;
                        break;
                    case 2:
                        System.out.println("Ingrese el autor: ");
                        lenguaje = scanner.nextLine();
                        lenguajes[i][j] = lenguaje;
                        break;
                    case 3:
                        System.out.println("Ingrese los detalles: ");
                        lenguaje = scanner.nextLine();
                        lenguajes[i][j] = lenguaje;
                        break;
                    case 4:
                        System.out.println("Ingrese los FRAMEWORKS: ");
                        lenguaje = scanner.nextLine();
                        lenguajes[i][j] = lenguaje;
                        break;
                }

            }
        }

        return lenguajes;
    }

    public static boolean busquedaNombre(String nombre) {

        for (Object[] lenguaje : lenguajes) {
            if (lenguaje[0].toString().toLowerCase().equals(nombre.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static String cordenadasDelLenguaje(String nombre) {

        for (int i = 0; i < lenguajes.length; i++) {
            if (lenguajes[i][0].toString().toLowerCase().equals(nombre.toLowerCase())) {
                return "Cordenadas (Fila, Columna): " + i + ", " + 0;
            }
        }
        return null;
    }

    public static Object[] buscarFila(int fila) {
        if (fila > lenguajes.length || fila <= 0) {
            throw new UnsupportedOperationException("No exite esa fila.");
        }

        for (int i = 0; i < lenguajes.length; i++) {
            if (i == fila) {
                return lenguajes[i];
            }
        }

        return null;

    }

    public static Object[] buscarColumna(int columna) {
        if (columna > lenguajes[0].length || columna < 0) {
            throw new UnsupportedOperationException("No exite esa columna.");
        }

        Object[] result = new Object[8];

        for (int i = 0; i < lenguajes.length; i++) {
            result[i] = lenguajes[i][columna];
        }

        return result;

    }

    public static Object[] buscarDatos(int fila, int columna) {
        if (columna > lenguajes[0].length || columna < 0) {
            throw new UnsupportedOperationException("No exite esa columna.");
        }

        if (fila > lenguajes.length || fila <= 0) {
            throw new UnsupportedOperationException("No exite esa fila.");
        }

        Object[] result = new Object[2];
        result[0] = lenguajes[fila][columna];
        result[1] = lenguajes[fila];

        return result;

    }

    public static String lenguajeYCordenadas(String nombre) {

        for (int i = 0; i < lenguajes.length; i++) {
            if (lenguajes[i][0].toString().toLowerCase().equals(nombre.toLowerCase())) {
                return "Cordenadas (Fila, Columna): " + i + ", " + 0;
            }
        }
        return null;
    }

    public static Object[] mostrarDatosSegunInfo(boolean[] info) {
        int count = 0;

        for (boolean value : info) {
            if (value) {
                count++;
            }
        }
        int num = 0;

        Object[] result = new Object[count];

        for (int i = 0; i < info.length; i++) {
            if (info[i] == true) {
                Object[] object = new Object[]{lenguajes[i + 1][0], lenguajes[i + 1][2], lenguajes[i + 1][4]};
                result[num] = object;
                num++;
            }
        }

        return result;
    }

}
