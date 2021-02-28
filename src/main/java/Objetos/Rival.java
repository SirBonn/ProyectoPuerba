package Objetos;

import Consola.DibujosAscii;

public class Rival {

    private Auto autoUser = new Auto();
    private String[] nombreRival = {"CrisLb", "MANDER", "MAISTERDANI", "SINS", "MARK", "SirB0n", "M.A.L.O.", "MANDO", "CHEWIEE"};
    private String[] caracterRival = {"]8-:>\u001b[0m", "||:=:)\u001b[0m", "l8=:) \u001b[0m", "[|8=8) \u001b[0m", "]|:=:-\u001b[0m", "]8-8)>\u001b[0m", "|]8=8>\u001b[0m",};
    private String[] colorRival = {DibujosAscii.amarillo, DibujosAscii.azul, DibujosAscii.cyan, DibujosAscii.rojo, DibujosAscii.verde, DibujosAscii.magenta};
    private int contadorRival;
    private int aceleracionRival;
    private int llantasRival;
    private int nombreRandom;

    public int moverCasillas(int coeficientePista) {
        aceleracionRival = ((int) (Math.random() * autoUser.getAceleracion()) + 1);
        llantasRival = ((int) ((Math.random() * 10)));

        int casillas = aceleracionRival + llantasRival + coeficientePista;
        return casillas;
    }

    public void avanzarAuto(int avanzar, int largo) {
        this.contadorRival += avanzar;
        if (this.contadorRival < largo) {
            for (int i = 0; i < this.contadorRival; i++) {
                System.out.print("-");
            }
            System.out.print(colorRival[((int) (Math.random() * 5) + 1)] + caracterRival[((int) (Math.random() * 6) + 1)] + "\n");
        }
        if (this.contadorRival >= largo) {
            int resto = this.contadorRival - largo;
            this.contadorRival -= resto;
            for (int i = 0; i < this.contadorRival; i++) {
                System.out.print("-");
            }
            System.out.print(colorRival[((int) (Math.random() * 5) + 1)] + caracterRival[((int) (Math.random() * 6) + 1)] + "\t HA LLEGADO A LA META\n");
        }

    }

    public String getnombreRandom() {
        this.nombreRandom = ((int) (Math.random() * 9));
        String rival = nombreRival[nombreRandom];
        return rival;
    }

    public int getContadorRival() {
        return contadorRival;
    }

    public void setContadorRival(int contadorRival) {
        this.contadorRival = contadorRival;
    }

    public int getAceleracionRival() {
        return aceleracionRival;
    }

    public int getLlantasRival() {
        return llantasRival;
    }

}
