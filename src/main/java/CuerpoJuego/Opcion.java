package CuerpoJuego;

import Objetos.Jugador;
import Objetos.Auto;
import static CuerpoJuego.MenuPrincipal.ejecutar;
import static CuerpoJuego.MenuPrincipal.dibujar;
import static CuerpoJuego.MenuPrincipal.sc;

public class Opcion {

    String opcion;
    String respuesta;

    public void competir(Jugador jugadorRegistrado, Auto auto) {
        Competicion competicion = new Competicion();
        dibujar.texto1Competir();
        System.out.println("\t\n" + jugadorRegistrado.mostrarDatos());
        System.out.println("\nQue deseas hacer por aca?\n\t1.Competir.\n\t0.Regresar al menu principal.");
        opcion = sc.nextLine();
        switch (opcion) {

            case "0":
                
                break;

            case "1":
                competicion.competicion(jugadorRegistrado, auto);
                competir(jugadorRegistrado, auto);
                break;

            default:
                ejecutar.valorInvalido();
                competir(jugadorRegistrado, auto);
        }
    }

    public void ruleta(Jugador jugadorRegistrado) {

        double random = Math.random();
        dibujar.texto2Ruleta();
        System.out.println("\t\n" + jugadorRegistrado.mostrarDatos());
        dibujar.textoPremios();
        System.out.println("\nQue deseas hacer por aca?\n\t1.Tirar la ruleta.\n\t0.Regresar al menu principal.");
        opcion = sc.nextLine();
        switch (opcion) {

            case "0":
                break;

            case "1":

                if (jugadorRegistrado.revisiarPago(5, 0)) {
                    jugadorRegistrado.pagar(5, 0);
                    if (random <= 0.10) {
                        jugadorRegistrado.ganar(40, 0);
                        dibujar.premio40gemas();
                    } else if (random > 0.10 && random <= 0.25) {
                        jugadorRegistrado.ganar(0, 75);
                        dibujar.premio75monedas();
                    } else if (random > 0.25 && random <= 0.30) {
                        jugadorRegistrado.ganar(1000, 0);
                        dibujar.premio1000gemas();
                    } else if (random > 0.30 && random <= 0.35) {
                        jugadorRegistrado.ganar(0, 2000);
                        dibujar.premio2000monedas();
                    } else if (random > 0.35 && random <= 65) {
                        jugadorRegistrado.ganar(5, 0);
                        dibujar.premio5gemas();
                    } else if (random > 0.65 && random <= 1.00) {
                        jugadorRegistrado.ganar(0, 10);
                        dibujar.premio10monedas();
                    }
                } else {
                    System.out.println("LO SIENTO USTED CUENTA CON GEMAS INSUFICIENTES");
                }
                ejecutar.esperaEnter();
                ejecutar.limpiarPantalla();
                ruleta(jugadorRegistrado);
                break;

            default:
                ejecutar.valorInvalido();
                ruleta(jugadorRegistrado);
        }
    }

    public void garage(Jugador jugadorRegistrado, Auto auto) {

        Tienda tienda = new Tienda();
        dibujar.texto3Garage();
        System.out.println("\t\n" + jugadorRegistrado.mostrarDatos());
        System.out.println("\nQue deseas hacer por aca?\n\t\t1.Ver autos.\t\t3.Modificar autos\n\t\t2.Comprar autos\t\t0.Regresar al menu principal.");
        opcion = sc.nextLine();
        switch (opcion) {

            case "0":
                break;

            case "1":
                jugadorRegistrado.mostrarAutos();
                ejecutar.esperaEnter();
                garage(jugadorRegistrado, auto);
                break;

            case "2":
                tienda.tiendaAutos(jugadorRegistrado);
                garage(jugadorRegistrado, auto);
                break;

            case "3":
                tienda.comprarMejoras(jugadorRegistrado, auto);
                garage(jugadorRegistrado, auto);
                break;
            default:
                ejecutar.valorInvalido();
                garage(jugadorRegistrado, auto);
        }
    }

