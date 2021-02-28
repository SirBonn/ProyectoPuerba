    package CuerpoJuego;

import Objetos.Auto;
import Objetos.Jugador;
import Consola.Accion;
import Consola.DibujosAscii;
import java.util.Scanner;

public class InicioJuego {

    String nick1;
    double monedas = 50;
    int gemas = 30;
    public Jugador jugadorRegistrado;
    public Auto auto;

    private final Accion ejecutar = new Accion();
    private final DibujosAscii dibujar = new DibujosAscii();
    private final Tienda partes = new Tienda();
    Scanner sc = new Scanner(System.in);

    public void terminosYCondiciones() {
        String respuesta0;
        dibujar.mensajeBienvenido();
        do {
            System.out.println("\nDespues de leer los terminos y condiciones.\nEsta de acuerdo?");
            System.out.println("1.SI\t\t\t2.NO");
            respuesta0 = sc.nextLine();
            if ("2".equals(respuesta0)) { //utilizamos .equals para comparar los datos tipo string con la condicion
                dibujar.gatoInsistente();
            } else if (!"1".equals(respuesta0) && !"2".equals(respuesta0)) {
                dibujar.fail();
            }
        } while (!"1".equals(respuesta0));
        ejecutar.esperaEnter();
        ejecutar.limpiarPantalla();
    }  

    public Jugador registrarse() {  //hacemos que retorne un ubjeto tipo jugador que crearemos en este metodo
        dibujar.mensajeRegistro();
        System.out.println("\n\nIngesa tu edad: ");
        String edad = sc.nextLine();
        System.out.println("\n\nProsigamos con el registro, cual es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("\nQue buen nombre, pero " + nombre + " no es lo suficiente rudo para este juego");
        System.out.println("Necesita un nick, como quieres apodarte?:");
        nick1 = sc.nextLine();
        System.out.println("\nSuper, te queda mejor " + nick1 + " que " + nombre);
        this.jugadorRegistrado = new Jugador(nick1, gemas, monedas);
        ejecutar.esperaEnter();
        ejecutar.limpiarPantalla();
        return this.jugadorRegistrado;
    }

    public Auto seleccionarAutoInicial() {
        String opcion;

        dibujar.selleccionAuto();
        System.out.println("Opcion 1:\n\tHonda Civic\n\tMotor lineal de 4cilindros");
        System.out.println("\n===================================================\n");
        System.out.println("Opcion 2:\n\tToyota Supra\n\tMotor lineal de 6 cilindros");
        System.out.println("\n===================================================\n");
        System.out.println("Opcion 3:\n\tNissan 300zx\n\tMotor en V de 6 cilindros");
        System.out.println("\n===================================================\n");

        do {
            System.out.println("Digita el numero del auto con el que deseas comenzar: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    ejecutar.limpiarPantalla();
                    jugadorRegistrado.comprarAuto(new Auto(partes.nombre[0], partes.motor[0], 2,1, 100, DibujosAscii.amarillo,partes.caracter[0]));
                    this.auto = new Auto(partes.nombre[0], partes.motor[0],2,1, 100, DibujosAscii.amarillo,partes.caracter[0]);
                    System.out.println("");
                    break;

                case "2":
                    ejecutar.limpiarPantalla();
                    jugadorRegistrado.comprarAuto(new Auto(partes.nombre[1], partes.motor[1], 2,1, 100, DibujosAscii.amarillo,partes.caracter[1]));
                    this.auto = new Auto(partes.nombre[1], partes.motor[1], 2,1, 100, DibujosAscii.amarillo,partes.caracter[1]);
                    System.out.println("");
                    break;

                case "3":
                    ejecutar.limpiarPantalla();
                    jugadorRegistrado.comprarAuto(new Auto(partes.nombre[2], partes.motor[2],  2,1, 100,DibujosAscii.amarillo, partes.caracter[2]));
                    this.auto = new Auto(partes.nombre[2], partes.motor[2],2,1, 100, DibujosAscii.amarillo,partes.caracter[2]);
                    System.out.println("");
                    break;

                default:
                    dibujar.fail();
                    break;
            }
        } while (!"1".equals(opcion) && !"2".equals(opcion) && !"3".equals(opcion));
        ejecutar.esperaEnter();
        ejecutar.limpiarPantalla();
        dibujar.bonoTxt();
        ejecutar.esperaEnter();
        ejecutar.limpiarPantalla();
        return this.auto;
    }
}
