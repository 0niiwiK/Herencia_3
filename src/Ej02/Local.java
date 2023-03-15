package Ej02;

public class Local extends Inmueble{

    protected enum tipoLocal {
        INTERNO,
        CALLE
    }
    tipoLocal tipo;
    public Local(int identificadorInmobiliario, int area, String direccion, tipoLocal tipo) {
        super(identificadorInmobiliario, area, direccion);
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if (tipo == tipoLocal.CALLE)
            System.out.println("Tipo = Calle");
        else
            System.out.println("Tipo = Interno");
    }
}
