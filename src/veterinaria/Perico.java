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
public class Perico extends Animal {

    private String tipo_alas;
    private String tipo_pico;

    public Perico(String nombre, String color, int edad, double precio, String tipo_alas, String tipo_pico) {
        super(nombre, color, edad, precio);
        this.tipo_alas = tipo_alas;
        this.tipo_pico = tipo_pico;
    }

    public String getTipo_alas() {
        return tipo_alas;
    }

    public void setTipo_alas(String tipo_alas) {
        this.tipo_alas = tipo_alas;
    }

    public String getTipo_pico() {
        return tipo_pico;
    }

    public void setTipo_pico(String tipo_pico) {
        this.tipo_pico = tipo_pico;
    }

    public String mostrar_datos() {
        String datos_perico;
        datos_perico = "Nombre: " + getNombre() + "\n"
                + "Color: " + getColor() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Tipo alas: " + getTipo_alas() + "\n"
                + "Tipo pico: " + getTipo_pico() + "\n"
                + "Precio: " + getPrecio();
        return datos_perico;
    }

}
