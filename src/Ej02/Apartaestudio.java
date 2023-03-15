package Ej02;

public class Apartaestudio extends Apartamento{
    protected static final double valorArea = 1500;
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanios) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios);
    }
}
