import java.util.ArrayList;
import java.util.List;

public class Compra {

    private List<ProductoCheemsMart> carritoDeCompra = new ArrayList<>();

    public void agregarProducto(ProductoCheemsMart producto) {
        carritoDeCompra.add(producto);
    }

    public void cancelarCompra() {
        carritoDeCompra.clear();
    }

    public void eliminarProducto(ProductoCheemsMart producto) {
        for (Producto p : carritoDeCompra) {
            if (!p.equals(producto)) {
                System.out.println("No puedes remover el producto" + producto +
                        "porque no se encuentra en tu carrito de compras!");
            } else carritoDeCompra.remove(producto);
        }
    }

    public void generarTicketDeCompra(double total) {
        System.out.println("\n---------------------------------" +
                "\n-------------Ticket--------------" +
                "\n---------------------------------" +
                "\n-- Resumen de compra: -----------\n");
        for (Producto p : carritoDeCompra) {
            System.out.println(p.getNombre() + " _____ " + p.getPrecio());
        }
        System.out.println("----------Total a pagar----------" +
                "\n -- $" + String.format("%.2f", total) +
                "\n---------------------------------\n");
    }

    public List<ProductoCheemsMart> getCarritoDeCompra() {
        return this.carritoDeCompra;
    }


}
