/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_uno_estructura_de_datos;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author crist
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//1. Declarar y definir arreglos:
//a. Declarar un arreglo por cada uno de los tipos de datos primitivos (byte, Byte,
//   char, Character, short, Short, int, Integer, long, Long, float, Float, double,
//   Double, Object, String.
//b. Definir cada uno de los arreglos anteriores con tamaño de 5 elementos
//c. Asignar valores a cada arreglo usando la notación de posiciones o índices
//d. Mostrar los valores de cada Arreglo
//e. Declarar y definir otro arreglo de tipo String en una variable llamada
//   dataStructs, e inicializarlo con los siguientes datos, usando la sintaxis de
//   llaves.
//      i. Listas
//      ii. Colas
//      iii. Pilas
//      iv. Mapas
//      v. Conjuntos
//f. Declarar y definir otro arreglo de tipo String en una variable llamada
//   características, con 5 elementos.
//g. Ingresar los siguientes datos por teclado:
//  i. Simples, Circulares y Enlazadas
//  ii. Primero en entrar, Primero en Salir. Último en entrar, Primero en salir
//  iii. Primero en entrar, Último en salir
//  iv. Parejas de clave y valor
//  v. Elementos no repetidos

        byte arrayByte[] = new byte[5];
        Byte arrayBytes[] = new Byte[5];
        char arrayChart[] = new char[5];
        Character arrayCharacter[] = new Character[5];
        short arrayShort[] = new short[5];
        Short arrayShorts[] = new Short[5];
        int arrayInt[] = new int[5];
        Integer arrayInteger[] = new Integer[5];
        long arrayLong[] = new long[5];
        Long arrayLongs[] = new Long[5];
        float arrayFloat[] = new float[5];
        Float arrayFloats[] = new Float[5];
        double arrayDouble[] = new double[5];
        Double arrayDoubles[] = new Double[5];
        Object arrayObject[] = new Object[5];
        String arrayString[] = new String[5];

        arrayByte[0] = 12;
        arrayByte[1] = 21;
        arrayByte[2] = 31;
        arrayByte[3] = 63;
        arrayByte[4] = 45;

        arrayBytes[0] = 1;
        arrayBytes[1] = 51;
        arrayBytes[2] = 61;
        arrayBytes[3] = 14;
        arrayBytes[4] = 3;

        arrayChart[0] = 'C';
        arrayChart[1] = 'R';
        arrayChart[2] = 'I';
        arrayChart[3] = 'S';
        arrayChart[4] = 'T';

        arrayCharacter[0] = 'I';
        arrayCharacter[1] = 'A';
        arrayCharacter[2] = 'N';
        arrayCharacter[3] = 'P';
        arrayCharacter[4] = 'A';

        arrayShort[0] = 152;
        arrayShort[1] = 500;
        arrayShort[2] = 200;
        arrayShort[3] = 159;
        arrayShort[4] = 75;

        arrayShorts[0] = 111;
        arrayShorts[1] = 199;
        arrayShorts[2] = 12;
        arrayShorts[3] = 149;
        arrayShorts[4] = 154;

        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;

        arrayInteger[0] = 15;
        arrayInteger[1] = 25;
        arrayInteger[2] = 35;
        arrayInteger[3] = 45;
        arrayInteger[4] = 55;

        arrayLong[0] = 5654;
        arrayLong[1] = 2554;
        arrayLong[2] = 3501;
        arrayLong[3] = 4514;
        arrayLong[4] = 5512;

        arrayLong[0] = 5654;
        arrayLong[1] = 2554;
        arrayLong[2] = 3501;
        arrayLong[3] = 4514;
        arrayLong[4] = 5512;

        arrayLongs[0] = 20L;
        arrayLongs[1] = 10l;
        arrayLongs[2] = 5l;
        arrayLongs[3] = 9l;
        arrayLongs[4] = 7l;

        arrayFloat[0] = 3.1415926535f;
        arrayFloat[1] = 10.56f;
        arrayFloat[2] = 1.0f;
        arrayFloat[3] = 2.5f;
        arrayFloat[4] = 4.5f;

        arrayFloats[0] = 3.15f;
        arrayFloats[1] = 10.5546f;
        arrayFloats[2] = 1.70f;
        arrayFloats[3] = 2.55f;
        arrayFloats[4] = 4.554f;

        arrayDouble[0] = 1.15;
        arrayDouble[1] = 7.55;
        arrayDouble[2] = 2.70;
        arrayDouble[3] = 6.55;
        arrayDouble[4] = 8.55;

        arrayDoubles[0] = 8.8;
        arrayDoubles[1] = 4.55;
        arrayDoubles[2] = 21.70;
        arrayDoubles[3] = 16.55;
        arrayDoubles[4] = 18.55;

        for (int i = 0; i < arrayObject.length; i++) {
            arrayObject[i] = new Object();
        }

        arrayString[0] = "Cristian";
        arrayString[1] = "Paez";
        arrayString[2] = "Estructura";
        arrayString[3] = "de";
        arrayString[4] = "Datos";

        System.out.println(Arrays.toString(arrayByte));
        System.out.println(Arrays.toString(arrayBytes));
        System.out.println(Arrays.toString(arrayChart));
        System.out.println(Arrays.toString(arrayCharacter));
        System.out.println(Arrays.toString(arrayShort));
        System.out.println(Arrays.toString(arrayShorts));
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayLong));
        System.out.println(Arrays.toString(arrayLongs));
        System.out.println(Arrays.toString(arrayFloat));
        System.out.println(Arrays.toString(arrayFloats));
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println(Arrays.toString(arrayDoubles));
        System.out.println(Arrays.toString(arrayObject));
        System.out.println(Arrays.toString(arrayString));

        System.out.println("\n");

        String dataStructs[] = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        String características[] = new String[5];
        System.out.println("Por favor, ingrese los siguientes datos por teclado, uno por uno:\n"
                + "Simples, Circulares y Enlazadas\n"
                + "Primero en entrar, Primero en Salir. Ultimo en entrar, Primero en salir\n"
                + "Primero en entrar, Ultimo en salir\n"
                + "Parejas de clave y valor\n"
                + "Elementos no repetidos");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < características.length; i++) {
            String text = scanner.nextLine();
            características[i] = text;
        }
