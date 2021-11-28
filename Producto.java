import java.util.List;

public interface Producto {

    public double getPrecio();

    public String getNombre();

    public void mostrarInformacion();

    public String getCodigo();

    public List<Producto> getListaProductos();
}
