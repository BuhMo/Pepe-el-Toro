/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

public class Proyecto {
    
    static int arma=1;
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
            System.out.println("Peleas contra la bestia!");
            Thread.sleep(3000);
            do{
            limpiarpantalla.limpiar();
            vida=vida-dañomounstro;
            System.out.println("La bestia ataca!");
            System.out.println("Te hizo daño! *vida - "+dañomounstro+"*");
            System.out.println("Vida restante del jugador= "+vida);
            System.out.println("");
            System.out.println("Atacas o huyes?");
            System.out.println("1: ataque");
            huyeataca=sc.nextInt();
            if(huyeataca==1){
            limpiarpantalla.limpiar();
            System.out.println("Tu atacas");
            vidamounstro=vidamounstro-arma;
            System.out.println("Vida de la bestia= "+vidamounstro);
            Thread.sleep(1500); 
            }
            
        }while(vidamounstro>0);
            
            }

    
    public static void camino2p() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        String esperar;
        System.out.println("Okey. Mmmmm…, al parecer me encuentro en una cueva, pero que es esa luz que sale por frente de mí ¿fuego?");
        System.out.println("¿focos? O es ¿luz del sol? No logro ver nada. Creo que tendré que moverme, dudo que convenga estar aquí");
        System.out.println("");
        System.out.println("ENTER para continuar");
        esperar=sc.nextLine();
        esperar=sc.nextLine();
        System.out.println("");
        System.out.println("‘Tienes 2 caminos’");
        System.out.println("1: Hacia el frente 2: Izquierda");
        int caminos2;
        caminos2=sc.nextInt();
        if (caminos2==1) {
            System.out.println("“Pues por aquí, se ve más iluminado…”");
            Thread.sleep(3000);
        }
        else if (caminos2==2){
            System.out.println("‘caminas un buen rato sin un rumbo, el camino parece largo y la luz se va desvaneciendo quedando a obscuras’");
            Thread.sleep(6000);
            System.out.println("ENTER para regresar");
            esperar=sc.nextLine();
            esperar=sc.nextLine();
            camino2p();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int escojerclase;
        int sangre;
        String esperar;
        System.out.println("*Corriendo*");
        Thread.sleep(1500);
        System.out.println("*Jadeos*");
        Thread.sleep(1500);
        System.out.println("*Algo cae*");
        Thread.sleep(1500);
        System.out.println("“AAAAAH!”");
        Thread.sleep(1500);
        System.out.println("¿eeh?, ¿Dónde estoy?, espera… ¡Quién soy?");
        Thread.sleep(6000);
        System.out.println("¿Qué ocurrió?, ¿Qué día es?");
        Thread.sleep(3000);
        System.out.println("¿cuánto ha pasado de que estoy desmayado/en coma?, me siento bastante… ¿raro? ");
        Thread.sleep(6000);
        System.out.println("¡AH! Mi cabeza");
        Thread.sleep(1500);
        System.out.println("*Ve al suelo*");
        Thread.sleep(1500);
        System.out.println("eso, es… ¿sangre?");
        Thread.sleep(1500);
        System.out.println("1: Investigar 2:Dejar atras");
        sangre=sc.nextInt();
        if (sangre==1) {
            System.out.println("Oh vaya. Pues no es sangre, pero tampoco sé que es.");
            System.out.println("");
            System.out.println("ENTER para continuar");
            esperar=sc.nextLine();
            esperar=sc.nextLine();
        }else if (sangre==2){
            System.out.println("Mejor dejo eso ahí, dudo que se mía no tengo ninguna herida.");
            System.out.println("");
            System.out.println("ENTER para continuar");
            esperar=sc.nextLine();
            esperar=sc.nextLine();
           
        }
        System.out.println("Okey. Mmmmm…, al parecer me encuentro en una cueva, pero que es esa luz que sale por frente de mí ¿fuego?, ¿focos? O es ¿luz del sol? No logro ver nada. Creo que tendré que moverme, dudo que convenga estar aquí");
        System.out.println("");
        System.out.println("ENTER para continuar");
        esperar=sc.nextLine();
        esperar=sc.nextLine();
        System.out.println("");
        System.out.println("‘Tienes 2 caminos’");
        System.out.println("1: Hacia el frente 2: Izquierda");
        int caminos2;
        caminos2=sc.nextInt();
       
        if (caminos2==1) {
            System.out.println("“Pues por aquí, se ve más iluminado…”");
            Thread.sleep(3000);
            System.out.println("");
            System.out.println("‘llegas a un sitio con más rutas’, ‘¿Por donde prosigues?’"); 
        }
        else if (caminos2==2){
            System.out.println("‘caminas un buen rato sin un rumbo, el camino parece largo y la luz se va desvaneciendo quedando a obscuras’");
            Thread.sleep(6000);
            
        }
       
        camino2p();
        //continuacion camino2p
        System.out.println("“Espero que por aquí allá algo”");
        Thread.sleep(3000);
        System.out.println("*pisas algo*");
        Thread.sleep(1500);
        System.out.println("*Gruñido de al parecer un animal*");
        Thread.sleep(1500);
        System.out.println("“¿Qué?, ¿Qué es eso?”");
        Thread.sleep(1500);
        System.out.println("*La bestia/animal se lanza contra ti*");
        Thread.sleep(1500);
        System.out.println("1: Atacar 2: Huyes");
        int primerapelea;
        primerapelea=sc.nextInt();
        if (primerapelea==1) {
            pelea();
        }
        else if(primerapelea==2){
            System.out.println("‘caminas a ciegas por esta ruta’");
            Thread.sleep(1500);
        }
        System.out.println("*te tropiezas con algo y este te hiere*");
        Thread.sleep(3000);
        
        
        
        
        
    }
    
}
