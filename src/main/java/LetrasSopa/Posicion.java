
package LetrasSopa;


public class Posicion {
    int inicioFila, inicioCol, finFila, finCol;

    public Posicion(int iF, int iC, int fF, int fC) {
        this.inicioFila = iF;
        this.inicioCol = iC;
        this.finFila = fF;
        this.finCol = fC;
    }

    @Override
    public String toString() {
        return "(" + (inicioFila+1) + "," + (inicioCol+1) + ") a (" + (finFila+1) + "," + (finCol+1) + ")";
    }
}
