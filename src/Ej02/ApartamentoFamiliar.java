package Ej02;

public class ApartamentoFamiliar extends Apartamento{
    protected static double valorArea = 2000;
    protected int valorAdministracion;
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanios, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios);
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor administración = " + valorAdministracion);
    }
}
