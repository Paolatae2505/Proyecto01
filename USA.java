import java.time.LocalDate;
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

    public double cobrar(List<ProductoCheemsMart> carritoDeCompra) {
        double cuenta = 0;
        for (ProductoCheemsMart p : carritoDeCompra) {
            if (p.getDepartamento().equals("Electronicos")) {
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
        return "You've got a " + descuento + "% discount on electronics!";
    }

    public void fechaEstimada() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("The estimated delivery date of your order is: " + tomorrow);
    }

    public void despedida() {
        System.out.println("Thank you for your purchase! \n" +
                "Come back soon!");
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
