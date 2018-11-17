/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

public class Proyecto {
    
    
    
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);
        int escojerclase;
        int arma=0;
        int vida=20;
        int dinero=0;
        System.out.println("Escoje tu clase");
        System.out.println("1: Berserker 2: Guerrero");
        escojerclase=sc.nextInt();
        switch(escojerclase){
            case 1:
                arma=5;
                System.out.println("Tu daño es 5");
                break;
            case 2:
                arma=6;
                System.out.println("Tu daño es 6");
                break;
            default:
                System.out.println("Escoje bien");
        }
        
        metodos.caminoprincipal(arma,vida,dinero);

        metodos.stats(arma,vida,dinero);
        
    }
    
}
