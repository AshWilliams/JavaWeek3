/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anorak
 */
public class Biblioteca {
    public List<Libro> Libros;

    public Biblioteca() {
        Libros = new ArrayList<>();
    }
    
    public void Agregar(Libro nuevoLibro){
        Libros.add(nuevoLibro);
    }
    
    public Libro Buscar(String codigo){
      Libro resultado = null;  
      for (Libro Libro : this.Libros) {
            if (Libro.getCodigo().equals(codigo)) {
                resultado = Libro;
                break;
            }
      }
      return resultado;
    }
}
