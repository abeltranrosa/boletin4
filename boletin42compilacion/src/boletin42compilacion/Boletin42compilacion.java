
package boletin42compilacion;

import javax.swing.JOptionPane;


public class Boletin42compilacion {

  
    public static void main(String[] args) {
        double p,m,dT;
        p=Double.parseDouble(JOptionPane.showInputDialog("Insertar paralelo"));
        m=Double.parseDouble(JOptionPane.showInputDialog("Insertar meridiano"));
        dT=Double.parseDouble(JOptionPane.showInputDialog("Insertar distancia a la tierra"));
        Satelite luna=new Satelite(m,p,dT);
        
        
    }
    
}
