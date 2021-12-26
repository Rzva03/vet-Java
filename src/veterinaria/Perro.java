/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author Victor Rodriguez
 */
public class Perro extends Animal {

    /*
    tipo_osico
                                  	conducta
     */
    private String tipo_hocico;
    private String conducta;

    public Perro(String nombre, String color, int edad, double precio, String tipo_hocico, String conducta) {
        super(nombre, color, edad, precio);
        this.tipo_hocico = tipo_hocico;
        this.conducta = conducta;
    }

    public String getTipo_osico() {
        return tipo_hocico;
    }

    public void setTipo_hocico(String tipo_hocico) {
        this.tipo_hocico = tipo_hocico;
    }

    public String getConducta() {
        return conducta;
    }

    public void setConducta(String conducta) {
        this.conducta = conducta;
    }

    public String mostrar_datos() {
        String datos_perico;
        datos_perico = "Nombre: " + getNombre() + "\n"
                + "Color: " + getColor() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Tipo hocico: " + getTipo_osico() + "\n"
                + "Tipo de conducta: " + getConducta() + "\n"
                + "Precio: " + getPrecio();
        return datos_perico;
    }
}
