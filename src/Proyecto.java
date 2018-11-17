/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

public class Proyecto {
    
    static int arma=0;
    static int vida=20;
    static int dinero=0;
    public static int tienda() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int armaescojer;
        boolean repetir=false;
        limpiarpantalla.limpiar();
        System.out.println("******************");
        System.out.println("*TIENDA DE PEPITO*");
        System.out.println("******************");
        System.out.println("Comprar: ");
        System.out.println("1: Arma 2 manos (daño+5) valor: $5");
        System.out.println("2: Arco (daño+3) valor: $3");
        System.out.println("3: Pocion de vida (vida+2) valor: $2");
        System.out.println("4: Regresar");
        do{
        armaescojer=sc.nextInt();
        switch(armaescojer){
            case 1:
                if(dinero>=5){
                dinero=dinero-5;
                arma=arma+5;
                System.out.println("Compraste un arma de dos manos...");
                System.out.println("|Regresando a la tienda|");
                Thread.sleep(1500);
                tienda();
                }else if(dinero<5){
                    System.out.println("No te alcanza");
                    Thread.sleep(1500);
                    tienda();
                }
                repetir=true;
                break;
            case 2:
                if(dinero>=3){
                dinero=dinero-3;
                arma=arma+3;
                System.out.println("Compraste un arco...");
                System.out.println("|Regresando a la tienda|");
                Thread.sleep(1500);
                tienda();
               
                }else if(dinero<3){
                    System.out.println("No te alcanza");
                    Thread.sleep(1500);
                    tienda();
                }
                repetir=true;
                break;
            case 3:
                if(dinero>=2){
                dinero=dinero-2;
                vida=vida+3;
                System.out.println("Compraste una pocion...");
                System.out.println("|Regresando a la tienda|");
                Thread.sleep(1500);
                tienda();
                }else if(dinero<2){
                    System.out.println("No te alcanza");
                    Thread.sleep(1500);
                    tienda();
                }
                repetir=true;
                break;
                
            case 4:
                limpiarpantalla.limpiar();
                System.out.println("Vuelves al camino...");
                Thread.sleep(1500);
                caminoprincipal();
                break;
        }
                
            
        
        }while(repetir!=true);
        return arma;
        }
      
    
    public static void caminoprincipal() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        limpiarpantalla.limpiar();
        String ruta="";
        System.out.println("Izquierda, Derecha o ver Estadisticas(stats)");
        ruta=sc.nextLine();
        if (ruta.equals("izquierda")) {
            limpiarpantalla.limpiar();
            pelea();
            limpiarpantalla.limpiar();
            System.out.println("Venciste!");
            System.out.println("Dinero +5");
            dinero=dinero+5;
            Thread.sleep(3000);
            stats();
            
        } else if (ruta.equals("derecha")) {
            tienda();
            
        }else if (ruta.equals("stats")){
            stats();
        }
        
    
    }
    
    public static void stats() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        limpiarpantalla.limpiar();
        String continuar;
        String opcionstats="";
        System.out.println("****************");
        System.out.println("**Estadisticas**");
        System.out.println("****************");
        System.out.println("Dinero: "+dinero);
        System.out.println("Daño: "+arma);
        System.out.println("Vida: "+vida);
        System.out.println("");
        System.out.print("Presione cualquier tecla para continuar: ");
        continuar=sc.nextLine();
        caminoprincipal();
        
    }
    
    public static void pelea() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int huyeataca;
        int dañomounstro=2;
        int vidamounstro=10;
        
        
            limpiarpantalla.limpiar();
            System.out.println("Te haz topado con un mounstro!");
            Thread.sleep(3000);
            do{
            limpiarpantalla.limpiar();
            vida=vida-dañomounstro;
            System.out.println("El mounstro ataca!");
            System.out.println("Te hizo daño! *vida - "+dañomounstro+"*");
            System.out.println("Vida restante del jugador= "+vida);
            System.out.println("");
            System.out.println("Atacas o huyes?");
            System.out.println("1: ataque");
            System.out.println("2: Huir");
            huyeataca=sc.nextInt();
            if(huyeataca==1){
            limpiarpantalla.limpiar();
            System.out.println("Tu atacas");
            vidamounstro=vidamounstro-arma;
            System.out.println("Vida del mounstro= "+vidamounstro);
            Thread.sleep(1500); 
            
            }else if(huyeataca==2){
                System.out.println("Huiste!");
                Thread.sleep(1500);
                caminoprincipal();
            }
        }while(vidamounstro>0);
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);
        int escojerclase;
        
        System.out.println("Escoje tu clase");
        System.out.println("1: Berserker 2: Guerrero");
        escojerclase=sc.nextInt();
        switch(escojerclase){
            case 1:
                arma=5;
                System.out.println("Tu daño inicial es 5");
                Thread.sleep(1500);
                break;
            case 2:
                arma=6;
                System.out.println("Tu daño inicial es 6");
                Thread.sleep(1500);
                break;
            default:
                System.out.println("Escoje bien");
        }
        
        caminoprincipal();
        
        
        
        
        
    }
    
}
