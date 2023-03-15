package Ej02;

public class Oficina extends Local{
    protected static double valorArea = 3500;
    protected boolean esGobierno;

    public Oficina(int identificadorInmobiliario, int area, String direccion, tipoLocal tipo, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipo);
        this.esGobierno = esGobierno;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.print("Es del gobierno = ");
        if (esGobierno)
            System.out.println("Sí");
        else
            System.out.println("No");
    }
}
