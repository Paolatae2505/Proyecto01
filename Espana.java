import java.time.LocalDate;
import java.util.List;

public class Espana implements TiendaVirutalPais {
    private double descuento = 0;
    private volatile static Espana tiendaVirtualEspana;
    private Cliente cliente;
    private String idioma = "espanol";

    private Espana(Cliente cliente) {
        this.cliente = cliente;
    }

    public static Espana obtenerTiendaVirtualEspana(Cliente cliente) {
        if (tiendaVirtualEspana == null) {
            synchronized (TiendaVirutalPais.class) {
                if (tiendaVirtualEspana == null) {
                    tiendaVirtualEspana = new Espana(cliente);
                }
            }
        }
        return tiendaVirtualEspana;
    }

    public void saludo() {
        System.out.println("Bienvenido(a) a Cheems Mart España!");
    }

    public double cobrar(List<ProductoCheemsMart> carritoDeCompra) {
        double cuenta = 0;
        for (ProductoCheemsMart p : carritoDeCompra) {
            if (p.getDepartamento().equals("Electrodomesticos")) {
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
        return "Tienes un " + descuento + "% de descuento en electrodométicos!";
    }

    public void mensajeDeAgregarAlCarrito() {

        System.out.println("Dijite el numero del producto que quereis Agregar al Carrito");

    }

    public void fechaEstimada() {
        LocalDate hoy = LocalDate.now();
        LocalDate manana = hoy.plusDays(1);
        System.out.println("La fecha de entrega estimada de tu compra es: " + manana);
    }

    public void despedida() {
        System.out.println("Cheems Mart España agradece su compra!" +
                "\nVuelva pronto!");
    }

    public void mostrarMenuPrincipal() {

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

    public static void setTiendaVirtualEspana(Espana tiendaVirtualEspana) {
        Espana.tiendaVirtualEspana = tiendaVirtualEspana;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
