/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static proyecto.Proyecto.fasefinal;
import static proyecto.Proyecto.vida;

/**
 *
 * @author pc
 */
public class metodos {
       
    static int arma=60;
    static int vida=6000;
    static int dinero=0;
    public static void peleasrandom() throws InterruptedException{
        Random rand = new Random();
        int mounstrorandom = rand.nextInt(10) + 0;
        int vidamounstro = rand.nextInt(10) + 1;
        int dañomounstro = rand.nextInt(3) + 1;
        String mounstros[]={"Esqueleto","Slime","Zombie","Gato","Cienpies gigante","","","","",""};
        Scanner sc = new Scanner(System.in);
        int ataca;
            limpiarpantalla.limpiar();
            System.out.println("Peleas contra un "+mounstros[mounstrorandom]);
            System.out.println("Presione enter para continuar");
            String continuar=sc.nextLine();
            do{
            limpiarpantalla.limpiar();
            vida=vida-dañomounstro;
            System.out.println("El "+mounstros[mounstrorandom]+ " ataca!");
            System.out.println("Te hizo daño! *vida - "+dañomounstro+"*");
            System.out.println("Vida restante del jugador= "+vida);
            System.out.println("");
            System.out.println("1: Ataque");
            ataca=sc.nextInt();
            if(ataca==1){
            limpiarpantalla.limpiar();
            System.out.println("Tu atacas");
            vidamounstro=vidamounstro-arma;
            System.out.println("Vida del "+ mounstros[mounstrorandom] +" "+vidamounstro);
            Thread.sleep(1500); 
            }
            
        }while(vidamounstro>0);
            if(vida<0){
                System.out.println("Moriste...");
                Thread.sleep(3000);
                System.exit(0);
            }
            int vidarecuperada= rand.nextInt(5) +2;
            System.out.println("Recuperas "+vidarecuperada+ " de vida");
            vida=vida+vidarecuperada;
            
    }
        
        

    public static void main(String[] args) throws InterruptedException {
        
    
  
        Random rand = new Random();
        System.out.println("*Entras*");
        Thread.sleep(1500);
        System.out.println("*Vez un minotauro gigante con un hacha*");
        Thread.sleep(3000);
        System.out.println("Minotauro- “¡Como te atreves a entrar!”");
        Thread.sleep(3000);
        System.out.println("*Se avalanza contra ti*");
        System.out.println("pulsa cualquier tecla");
        Thread.sleep(3000);
        int vidaboss = 500;
            Scanner sc = new Scanner(System.in);
            int ataca;
            limpiarpantalla.limpiar();
            System.out.println("Peleas contra el minotauro");
            Thread.sleep(3000);
            do{
            int dañoboss = rand.nextInt(5) +1;
            limpiarpantalla.limpiar();
            vida=vida-dañoboss;
            System.out.println("El minotauro ataca!");
            System.out.println("Te hizo daño! *vida - "+dañoboss+"*");
            System.out.println("Vida restante del jugador= "+vida);
            System.out.println("");
            System.out.println("1: Para atacar 2: Para huir");
            ataca=sc.nextInt();
            limpiarpantalla.limpiar();
                if (ataca==1) {
                    System.out.println("Tu atacas");
                    vidaboss=vidaboss-arma;
                    System.out.println("Vida del boss " +vidaboss);
                    Thread.sleep(1500);
                }
                if (ataca==2) {
                    System.out.println("*Logras huir...*");
                    Thread.sleep(3000);
                    fasefinal();
                }
            
            if(vida<=0){
                System.out.println("Moriste...");
                Thread.sleep(3000);
                System.exit(0);
            }
            
                
            
        }while(vidaboss>50);
            limpiarpantalla.limpiar();
            System.out.println("*El minotauro lanza su hacha hacia ti*");
            System.out.println("1: Correr hacia el hacha 2: Esquivar a la izquierda");
            int esquivar=0;
            boolean nosirve=false;
            while(nosirve!=true){
            
            esquivar=sc.nextInt();
            if(esquivar>0 && esquivar<4){
                break;
            }else {
                continue;
            }
        }
            if (esquivar==1) {
                limpiarpantalla.limpiar();
                System.out.println("*Te partio en  2...*");
                System.out.println("*Moriste*");
                System.exit(0);
        }
            if (esquivar==2) {
                System.out.println("*La esquivas*");
                Thread.sleep(3000);
                System.out.println("*Corres hacia el y le cortas una pierna*");
                Thread.sleep(3000);
        }
            System.out.println("Minotauro- “Parece que he perdido”");
            Thread.sleep(3000);
            System.out.println("*Se abre una puerta gigantesca detras suyo*");
            Thread.sleep(3000);
            System.out.println("Minotauro- “Puedes salir...”");
            Thread.sleep(3000);
            System.out.println("“Intentase matarme pero aun asi te lo agradezco”");
            Thread.sleep(3000);
            System.out.println("*Sales de la cueva*");
            Thread.sleep(3000);
            System.out.println("*Vez todo muy iluminado*");
            Thread.sleep(3000);
            System.out.println("*Te tapas los ojos*");
            Thread.sleep(3000);
            System.out.println("*Te desmayas*");
            Thread.sleep(3000);
            System.out.println("*Despiertas en un hospital sin piernas...*");
            Thread.sleep(3000);
            System.exit(0);
    }
    }

