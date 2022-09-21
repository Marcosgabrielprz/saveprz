/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bhaskara;

/**
 *
 * @author Marquinho
 */
public class resultado {
    
    int a=1;
    int b=-2;
    int c=4;   
public void resultado(){
    double delta = Math.pow(b, 2)-(4*a*c);
    double denominador = 2*a;
    double numeradorx1 = -b+Math.sqrt(delta);
    double numeradorx2 = -b-Math.sqrt(delta);
    double x1 = numeradorx1/denominador;
    double x2 = numeradorx2/denominador;
    
    if(delta>=0) {
        if(x1==x2){
            System.out.println("X1 = X2 ="+String.format("%.2f",x1));
        }else{ 
            System.out.println("X1 ="+x1);
            System.out.println("X2 = "+x2);
        }
    }else {
        System.out.println("Nao existe raizes reais");
        }
}
}
