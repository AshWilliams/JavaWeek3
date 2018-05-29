
import OnlinePackage.Compra;
import BiblioPackage.Libro;
import BiblioPackage.Biblioteca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anorak
 */

public class Trabajo_Semana_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro("1","Robert","Clean Code","C#",100,"Press","Chile");
        Libro libro2 = new Libro("2","Antonio","Code Complete",".Net",200,"Press","Chile");
        
        Biblioteca miBiblioteca = new Biblioteca();
        miBiblioteca.Agregar(libro1);
        miBiblioteca.Agregar(libro2);
        //Busca libro
        Libro busqueda = null;
        busqueda = miBiblioteca.Buscar("1");
        
        //Presta libro en la posicion 1
        miBiblioteca.Libros.get(1).Prestar();
        
        Compra laCompra = new Compra(10000000,"Robert","1-1","robert.rozas@uniacc.edu","debito");
        //Se invoca el método Descuento dentro del constructor
        System.out.println("Descuento: " + laCompra.getPromocion());
        //total a pagar
        System.out.println("Post: " + laCompra.getMonto());
        
        
        
        
        
        
        
        
    }
    
}
