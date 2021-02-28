package CuerpoJuego;

import Consola.DibujosAscii; //para traer los colores 
import static CuerpoJuego.MenuPrincipal.ejecutar;
import static CuerpoJuego.MenuPrincipal.sc;
import static CuerpoJuego.MenuPrincipal.dibujar; //para traer clases/dibujos ASCII
import Objetos.Auto;
import Objetos.Jugador;
import Objetos.Rival;

public class Competicion {

    Rival rival = new Rival();
    int tamañoPista;
    int coeficientePista;

    public void competicion(Jugador jugador, Auto auto) {
        int numeroRivales = ((int) (Math.random() * 2) + 3);
        int premioDeCarreara;
        ejecutar.limpiarPantalla();
        System.out.println("BIENVENIDO A LA COMPETICION\n");
        System.out.println("Con que carro desea participar \n");
        jugador.mostrarAutos();
        int slot = Integer.parseInt(sc.nextLine());
        slot -= 1;
        if (jugador.garajeAutos[slot] == null || slot < 0) {
            System.out.println("ESE LUGAR ESTA VACIO");
            ejecutar.esperaEnter();
            ejecutar.limpiarPantalla();
            competicion(jugador, auto);
        } else {
            System.out.println("Seleccione la pista en donde desea correr:\n\t|1. PISTA DE TIERRA|\t|2. PISTA DE ARENA|\t|3. PISTA DE CONCRETO|");
            switch (sc.nextLine()) {
                case "1":
                    coeficientePista = 4;
                    tamañoPista = 80;
                    if (jugador.garajeAutos[slot].revisarGasolina(tamañoPista)) {
                        System.out.println("GENIAL, TODO ESTA LISTO\n");
                        System.out.println("Escogio la pista de Tierra\n\n\tTamaño: 80 casillas\tCoeficiente: 4\n");
                        dibujar.pistaTierra();
                        ejecutar.esperaEnter();
                        ejecutar.limpiarPantalla();

                        while (jugador.getContador() < tamañoPista && rival.getContadorRival() < tamañoPista) {
                            System.out.println("\nPulse para tirar ");
                            String respuesta = sc.nextLine();
                            dibujar.bordePista(tamañoPista, DibujosAscii.cafe + "▒" + DibujosAscii.reset + DibujosAscii.reset);
                            System.out.println("");
                            jugador.avanzarAuto(jugador.garajeAutos[slot].moverCasillas(coeficientePista), tamañoPista, "-", jugador.garajeAutos[slot].getColor(), jugador.garajeAutos[slot].getCaracter());
                            for (int i = 0; i < numeroRivales; i++) {
                                rival.avanzarAuto(rival.moverCasillas(coeficientePista), tamañoPista);
                            }
                            dibujar.bordePista(tamañoPista, DibujosAscii.cafe + "▒" + DibujosAscii.reset + DibujosAscii.reset);
                        }
                        System.out.println("\n\tSu auto se movio: " + jugador.getContador());
                        System.out.println("\tHa consumido: " + jugador.getContador() + " de Gasolina");
                        jugador.garajeAutos[slot].cobrarGasolina(jugador.getContador());
                        System.out.println(jugador.verificarGanador(jugador.getContador(), rival.getContadorRival(), jugador, rival.getnombreRandom(), rival.getnombreRandom(), rival.getnombreRandom()));
                        premioDeCarreara = ((rival.getAceleracionRival()) + (((int) (Math.random() * 10) + 1) + coeficientePista));
                        System.out.println("\n\nUsted ha ganado: " + premioDeCarreara + " gemas y " + premioDeCarreara + " monedas");
                        System.out.println("\t\t\tVUELVA PRONTO");
                        ejecutar.esperaEnter();

                    } else {
                        System.out.println("\t\tUSTED NO CUENTA CON EL TANQUE LLENO");
                        ejecutar.esperaEnter();

                    }

                    ejecutar.limpiarPantalla();
                    break;

                case "2":

                    coeficientePista = 2;
                    tamañoPista = 90;
                    if (jugador.garajeAutos[slot].revisarGasolina(tamañoPista)) {
                        System.out.println("GENIAL, TODO ESTA LISTO\n");
                        System.out.println("Escogio la pista de Arena\n\n\tTamaño: 90 casillas\tCoeficiente: 2\n");
                        dibujar.pistaArena();
                        ejecutar.esperaEnter();
                        ejecutar.limpiarPantalla();

                        while (jugador.getContador() < tamañoPista && rival.getContadorRival() < tamañoPista) {
                            System.out.println("\nPulse para tirar ");
                            String respuesta = sc.nextLine();
                            dibujar.bordePista(tamañoPista, DibujosAscii.fblanco + DibujosAscii.amarillo + "▒" + DibujosAscii.reset + DibujosAscii.reset);
                            System.out.println("");
                            jugador.avanzarAuto(jugador.garajeAutos[slot].moverCasillas(coeficientePista), tamañoPista, "-", jugador.garajeAutos[slot].getColor(), jugador.garajeAutos[slot].getCaracter());
                            for (int i = 0; i < numeroRivales; i++) {
                                rival.avanzarAuto(rival.moverCasillas(coeficientePista), tamañoPista);
                            }
                            dibujar.bordePista(tamañoPista, DibujosAscii.fblanco + DibujosAscii.amarillo + "▒" + DibujosAscii.reset + DibujosAscii.reset);
                        }
                        System.out.println("\n\tSu auto se movio: " + jugador.getContador());
                        System.out.println("\tHa consumido: " + jugador.getContador() + " de Gasolina");
                        jugador.garajeAutos[slot].cobrarGasolina(jugador.getContador());
                        System.out.println(jugador.verificarGanador(jugador.getContador(), rival.getContadorRival(), jugador, rival.getnombreRandom(), rival.getnombreRandom(), rival.getnombreRandom()));
                        premioDeCarreara = ((rival.getAceleracionRival()) + (((int) (Math.random() * 10) + 1) + coeficientePista));
                        System.out.println("\n\nUsted ha ganado: " + premioDeCarreara + " gemas y " + premioDeCarreara + " monedas");
                        System.out.println("\t\t\tVUELVA PRONTO");
                        ejecutar.esperaEnter();
                    } else {
                        System.out.println("\t\tUSTED NO CUENTA CON EL TANQUE LLENO");
                        ejecutar.esperaEnter();

                    }
                    ejecutar.limpiarPantalla();
                    break;
                case "3":

                    coeficientePista = 6;
                    tamañoPista = 100;
                    if (jugador.garajeAutos[slot].revisarGasolina(tamañoPista)) {
                        System.out.println("GENIAL, TODO ESTA LISTO\n");
                        System.out.println("Escogio la pista de concreto\n\n\tTamaño: 100 casillas\tCoeficiente: 6\n");
                        dibujar.pistaConcreto();
                        ejecutar.esperaEnter();
                        ejecutar.limpiarPantalla();

                        while (jugador.getContador() < tamañoPista && rival.getContadorRival() < tamañoPista) {
                            System.out.println("\nPulse para tirar ");
                            String respuesta = sc.nextLine();
                            dibujar.bordePista(tamañoPista, DibujosAscii.negro + DibujosAscii.blanco + "▒" + DibujosAscii.reset + DibujosAscii.reset);
                            System.out.println("");
                            jugador.avanzarAuto(jugador.garajeAutos[slot].moverCasillas(coeficientePista), tamañoPista, "-", jugador.garajeAutos[slot].getColor(), jugador.garajeAutos[slot].getCaracter());
                            for (int i = 0; i < numeroRivales; i++) {
                                rival.avanzarAuto(rival.moverCasillas(coeficientePista), tamañoPista);
                            }
                            dibujar.bordePista(tamañoPista, DibujosAscii.negro + DibujosAscii.blanco + "▒" + DibujosAscii.reset + DibujosAscii.reset);
                        }

                        System.out.println("\n\tSu auto se movio: " + jugador.getContador());
                        System.out.println("\tHa consumido: " + jugador.getContador() + " de Gasolina");
                        jugador.garajeAutos[slot].cobrarGasolina(jugador.getContador());
                        System.out.println(jugador.verificarGanador(jugador.getContador(), rival.getContadorRival(), jugador, rival.getnombreRandom(), rival.getnombreRandom(), rival.getnombreRandom()));
                        premioDeCarreara = ((rival.getAceleracionRival()) + (((int) (Math.random() * 10) + 1) + coeficientePista));
                        System.out.println("\n\nUsted ha ganado: " + premioDeCarreara + " gemas y " + premioDeCarreara + " monedas");
                        System.out.println("\t\t\tVUELVA PRONTO");
                        ejecutar.esperaEnter();
                    } else {
                        System.out.println("\t\tUSTED NO CUENTA CON EL TANQUE LLENO");
                        ejecutar.esperaEnter();

                    }
                    ejecutar.limpiarPantalla();
                    break;
                default:
                    ejecutar.valorInvalido();
                    competicion(jugador, auto);
            }
            jugador.setContador(0);
            rival.setContadorRival(0);
        }

    }
}