    public void pistas(Jugador jugadorRegistrado) {
        dibujar.texto4Pistas();
        System.out.println("\t\n" + jugadorRegistrado.mostrarDatos());
        System.out.println("\nSeleccione la opcion que desea\n\n\t1.Pista de Tierra.\t3.Pista de Concreto.");
        System.out.println("\t2.Pista de arena.\t0. Regresar al Menu principal.\n\n");
        opcion = sc.nextLine();
        switch (opcion) {

            case "0":
                break;

            case "1":
                System.out.println("\t\tPISTA DE TIERRA\n\nTamaño de 80 casillas\nAgarre en pista medio (4)\n");
                dibujar.pistaTierra();
                ejecutar.esperaEnter();
                pistas(jugadorRegistrado);
                break;

            case "2":
                System.out.println("\t\tPISTA DE ARENA\n\nTamaño de 90 casillas\nAgarre en pista bajo (2)\n");
                dibujar.pistaArena();
                ejecutar.esperaEnter();
                pistas(jugadorRegistrado);
                break;

            case "3":
                System.out.println("\t\tPISTA DE CONCRETO\n\nTamaño de 100 casillas\nAgarre en pista alto (6)\n");
                dibujar.pistaConcreto();
                ejecutar.esperaEnter();
                pistas(jugadorRegistrado);
                break;

            default:
                ejecutar.valorInvalido();
                pistas(jugadorRegistrado);
        }
    }

    public void estadisticasYReportes(Jugador jugadorRegistrado, Auto auto) {
        int slot;
        
        dibujar.texto5EstadYRepor();
        System.out.println("\t\n" + jugadorRegistrado.mostrarDatos());
        System.out.println("\nQue deseas hacer por aca?\n\t1.Ver estadisticas de la ultima partida.\t0.Regresar\n\t2.Ver estadisticas del juego.\n\t3.Ver esstadisticas del jugador");
        opcion = sc.nextLine();
        switch (opcion) {

            case "0":
                
                break;

            case "1":
                System.out.println("usted esta viendo sus ultimas estadisticas");
                System.out.println(jugadorRegistrado.getGanadores());
                System.out.println();
                ejecutar.esperaEnter();
                ejecutar.limpiarPantalla();
                estadisticasYReportes(jugadorRegistrado, auto);
                break;
                
            case "2":
                System.out.println("De sus autos: ");
                jugadorRegistrado.mostrarAutos();
                System.out.println("seleccione al que quiere explorar sus estadisticas: ");
                slot = Integer.parseInt(sc.nextLine());
                ejecutar.limpiarPantalla();
                jugadorRegistrado.garajeAutos[slot-1].mostrarCaracteristicas();
                System.out.println("La gasolina consumida por 1tu " +jugadorRegistrado.garajeAutos[slot-1].getNombre()+" durante el juego es de: " +jugadorRegistrado.garajeAutos[slot-1].getContadorGasolinaQuemada() +" galones");
                System.out.println("y le ha comprado un total de: " +jugadorRegistrado.garajeAutos[slot-1].getContadorGasolinaComprada()+" galones.");
                ejecutar.esperaEnter();
                ejecutar.limpiarPantalla();
                estadisticasYReportes(jugadorRegistrado, auto);
                break;
             
            case "3":
                System.out.println("\nUsted ha gastado un total de: " +jugadorRegistrado.getContadorOro()+" monedas.");
                System.out.println("Usted ha gastado un total de: "+jugadorRegistrado.getContadorGemas()+" gemas.");
                ejecutar.esperaEnter();
                ejecutar.limpiarPantalla();
                estadisticasYReportes(jugadorRegistrado, auto);
                break;
                
            default:
                ejecutar.valorInvalido();
                estadisticasYReportes(jugadorRegistrado, auto);
        }

    }

    public void salir() {
        ejecutar.limpiarPantalla();
        dibujar.despedida();
        sc.close();
        System.exit(0);
    }
}
