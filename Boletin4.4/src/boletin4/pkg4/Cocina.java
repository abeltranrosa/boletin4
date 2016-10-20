
package boletin4.pkg4;


public class Cocina {
   private int polbo;
   private int patacas;        
   
   public Cocina(){
        
    }
   public Cocina(int pa,int po){
        patacas=pa;
        polbo=po;    
    }
   public void engadirPolbo(int po){
       polbo=polbo+po;
   }
   public void engadirPatacas(int pa){
       patacas=patacas+pa;
   }
   public void amosarPolbo(){
       System.out.println("temos "+polbo+" kg de polbo no almacen");
       
       
   }
   public void amosarPatacas(){
       System.out.println("Temos "+patacas+" kg de patacas no almacen");
      
   }
   public int calcClient(){
       int clientes=3;
       if(this.polbo>this.patacas){
       int nClientes=(this.polbo/2)*clientes;
       return nClientes;
   }else{
       int nClientes=this.patacas/3;
    return nClientes;
    
      }
   }
}
