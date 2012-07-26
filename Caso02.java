/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

/**
 *
 * @author vpolo
 */
public class Caso02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mascota masColita = new Mascota("Colita");
        Persona perCarlos = new Persona("Carlos",5);
        
        System.out.println(perCarlos.MuestraZanahoria(masColita));
        System.out.println(perCarlos.TocaOreja(masColita));
    }
}
