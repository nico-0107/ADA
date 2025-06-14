
package hashtableclientes;
import java.util.LinkedList;
public class HashTable {
    private LinkedList<Cliente>[] tabla;
    private int tamaño;

    public HashTable(int tamaño) {
        this.tamaño = tamaño;
        tabla = new LinkedList[tamaño];
        for (int i = 0; i < tamaño; i++) {
            tabla[i] = new LinkedList<>();
        }
    }

    private int hash(String clave) {
        return Math.abs(clave.hashCode()) % tamaño;
    }

    public void insertar(Cliente cliente) {
        int index = hash(cliente.getClave());
        tabla[index].add(cliente);
    }

    public Cliente buscar(String nombreApellido) {
        int index = hash(nombreApellido.toLowerCase());
        for (Cliente c : tabla[index]) {
            if (c.getClave().equals(nombreApellido.toLowerCase())) {
                return c;
            }
        }
        return null;
    }
}
