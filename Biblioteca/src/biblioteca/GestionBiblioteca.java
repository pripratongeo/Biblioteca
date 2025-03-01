/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Est01
 */
import java.util.Scanner;

public class GestionBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            System.out.println("===== Gestión de Biblioteca =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro");
            System.out.println("4. Ver todos los libros");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar libro
                    System.out.print("Introduce el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el año de publicación: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer

                    Libro libro = new Libro(titulo, autor, anio);
                    biblioteca.agregarLibro(libro);
                    System.out.println("Libro agregado exitosamente.");
                    break;

                case 2:
                    // Eliminar libro
                    System.out.print("Introduce el título del libro a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    if (biblioteca.eliminarLibro(tituloEliminar)) {
                        System.out.println("Libro eliminado exitosamente.");
                    } else {
                        System.out.println("No se encontró un libro con ese título.");
                    }
                    break;

                case 3:
                    // Buscar libro
                    System.out.print("Introduce el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Libro libroEncontrado = biblioteca.buscarLibro(tituloBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado:");
                        libroEncontrado.mostrarInfo();
                    } else {
                        System.out.println("No se encontró un libro con ese título.");
                    }
                    break;

                case 4:
                    // Ver todos los libros
                    biblioteca.mostrarLibros();
                    break;

                case 5:
                    // Salir
                    System.out.println("Gracias por usar la gestión de biblioteca.");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}

