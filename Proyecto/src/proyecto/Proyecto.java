/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.InputMismatchException;
import java.util.Random;

import java.util.Scanner;

public class Proyecto {

    static int arma = 1;
    static int vida = 20;
    static int dinero = 0;

    public static void bossfinal() throws InterruptedException {
        try{
        Random rand = new Random();
        System.out.println("*Entras*");
        Thread.sleep(1500);
        System.out.println("*Vez un minotauro gigante con un hacha*");
        Thread.sleep(3000);
        System.out.println("Minotauro- “¡Como te atreves a entrar!”");
        Thread.sleep(3000);
        System.out.println("*Se avalanza contra ti*");
        Thread.sleep(3000);
        int vidaboss = 500;
        Scanner sc = new Scanner(System.in);
        int ataca;
        limpiarpantalla.limpiar();
        System.out.println("Peleas contra el minotauro");
        Thread.sleep(3000);
        do {
            int dañoboss = rand.nextInt(5) + 1;
            limpiarpantalla.limpiar();
            vida = vida - dañoboss;
            System.out.println("El minotauro ataca!");
            System.out.println("Te hizo daño! *vida - " + dañoboss + "*");
            System.out.println("Vida restante del jugador= " + vida);
            System.out.println("");
            System.out.println("1: Para atacar 2: Para huir");
            ataca = sc.nextInt();
            limpiarpantalla.limpiar();
            if (ataca == 1) {
                System.out.println("Tu atacas");
                vidaboss = vidaboss - arma;
                System.out.println("Vida del boss " + vidaboss);
                Thread.sleep(1500);
            }
            if (ataca == 2) {
                System.out.println("*Logras huir...*");
                Thread.sleep(3000);
                fasefinal();
            }

            if (vida <= 0) {
                System.out.println("Moriste...");
                Thread.sleep(3000);
                System.exit(0);
            }

        } while (vidaboss > 50);
        limpiarpantalla.limpiar();
        System.out.println("*El minotauro lanza su hacha hacia ti*");
        System.out.println("1: Correr hacia el hacha 2: Esquivar a la izquierda");
        int esquivar = 0;
        boolean nosirve = false;
        while (nosirve != true) {

            esquivar = sc.nextInt();
            if (esquivar > 0 && esquivar < 3) {
                break;
            } else {
                continue;
            }
        }
        if (esquivar == 1) {
            limpiarpantalla.limpiar();
            System.out.println("*Te partio en  2...*");
            System.out.println("*Moriste*");
            System.exit(0);
        }
        if (esquivar == 2) {
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
        System.out.println("Presiona ENTER para continuar");
        String esperar = sc.nextLine();
        System.out.println("Tú- “Intentase matarme pero aun asi te lo agradezco”");
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
        }catch(InputMismatchException e){
            System.out.println("Algo paso...");
            
        }
    }

    public static void peleasrandomfasefinal() throws InterruptedException {
        Random rand = new Random();
        int mounstrorandom = rand.nextInt(10) + 0;
        int vidamounstro = rand.nextInt(40) + 1;
        int dañomounstro = rand.nextInt(3) + 1;
        String mounstros[] = {"Esqueleto", "Slime", "Zombie", "Gato", "Cienpies gigante", "Jabali asesino", "Araña gigante", "Ardilla asesina", "Leon", "Oso"};
        Scanner sc = new Scanner(System.in);
        String ataca;
        limpiarpantalla.limpiar();
        System.out.println("Peleas contra un " + mounstros[mounstrorandom]);
        Thread.sleep(3000);
        do {
            limpiarpantalla.limpiar();
            vida = vida - dañomounstro;
            System.out.println("El " + mounstros[mounstrorandom] + "ataca!");
            System.out.println("Te hizo daño! *vida - " + dañomounstro + "*");
            System.out.println("Vida restante del jugador= " + vida);
            System.out.println("");
            System.out.println("ENTER para atacar");
            ataca = sc.nextLine();
            limpiarpantalla.limpiar();
            System.out.println("Tu atacas");
            vidamounstro = vidamounstro - arma;
            System.out.println("Vida del " + mounstros[mounstrorandom] + " " + vidamounstro);
            Thread.sleep(1500);
            if (vida <= 0) {
                System.out.println("Moriste...");
                Thread.sleep(3000);
                System.exit(0);
            }

        } while (vidamounstro > 0);

        int vidarecuperada = rand.nextInt(5) + 2;
        System.out.println("Venciste!");
        Thread.sleep(1500);
        System.out.println("Dinero +5");
        dinero = dinero + 5;
        Thread.sleep(1500);
        System.out.println("Recuperas " + vidarecuperada + " de vida");
        vida = vida + vidarecuperada;
        Thread.sleep(3000);
        fasefinal();
        limpiarpantalla.limpiar();

    }

    public static void fasefinal() throws InterruptedException {
        int decisionfinal = 0;
        Scanner sc = new Scanner(System.in);
        boolean nosirve = false;
        System.out.println("1: Izquierda para pelear contra mounstros(+dinero) ");
        System.out.println("2: Pelear contra el jefe final (entrar a la sala)");
        System.out.println("3: Ir a la tienda");
        while (nosirve != true) {

            decisionfinal = sc.nextInt();
            if (decisionfinal > 0 && decisionfinal < 4) {
                break;
            } else {
                continue;
            }
        }
        if (decisionfinal == 1) {
            peleasrandomfasefinal();
        }
        if (decisionfinal == 2) {
            bossfinal();
        }
        if (decisionfinal == 3) {
            tienda();
        }

    }

    public static void peleasrandom() throws InterruptedException {
        Random rand = new Random();
        int mounstrorandom = rand.nextInt(10) + 0;
        int vidamounstro = rand.nextInt(10) + 1;
        int dañomounstro = rand.nextInt(3) + 1;
        String mounstros[] = {"Esqueleto", "Slime", "Zombie", "Gato", "Cienpies gigante", "Javali asesino", "Araña gigante", "Ardilla asesina", "Leon", "Oso"};
        Scanner sc = new Scanner(System.in);
        String ataca;
        limpiarpantalla.limpiar();
        System.out.println("Peleas contra un " + mounstros[mounstrorandom]);
        Thread.sleep(3000);
        do {
            limpiarpantalla.limpiar();
            vida = vida - dañomounstro;
            System.out.println("El " + mounstros[mounstrorandom] + "ataca!");
            System.out.println("Te hizo daño! *vida - " + dañomounstro + "*");
            System.out.println("Vida restante del jugador= " + vida);
            System.out.println("");
            System.out.println("ENTER para atacar");
            ataca = sc.nextLine();
            limpiarpantalla.limpiar();
            System.out.println("Tu atacas");
            vidamounstro = vidamounstro - arma;
            System.out.println("Vida del " + mounstros[mounstrorandom] + "=" + vidamounstro);
            Thread.sleep(1500);
            if (vida <= 0) {
                System.out.println("Moriste...");
                Thread.sleep(3000);
                System.exit(0);
            }

        } while (vidamounstro > 0);

        int vidarecuperada = rand.nextInt(5) + 2;
        System.out.println("Venciste!");
        Thread.sleep(1500);
        System.out.println("Sangre +5");
        dinero = dinero + 5;
        Thread.sleep(1500);
        System.out.println("Recuperas " + vidarecuperada + " de vida");
        vida = vida + vidarecuperada;
        Thread.sleep(3000);

    }

    public static void tienda() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int armaescojer;
        boolean repetir = false;
        limpiarpantalla.limpiar();
        System.out.println("******************************");
        System.out.println("*TIENDA DEL HOMBRE MISTERIOSO*");
        System.out.println("******************************");
        System.out.println("Comprar: ");
        System.out.println("1: Daño +5 valor: $5");
        System.out.println("2: Daño +3 valor: $3");
        System.out.println("3: Pocion de vida (vida+5) valor: $3");
        System.out.println("4: Regresar");
        System.out.println("Sangre restante= " + dinero);
        do {
            armaescojer = sc.nextInt();
            switch (armaescojer) {
                case 1:
                    if (dinero >= 5) {
                        dinero = dinero - 5;
                        arma = arma + 5;
                        System.out.println("Compraste 5 de daño...");
                        System.out.println("|Regresando a la tienda|");
                        Thread.sleep(1500);
                        tienda();
                    } else if (dinero < 5) {
                        System.out.println("No te alcanza");
                        Thread.sleep(1500);
                        tienda();
                    }
                    break;
                case 2:
                    if (dinero >= 3) {
                        dinero = dinero - 3;
                        arma = arma + 3;
                        System.out.println("Compraste 3 de daño...");
                        System.out.println("|Regresando a la tienda|");
                        Thread.sleep(1500);
                        tienda();

                    } else if (dinero < 3) {
                        System.out.println("No te alcanza");
                        Thread.sleep(1500);
                        tienda();
                    }
                    break;
                case 3:
                    if (dinero >= 3) {
                        dinero = dinero - 3;
                        vida = vida + 5;
                        System.out.println("Compraste una pocion...");
                        System.out.println("|Regresando a la tienda|");
                        Thread.sleep(1500);
                        tienda();
                    } else if (dinero < 2) {
                        System.out.println("No te alcanza");
                        Thread.sleep(1500);
                        tienda();
                    }
                    break;

                case 4:
                    limpiarpantalla.limpiar();
                    System.out.println("Vuelves al camino...");
                    Thread.sleep(1500);
                    fasefinal();
                    break;
            }

        } while (repetir != true);

    }

