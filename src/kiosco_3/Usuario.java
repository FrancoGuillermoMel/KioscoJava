
package kiosco_3;

import java.util.ArrayList;

public class Usuario {
    public String nombre;
    private static ArrayList<String> nombresUsuarios = new ArrayList<>();

    // Constructor 
    public Usuario(String nombre) {
        this.nombre = nombre;
        // Agregar el nombre del usuario a la lista de nombres de usuarios
        nombresUsuarios.add(nombre);
    }

    // Metodo para obtener el nombre del usuario
    public String getNombre() {
        return nombre;
    }

    // Metodopara obtener la lista de nombres de usuarios
    public static ArrayList<String> getNombresUsuarios() {
        return nombresUsuarios;
    }
}
