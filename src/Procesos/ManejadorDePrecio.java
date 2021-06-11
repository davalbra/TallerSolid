package Procesos;

import Postres.Postre;

public class ManejadorDePrecio {

    public static double calcularPrecioFinal(Postre p){
        double precioFinal;
        precioFinal=(p.getPrecioParcial()+(p.getPrecioParcial()*0.12))+(p.getAderezos().size()*0.50);
        return precioFinal;
    }
    public static String showPrecioFinal(Postre p){
        return "Precio Final: $ " + calcularPrecioFinal(p);
    }
}
