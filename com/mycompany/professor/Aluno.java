/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.professor;

import java.util.Scanner;

/**
 *
 * @author Marquinho
 */
public class Aluno {
    public float totalp;
    public float valor;
    public float res;
    
 public void resultado(){
     Scanner dados = new Scanner(System.in);
     
     System.out.println("Quantas pessoas há na mesa?");
     totalp = dados.nextFloat();
     
     System.out.println("Qual o valor total da conta?");
     valor = dados.nextFloat();
     
     res = valor/totalp;
     System.out.println("O valor a pagar por pessoa é:" + res);
     
 }
     
     
 }
    
    

