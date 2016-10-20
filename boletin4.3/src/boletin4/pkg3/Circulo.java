
package boletin4.pkg3;


public class Circulo {
    private double radio;
    private final double Pi=3.14;
    public Circulo (){
        
    }
    public Circulo(double r){
        radio=r;
    }
    public void setRadio(double ra){
        radio=ra;
    }
    public double getRadio(){
        return radio;
    }
    public double calArea(){
        double area=Pi*Math.pow(Pi, 2);
        return area;
    }
    public double calLongCir(){
       double longitudCir=2*this.Pi*this.radio;
    return longitudCir;
    
}
}
