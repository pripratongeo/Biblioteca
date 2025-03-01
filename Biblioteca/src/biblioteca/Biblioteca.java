/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Est01
 */
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para eliminar un libro por título
    public boolean eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libros.remove(libro);
                return true;
            }
        }
        return false;
    }

    // Método para buscar un libro por título
    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // Si no se encuentra el libro
    }

    // Método para mostrar todos los libros en la biblioteca
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInfo();
                System.out.println("----------------------------");
            }
        }
    }
}

