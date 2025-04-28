
package Labo02;

import java.util.Scanner;
public class SumaMaxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos:");
        int n = sc.nextInt();

        int[] valores = new int[n];
        System.out.println("Ingrese los " + n + " valores (enteros):");

        for (int i = 0; i < n; i++) {
            valores[i] = sc.nextInt();
        }

        Resultado resultado = kadane(valores);

        if (resultado.maxSuma > 0) {
            System.out.println("Maxima suma: " + resultado.maxSuma);
            System.out.println("Desde la posicion a" + (resultado.inicio + 1) + " hasta a" + (resultado.fin + 1));
        } else {
            System.out.println("Todos los numeros son negativos. Suma máxima: 0");
        }
    }

    static class Resultado {
        int maxSuma;
        int inicio;
        int fin;

        Resultado(int maxSuma, int inicio, int fin) {
            this.maxSuma = maxSuma;
            this.inicio = inicio;
            this.fin = fin;
        }
    }

    public static Resultado kadane(int[] arr) {
        int maxSuma = 0;
        int sumaActual = 0;
        int inicio = 0;
        int tempInicio = 0;
        int fin = -1;

        for (int i = 0; i < arr.length; i++) {
            sumaActual += arr[i];

            if (sumaActual > maxSuma) {
                maxSuma = sumaActual;
                inicio = tempInicio;
                fin = i;
            }

            if (sumaActual < 0) {
                sumaActual = 0;
                tempInicio = i + 1;
            }
        }

        return new Resultado(maxSuma, inicio, fin);
    }
}
