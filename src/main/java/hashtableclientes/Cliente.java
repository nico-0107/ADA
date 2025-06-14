
package hashtableclientes;


public class Cliente {
    String codigo, nombres, apellidos, telefono, correo, direccion, codPostal;

    public Cliente(String codigo, String nombres, String apellidos, String telefono,
                   String correo, String direccion, String codPostal) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.codPostal = codPostal;
    }

    public String getClave() {
        return (nombres + " " + apellidos).toLowerCase();
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nNombre: " + nombres + " " + apellidos +
               "\nTeléfono: " + telefono + "\nCorreo: " + correo +
               "\nDirección: " + direccion + "\nCódigo Postal: " + codPostal;
    }
}
