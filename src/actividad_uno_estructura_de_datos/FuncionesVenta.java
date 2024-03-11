/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_uno_estructura_de_datos;

import java.util.Random;

/**
 *
 * @author crist
 */
public class FuncionesVenta {

    public static int ventaMasAlta(int[] ventas) {
        int mayor = ventas[0];

        for (int x = 1; x < ventas.length; x++) {
            if (ventas[x] > mayor) {
                mayor = ventas[x];
            }
        }
        return mayor;
    }

    public static int ventaMasBaja(int[] ventas) {
        int menor = ventas[0];

        for (int x = 1; x < ventas.length; x++) {
            if (ventas[x] < menor) {
                menor = ventas[x];
            }
        }

        return menor;
    }

    public static int totalDeVentas(int[] ventas) {
        int totalVenta = 0;

        for (int venta : ventas) {
            totalVenta += venta;
        }
        return totalVenta;
    }

    public static double promedioVentas(int[] ventas) {

        totalDeVentas(ventas);

        double promedio = totalDeVentas(ventas) / ventas.length;

        return promedio;
    }

    public static int[] ordenarDecendente(int[] ventas) {
        int temp;
        for (int i = 1; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length - 1; j++) {
                if (ventas[j] < ventas[j + 1]) {
                    temp = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = temp;
                }
            }
        }

        return ventas;
    }

    public static int valorCercanoAlPromedio(int[] ventas) {
        double promedio = promedioVentas(ventas);
        int[] arrayOrdenados = ordenarDecendente(ventas);

        for (int arrayOrdenado : arrayOrdenados) {
            if (arrayOrdenado > promedio) {
                return arrayOrdenado;
            }
        }

        return -1;
    }

    public static int[] ordenarAscendente(int[] ventas) {
        int variable;
        for (int i = 1; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length - 1; j++) {
                if (ventas[j] > ventas[j + 1]) {
                    variable = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = variable;
                }
            }
        }

        return ventas;
    }

    public static int[] desordenarVentas(int[] ventas) {
        Random aleatorio = new Random();

        for (int i = 0; i < ventas.length; i++) {
            int posicionAletoria = aleatorio.nextInt(ventas.length);
            ventas[i] = ventas[posicionAletoria];
        }

        return ventas;
    }

    public static int[] ordernarParesImpares(int[] ventas) {

        int[] arrayOrdenado = new int[ventas.length];
        int indicePar = 0;
        int indiceImpar = ventas.length - 1;

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] % 2 == 0) {
                arrayOrdenado[indicePar++] = ventas[i];
            } else {
                arrayOrdenado[indiceImpar--] = ventas[i];
            }
        }

        return arrayOrdenado;
    }
}
