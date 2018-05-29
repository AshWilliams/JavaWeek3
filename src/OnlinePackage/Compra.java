/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlinePackage;

/**
 *
 * @author Anorak
 */
public class Compra {
    private static final int valorUF = 27075;
    private int monto;
    private String nombre;
    private String rut;
    private String correo;
    private String medioPago;
    private int promocion = 0;
    public Compra(int monto, String nombre, String rut, String correo, String medioPago) {
        this.monto = monto;
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.medioPago = medioPago;
        this.Descuento();
    }

    public final void Descuento(){      
      if(this.getMonto() > (valorUF * 100) && this.getMonto() < (valorUF * 500)){
        this.setPromocion((this.getMonto() * 10) / 100);
      }
      else if(this.getMonto() > (valorUF * 500)){
        this.setPromocion((this.getMonto() * 20) / 100);
      }
      this.setMonto(this.getMonto() - this.getPromocion());
    }
    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getPromocion() {
        return promocion;
    }

    public void setPromocion(int promocion) {
        this.promocion = promocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    
}
