import java.time.LocalDate;
import java.util.List;

public class Mexico implements TiendaVirutalPais {
    private double descuento = 0;
    private volatile static Mexico tiendaVirtualMexico;
    private Cliente cliente;
    private String idioma = "espanol";

    private Mexico(Cliente cliente) {
        this.cliente = cliente;
    }

    public static Mexico obtenerTiendaVirtualEspana(Cliente cliente) {
        if (tiendaVirtualMexico == null) {
            synchronized (TiendaVirutalPais.class) {
                if (tiendaVirtualMexico == null) {
                    tiendaVirtualMexico = new Mexico(cliente);
                }
            }
        }
        return tiendaVirtualMexico;
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

    public void mensajeDeAgregarAlCarrito() {

        System.out.println("Dijite el numero del producto a Agregar al Carrito");

    }

    public void fechaEstimada() {
        LocalDate hoy = LocalDate.now();
        LocalDate manana = hoy.plusDays(1);
        System.out.println("La fecha de entrega estimada de tu compra es: " + manana);
    }

    public void despedida() {
        System.out.println("Cheems Mart México agradece su compra!" +
                "\nVuelva pronto!");
    }

    public void mostrarMenuPrincipal() {
        System.out.println("---------------------------------------------");
        System.out.println("--------- ¡Bienvenido a CheemsMart! ---------");
        System.out.println("---------------------------------------------");
        System.out.println("-------------- Elige una opción -------------");
        System.out.println("-1 --- Ver Catálogo -------------------------");
        System.out.println("-2 --- Realizar Compra ----------------------");
        //System.out.println("-3 --- Realizar Pago ------------------------");
        System.out.println("-3 --- Salir --------------------------------");
        System.out.println("---------------------------------------------");
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

    public static void setTiendaVirtualMexico(Mexico tiendaVirtualMexico) {
        Mexico.tiendaVirtualMexico = tiendaVirtualMexico;
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
