
package boletin4.pkg3;

import javax.swing.JOptionPane;


public class Boletin43 {

    
    public static void main(String[] args) {
       double r;
       r=Double.parseDouble(JOptionPane.showInputDialog("Introduzca radio"));
       Circulo circulo1=new Circulo();
       circulo1.setRadio(r);
       JOptionPane.showMessageDialog(null,"El area es "+circulo1.calArea());
       JOptionPane.showMessageDialog(null,"La longitud es "+circulo1.calLongCir());
    }
    
}
