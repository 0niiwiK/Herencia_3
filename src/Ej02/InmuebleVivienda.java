package Ej02;

public class InmuebleVivienda extends Inmueble{

    protected int numeroHabitaciones;
    protected int numeroBanios;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanios) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanios = numeroBanios;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBanios() {
        return numeroBanios;
    }

    public void setNumeroBanios(int numeroBanios) {
        this.numeroBanios = numeroBanios;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones = " + numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBanios);
    }
}
