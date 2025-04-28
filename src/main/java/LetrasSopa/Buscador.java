
package LetrasSopa;


public class Buscador {
    private final char[][] matriz;
    private final int[][] direcciones = {
        {-1, -1}, {-1, 0}, {-1, 1},
        { 0, -1},          { 0, 1},
        { 1, -1}, { 1, 0}, { 1, 1}
    };

    public Buscador(char[][] matriz) {
        this.matriz = matriz;
    }

    public Posicion buscarPalabra(String palabra) {
        int n = matriz.length;
        int m = matriz[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == palabra.charAt(0)) {
                    for (int[] dir : direcciones) {
                        int ni = i, nj = j;
                        int k;
                        for (k = 1; k < palabra.length(); k++) {
                            ni += dir[0];
                            nj += dir[1];
                            if (ni < 0 || nj < 0 || ni >= n || nj >= m || matriz[ni][nj] != palabra.charAt(k)) {
                                break;
                            }
                        }
                        if (k == palabra.length()) {
                            return new Posicion(i, j, ni, nj);
                        }
                    }
                }
            }
        }
        return null;
    }
}
