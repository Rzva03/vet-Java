package veterinaria;

public class venta {

    public static String mascota;
    public static String concatenacion;
    public static double subtotal;
    public static double importe;
    public static double total;
    public static double totalF;
    public static double costo;
    public static double iva;
    public static int cantidad;
    public static String lbl;

    public venta() {
        mascota = "";
        concatenacion = "";
        subtotal = 0.0;
        total = 0.0;
        totalF = 0.0;
        importe=0.0;
        iva = 0.0;
        costo = 0.0;
        cantidad = 0;
        lbl="";
    }

    protected static void calcular() {//no factura
        subtotal=importe+subtotal;
        total+=importe; 
    }
   protected static void Reset(){
        mascota = "";
        concatenacion = "";
        subtotal = 0.0;
        total = 0.0;
        totalF = 0.0;
        importe=0.0;
        iva = 0.0;
        costo = 0.0;
        cantidad = 0;
        lbl="";
   }
    

    public static void calcularImporte(int opc, int cant, double precio) {
        switch (opc) {
            case 1:
                mascota="PERRO";
                cantidad=cant;
                costo = precio;
                importe = cant * costo;
                break;
            case 2:
                mascota="PERICO";
                cantidad=cant;
                costo = precio;
                importe = cant * costo;
                break;
            case 3:
                mascota="CAMALEON";
                cantidad=cant;
                costo = precio;
                importe = cant * costo;
                break;

        }
        lbl="  "+mascota+"                       "+"            "+costo+"                  "+cantidad+"                    "+importe+"\n";
    }
    public static String Ticket(){
        if(total!=0){
                   concatenacion="*********************************** VETERINARIA GEORGE ***********************************"
                + "\n      MASCOTA                       COSTO               CANTIDAD               IMPORTE\n"
                +"   "+lbl+"                                      "
                +"\n---------------------------------------------------------------------------------------------------------------------------------"+
                "\n SUBTOTAL: "+subtotal+""
                + "\n   TOTAL: "+total; 
        }else{
            concatenacion="";
        }

      
        return concatenacion;
    }

    
}
