/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.Random;

import java.util.Scanner;

public class Proyecto {
    
    static int arma=1;
    static int vida=20;
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
            Thread.sleep(3000);
            do{
            limpiarpantalla.limpiar();
            vida=vida-dañomounstro;
            System.out.println("El "+mounstros[mounstrorandom]+ "ataca!");
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
            int vidarecuperada= rand.nextInt(5)+2;
            System.out.println("Recuperas "+vidarecuperada+ "de vida");
            vida=vida+vidarecuperada;
            
    }
    
    public static void tienda() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int armaescojer;
        boolean repetir=false;
        limpiarpantalla.limpiar();
        System.out.println("******************************");
        System.out.println("*TIENDA DEL HOMBRE MISTERIOSO*");
        System.out.println("******************************");
        System.out.println("Comprar: ");
        System.out.println("1: Daño +5 valor: $5");
        System.out.println("2: Daño +3 valor: $3");
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
                break;
        }
                
            
        
        }while(repetir!=true);
        
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
        
    }
    
    public static void pelea() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int huyeataca;
        int dañomounstro=1;
        int vidamounstro=5;
        
        
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
            camino2p();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
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
        camino2p();
        //continuacion camino2p
        System.out.println("“Espero que por aquí haya algo”");
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
            System.out.println("*Venciste a la bestia*");
        }
        else if(primerapelea==2){
            System.out.println("*Sales corriendo*");
            Thread.sleep(1500);
            System.out.println("‘caminas a ciegas por esta ruta’");
            Thread.sleep(1500);
            System.out.println("*te tropiezas con algo y este te hiere*");
        Thread.sleep(3000);
        System.out.println("“Que es esto con lo que me tropeze?, al parecer el algo filoso...”");
        Thread.sleep(3000);
        System.out.println("¿Ver con que tropeze? \n 1:si 2:no");
        int tropeze;
        tropeze=sc.nextInt();
        if (tropeze==1) {
            System.out.println("¡Haz conseguido una daga vieja!");
            Thread.sleep(3000);
            arma=arma+2;
            System.out.println("“puede que esto ayude de algo”");
            Thread.sleep(1500);
            System.out.println("‘sigues corriendo, pero no hay nada y está cerrado’");
            Thread.sleep(3000);
        }else if (tropeze==2){
            System.out.println("‘Sigues caminando, pero no hay nada y está cerrado’");
            Thread.sleep(3000);
        }
        System.out.println("*La bestia logra alcanzarte*");
        Thread.sleep(3000);
        pelea();
        }
        
        System.out.println("*Venciste a la bestia*");
        Thread.sleep(1500);
        System.out.println("*La bestia suelta algo circular*");
        Thread.sleep(1500);
        System.out.println("“¿Que es esto?”");
        Thread.sleep(1500);
        System.out.println("“¡Es dinero!”");
        Thread.sleep(1500);
        dinero=dinero+5;
        System.out.println("*Dinero +5*");
        Thread.sleep(1500);
        System.out.println("“Casi veo mi muerte. Tuve mucha suerte”");
        Thread.sleep(3000);
        System.out.println("“Tzz. Tendré que regresarme. Que pérdida de tiempo”");
        Thread.sleep(3000);
        System.out.println("*Suspiro*");
        Thread.sleep(1500);
        System.out.println("“Bueno, continuemos caminando”");
        Thread.sleep(1500);
        System.out.println("“¿Qué es eso?... ¿un hoyo? ... ”");
        Thread.sleep(1500);
        System.out.println("‘Te acercas…’");
        Thread.sleep(1500);
        System.out.println("*Caes por el hoyo*");
        Thread.sleep(1500);
        System.out.println("*No te haces ningun daño*");
        Thread.sleep(1500);
        System.out.println("“Veremos que hay por aquí”");
        Thread.sleep(1500);
        System.out.println("‘sigues caminando’");
        Thread.sleep(1500);
        System.out.println("‘llegas a una zona y hay una persona, está aún no te ve’");
        Thread.sleep(3000);
        System.out.println("1: Ir con la persona 2: Vas con sigilo para evitar que te vea");
        int personamisteriosa=sc.nextInt();
        if (personamisteriosa==1) {
            System.out.println("“¡Ey!”");
            Thread.sleep(1500);
            System.out.println("*La persona* “¿ah? Hola ¿qué pasa?”");
            Thread.sleep(3000);
            System.out.println("“Ven, tengo algo para ti”");
            Thread.sleep(3000);
            System.out.println("*Te da una bolsa*");
            Thread.sleep(1500);
            System.out.println("-Tú- “¿eeh?, ¿qué es esto?”");
            Thread.sleep(1500);
            System.out.println("*Volteas y no hay nadie*");
            Thread.sleep(1500);
        }
        else if (personamisteriosa==2){
            System.out.println("*Caminas lenta y cuidadosamente*");
            Thread.sleep(1500);
            System.out.println("*Voltea la persona*");
            Thread.sleep(1500);
            System.out.println("“hey, ¿a donde vas?”");
            Thread.sleep(1500);
            System.out.println("“Ven, tengo algo para ti”");
            Thread.sleep(3000);
            System.out.println("-Tu- “ho, ho, hola” “¿Qué tienes para mí?”");
            Thread.sleep(3000);
            System.out.println("*Te da una bolsa*");
            Thread.sleep(1500);
            System.out.println("-Tú- “¿eeh?, ¿qué es esto?”");
            Thread.sleep(1500);
            System.out.println("*Volteas y no hay nadie*");
            Thread.sleep(1500);
        }
        System.out.println("“¿eeh?”");
        Thread.sleep(1500);
        System.out.println("‘abres y ves que hay en la bolsa’");
        Thread.sleep(1500);
        System.out.println("‘encuentras un tipo de bebida roja, cuerda y una daga de plata’");
        Thread.sleep(3000);
        System.out.println("(Daño +5)");
        arma=arma+5;
        Thread.sleep(1500);
        System.out.println("*corres*");
        Thread.sleep(1500);
        System.out.println("“corres por una ruta desconocida”");
        Thread.sleep(3000);
        System.out.println("*Gruñido*");
        Thread.sleep(1500);
        System.out.println("*tiemblas* *te encuentras con un monto*");
        Thread.sleep(3000);
        System.out.println("*comienza una batalla en la cual puedes morir*");
        Thread.sleep(3000);
        peleasrandom();
        System.out.println("Venciste!");
        Thread.sleep(1500);
        System.out.println("Dinero +5");
        dinero=dinero+5;
        Thread.sleep(1500);
        System.out.println("“okey, creo que seguiré buscando una salida… o algo que me indique en dónde estoy al menos”");
        Thread.sleep(3000);
        System.out.println("‘tienes 2 rutas más’");
        System.out.println("1: Derecha 2: Izquierda");
        int decisiondespuespelea=sc.nextInt();
        if (decisiondespuespelea==1) {
            peleasrandom();
            System.out.println("Venciste!");
            Thread.sleep(1500);
            System.out.println("(Dinero +5)");
            dinero=dinero+5;
            Thread.sleep(1500);
            System.out.println("*caminas por un buen rato por un pasillo recto sin nada en particular. Hasta llegar a un sala con algo en el suelo*");
            System.out.println("Presiona enter para continuar: ");
            esperar=sc.nextLine();
            System.out.println("*es...un encendedor de aluminio*");
            Thread.sleep(1500);
            System.out.println("“¿Qué hará algo como esto aquí?, espero y tenga gas mínimo.”");
            Thread.sleep(3000);
            System.out.println("*coges encendedor y enciendes*");
            Thread.sleep(1500);
            System.out.println("“excelente tiene gas. Ahora que camino agarro -esto cada vez para ser un laberinto que una cueva-”");
            Thread.sleep(3000);
        }
    }
    
}