//2. Manipular los elementos dentro de arreglos:
//a. Mostrar los elementos del arreglo dataStructs con su equivalente elemento del
//   arreglo características.
//b. Declarar un arreglo de enteros en una variable llamada ventas,
//c. Inicializar el arreglo ventas con una cantidad aleatoria de elementos.
//d. Llenar el arreglo ventas con valores aleatorios entre 1 y 1000
//e. Mostrar la cantidad de ventas
//f. Mostrar el valor de cada una de las ventas
//g. Mostrar el total de ventas
//h. Mostrar el promedio de las ventas.
        for (String característica : características) {
            if (característica.toLowerCase().equals("Simples, Circulares y Enlazadas".toLowerCase())) {
                System.out.println(dataStructs[0] + ": " + característica);
            } else if (característica.toLowerCase().equals("Primero en entrar, Primero en Salir. Ultimo en entrar, Primero en salir".toLowerCase())) {
                System.out.println(dataStructs[1] + ": " + característica);
            } else if (característica.toLowerCase().equals("Primero en entrar, Ultimo en salir".toLowerCase())) {
                System.out.println(dataStructs[2] + ": " + característica);
            } else if (característica.toLowerCase().equals("Parejas de clave y valor".toLowerCase())) {
                System.out.println(dataStructs[3] + ": " + característica);
            } else if (característica.toLowerCase().equals("Elementos no repetidos".toLowerCase())) {
                System.out.println(dataStructs[4] + ": " + característica);
            }
        }
        System.out.println("\n");

        Random aleatorio = new Random();
        int intAletorio = aleatorio.nextInt(100);

        int ventas[] = new int[intAletorio];

        for (int i = 0; i < ventas.length; i++) {
            int numeroAletorio = aleatorio.nextInt(1000);

            ventas[i] = numeroAletorio;
        }

        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i + 1) + ":" + ventas[i]);
        }

        System.out.println("Catidad de ventas: " + ventas.length);

        int totalVenta = 0;

        for (int venta : ventas) {
            totalVenta += venta;
        }

        System.out.println("Total de ventas: " + totalVenta);

        double promedio = totalVenta / ventas.length;

        System.out.println("Promedio de ventas: " + promedio);

//3. Buscar elementos en un arreglo:
//a. Diseñar una función que permita buscar la venta más alta e invocar la función
//   para probarla.
//b. Diseñar una función que permita buscar la venta más baja e invocar la función
//   para probarla.
//c. Diseñar una función que permita obtener el total de las ventas e invocar la
//   función para probarla.
//d. Diseñar una función que permita obtener el promedio de las ventas e invocar la
//   función para probarla.
//e. Diseñar una función que devuelva la venta cuyo valor se acerque más al valor
//   que le sigue al promedio e invocar la función para probarla.
        System.out.println("La venta mas alta fue: " + FuncionesVenta.ventaMasAlta(ventas));
        System.out.println("La venta mas baja fue: " + FuncionesVenta.ventaMasBaja(ventas));
        System.out.println("El total de ventas fue: " + FuncionesVenta.totalDeVentas(ventas));
        System.out.println("El promedio de ventas es: " + FuncionesVenta.promedioVentas(ventas));
        System.out.println("La venta cuyo valor se acerque más al valor que le sigue al promedio es: " + FuncionesVenta.valorCercanoAlPromedio(ventas));
