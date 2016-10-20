
package boletin4.pkg4;

import javax.swing.JOptionPane;


public class Boletin44 {

   
    public static void main(String[] args) {
        int po,pa;
        pa=Integer.parseInt(JOptionPane.showInputDialog("Introduzca kg de patacas"));
        po=Integer.parseInt(JOptionPane.showInputDialog("Introduzca kg de patacas"));
        Cocina cocina1=new Cocina(pa,po);
    }
    
}
