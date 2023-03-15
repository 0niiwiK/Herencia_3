package Ej02;

public class Casa extends InmuebleVivienda{
    protected int numeroPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanios, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Pisos = " + numeroPisos);
    }
}
