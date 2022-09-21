/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apvdourpvd;

import java.util.Scanner;

/**
 *
 * @author Marquinho
 */
public class Aluno {
   
       
       
    
    
    public void resultado(){
         double nota1,nota2,nota3,media;
       Scanner in = new Scanner(System.in);
       System.out.println("Coloque a primeira nota");
            nota1 = in.nextInt();
        System.out.println("Coloque a segunda nota");
             nota2 = in.nextInt();
        System.out.println("Coloque a terceira nota");
            nota3 = in.nextInt();
                 media = (nota1+nota2+nota3)/3;
                 System.out.println("A media do aluno é: " + media);
                        if (media >= 6) {
                            System.out.println("Voce foi aprovado");
                        
                        } else if  (media >= 4 && media <6) {
                        System.out.println("Voce foi parar na recuperacao");
                        }  else if  (media <= 3) {
                            System.out.println("Voce foi reprovado");  
                        }
                        }
}
