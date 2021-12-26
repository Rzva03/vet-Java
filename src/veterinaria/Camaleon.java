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
public class Camaleon extends Animal{
    private String tipoCamaleon;
    public Camaleon(String nombre, String color, int edad, double precio, String tipoCamaleon ) {
        super(nombre, color, edad, precio);
        this.tipoCamaleon=tipoCamaleon;
    }

    public String getTipoCamaleon() {
        return tipoCamaleon;
    }

    public void setTipoCamaleon(String tipoCamaleon) {
        this.tipoCamaleon = tipoCamaleon;
    }
    public String mostrar_datos() {
        String datos_perico;
        datos_perico = "Nombre: " + getNombre() + "\n"
                + "Color: " + getColor() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Tipo de Camaleon: " + getTipoCamaleon() + "\n"
                +"Precio: "+getPrecio();
            
        return datos_perico;
    }
    
}
