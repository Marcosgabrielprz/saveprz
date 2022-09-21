/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundograu;

import java.util.Scanner;

/**
 *
 * @author Marquinho
 */
public class resulteq {
    
    int a, b, c, delta, d= -4, b2, v2;
    double r1, r2;
    Scanner scan = new Scanner(System.in);
    
    public void Iniciar(){
    
    
            System.out.println("Digite o Valor de 'a': ");    
            a = scan.nextInt();
            while(a == 0) {
                System.err.println("O valor de 'a' não pode ser igual a '0'");
                System.out.println("Digite novamente um valor para 'A': ");
                a = scan.nextInt();
            }
            System.out.println("Digite o valor de 'b': ");
            b = scan.nextInt();
            
            System.out.println("Digite o Valor de 'c': ");
            c = scan.nextInt();
    
            System.out.println("Resolvendo o Valor de Delta");
            System.out.println("Colocando na Fomula, temos:" +b +"²"+d+"."+a+"."+c);
            
    
}
}

