package Labo03;


public class Main {
    public static void main(String[] args) {
        int m = 3, n = 2;
        int result = Ackermann.ackermann(m, n);
        System.out.println("Resultado de Ackermann(" + m + "," + n + ") = " + result);
    }
}
