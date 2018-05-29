/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioPackage;
import java.time.LocalDateTime;

/**
 *
 * @author Anorak
 */
public class Libro {
    private String codigo ;
    private String autor;
    private String titulo;
    private String tema;
    private LocalDateTime  fecha;
    private int paginas;
    private String editorial;
    private String pais;
    private boolean estado = false;

    public Libro(String codigo, String autor, String titulo, String tema, int paginas, String editorial, String pais) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.tema = tema;
        this.fecha = LocalDateTime.now();
        this.paginas = paginas;
        this.editorial = editorial;
        this.pais = pais;
    }
    
    public void Prestar(){
      this.setEstado(!this.isEstado());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     
    
    
}
