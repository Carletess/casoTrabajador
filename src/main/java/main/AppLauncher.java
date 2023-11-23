package main;

import modelo.Trabajador;

public class AppLauncher {
    public static void main(String[] args) {
        // Crear una instancia de Trabajador
        Trabajador trabajador1 = crearTrabajador("Juan", "Perez", "12345678-9", "BanMédica", "AFP Provida");

        // Mostrar información del trabajador
        mostrarInformacionTrabajador(trabajador1);

        // Modificar la Isapre y AFP del trabajador
        actualizarInformacionTrabajador(trabajador1, "Colmena", "AFP Modelo");

        // Mostrar información actualizada del trabajador
        mostrarInformacionTrabajador(trabajador1);
    }

    // Método para crear un Trabajador
    public static Trabajador crearTrabajador(String nombre, String apellido, String rut, String isapre, String afp) {
        return new Trabajador(nombre, apellido, rut, isapre, afp);
    }

    // Método para mostrar información de un Trabajador
    public static void mostrarInformacionTrabajador(Trabajador trabajador) {
        System.out.println("Información del Trabajador:");
        trabajador.mostrarInformacion();
        System.out.println(); // Agregamos un salto de línea para mejor legibilidad
    }

    // Método para actualizar la Isapre y AFP de un Trabajador
    public static void actualizarInformacionTrabajador(Trabajador trabajador, String nuevaIsapre, String nuevaAfp) {
        trabajador.setIsapre(nuevaIsapre);
        trabajador.setAfp(nuevaAfp);
        System.out.println("Información actualizada correctamente.");
    }
}
