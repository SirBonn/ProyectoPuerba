package CuerpoJuego;

import Objetos.Jugador;
import Objetos.Auto;
import Consola.DibujosAscii;
import static CuerpoJuego.MenuPrincipal.dibujar;
import static CuerpoJuego.MenuPrincipal.ejecutar;
import static CuerpoJuego.MenuPrincipal.sc;

public class Tienda {

    String[] nombre = {"Honda Civic", "Toyota Supra", "Nissan 300zx", "Audi TT", "Mazda RX-8"}; //autos rivales
    String[] motor = {"Lineal de 4 cilindros", "Lineal 6 cilindros", "V6", "Lineal de 4 cilindros", "Motor Rotativo de 2 rotores"};
    String[] caracter = {"]|:=:-\u001b[0m", "]8-8)>\u001b[0m", "|]8=8>\u001b[0m", "]:-:-\u001b[0m", "]8=:>\u001b[0m"}; // "]8-:>\u001b[0m", "||:=:)\u001b[0m", "l8=:) \u001b[0m", "[|8=8) \u001b[0m"};

    public void tiendaAutos(Jugador jugador) {
        
        ejecutar.limpiarPantalla();
        System.out.println(jugador.mostrarDatos() + "\n");
        dibujar.menuCompraAutos();
        System.out.println("\n\nTe quedan " +(5-jugador.getNumAuto())+ " espacios en tu garaje");
        System.out.println("\nCual desea comprar?");
        switch (sc.nextLine()) {
            case "0":
                break;
            case "1":
                if (jugador.revisiarPago(50, 0)) {
                    jugador.pagar(50, 0);
                    jugador.comprarAuto(new Auto(nombre[0], motor[0], 2/*potencia*/, 1/*coeficiente de llantas*/, 100/*gasolina*/, DibujosAscii.amarillo, caracter[0]));
                    ejecutar.esperaEnter();
                } else {
                    System.out.println(DibujosAscii.rojo + "\tGemas insuficientes" + DibujosAscii.reset);
                    ejecutar.esperaEnter();
                }
                tiendaAutos(jugador);
                break;
            case "2":
                if (jugador.revisiarPago(60, 0)) {
                    jugador.pagar(60, 0);
                    jugador.comprarAuto(new Auto(nombre[1], motor[1], 2/*potencia*/, 1/*coeficiente de llantas*/, 100/*gasolina*/, DibujosAscii.amarillo, caracter[1]));
                    ejecutar.esperaEnter();
                } else {
                    System.out.println(DibujosAscii.rojo + "\tGemas insuficientes" + DibujosAscii.reset);
                    ejecutar.esperaEnter();
                }
                tiendaAutos(jugador);
                break;
            case "3":
                if (jugador.revisiarPago(70, 0)) {
                    jugador.pagar(70, 0);
                    jugador.comprarAuto(new Auto(nombre[2], motor[2], 2/*potencia*/, 1/*coeficiente de llantas*/,100/*gasolina*/, DibujosAscii.amarillo, caracter[2]));
                    ejecutar.esperaEnter();
                } else {
                    System.out.println(DibujosAscii.rojo + "\tGemas insuficientes" + DibujosAscii.reset);
                    ejecutar.esperaEnter();
                }
                tiendaAutos(jugador);
                break;
            case "4":
                if (jugador.revisiarPago(80, 0)) {
                    jugador.pagar(80, 0);
                    jugador.comprarAuto(new Auto(nombre[3], motor[3], 2/*potencia*/, 1/*coeficiente de llantas*/, 100/*gasolina*/, DibujosAscii.amarillo, caracter[3]));
                    ejecutar.esperaEnter();
                } else {
                    System.out.println(DibujosAscii.rojo + "\tGemas insuficientes" + DibujosAscii.reset);
                    ejecutar.esperaEnter();
                }
                tiendaAutos(jugador);
                break;
            case "5":
                if (jugador.revisiarPago(90, 0)) {
                    jugador.pagar(90, 0);
                    jugador.comprarAuto(new Auto(nombre[4], motor[4], 2/*potencia*/, 1/*coeficiente de llantas*/, 100/*gasolina*/, DibujosAscii.amarillo, caracter[4]));
                    ejecutar.esperaEnter();
                } else {
                    System.out.println(DibujosAscii.rojo + "\tGemas insuficientes" + DibujosAscii.reset);
                    ejecutar.esperaEnter();
                }
                tiendaAutos(jugador);
                break;
            default:
                ejecutar.valorInvalido();
                tiendaAutos(jugador);
        }

    }

