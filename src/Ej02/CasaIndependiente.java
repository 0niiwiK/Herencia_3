package Ej02;

public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea = 3000;
    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanios, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios, numeroPisos);
    }
}
