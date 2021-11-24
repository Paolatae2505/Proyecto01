import java.util.List;

public interface TiendaVirutalPais {


    public void saludo();

    public double cobrar(List<ProductoCheemsMart> carritoDeCompra);

    public double descuentoRandom();

    public String mensajeDescuento(double descuento);

    public void fechaEstimada();

    public void despedida();


}
