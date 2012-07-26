/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

/**
 *
 * @author vpolo
 */
public class Mascota {

    String strNombre;
    
    public Mascota() {
        strNombre = "Sin Nombre";
    }
    
    public Mascota(String _strNombre) {
        this.strNombre = _strNombre;
    }
    
    public String MoverCola()
    {
        return strNombre + " Mueve la Colita";
    }
    
    public String Acercar()
    {
        return strNombre + " se acerca a la zanahoria. ";
    }
    
}
