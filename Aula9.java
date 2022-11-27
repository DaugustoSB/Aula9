/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NOT - DANILO
 */
public class Aula9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rdm = new Random();
        ArrayList list = new ArrayList();
         

        System.out.println("***********O PROBLEMA DE JOSEPHUS***********");
        System.out.println("");
        System.out.println("Quantas pessoas? ");
        int pes = scn.nextInt();
        scn.nextLine();
        
      
        System.out.println("Qual são os dados das pessoas? ");
        for(int i = 0; i < pes; i++){
            System.out.print("Pessoa: "+ (i+1) +": ");
            list.add(scn.nextLine());
            
        }

        
        int pos = rdm.nextInt(list.size());
        System.out.println("****************************************************");
        System.out.println("A contagem irá começar pela pessoa: "+ list.get(pos));
        
        
        System.out.println("****************************************************");
        System.out.println("Qual o intervalo que as pessoas serão eliminadas? ");
        int itv = scn.nextInt();
        scn.nextLine();
        System.out.println("****************************************************");
        
       
        int b = 1;
        int val = pos + itv;
        while (list.size() != 1) {
            if (val > list.size()) {
                val = val - list.size();
            }else{
                System.out.println("O "+ b +"º pessoa removida foi: " + list.get(val-1));
                b++;
                list.remove(val-1);
                val = (val-1) + itv;
            }
    }
        System.out.println("****************************************************");
        System.out.println("A Pessoa sobrevivente foi: "+ list);
              
        
    }
    
}