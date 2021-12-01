import java.util.List;

public interface Sucursal {


    public double cobrar(List<Producto> carritoDeCompra);

    public double descuentoRandom();

    public boolean tieneDescuento();

    public ClienteTiendaProxy verificarClienteExistente(String usuario, String contrasena);
}
