package pe.ist.crm.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import pe.ist.crm.entity.Cliente;

public class Data {

    public static List<Cliente> clientes;
    
    
    static {
        clientes = new ArrayList<>();
        clientes.add(new Cliente(101L, "Arbulu", "Anicama", "Jose", "martin.arbulu@gmail.com", "42762681", "2482329", Calendar.getInstance().getTime()));
        clientes.add(new Cliente(102L, "Rojas", "Rojas", "Jesus", "jrojas@gmail.com", "40021130", "3484727", Calendar.getInstance().getTime()));
        clientes.add(new Cliente(103L, "Reyna", "Del Aguila", "Robert", "rreyna@gmail.com", "11113362", "9991234", Calendar.getInstance().getTime()));
        clientes.add(new Cliente(104L, "Nole", "Perez", "Cristhian", "cnole@gmail.com", "22226782", "8881234", Calendar.getInstance().getTime()));
        clientes.add(new Cliente(105L, "Palomares", "Suarez", "Luis", "lpalomares@gmail.com", "33336754", "7771234", Calendar.getInstance().getTime()));
    }
    
    
}
