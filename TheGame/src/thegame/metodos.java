/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class metodos {
    public static int caminoprincipal(int arma,int dinero, int vida) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        String ruta="";
        System.out.println("Izquierda o derecha");
        ruta=sc.nextLine();
        if (ruta.equals("izquierda")) {
            limpiarpantalla.limpiar();
            pelea(vida,arma,dinero);
            limpiarpantalla.limpiar();
            System.out.println("Venciste!");
            System.out.println("Dinero +5");
            dinero=dinero+5;
            Thread.sleep(4500);
            
        } else if (ruta.equals("derecha")) {
            System.out.println("");
        }
        return dinero;
    }
    
    public static void stats(int dinero,int vida,int arma){
        Scanner sc = new Scanner(System.in);
        String opcionstats="";
        System.out.println("Deseas ver tus estadisticas?");
        opcionstats=sc.nextLine();
        if(opcionstats.equals("si")){
        System.out.println("Dinero: "+dinero);
        System.out.println("Daño: "+arma);
        System.out.println("Vida: "+vida);
        }
    }
    
    public static void pelea(int vida,int arma, int dinero) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int huyeataca;
        int dañomounstro=2;
        int vidamounstro=10;
        
        do{
            limpiarpantalla.limpiar();
            System.out.println("");
            System.out.println("El mounstro ataca");
            vida=vida-dañomounstro;
            System.out.println("");
            System.out.println("Vida restante del jugador= "+vida);
            System.out.println("");
            System.out.println("Atacas o huyes?");
            System.out.println("1: ataque");
            System.out.println("2: Huir");
            huyeataca=sc.nextInt();
            if(huyeataca==1){
            System.out.println("Tu atacas");
            vidamounstro=vidamounstro-arma;
            System.out.println("Vida del mounstro= "+vidamounstro);
            Thread.sleep(4500); 
            
            }else if(huyeataca==2){
                System.out.println("Huiste!");
                break;
            }
        }while(vidamounstro>0);
        
        
        
}
}
