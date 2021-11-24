import java.util.List;

public class Espana implements TiendaVirutalPais {
    private double descuento = 0;
    private volatile static TiendaVirutalPais tiendaVirtualEspana;
    private Cliente cliente;

    public void saludo() {
        System.out.println("Bienvenido a Cheems Mart España!");
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
        System.out.println("Cheems Mart España agradece su compra!" +
                "\nVuelva pronto!");
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static TiendaVirutalPais getTiendaVirtual() {
        return tiendaVirtualEspana;
    }

    public static void setTiendaVirtualEspana(TiendaVirutalPais tiendaVirtualEspana) {
        Espana.tiendaVirtualEspana = tiendaVirtualEspana;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
