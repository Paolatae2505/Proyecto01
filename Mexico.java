import java.time.LocalDate;
import java.util.List;

public class Mexico implements TiendaVirutalPais {
    private double descuento = 0;
    private volatile static TiendaVirutalPais tiendaVirtualMexico;
    private Cliente cliente;

    private Mexico(Cliente cliente) {
        this.cliente = cliente;
    }

    public void saludo() {
        System.out.println("Bienvenida(o) a Cheems Mart Mexico!");
    }

    public double cobrar(List<ProductoCheemsMart> carritoDeCompra) {
        double cuenta = 0;
        for (ProductoCheemsMart p : carritoDeCompra) {
            if (p.getDepartamento().equals("Alimentos")) {
                cuenta = cuenta + ((p.getPrecio() * descuento) / 100);
            } else {
                cuenta = cuenta + p.getPrecio();
            }
        }
        return cuenta;
    }

    public double descuentoRandom() {
        descuento = (((int) (Math.random() * (5 - 1))) + 1) * 10;
        return descuento;
    }

    public String mensajeDescuento(double descuento) {
        return "Tienes un " + descuento + "% de descuento en alimentos!";
    }

    public void fechaEstimada() {
        LocalDate hoy = LocalDate.now();
        LocalDate manana = hoy.plusDays(1);
        System.out.println("La fecha de entrega estimada de tu compra es: " + manana);
    }

    public void despedida() {
        System.out.println("Cheems Mart Mexico agradece su compra!" +
                "\nVuelva pronto!");
    }


    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static TiendaVirutalPais getTiendaVirtual() {
        return tiendaVirtualMexico;
    }

    public static void setTiendaVirtualEspana(TiendaVirutalPais tiendaVirtualMexico) {
        Mexico.tiendaVirtualMexico = tiendaVirtualMexico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
