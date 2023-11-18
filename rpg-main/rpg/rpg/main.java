package rpg;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class main {

    public static int MostrarMenu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*****************     MENU   ******************");
        System.out.println("***********************************************");
        System.out.println("*****************  1. LUCHAR        ***********");
        System.out.println("*****************  2. TIENDA        ***********");
        System.out.println("*****************  3. INVENTARIO    ***********");
        System.out.println("*****************  4. ESTADISTICAS  ***********");
        System.out.println("*****************  5. ABRIR CAJAS   ***********");
        System.out.println("*****************  6. SALIR         ***********");
        System.out.println("***********************************************");
        int opcion = teclado.nextInt();
        return opcion;
    }

    public static void Tienda() {
        System.out.println("************************       TIENDA       ***********************************");
        System.out.println("*******************************************************************************");
        System.out.println("***************** 1.  Comprar Juggernaut (+1 salud)        *********    20 oros");
        System.out.println("***************** 2.  Comprar carne de rata ( +2 salud)    *********    40 oros");
        System.out.println("***************** 3.  Mejorar ataque (+10 puntos)          *********   100 oros");
        System.out.println("***************** 4.  TIENDA DE ARMAS                      *********           ");
        System.out.println("*****************        SELECCIONA UN NÚMERO              ********************");

    }

    public static String Bienvenida() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("Bienvenido al despertar de las Sombras de Medac");
        System.out.println("***********************************************");
        System.out.println("Pulsa enter para continuar...");

        System.out.println("¿Cual es tu nombre viajero?");
        String NombreUsuario = teclado.nextLine();
        System.out.println("Encantado de conocerte " + NombreUsuario
                + " ...tome asiento junto al fuego hay mucho de lo que hablar...");
        System.out.println("Pulsa enter para continuar...");
        teclado.nextLine();
        return NombreUsuario;

    }

    public static void Mensaje() {
        System.out.println("\n");
        System.out.println(
                "TE QUEDAN MUCHAS AVENTURAS POR DELANTE VIAJERO, HA,HA,HA... SELECCIONA LO QUE DESEAS HACER AHORA...SI TE ATREVES");
    }

    public static int Pueblo() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Parece que vienes de muy lejos... ¿Cual es tu origen camarada? ");
        System.out.println("1. Fuerte de los Guerreros de las minas");
        System.out.println("2. Aldea de Paladines de luz");
        System.out.println("3. Castillo Demoniaco de la Muerte");
        System.out.println("4. Ciudad Botín Elfica");
        int pueblo = teclado.nextInt();

        return pueblo;
    }

    public static void main(String[] args) {

        // crear armas
        Armas arma1 = new Armas("El palo abreventanas del Évano", 40);
        Armas arma2 = new Armas("La pierna de PEDROISONOMIKUE", 70);
        Armas arma3 = new Armas("La regleta que peta", 30);
        Armas arma4 = new Armas("Un piti", 20);
        Armas arma5 = new Armas("El rotu gastao", 10);
        // cramos enemigos
        int random1 = (int) (Math.random() * 40 + 20);
        int random2 = (int) (Math.random() * 20 + 10);
        int random3 = (int) (Math.random() * 35 + 15);
        int random4 = (int) (Math.random() * 70 + 50);

        Enemigo enemigo1 = new Enemigo("Javi", random1);
        Enemigo enemigo2 = new Enemigo("Jose", random2);
        Enemigo enemigo3 = new Enemigo("Luis", random3);
        Enemigo enemigo4 = new Enemigo("PEDROISONOMIKUE", random4);
        Enemigo[] enemigos = new Enemigo[4];
        enemigos[0] = enemigo1;
        enemigos[1] = enemigo2;
        enemigos[2] = enemigo3;
        enemigos[3] = enemigo4;

        Scanner entrada = new Scanner(System.in);
        String Nombre;
        int Salud, Dinero, Ataque;
        Jugador jugador1 = null; // se tiene que inicializar el jugador ya que al solo existir en el if cabe la
                                 // posibilidad de que no entre por lo que se iguala a "null" que significa vacio
                                 // y ya .
        // CREAMOS OBJETOS DE RELEVANCIA
        // creamos variables en el main que llamen a las otras clases

        Bienvenida();

        int NumeroPueblos = Pueblo(); ///

        if (NumeroPueblos == 1) {
            jugador1 = new Jugador("Guerrero", 10, 35, 150, 5);
            // jugador1.setNombre("Guerrero");

            System.out.println("Se aprecia que eres un feroz Guerrero dispuesto a la batalla!!");
        } else if (NumeroPueblos == 2) {
            jugador1 = new Jugador("Paladin", 15, 20, 300, 5);
            System.out.println("El brillo de tu armadura sagrada casi me deja ciego Paladin...");
        } else if (NumeroPueblos == 4) {
            jugador1 = new Jugador("Elfo", 8, 22, 500, 5);
            System.out.println("Menos mal que mi arca está vacia de oro eh Granujila... bienvenido elfo");
        } else if (NumeroPueblos == 3) {
            jugador1 = new Jugador("Demonio", 20, 30, 50, 5);
            System.out.println("Ya decía yo que olía a azufre por aqui... bienvenido Gran Demonio");
        }
        int salud_jugador = jugador1.getSalud();

        int ataque_jugador = jugador1.getAtaque();
        int keys = jugador1.getKeys();
        //
        int ataque_enemigo1 = enemigo1.getAtaque();
        int ataque_enemigo2 = enemigo2.getAtaque();
        int ataque_enemigo3 = enemigo3.getAtaque();
        int ataque_enemigo4 = enemigo4.getAtaque();

        int ataque_arma1 = arma1.getAtaque();
        int ataque_arma2 = arma2.getAtaque();
        int ataque_arma3 = arma3.getAtaque();
        int ataque_arma4 = arma4.getAtaque();
        int ataque_arma5 = arma5.getAtaque();

        Armas[] armas = new Armas[5];
        armas[0] = arma1;
        armas[1] = arma2;
        armas[2] = arma3;
        armas[3] = arma4;
        armas[4] = arma5;
        int contador_evano = 0;
        int contador_piti = 0;
        int contador_pierna = 0;
        int contador_rotu = 0;
        int contador_regleta = 0;
        while (true) {

            Mensaje();
            int opcion = MostrarMenu();
            if (opcion == 4 && jugador1 != null) { // esto lo que quiere decir es que funcione este if cuando opcion sea
                                                   // 4 y
                                                   // jugador 1 exista.
                System.out.println(jugador1);
            } else if (opcion == 1 && jugador1 != null) {
                Scanner teclado = new Scanner(System.in);
                int random5 = (int) (Math.random() * 4);
                int random6 = (int) (Math.random() * 5);
                System.out.println("AL ATAQUEEEEEEEEEEEEEEEEEEEEE!!");
                System.out.println("Ha aparecido un enemigo salvaje...¿estarás a su altura? ");// array con el random
                                                                                               // para
                                                                                               // sacar al enemigo
                                                                                               // aleatorio

                int j = random5;
                int k = random6;
                System.out.println("Ha aparecido ante tí " + "\n" + enemigos[j] + " con el arma: " + "\n" + armas[k]);

                System.out.println("¿Quieres enfrentarte a esta bestia?");
                System.out.println(
                        "Recuerda si alcanzas la victoria obtendrás recompensas... pero si pierdes perderás puntos de salud");
                System.out.println("1. LUCHAR");
                System.out.println("2. HUIR");
                int OpcionLucha = teclado.nextInt();
                if (OpcionLucha == 1) {
                    Armas arma_elegida = armas[k];
                    Enemigo enemigo_elegido = enemigos[j];

                    if (jugador1.getAtaque() >= (enemigo_elegido.getAtaque() + arma_elegida.getAtaque())) {
                        System.out.println(" YOU WIN! has ganado 1 llave");
                        jugador1.setkeys(jugador1.getKeys() + 1);
                        enemigo1.setAtaque(enemigo1.getAtaque() + 20);
                        enemigo2.setAtaque(enemigo2.getAtaque() + 25);
                        enemigo3.setAtaque(enemigo3.getAtaque() + 40);
                        enemigo4.setAtaque(enemigo3.getAtaque() + 50);
                    } else {
                        System.out.println("YOU LOSEE!- 3 de vida pa mi JAJAJAJJA");
                        System.out.println(
                                "Te recomendamos que pases por la tienda o pruebes suerte en las cajas para aumentar tus estadísticas");

                        jugador1.setSalud(jugador1.getSalud() - 3);
                    }

                } else {
                    System.out.println("****************************************************************************");
                    System.out.println("Has huido con exito... por esta vez, nos quedamos con un punto tuyo de vida!");
                    System.out.println(
                            "Te recomendamos que pases por la tienda o pruebes suerte en las cajas para aumentar tus estadísticas");
                    System.out.println("****************************************************************************");
                    jugador1.setSalud(jugador1.getSalud() - 1);
                }
            } else if (opcion == 2 && jugador1 != null) {
                Tienda();

                Scanner teclado1 = new Scanner(System.in);
                int Tienda = teclado1.nextInt();
                if (Tienda == 1) {
                }
            } else if (opcion == 3 && jugador1 != null) {
                System.out.println("****************************************");
                System.out.println("**********     INVENTARIO     **********");
                System.out.println("****************************************");
                System.out.println("El palo abreventanas del Évano -- NIVEL: " + contador_evano);
                System.out.println("La pierna de PEDROISONOMIKUE -- NIVEL: " + contador_pierna);
                System.out.println("La regleta que peta -- NIVEL: " + contador_regleta);
                System.out.println("Un piti -- NIVEL: " + contador_piti);
                System.out.println("El rotu gastao -- NIVEL: " + contador_rotu);
            
            
            } else if (opcion == 5) {
                Scanner teclado2 = new Scanner(System.in);
                while (true) {
                    System.out.println("BIENVENIDO A LA APERTURA DE CAJAS!!!!!!");
                    System.out.println("Abrir cajas te costará 1 llave");
                    System.out.println(
                            "Podrás obtener llaves al derrotar enemigos... que los dioses de la fortuna te guien en tu camino");
                    System.out.println("1 PARA ABRIR CAJA, 2 PARA SALIR AL MENU");
                    int opcion_caja = teclado2.nextInt();
                    if (opcion_caja == 1) {
                        if (jugador1.getkeys() >= 1) {
                            // cobramos la llave
                            jugador1.setkeys(jugador1.getKeys() - 1);
                            // código para la apertura de cajas
                            String[] recompensas = { "+100 de dinero", "+50 de dinero", "+20 puntos de ataque",
                                    "+50 puntos de ataque", "El palo abreventanas del Évano",
                                    "La pierna de PEDROISONOMIKUE", "La regleta que peta", "Un piti",
                                    "El rotu gastao" };
                            int randomIndex = (int) (Math.random() * recompensas.length);
                            String recompensa = recompensas[randomIndex];

                            switch (recompensa) {
                                case "+100 de dinero":
                                    System.out.println("WOOOW GANASTE 100 OROS");
                                    jugador1.setDinero(jugador1.getDinero() + 100);
                                    break;
                                case "+50 de dinero":
                                    System.out.println("WOOOW GANASTE 50 OROS");
                                    jugador1.setDinero(jugador1.getDinero() + 50);
                                    break;
                                case "+20 puntos de ataque":
                                    System.out.println("WOOOW GANASTE 20 DE ATAQUE");
                                    jugador1.setAtaque(jugador1.getAtaque() + 20);
                                    break;
                                case "+50 puntos de ataque":
                                    System.out.println("WOOOW GANASTE 50 DE ATAQUE");
                                    jugador1.setAtaque(jugador1.getAtaque() + 50); // EXISTE LA POSIBILIDAD DE QUE TE
                                                                                   // TOQUE MAS DE UNA VEZ EL MISMO ARMA
                                                                                   // QUE LO QUE HARÁ SERÁ UPGRADEARTELA
                                                                                   // PARA HACER SU DAÑO
                                    break; // COMO SI LLEVARAS 2, 3, 4 o LAS QUE SEAN
                                case "El palo abreventanas del Évano":
                                    System.out.println("WOOOW GANASTE El palo abreventanas del Évano +40 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 40);
                                    contador_evano += 1;
                                    break;
                                case "La regleta que peta":
                                    System.out.println("WOOOW GANASTE La regleta que peta +30 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 30);
                                    contador_regleta += 1;
                                    break;
                                case "Un piti":
                                    System.out.println("WOOOW GANASTE Un piti + 20 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 20);
                                    contador_piti += 1;
                                    break;
                                case "El rotu gastao":
                                    System.out.println("WOOOW GANASTE El rotu gastao + 10 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 10);
                                    contador_rotu += 1;
                                    break;
                                case "La pierna de PEDROISONOMIKUE":
                                    System.out.println("WOOOW GANASTE La pierna de PEDROISONOMIKUE +70 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 70);
                                    contador_pierna += 1;
                                    break;
                            }

                        } else {
                            System.out.println("No te quedan llaves... vuelve a la lucha para conseguir más");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            
        } // while
    }// cierre main

}// cierre clase