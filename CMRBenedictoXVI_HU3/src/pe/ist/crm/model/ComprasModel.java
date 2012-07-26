package pe.ist.crm.model;

import pe.ist.crm.entity.Compras;

public class ComprasModel {


    public int validarNulos(Compras compra) {
        int rpta = 1;
        if (compra.getConcepto() == null
                || compra.getFechaEmision() == null
                || compra.getFechaVencimiento() == null
                || compra.getFechaPago() == null) {
            rpta = -1;
        }
        return rpta;
    }
    


}
