import java.util.ArrayList;
import java.util.List;

public class Departamento implements Producto {

    private String nombre;
    private List<Producto> productos = new ArrayList<>();


    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public Departamento(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public double getPrecio() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto getProducto(String nombreDelProducto) {
        Producto productoFInal = null;
        for (Producto producto : productos) {
            String nombre = producto.getNombre();
            if (nombre.equals(nombreDelProducto) == true)
                productoFInal = producto;
        }
        return productoFInal;

    }

    public void mostrarInformacion() {
        int i = 1;
        for (Producto producto : productos) {
            System.out.println("Numero de producto :" + i);
            producto.mostrarInformacion();
            i++;
        }
    }

    public List<Producto> getListaDeProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

}
