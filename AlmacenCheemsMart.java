import java.util.ArrayList;
import java.util.List;

public class AlmacenCheemsMart implements Producto {

    private double precio;
    private List<Departamento> departamentos = new ArrayList<Departamento>();

    public void AlmacenCheemsMart() {
    }

    public void inventario() {
    }

    public void llenarDepartamentoDeElectronica() {
        Departamento deptoElectronica = new Departamento("Electronica");
        List<ProductoCheemsMart> productosElectronica = new ArrayList<>();
        productosElectronica.add(new ProductoCheemsMart("Reloj", 6800, "Electronica", "a4530gf"));
        productosElectronica.add(new ProductoCheemsMart("Televisión HD", 7200, "Electronica", "a4530gg"));
        productosElectronica.add(new ProductoCheemsMart("Radio", 600, "Electronica", "a4530gh"));
        productosElectronica.add(new ProductoCheemsMart("iPod", 13000, "Electronica", "a4530gi"));
        productosElectronica.add(new ProductoCheemsMart("x-box", 6064, "Electronica", "a4530gj"));
        departamentos.add(new Departamento("Electronica", productosElectronica));
    }

    public void llenarDepartamentoDeLuces() {
    }

    public void llenarDepartamentoDeAlimentosFrescos() {
    }

    public void llenarDepartamentoDeElectrodomesticos() {
    }

    public void llenarDepartamentoDeEmpaquetados() {
    }

    public String getNombre() {
        return this.getNombre();
    }

    public Departamento getDepartamento(String nombreDepartamento) {
        Departamento departamento = null;
        for (Departamento d : departamentos) {
            if (d.getNombre().equals(nombreDepartamento)) {
                departamento = d;
            }
        }
        return departamento;
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public Departamento getProductoDeDepartamento() {
        return null;
    }

    public void agregarProductoDeDepartamento(ProductoCheemsMart nuevoProducto, String departamento) {
        for (Departamento d : departamentos) {
            if (d.getNombre().equals(departamento)) {
                d.agregarProducto(nuevoProducto);
            } else {
                System.out.println("No existe un departamento llamado" + departamento);
            }
        }
    }

    public void eliminarProducto(Producto producto, String departamento) {
        for (Departamento d : departamentos) {
            if (d.getNombre().equals(departamento)) {
                d.eliminarProducto(producto);
            }
        }
    }

    public double getPrecio() {
        return this.precio;
    }

    public void mostrarInformacion() {
    }

}
