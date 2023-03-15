package Ej02;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500;
    protected double valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanios, int numeroPisos, double valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor administración = " + valorAdministracion);
        System.out.print("Tiene Piscina = ");
        if (tienePiscina)
            System.out.println("Sí");
        else
            System.out.println("No");
        System.out.print("Tiene Campos Deportivos = ");
        if (tieneCamposDeportivos)
            System.out.println("Sí");
        else
            System.out.println("No");
    }
}
