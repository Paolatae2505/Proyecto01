import java.util.ArrayList;
import java.util.List;

public class AlmacenCheemsMart implements Producto {

    private double precio;
    private List<Producto> departamentos = new ArrayList<Producto>();

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
        
       // departamentos.add(new Departamento("Electronica", productosElectronica));
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

    public Producto getDepartamento(String CodigoDepto) {
        Producto departamento = null;
        for (Producto d : departamentos) {
            if (d.getCodigo().equals(CodigoDepto)) {
                departamento = d;
            }
        }
        return departamento;
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public ProductoCheemsMart getProducto(int numeroProducto, String codigoDepto) {
        return null;
    }
    public void agregarProducto(Producto nuevoProducto, String codigoDepto) {
        for (Producto d : departamentos) {
            if (d.getCodigo().equals(codigoDepto)) {
                d.agregarProducto(nuevoProducto);
            } else {
                System.out.println("No existe ese codigo de departamento" + codigoDepto);
            }
        }
    }

    public void eliminarProducto(Producto producto, String codigoDepto) {
        for (Producto d : departamentos) {
            if (d.getCodigo().equals(codigoDepto)) {
                d.eliminarProducto(producto);
            }
        }
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getCodigo(){
        return "CHEMS-1351";
    }

    public void mostrarInformacion() {
    }

}
