package Objetos;

public class Auto {

    private String nombre;
    private String motor;
    private int aceleracion; // que se tomara en cuenta como 'potencia'
    private int coeficienteLlantas;
    private int gasolina;
    private String caracter;
    private String color;
    private int contadorGasolinaComprada;
    private int contadorGasolinaQuemada;

    public Auto() {

    }

    public Auto(String nombre, String motor, int aceleracion, int coeficienteLlantas, int gasolina, String color, String caracter) {
        this.nombre = nombre;
        this.motor = motor;
        this.caracter = caracter;
        this.aceleracion = aceleracion;
        this.coeficienteLlantas = coeficienteLlantas;
        this.gasolina = gasolina;
        this.color = color;

    }

    public void mejorarAuto(int upgradeAceleracion, int upgradeCoeficienteDeLlantas, int upgradeGasolina, String upgradeColor){
        this.aceleracion = upgradeAceleracion;
        this.coeficienteLlantas = upgradeCoeficienteDeLlantas;
        this.gasolina = upgradeGasolina;
        this.color = upgradeColor;
        
    }
    
    public void mejorarAceleracion(int upgrade) {
        this.aceleracion = upgrade;
    }

    public void mejorarLlantas(int upgrade) {
        this.coeficienteLlantas = upgrade;
    }

    public void cambiarColor(String color) {
        this.color = color;
    }

    public int moverCasillas(int coeficientePista) {
        int casillas = (this.aceleracion * (int) ((Math.random() * 10) + 1)) + ((coeficienteLlantas * (int) (Math.random() * 5) + 1)) + coeficientePista;
        return casillas;
    }

    public String mostrarCaracteristicas() {
        String caracteristicas = "\n\t" + nombre + "\n\tMotor: " + motor + "\n\tAceleracion de: " + aceleracion
                + "\n\tAgarre: " + coeficienteLlantas + "\n\tgasolina disponible: " + gasolina
                + "\n\tTu auto:\n\t\t" + color + caracter;
        return caracteristicas;
    }

    public void llenarTanque(int upgrade) {
        
        this.gasolina = upgrade;
        
        this.contadorGasolinaComprada += upgrade;

    }

    public void cobrarGasolina(int gasolinaQuemada) {
        this.gasolina -= gasolinaQuemada;
        this.contadorGasolinaQuemada += gasolinaQuemada;
    }

    public boolean revisarGasolina(int costoGasolina) {
        return this.gasolina >= costoGasolina;
    }

    public int getContadorGasolinaComprada() {
        return contadorGasolinaComprada;
    }

    public int getContadorGasolinaQuemada() {
        return contadorGasolinaQuemada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getCoeficienteLlantas() {
        return coeficienteLlantas;
    }

    public void setCoeficienteLlantas(int coeficienteLlantas) {
        this.coeficienteLlantas = coeficienteLlantas;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
