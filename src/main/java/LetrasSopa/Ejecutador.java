
package LetrasSopa;


public class Ejecutador {
    public static void main(String[] args) {
        char[][] sopa = {
            {'E', 'S', 'T', 'O'},
            {'S', 'T', 'T', 'M'},
            {'E', 'A', 'S', 'A'},
            {'P', 'R', 'N', 'E'}
        };

        String[] palabras = {"esto", "ese", "pato", "este"};

        Buscador buscador = new Buscador(sopa);
        for (String palabra : palabras) {
            Posicion resultado = buscador.buscarPalabra(palabra.toUpperCase());
            if (resultado != null) {
                System.out.println("Palabra '" + palabra + "' encontrada de " + resultado);
            } else {
                System.out.println("Palabra '" + palabra + "' no encontrada.");
            }
        }
    }
}