    public static void pelea() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String huyeataca;
        int dañomounstro = 1;
        int vidamounstro = 2;

        limpiarpantalla.limpiar();
        System.out.println("Peleas contra la bestia!");
        Thread.sleep(3000);
        do {
            limpiarpantalla.limpiar();
            vida = vida - dañomounstro;
            System.out.println("La bestia ataca!");
            System.out.println("Te hizo daño! *vida - " + dañomounstro + "*");
            System.out.println("Vida restante del jugador= " + vida);
            System.out.println("");
            System.out.println("Enter para atacar");
            huyeataca = sc.nextLine();
            limpiarpantalla.limpiar();
            System.out.println("Tu atacas");
            vidamounstro = vidamounstro - arma;
            System.out.println("Vida de la bestia= " + vidamounstro);
            Thread.sleep(1500);
        } while (vidamounstro > 0);

    }

    public static void camino2p() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String esperar;
        boolean nosirve = false;
        System.out.println("‘Tienes 2 caminos’");
        System.out.println("1: Hacia el frente 2: Izquierda");
        int caminos2 = 0;
        while (nosirve != true) {

            caminos2 = sc.nextInt();
            if (caminos2 > 0 && caminos2 < 3) {
                break;
            } else {
                continue;
            }
        }
        if (caminos2 == 1) {
            System.out.println("“Pues por aquí, se ve más iluminado…”");
            Thread.sleep(3000);
        } else if (caminos2 == 2) {
            System.out.println("‘caminas un buen rato sin un rumbo, el camino parece largo y la luz se va desvaneciendo quedando a obscuras’");
            Thread.sleep(6000);
            System.out.println("ENTER para regresar");
            esperar = sc.nextLine();
            esperar = sc.nextLine();
            camino2p();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        try{
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int sangre = 0;
        String esperar;
        boolean nosirve = false;
        System.out.println("*Corriendo*");
        Thread.sleep(1500);
        System.out.println("*Jadeos*");
        Thread.sleep(1500);
        System.out.println("*Algo caé*");
        Thread.sleep(1500);
        System.out.println("“AAAAAH!”");
        Thread.sleep(1500);
        System.out.println("¿eeh?, ¿Dónde estoy?, espera… ¡Quién soy?");
        Thread.sleep(6000);
        System.out.println("¿Qué ocurrió?, ¿Qué día es?");
        Thread.sleep(3000);
        System.out.println("¿cuánto ha pasado de que estoy desmayado/en coma?, me siento bastante… raro ");
        Thread.sleep(6000);
        System.out.println("¡AH! Mi cabeza");
        Thread.sleep(1500);
        System.out.println("*Ve al suelo*");
        Thread.sleep(1500);
        System.out.println("eso, es… ¿sangre?");
        Thread.sleep(1500);
        System.out.println("1: Investigar 2:Dejar atras");
        while (nosirve != true) {

            sangre = sc.nextInt();
            if (sangre > 0 && sangre < 3) {
                break;
            } else {
                continue;
            }
        }
        if (sangre == 1) {
            System.out.println("Oh vaya. Pues no es sangre, pero tampoco sé que es.");
            System.out.println("");
            System.out.println("ENTER para continuar");
            esperar = sc.nextLine();
            esperar = sc.nextLine();
        } else if (sangre == 2) {
            System.out.println("Mejor dejo eso ahí, dudo que se mía no tengo ninguna herida.");
            System.out.println("");
            System.out.println("ENTER para continuar");
            esperar = sc.nextLine();
            esperar = sc.nextLine();
        }
        System.out.println("Okey. Mmmmm…, al parecer me encuentro en una cueva, pero que es esa luz que sale por frente de mí ¿fuego?");
        System.out.println("¿focos? O es ¿luz del sol? No logro ver nada. Creo que tendré que moverme, dudo que convenga estar aquí");
        System.out.println("");
        System.out.println("Presiona ENTER para continuar");
        esperar = sc.nextLine();
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
        int primerapelea = 0;
        while (nosirve != true) {

            primerapelea = sc.nextInt();
            if (primerapelea > 0 && primerapelea < 3) {
                break;
            } else {
                continue;
            }
        }
        if (primerapelea == 1) {
            pelea();
            System.out.println("*Venciste a la bestia*");
        } else if (primerapelea == 2) {
            limpiarpantalla.limpiar();
            System.out.println("*Sales corriendo*");
            Thread.sleep(1500);
            System.out.println("‘caminas a ciegas por esta ruta’");
            Thread.sleep(1500);
            System.out.println("*te tropiezas con algo y este te hiere*");
            Thread.sleep(3000);
            System.out.println("“Que es esto con lo que me tropeze?, al parecer es algo filoso...”");
            Thread.sleep(3000);
            System.out.println("¿Ver con que tropeze? \n 1: Si 2: No");
            int tropeze = 0;
            while (nosirve != true) {

                tropeze = sc.nextInt();
                if (tropeze > 0 && tropeze < 3) {
                    break;
                } else {
                    continue;
                }
            }

            if (tropeze == 1) {
                limpiarpantalla.limpiar();
                System.out.println("¡Haz conseguido una daga vieja!");
                Thread.sleep(3000);
                arma = arma + 2;
                System.out.println("“puede que esto ayude de algo”");
                Thread.sleep(1500);
                System.out.println("‘sigues corriendo, pero no hay nada y está cerrado’");
                Thread.sleep(3000);
            } else if (tropeze == 2) {
                limpiarpantalla.limpiar();
                System.out.println("‘Sigues caminando, pero no hay nada y está cerrado’");
                Thread.sleep(3000);
            }
            System.out.println("*La bestia logra alcanzarte*");
            Thread.sleep(3000);
            System.out.println("Presiona ENTER para continuar");
            esperar = sc.nextLine();
            esperar = sc.nextLine();
            pelea();
        }

        System.out.println("*Venciste a la bestia*");
        Thread.sleep(1500);
        System.out.println("*La bestia suelta algo*");
        Thread.sleep(1500);
        System.out.println("“¿Que es esto?”");
        Thread.sleep(1500);
        System.out.println("“¡Es Sangre!”");
        Thread.sleep(1500);
        dinero = dinero + 5;
        System.out.println("*Sangre +5*");
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
        int personamisteriosa = 0;
        while (nosirve != true) {

            personamisteriosa = sc.nextInt();
            if (personamisteriosa > 0 && personamisteriosa < 3) {
                break;
            } else {
                continue;
            }
        }
        if (personamisteriosa == 1) {
            limpiarpantalla.limpiar();
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
        } else if (personamisteriosa == 2) {
            limpiarpantalla.limpiar();
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
        arma = arma + 5;
        Thread.sleep(1500);
        System.out.println("*corres*");
        Thread.sleep(1500);
        System.out.println("“corres por una ruta desconocida”");
        Thread.sleep(3000);
        System.out.println("*Gruñido*");
        Thread.sleep(1500);
        System.out.println("*tiemblas* *te encuentras con un mounstro*");
        Thread.sleep(3000);
        System.out.println("*comienza una batalla en la cual puedes morir*");
        Thread.sleep(3000);
        System.out.println("Presiona ENTER para continuar");
        esperar = sc.nextLine();
        esperar = sc.nextLine();
        peleasrandom();
        Thread.sleep(1500);
        System.out.println("“okey, creo que seguiré buscando una salida… o algo que me indique en dónde estoy al menos”");
        Thread.sleep(3000);
        peleasrandom();
        limpiarpantalla.limpiar();
        System.out.println("*caminas por un buen rato por un pasillo recto sin nada en particular. Hasta llegar a un sala con algo en el suelo*");
        System.out.println("Presiona enter para recogerlo: ");
        esperar = sc.nextLine();
        esperar = sc.nextLine();
        System.out.println("*es...un encendedor de aluminio*");
        Thread.sleep(1500);
        System.out.println("“¿Qué hará algo como esto aquí?, espero y tenga gas mínimo.”");
        Thread.sleep(3000);
        System.out.println("*coges encendedor y enciendes*");
        Thread.sleep(1500);
        System.out.println("“excelente tiene gas. Ahora que camino agarro -esto cada vez para ser un laberinto que una cueva-”");
        Thread.sleep(3000);

        System.out.println("*sigues hasta llegar a un lugar oscuro*");
        Thread.sleep(3000);
        System.out.println("*“Espera tengo el encendedor”*");
        Thread.sleep(1500);
        System.out.println("1: Encender 2: No enceder");
        int encenderono = 0;
        while (nosirve != true) {

            encenderono = sc.nextInt();
            if (encenderono > 0 && encenderono < 3) {
                break;
            } else {
                continue;
            }
        }
        if (encenderono == 1) {
            limpiarpantalla.limpiar();
            System.out.println("*Lo enciendes*");
            Thread.sleep(1500);
            System.out.println("*continuas*");
            Thread.sleep(1500);
        }
        if (encenderono == 2) {
            limpiarpantalla.limpiar();
            System.out.println("*Una bestia te mata*");
            Thread.sleep(3000);
            System.out.println("Perdiste...");
            Thread.sleep(3000);
            System.exit(0);
        }
        System.out.println("“Estoy quedando cansado de este “laberinto”.¿qué hago aquí? ¿por qué yo?.");
        Thread.sleep(3000);
        System.out.println("“Espero lograr salir...”");
        Thread.sleep(1500);
        System.out.println("*sigues caminando durante un rato sin llegar a nada*");
        Thread.sleep(3000);
        System.out.println("“¿Qué pasa con este camino? ¿no tiene final o que? Estoy harto”");
        Thread.sleep(3000);
        System.out.println("*se ve una rafaga de luz*");
        Thread.sleep(1500);
        System.out.println("*corres para ver que es y apagas el encendedor*");
        Thread.sleep(1500);
        System.out.println("*ves una sala con buena luz*");
        Thread.sleep(1500);
        System.out.println("**llegas a la sala, pero esta tiene  un hoyo**");
        Thread.sleep(3000);
        System.out.println("1: Ver que es 2: Izquierda");
        int decisionsala = 0;
        while (nosirve != true) {

            decisionsala = sc.nextInt();
            if (decisionsala > 0 && decisionsala < 3) {
                break;
            } else {
                continue;
            }
        }
        if (decisionsala == 1) {
            limpiarpantalla.limpiar();
            System.out.println("*Algo cae*");
            Thread.sleep(1500);
            System.out.println("“¿ehh?, ¿qué fue eso?”");
            Thread.sleep(1500);
        }
        if (decisionsala == 2) {
            peleasrandom();
            System.out.println("*Algo cae*");
            Thread.sleep(1500);
            System.out.println("“¿ehh?, ¿qué fue eso?”");
            Thread.sleep(1500);
        }
        System.out.println("1: Ver que es 2: Seguir camino");
        int quecayo = 0;
        while (nosirve != true) {

            quecayo = sc.nextInt();
            if (quecayo > 0 && quecayo < 3) {
                break;
            } else {
                continue;
            }
        }
        if (quecayo == 1) {
            limpiarpantalla.limpiar();
            System.out.println("*Intentas ver que cayó*");
            Thread.sleep(1500);
            System.out.println("*Chocas con algo, pero no logras ver que es*");
            Thread.sleep(3000);
            System.out.println("*Una bestia te destroza*");
            Thread.sleep(3000);
            System.exit(0);
        }
        if (quecayo == 2) {
            limpiarpantalla.limpiar();
            System.out.println("*Caminas hasta ver otra sala, pero esta tiene un hoyo en el suelo*");
            Thread.sleep(3000);
        }
        System.out.println("Presiona ENTER para bajar por el hoyo");
        esperar = sc.nextLine();
        System.out.println("*Intentas bajar, pero solo caes*");
        Thread.sleep(1500);
        System.out.println("*Ves que algo se acerca a ti*");
        Thread.sleep(1500);
        System.out.println("“¿eh? ¿qué es eso?”");
        Thread.sleep(1500);
        System.out.println("*logras ver mejor y es una mano*");
        Thread.sleep(1500);
        System.out.println("Alguien- “vamos chico, no tendré la mano estirada todo el tiempo”");
        Thread.sleep(3000);
        System.out.println("Presiona ENTER para tomar su mano");
        esperar = sc.nextLine();
        System.out.println("*Ya parado*");
        Thread.sleep(1500);
        System.out.println("Tú- “¿Quién eres tú?”");
        Thread.sleep(1500);
        System.out.println("Persona misteriosa- “Eso es lo de menos ahora, ¿Quieres comprar algo?”");
        Thread.sleep(6000);
        System.out.println("Tú-” ¿Qué? En primera: no tengo dinero.");
        Thread.sleep(3000);
        System.out.println("Tú-” En segunda: ¡Quién eres?”");
        Thread.sleep(3000);
        System.out.println("-Persona misteriosa- “¡JAJAJAJA!”");
        Thread.sleep(3000);
        System.out.println("-Tu- “¿Qué es tan gracioso?”");
        Thread.sleep(3000);
        System.out.println("Persona misteriosa- “Perdón, perdón; es que no había escuchado dinero en mucho tiempo”");
        Thread.sleep(6000);
        System.out.println("Tú- “¿Y eso que tiene de gracioso?”");
        Thread.sleep(3000);
        System.out.println("Persona misteriosa- “Bueno, aquí no se usa el dinero, si no sangre”");
        Thread.sleep(6000);
        System.out.println("Tú- “¿Qué?”");
        Thread.sleep(3000);
        System.out.println("Persona misteriosa- “Sí, como escuchaste. Aunque la sangre no solo es dinero si no un tipo de elixir que cura. Por lo cual la sangre es preciada”");
        System.out.println("pero solo la de las criaturas de aquí. La tuya y la mía no valen nada, solo para que sepas y no te quieras extraer medio litro y así comprar algo como la mayoría.");
        System.out.println("Presiona ENTER para continuar");
        esperar = sc.nextLine();
        System.out.println("Tú- “Espera ¿hay más gente aquí?”");
        Thread.sleep(3000);
        System.out.println("Persona misteriosa- “Claro que sí, que ¿creías ser el único en este “peculiar lugar”? dejame decirte no.”");
        Thread.sleep(6000);
        System.out.println("Tú- “Entonces ¿donde estan todos?”");
        Thread.sleep(3000);
        System.out.println("Persona misteriosa- “No se”");
        Thread.sleep(3000);
        System.out.println("Tú- “¿Eso que significa?”");
        Thread.sleep(3000);
        System.out.println("El- “¿Qué más va a significar? nose, no soy algo extraño para saber la ubicación de todos aquí.”");
        Thread.sleep(6000);
        System.out.println("No se de que me viste, pero vidente o cualquier cosa que pueda ver sujetos no soy yo. Pero, ya nos desviamos. Quieres comprar ¿sí o no?”");
        System.out.println("Presiona ENTER para continuar");
        esperar = sc.nextLine();
        System.out.println("Tú- “A ver que tienes”");
        System.out.println("");
        System.out.println("*Entras a la fase final*");
        Thread.sleep(3000);
        System.out.println("*A lo lejos vez una sala muy brillosa*");
        Thread.sleep(3000);
        System.out.println("¿“Que sera?”");
        Thread.sleep(3000);
        System.out.println("Presiona ENTER para continuar");
        esperar = sc.nextLine();
        limpiarpantalla.limpiar();
        tienda();

        fasefinal();
        }catch(InputMismatchException e){
            System.out.println("Solo pon numeros...");
        }
    }

}
