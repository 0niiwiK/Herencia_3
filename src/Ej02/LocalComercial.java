package Ej02;

public class LocalComercial extends Local{
    protected static double valorArea = 3000;
    protected String centroComercial;
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, String centroComercial, tipoLocal tipo) {
        super(identificadorInmobiliario, area, direccion, tipo);
        this.centroComercial = centroComercial;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Centro Comercial: = " + centroComercial);
    }
}
