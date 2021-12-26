package veterinaria;

import java.awt.HeadlessException;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Veterinaria {

    public static void main(String[] args) {
        venta objventa = new venta();
        String nom, color, tipo_hocico, conducta, tipo_alas, tipo_pico, tipo_Camaleon;
        String datoPerro = "", datoPerico = "", datoCamaleon = "";
        String ticket;
        int edad = 0;
        Perro objPerro;
        Perico objPerico;
        Camaleon objCamaleon;
        int cantidad = 0;
        int opcion = 0;
        int confirmacion = 0;
        double precio = 0, precioPerico = 0, precioC = 0;
        boolean bandera2 = true;
        boolean bandera = true;
        do {

            try {
                do {
                    bandera = true;
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. AGREGAR MASCOTAS"
                            + "\n2. MOSTRAR MASCOTAS"
                            + "\n3. VENDER"
                            + "\n4. MOSTRAR TICKET"
                            + "\n5. SALIR"
                    ));
                    switch (opcion) {
                        case 1://AGREGAR MASCOTAS
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del perro.");
                            nom = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
                            color = JOptionPane.showInputDialog(null, "Ingrese el color:");
                            tipo_hocico = JOptionPane.showInputDialog(null, "Ingrese el tipo de hocico:");
                            conducta = JOptionPane.showInputDialog(null, "Ingrese la conducta hacia las personas o animales:");
                            do {
                                bandera2 = true;
                                try {
                                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad: "));
                                } catch (HeadlessException | NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "SOLO VALORES NUMERICOS !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                    bandera2 = false;

                                }
                            } while (bandera2 != true);
                            do {
                                bandera2 = true;
                                try {
                                    precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio: "));
                                } catch (InputMismatchException | NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "SOLO VALORES NUMERICOS !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                    bandera2 = false;

                                }
                            } while (bandera2 != true);
                            objPerro = new Perro(nom, color, edad, precio, tipo_hocico, conducta);
                            datoPerro = objPerro.mostrar_datos();
                            //////////////////////////////PERICO
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del perico.");
                            nom = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
                            color = JOptionPane.showInputDialog(null, "Ingrese el color:");
                            tipo_alas = JOptionPane.showInputDialog(null, "Ingrese el tipo de alas:");
                            tipo_pico = JOptionPane.showInputDialog(null, "Ingrese el tipo de pico:");
                            do {
                                bandera2 = true;
                                try {
                                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad: "));

                                } catch (HeadlessException | NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "SOLO VALORES NUMERICOS !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                    bandera2 = false;

                                }
                            } while (bandera2 != true);
                            do {
                                bandera2 = true;
                                try {
                                    precioPerico = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio: "));
                                } catch (InputMismatchException | NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "SOLO VALORES NUMERICOS !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                    bandera2 = false;

                                }
                            } while (bandera2 != true);
                            objPerico = new Perico(nom, color, edad, precioPerico, tipo_alas, tipo_pico);
                            datoPerico = objPerico.mostrar_datos();
                            ////////////////////////////////CAMALEON
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del camaleon.");
                            nom = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
                            color = JOptionPane.showInputDialog(null, "Ingrese el color:");
                            tipo_Camaleon = JOptionPane.showInputDialog(null, "Ingrese el tipo de camaleon:");
                            do {
                                bandera2 = true;
                                try {
                                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad: "));

                                } catch (HeadlessException | NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "SOLO VALORES NUMERICOS !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                    bandera2 = false;

                                }
                            } while (bandera2 != true);
                            do {
                                bandera2 = true;
                                try {
                                    precioC = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio: "));
                                } catch (InputMismatchException | NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "SOLO VALORES NUMERICOS !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                    bandera2 = false;

                                }
                            } while (bandera2 != true);
                            objCamaleon = new Camaleon(nom, color, edad, precioC, tipo_Camaleon);
                            datoCamaleon = objCamaleon.mostrar_datos();
                            break;
                        case 2:////MOSTRAR DATOS
                            if (datoCamaleon.isEmpty() || datoPerico.isEmpty() || datoPerro.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "NO HAY DATOS PARA MOSTRAR !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Datos del perro: \n" + datoPerro);
                                JOptionPane.showMessageDialog(null, "Datos del perico: \n" + datoPerico);
                                JOptionPane.showMessageDialog(null, "Datos del camaleon: \n" + datoCamaleon);
                            }
                            break;
                        case 3://REALIZAR VENTAS
                            venta.Reset();
                            if (datoCamaleon.isEmpty() || datoPerico.isEmpty() || datoPerro.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "NO HAY DATOS PARA MOSTRAR !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            } else {
                                String[] options = {"Perro", "Perico", "Camaleon", "Cancelar"};
                                confirmacion = JOptionPane.showOptionDialog(null, "¿QUE ANIMAL DESEA VENDER?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                                if (confirmacion == 3) {
                                    break;
                                } else {
                                    cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA CANTIDAD"));
                                    switch (confirmacion) {
                                        case 0:
                                            venta.calcularImporte(1, cantidad, precio);
                                            break;
                                        case 1:
                                            venta.calcularImporte(2, cantidad, precioPerico);
                                            break;
                                        case 2:
                                            venta.calcularImporte(3, cantidad, precioC);
                                            break;
                                        default:
                                            break;
                                    }

                                    venta.calcular();
                                }
                            }
                            break;
                        case 4:///TICKET
                            if (datoCamaleon.isEmpty() || datoPerico.isEmpty() || datoPerro.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "NO HAY DATOS PARA MOSTRAR !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            } else {
                                ticket = venta.Ticket();
                                if(ticket.isEmpty()){
                                     JOptionPane.showMessageDialog(null, "NO HAY VENTAS REALIZADAS");
                                }else{
                                     JOptionPane.showMessageDialog(null, ticket);
                                }
                               
                                
                            }
                            break;
                        case 5:///SALIR
                                JOptionPane.showMessageDialog(null, "SALIENDO DEL SISTEMA... ", "ADIOS", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "OPCION NO DISPONIBLE... ");
                            break;
                    }
                } while (opcion != 5);
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "SOLO VALORES NUMERICOS !!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                bandera = false;

            }
        } while (bandera != true);
    }

}
