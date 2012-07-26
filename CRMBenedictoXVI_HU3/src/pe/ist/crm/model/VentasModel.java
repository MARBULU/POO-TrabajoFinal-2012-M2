package pe.ist.crm.model;

import pe.ist.crm.entity.Ventas;

public class VentasModel {


    public int validarNulos(Ventas venta) {
        int rpta = 1;
        if (venta.getConcepto() == null
                || venta.getFechaEmision() == null
                || venta.getFechaVencimiento() == null
                || venta.getFechaPago() == null) {
            rpta = -1;
        }
        return rpta;
    }
    


}
