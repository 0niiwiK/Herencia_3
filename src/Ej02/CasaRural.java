package Ej02;

public class CasaRural extends Casa{
    protected static double valorArea = 1500;
    protected int distanciaCabera;
    protected int altitud;
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanios, int numeroPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia cabecera municipal = " + distanciaCabera);
        System.out.println("Altitud = " + altitud);
    }
}
