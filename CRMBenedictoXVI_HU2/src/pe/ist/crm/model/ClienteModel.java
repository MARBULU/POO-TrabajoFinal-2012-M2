package pe.ist.crm.model;

import pe.ist.crm.data.Data;
import pe.ist.crm.entity.Cliente;

public class ClienteModel {

    public int crear(Cliente cliente) {
        int rpta;
        rpta = validarNulos(cliente);
        if(rpta == 1){
            rpta = validarDni(cliente);
        }
        return rpta;
    }

    private int validarNulos(Cliente cliente) {
        int rpta = 1;
        if (cliente.getPaterno() == null
                || cliente.getMaterno() == null
                || cliente.getNombre() == null
                || cliente.getEmail() == null) {
            rpta = -1;
        }
        return rpta;
    }
    
    public int actualizar (Cliente cliente) {
        int rpta;
        rpta = validarNulos(cliente);
        if( rpta == 1 ){
            rpta = codigoExiste(cliente);
        }
        return rpta;
    }

    private int validarDni(Cliente cliente) {
        int rpta = 1;
        for (Cliente c : Data.clientes) {
            if(c.getDni().equals(cliente.getDni())){
                rpta = -2;
                break;
            }
        }
        return rpta;
    }

    private int codigoExiste(Cliente cliente) {
        int rpta = -3;
        for (Cliente c : Data.clientes) {
            if(c.getCodigo() == cliente.getCodigo()){
                rpta = 1;
                break;
            }
        }
        return rpta;
    }
    
    
}
