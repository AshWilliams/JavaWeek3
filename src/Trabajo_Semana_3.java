
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
        // Aunque no estaba implicito en el ejemplo se añadió el attr título a la clase Libro
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
        
        //Presta libro en la posicion 1
        miBiblioteca.Libros.get(2).Prestar();
        
        //Seteamos el flag en 1 para que aplique el descuento automaticamente
        Compra compra1 = new Compra(10000000,"Robert","1-1","robert.rozas@uniacc.edu","debito",1);
        //Se ve cuento descuento aplico
        System.out.println("Descuento: " + compra1.getPromocion());
        //total a pagar
        System.out.println("Post: " + compra1.getMonto());
        
        //Seteamos el flag en 0 para que aplique el descuento manualmente
        Compra compra2 = new Compra(30000000,"Robert","1-1","robert.rozas@uniacc.edu","credito",0);
        //total pre descuento
        System.out.println("Pre Descuento: " + compra2.getMonto());
        //Invocamos descuento por si aplica   
        compra2.AplicarDescuento();
        //total post descuento
        System.out.println("Post Descuento: " + compra2.getMonto());   
        
    }
    
}
