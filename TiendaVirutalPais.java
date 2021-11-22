import java.util.List;

public interface TiendaVirutalPais {


    public void saludo();

    public double cobrar(List<Producto> carritoDeCompra ,
    String IDCliente );

    public double descuentoRandom();

    public double aplicarDescuento(Producto producto);

    public String mensajeDescuento();
    
    public void fechaEstimada();

    public void despedida();



}
