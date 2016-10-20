/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg1;

public class Coche {
    private int velocidade;
    public Coche(){
         velocidade=0;
    }
    public Coche(int ve){
        this.velocidade=ve;
    }
    
    public int getVelocidade(){
       return velocidade;
    }
    
    public void acelerar (int valor){
           velocidade=velocidade+valor;
           System.out.println("velocidade="+velocidade);
    }
    
    public void frenar(int menos){
          velocidade=velocidade-menos;
          System.out.println("velocidade="+velocidade);
          
    }    
}