//4. Ordenar arreglos:
//a. Diseñar una función que permita ordenar las ventas de forma descendente e
//   invocar la función para probarla.
//b. Diseñar una función que permita ordenamiento que permita ordenar las ventas
//   de forma ascendente e invocar la función para probarla.
//c. Diseñar una función que permite desordenar las ventas e invocar la función
//   para probarla.
//d. Diseñar una función que permita ordenar las ventas primero las partes y luego
//   en impares e invocar la función para probarla.
        System.out.println("Las ventas ordenadas decendentemete son: " + Arrays.toString(FuncionesVenta.ordenarDecendente(ventas)));
        System.out.println("Las ventas ordenadas asendentemente son: " + Arrays.toString(FuncionesVenta.ordenarAscendente(ventas)));
        System.out.println("Las ventas desordenadas: " + Arrays.toString(FuncionesVenta.desordenarVentas(ventas)));
        System.out.println("Ordenar las ventas primero las pares y luego en impares: " + Arrays.toString(FuncionesVenta.ordernarParesImpares(ventas)));

//5. Trabajar con Matrices (tablas o arreglos multidimencionales)
//a. Declarar e inicializar una matriz de 5 x 8 de tipo Object en una variable llamada
//   lenguajes
//b. A la primera línea de la matriz lenguajes se debe asignar los siguientes valores
//   en ese orden:
//   [NOMBRE, AÑO, AUTOR, DETALLES, FRAMEWORKS]
//c. Realizar una función llamada infoLenguajes que permita llenar la matriz
//   lenguajes con datos por teclado a partir de la segunda fila.
//d. Realizar una función que reciba como parámetro el nombre de un lenguaje y
//   retorna verdadero si este se encuentra dentro de la matriz lenguajes, de lo
//   contrario retorna falso.
//e. Realizar una función que reciba como parámetro el nombre de un lenguaje y
//   retorna las coordenadas (fila, columna) si este se encuentra encuentra dentro
//   de la matriz lenguajes, de lo contrario retorna null.
//f. Realizar una función que reciba como parámetro una fila y retorne el registro
//   completo (datos en la fila) del lenguaje en esa fila. Si la fila está errada (no
//   existe en la matriz lenguajes) entonces, debe retornar una excepción con un
//   mensaje informando el problema.
//g. Realizar una función que reciba como parámetro una columna y retorne un
//   todos los datos en esa columna. Si la columna está errada (no existe en la
//   matriz lenguajes) entonces, debe retornar una excepción con un mensaje
//   informando el problema.
//h. Realizar una función que reciba como parámetro las coordenadas (fila,
//   columna) y retorne el valor en esa coordinada y el registro (fila) completo con
//   ojos datos de ese lenguaje, si las coordinadas son erradas (no existen en la
//   matriz lenguajes) entonces, debe retornar una excepción con un mensaje
//   informando el problema.
//i. lenguaje y retorna las coordenadas (fila, columna) si este se encuentra dentro
//   de la matriz lenguajes, de lo contrario retorna null.
//j. Realizar una función que permita mostrar los datos de la matriz lenguajes
//   según la siguiente logia:
//      i. La función de debe recibir como parámetro un arreglo con 5 elementos
//      de tipo boolean
//      ii. Al invocar la función se debe mostrar solo la información de la matriz
//      lenguajes de acuerdo al valor (false o true) que tenga el arreglo que
//      recibe como parámetro. Por ejemplo:
//      boolean info[] = {true, false, true, true, false};
//      infoLenguajes(info)
//Debe mostrar los nombres de los lenguajes, los autores, los frameworks
        FuncionesMatrices.lenguajes[0] = new Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};

        System.out.println(FuncionesMatrices.busquedaNombre("javaSCRIPT"));

        System.out.println(FuncionesMatrices.cordenadasDelLenguaje("javaSCRIPT"));

        System.out.println(Arrays.deepToString(FuncionesMatrices.buscarFila(3)));

        System.out.println(Arrays.deepToString(FuncionesMatrices.buscarColumna(2)));

        System.out.println(Arrays.deepToString(FuncionesMatrices.buscarDatos(1, 4)));

        System.out.println(FuncionesMatrices.lenguajeYCordenadas("javaSCRIPT"));

        boolean info[] = {true, true, false, false, true};

        System.out.println(Arrays.deepToString(FuncionesMatrices.mostrarDatosSegunInfo(info)));
    }

}
