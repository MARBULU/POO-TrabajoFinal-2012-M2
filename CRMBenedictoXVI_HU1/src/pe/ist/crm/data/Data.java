package pe.ist.crm.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import pe.ist.crm.entity.Prospecto;

public class Data {

    public static List<Prospecto> clientes;
    
    
    static {
        clientes = new ArrayList<>();
        clientes.add(new Prospecto(101L, "Diaz", "Perez", "Ruben", "Rdiaz@gmail.com", "49258862", "5824689", Calendar.getInstance().getTime()));
        clientes.add(new Prospecto(102L, "Garcia", "Arrunategui", "Mario", "Mgarcia@gmail.com", "478583362", "3822583", Calendar.getInstance().getTime()));
        clientes.add(new Prospecto(103L, "Arrue", "Sanchez", "Pedro", "Parrue@gmail.com", "09223362", "5469427", Calendar.getInstance().getTime()));
        clientes.add(new Prospecto(104L, "Mejia", "Coronel", "Hugo", "HMejia@gmail.com", "09986782", "3238954", Calendar.getInstance().getTime()));
        clientes.add(new Prospecto(105L, "Anchante", "Fernandez", "Roberto", "Ranchante@gmail.com", "08856754", "5775986", Calendar.getInstance().getTime()));
    }
    
    
}