    public void comprarMejoras(Jugador jugador, Auto auto) {
        String opcion;
        String opcionMenu;
        ejecutar.limpiarPantalla();
        System.out.println(jugador.mostrarDatos());
        jugador.mostrarAutos();
        System.out.println("\n\nque auto deseas modificar?");
        int slot = Integer.parseInt(sc.nextLine());
        slot -= 1;
        if (jugador.garajeAutos[slot] == null || slot < 0 ) {
            System.out.println("ESE LUGAR ESTA VACIO");
            ejecutar.esperaEnter();
            ejecutar.limpiarPantalla();
            comprarMejoras(jugador, auto);
        } else {

            dibujar.menuMejoras();
            System.out.println("\n\nque le deseas mejorar a tu " + jugador.garajeAutos[slot].getNombre());
            opcionMenu = sc.nextLine();
            ejecutar.limpiarPantalla();
            switch (opcionMenu) {
                case "0":

                    break;
                case "1":
                    dibujar.nivelMejoras(" gemas: ", " 05 ", " 50 ", " 35 ", DibujosAscii.magenta);
                    System.out.println("seleccione el nivel de mejora:");
                    opcion = sc.nextLine();
                    if ("1".equals(opcion)) {
                        if (jugador.revisiarPago(5, 0)) {
                            jugador.garajeAutos[slot].mejorarAceleracion(4);
                            jugador.pagar(5, 0);
                            System.out.println(jugador.garajeAutos[slot].mostrarCaracteristicas());
                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON GEMAS NECESARIAS");
                            ejecutar.esperaEnter();
                        }
                        ejecutar.limpiarPantalla();
                    }
                    if ("2".equals(opcion)) {

                        if (jugador.revisiarPago(20, 0)) {
                            jugador.garajeAutos[slot].mejorarAceleracion(5);
                            jugador.pagar(20, 0);
                            System.out.println(jugador.garajeAutos[slot].mostrarCaracteristicas());
                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON GEMAS NECESARIAS");
                            ejecutar.esperaEnter();
                        }
                        ejecutar.limpiarPantalla();
                    }
                    if ("3".equals(opcion)) {

                        if (jugador.revisiarPago(35, 0)) {
                            jugador.garajeAutos[slot].mejorarAceleracion(7);
                            jugador.pagar(35, 0);
                            System.out.println(jugador.garajeAutos[slot].mostrarCaracteristicas());
                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON GEMAS NECESARIAS");
                            ejecutar.esperaEnter();
                        }
                        ejecutar.limpiarPantalla();
                    }
                    if ("0".equals(opcion)) {
                        ejecutar.limpiarPantalla();
                    }
                    if (!"1".equals(opcion) && !"2".equals(opcion) && !"3".equals(opcion) && !"0".equals(opcion)) {
                        ejecutar.valorInvalido();
                    }

                    break;
                case "2":
                    dibujar.nivelMejoras("MONEDAS:", " 25 ", " 50 ", " 75 ", DibujosAscii.amarillo);
                    System.out.println("seleccione el nivel de mejora:");
                    opcion = sc.nextLine();
                    if ("1".equals(opcion)) {
                        if (jugador.revisiarPago(0, 25.0)) {
                            jugador.garajeAutos[slot].mejorarLlantas(2);
                            jugador.pagar(0, 25.0);
                            System.out.println(jugador.garajeAutos[slot].mostrarCaracteristicas());
                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON MONEDAS NECESARIAS");
                            ejecutar.esperaEnter();

                        }
                        ejecutar.limpiarPantalla();
                    }

                    if ("2".equals(opcion)) {
                        if (jugador.revisiarPago(0, 50.0)) {
                            jugador.garajeAutos[slot].mejorarLlantas(3);
                            jugador.pagar(0, 50.0);
                            System.out.println(jugador.garajeAutos[slot].mostrarCaracteristicas());
                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON MONEDAS NECESARIAS");
                            ejecutar.esperaEnter();

                        }

                        ejecutar.limpiarPantalla();
                    }

                    if ("3".equals(opcion)) {
                        if (jugador.revisiarPago(0, 75.0)) {
                            jugador.garajeAutos[slot].mejorarLlantas(5);
                            jugador.pagar(0, 75.0);
                            System.out.println(jugador.garajeAutos[slot].mostrarCaracteristicas());
                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON MONEDAS NECESARIAS");
                            ejecutar.esperaEnter();

                        }
                        ejecutar.limpiarPantalla();

                    }

                    if ("0".equals(opcion)) {
                        ejecutar.limpiarPantalla();
                    }
                    if (!"1".equals(opcion) && !"2".equals(opcion) && !"3".equals(opcion) && !"0".equals(opcion)) {
                        ejecutar.valorInvalido();
                    }

                    break;
                case "3":
                    int cantidad;
                    System.out.println(jugador.mostrarDatos());
                    dibujar.gasolinera();
                    System.out.println("\n" + DibujosAscii.amarillo + "BIENVENIDO A LA GASOLINERA" + DibujosAscii.reset);
                    System.out.println("\n\t1.Comprar gasolina\t0.cancelar");
                    opcion = sc.nextLine();
                    if ("1".equals(opcion)) {

                        System.out.println("\ningrese la cantidad que desea: ");
                        cantidad = Integer.parseInt(sc.nextLine());
                        //if para evitar que se exceda de 100 galones de gasolina
                        int gasolina = (cantidad + jugador.garajeAutos[slot].getGasolina());
                        if (gasolina <= 100) {
                            //if para condicionar el pago
                            if (jugador.revisiarPago(0, (cantidad * 2.5))) {
                                jugador.garajeAutos[slot].llenarTanque(gasolina);
                                jugador.pagar(0, (cantidad * 2.5));
                                System.out.println("El tanque de su " +jugador.garajeAutos[slot].getNombre() +" ha sido fuleado hasta: " +jugador.garajeAutos[slot].getGasolina());
                                ejecutar.esperaEnter();

                            } else { //si no cumple el pago
                                System.out.println("USTED NO CUENTA CON MONEDAS SUFICIENTES");
                                ejecutar.esperaEnter();
                            }
                        } else { //si se pasa de 100 galones
                            int resto = gasolina - 100;
                            System.out.println("\nUSTED INTENTA LLENAR MAS DE LA CUENTA EL TANQUE");
                            //se verifica el pago de los galones que caben
                            if (jugador.revisiarPago(0, ((cantidad-resto) * 2.5))) {
                                jugador.garajeAutos[slot].llenarTanque(gasolina - resto);
                                jugador.pagar(0, ((cantidad-resto) * 2.5));
                                System.out.println("\nSu tanque ha sifo fulleado con " + (cantidad - resto));
                                System.out.println("\nEl tanque de su " +jugador.garajeAutos[slot].getNombre() +" ha sido fuleado");
                                ejecutar.esperaEnter();
                            } else { //si no cumple el pago
                                System.out.println("USTED NO CUENTA CON MONEDAS SUFICIENTES");
                                ejecutar.esperaEnter();
                            }

                        } //fin del caso 1
                    }
                    if ("0".equals(opcion)) {
                        ejecutar.limpiarPantalla();
                    }
                    if (!"1".equals(opcion) && !"2".equals(opcion) && !"3".equals(opcion) && !"0".equals(opcion)) {
                        ejecutar.valorInvalido();
                    }
                            ejecutar.limpiarPantalla();

                    break;
                case "4":
                    dibujar.menuColores();
                    System.out.println("\ningrese el color con el que desea pintar el auto:");
                    opcion = sc.nextLine();
                    if ("1".equals(opcion)) {
                        if (jugador.revisiarPago(0, 20)) {
                            jugador.garajeAutos[slot].cambiarColor(DibujosAscii.rojo);
                            jugador.pagar(0, 20);
                            System.out.println("\nSu auto ahora es:\n\t" + jugador.garajeAutos[slot].getColor() + jugador.garajeAutos[slot].getCaracter());

                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON MONEDAS SUFICIENTES");
                            ejecutar.esperaEnter();

                        }
                    }
                            ejecutar.limpiarPantalla();
                    if ("2".equals(opcion)) {
                        if (jugador.revisiarPago(0, 20)) {
                            jugador.garajeAutos[slot].cambiarColor(DibujosAscii.azul);
                            jugador.pagar(0, 20);
                            System.out.println("\nSu auto ahora es:\n\t" + jugador.garajeAutos[slot].getColor() + jugador.garajeAutos[slot].getCaracter());
                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON MONEDAS SUFICIENTES");
                            ejecutar.esperaEnter();

                        }
                    }
                            ejecutar.limpiarPantalla();
                    if ("3".equals(opcion)) {
                        if (jugador.revisiarPago(0, 20)) {
                            jugador.garajeAutos[slot].cambiarColor(DibujosAscii.verde);
                            jugador.pagar(0, 20);
                            System.out.println("\nSu auto ahora es:\n\t" + jugador.garajeAutos[slot].getColor() + jugador.garajeAutos[slot].getCaracter());

                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON MONEDAS SUFICIENTES");
                            ejecutar.esperaEnter();
                        }
                    }
                            ejecutar.limpiarPantalla();
                    
                    if ("4".equals(opcion)) {
                        if (jugador.revisiarPago(0, 20)) {
                            jugador.garajeAutos[slot].cambiarColor(DibujosAscii.amarillo);
                            jugador.pagar(0, 20);
                            System.out.println("\nSu auto ahora es:\n\t" + jugador.garajeAutos[slot].getColor() + jugador.garajeAutos[slot].getCaracter());

                            ejecutar.esperaEnter();

                        } else {
                            System.out.println("USTED NO CUENTA CON MONEDAS SUFICIENTES");
                            ejecutar.esperaEnter();

                        }

                        ejecutar.limpiarPantalla();
                    }
                    if ("0".equals(opcion)) {
                        ejecutar.limpiarPantalla();
                    }
                    if (!"1".equals(opcion) && !"2".equals(opcion) && !"3".equals(opcion) && !"0".equals(opcion)) {
                        ejecutar.valorInvalido();
                    }

                    ejecutar.limpiarPantalla();
                    break;
                default:
                    ejecutar.valorInvalido();
            }

        }

    }

}
