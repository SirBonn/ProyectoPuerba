package Objetos;

public class Jugador {

    private String nick;
    private int gemas;
    private double monedas;
    public Auto[] garajeAutos;
    private int numAuto = 0;
    private int contador = 0;
    private int contadorOro;
    private int contadorGemas;
    private String ganadores;

    public Jugador(String nick, int gemas, double monedas) {
        this.nick = nick;                       //mandando el nombre del jugador desde el inicio 
        this.monedas = monedas;                 //"
        this.gemas = gemas;                     //"
        this.garajeAutos = new Auto[5];         //inicializando el garaje de 5 slots
        this.numAuto = 0;                       //donde comenzara a guardar los carros que compre
    }

    public void ganar(int gemas, double monedas) {
        this.gemas += gemas;
        this.monedas += monedas;
    }

    public void pagar(int gemas, double monedas) {
        this.gemas -= gemas;
        this.monedas -= monedas;
        this.contadorOro += monedas;
        this.contadorGemas += gemas;
    }

    public boolean revisiarPago(int gemas, double monedas) {
        return this.gemas >= gemas && this.monedas >= monedas;

    }

    public void comprarAuto(Auto auto) {
        if (numAuto < 5) {
            this.garajeAutos[numAuto] = auto;
            System.out.println("Has obtenido: " + auto.mostrarCaracteristicas());
            numAuto++;
        } else if (numAuto == 5) {
            System.out.println("Haz alcanzado el maximo de autos que puedes guardar");
        }
    }

    public void mostrarAutos() {
        for (int i = 0; i < numAuto; i++) {
            System.out.println(i + 1 + "." + garajeAutos[i].mostrarCaracteristicas());
            System.out.println("================================================");
        }
    }

    public String mostrarDatos() {
        String datos = "\u001b[34m" + "\t" + nick + "\n\tGemas: " + gemas + "\n\tMonedas: " + monedas + "\n" + "\u001b[0m";
        return datos;
    }

    // añadimos el avanzar auto
    public void avanzarAuto(int avanzar, int largo, String caracter, String autoColor, String autoModelo) {
        this.contador += avanzar;
        if (this.contador < largo) {
            for (int i = 0; i < this.contador; i++) {
                System.out.print(caracter);
            }
            System.out.print(autoColor + autoModelo + "\n");
        }
        if (this.contador >= largo) {
            int resto = this.contador - largo;
            this.contador -= resto;
            for (int i = 0; i < this.contador; i++) {
                System.out.print(caracter);
            }
            System.out.print(autoColor + autoModelo + "\t HA LLEGADO A LA META\n");
        }

    }

    public String verificarGanador(int contadorJugador, int contadorRival, Jugador jugador, String rival1, String rival2, String rival3) {
        if (contadorJugador > contadorRival) {
            this.ganadores = "\n\tEL GANADOR DEL PRIMER LUGAR ES: " + jugador.nick + "\n\tEL GANADOR DEL SEGUNDO LUGAR ES: " + rival1 + "\n\tEL GANADOR DEL TERCER LUGAR ES: " + rival2;

        } else {
            this.ganadores = "\n\tEL GANADOR DEL PRIMER LUGAR ES: " + rival3 + "\n\tEL GANADOR DEL SEGUNDO LUGAR ES: " + rival1 + "\n\tEL GANADOR DEL TERCER LUGAR ES: " + rival2;
        }
        return ganadores;
    }

    public String getGanadores(){
        return ganadores;
    }
    
    public int getContadorOro() {
        return contadorOro;
    }

    public int getContadorGemas() {
        return contadorGemas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getNick() {
        return nick;
    }

    public int getGemas() {
        return gemas;
    }

    public int getNumAuto() {
        return numAuto;
    }

    public double getMonedas() {
        return monedas;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setGemas(int gemas) {
        this.gemas = gemas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }
}
