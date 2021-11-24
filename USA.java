import java.util.List;

public class USA implements TiendaVirutalPais {
    private double descuento = 0;
    private volatile static TiendaVirutalPais tiendaVirtualUSA;
    private Cliente cliente;

    private USA(Cliente cliente) {
        this.cliente = cliente;
    }

    public void saludo() {
        System.out.println("Welcome to Cheems Mart USA!");
    }

    public double cobrar(List<Producto> carritoDeCompra, String IDCliente) {
        return 0;
    }

    public double descuentoRandom() {
        return 0;
    }

    public double aplicarDescuento(Producto producto) {
        return 0;
    }

    public String mensajeDescuento() {
        return null;
    }

    public void fechaEstimada() {

    }

    public void despedida() {
        System.out.println("Thank you for your purchase!");
    }


    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static TiendaVirutalPais getTiendaVirtual() {
        return tiendaVirtualUSA;
    }

    public static void setTiendaVirtualEspana(TiendaVirutalPais tiendaVirtualUSA) {
        USA.tiendaVirtualUSA = tiendaVirtualUSA;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
