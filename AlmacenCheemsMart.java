import java.util.ArrayList;
import java.util.List;

public class AlmacenCheemsMart implements Producto {

    private double precio;
    private List<Producto> departamentos = new ArrayList<Producto>();

     
    public AlmacenCheemsMart(){
        inventario();
    }
    
    private void inventario() {
        llenarDepartamentoDeAlimentosFrescos();
        llenarDepartamentoDeBebidas();
        llenarDepartamentoDeBelleza();
        llenarDepartamentoDeDulces();
        llenarDepartamentoDeElectrodomesticos();
        llenarDepartamentoDeElectronica();
        llenarDepartamentoDeEmpaquetados();
    }
    /** 
    public void llenarDepartamento(Producto nuevoProducto, String codigoDepto) {
        //agregar al almacen y al depto
    }
    */

    public void llenarDepartamentoDeElectronica() {
        Departamento deptoElectronica = new Departamento("Electronica");
        departamentos.add(deptoElectronica);
        deptoElectronica.agregarProducto(new ProductoCheemsMart("Reloj", 6800, "Electronica"));
        deptoElectronica.agregarProducto(new ProductoCheemsMart("Televisión HD", 7200, "Electronica"));
        deptoElectronica.agregarProducto(new ProductoCheemsMart("Radio", 600, "Electronica"));
        deptoElectronica.agregarProducto(new ProductoCheemsMart("iPod", 13000, "Electronica"));
        deptoElectronica.agregarProducto(new ProductoCheemsMart("x-box", 6064, "Electronica"));
    }

    public void llenarDepartamentoDeBelleza() {
        Departamento deptoBelleza = new Departamento("Belleza");
        departamentos.add(deptoBelleza);
        deptoBelleza.agregarProducto(new ProductoCheemsMart("Labial Revon", 240, "Belleza"));
        deptoBelleza.agregarProducto(new ProductoCheemsMart("Barniz de uñas Revon", 275, "Belleza"));
        deptoBelleza.agregarProducto(new ProductoCheemsMart("Mascara de Pestañas Revon", 300, "Belleza"));
        deptoBelleza.agregarProducto(new ProductoCheemsMart("Rubor Revon", 290, "Belleza"));
        deptoBelleza.agregarProducto(new ProductoCheemsMart("Polvo Compacto Revon", 290, "Belleza"));
    }

    public void llenarDepartamentoDeAlimentosFrescos() {
        Departamento deptoAlimentosFrescos = new Departamento("Frescos");
        departamentos.add(deptoAlimentosFrescos);
        deptoAlimentosFrescos.agregarProducto(new ProductoCheemsMart("Pollo 1kg", 98, "Alimentos Frescos"));
        deptoAlimentosFrescos.agregarProducto(new ProductoCheemsMart("Pescado 1kg", 102.50, "Alimentos Frescos"));
        deptoAlimentosFrescos.agregarProducto(new ProductoCheemsMart("Mandarinas 1kg", 32, "Alimentos Frescos"));
        deptoAlimentosFrescos.agregarProducto(new ProductoCheemsMart("Granada 1kg", 60, "Alimentos Frescos"));
        deptoAlimentosFrescos.agregarProducto(new ProductoCheemsMart("Lechuga 1kg", 15, "Alimentos Frescos"));
    }

    public void llenarDepartamentoDeElectrodomesticos() {
        Departamento deptoDom = new Departamento("Domesticos");
        departamentos.add(deptoDom);
        deptoDom.agregarProducto(new ProductoCheemsMart("Lavadora", 12560, "Electrodomesticos"));
        deptoDom.agregarProducto(new ProductoCheemsMart("Secadora HD", 13067, "Electrodomesticos"));
        deptoDom.agregarProducto(new ProductoCheemsMart("Licuadora", 970, "Electrodomesticos"));
        deptoDom.agregarProducto(new ProductoCheemsMart("Tostadora", 895, "Electrodomesticos"));
        deptoDom.agregarProducto(new ProductoCheemsMart("Sandwichera", 579, "Electrodomesticos"));
    }

    public void llenarDepartamentoDeEmpaquetados() {
        Departamento deptoEmpaquetados = new Departamento("Empaquetados");
        departamentos.add(deptoEmpaquetados);
        deptoEmpaquetados.agregarProducto(new ProductoCheemsMart("Frijoles", 49.90, "Empaquetados"));
        deptoEmpaquetados.agregarProducto(new ProductoCheemsMart("Sopa Instanténea", 16, "Empaquetados"));
        deptoEmpaquetados.agregarProducto(new ProductoCheemsMart("Tamales", 9, "Empaquetados"));
        deptoEmpaquetados.agregarProducto(new ProductoCheemsMart("Sardinas", 39, "Empaquetados"));
        deptoEmpaquetados.agregarProducto(new ProductoCheemsMart("Palmitos", 35, "Empaquetados"));
    }

    public void llenarDepartamentoDeBebidas() {
        Departamento deptoBebidas = new Departamento("Bebidas");
        departamentos.add(deptoBebidas);
        deptoBebidas.agregarProducto(new ProductoCheemsMart("CocaCola", 12, "Bebidas"));
        deptoBebidas.agregarProducto(new ProductoCheemsMart("Mundet", 13, "Bebidas"));
        deptoBebidas.agregarProducto(new ProductoCheemsMart("Leche Entera", 27, "Bebidas"));
        deptoBebidas.agregarProducto(new ProductoCheemsMart("Agua Mineral", 21, "Bebidas"));
        deptoBebidas.agregarProducto(new ProductoCheemsMart("Jugo de Naranja", 30, "Bebidas"));
    }

    public void llenarDepartamentoDeDulces() {
        Departamento deptoDulces = new Departamento("Dulces");
        departamentos.add(deptoDulces);
        deptoDulces.agregarProducto(new ProductoCheemsMart("Reloj", 6800, "Electronica"));
        deptoDulces.agregarProducto(new ProductoCheemsMart("Televisión HD", 7200, "Electronica"));
        deptoDulces.agregarProducto(new ProductoCheemsMart("Radio", 600, "Electronica"));
        deptoDulces.agregarProducto(new ProductoCheemsMart("iPod", 13000, "Electronica"));
        deptoDulces.agregarProducto(new ProductoCheemsMart("x-box", 6064, "Electronica"));
    }

    /**
     * Devuelve el departamento buscado mediante su atributo código.
     *
     * @param codigoDepto Código del deparamento a encontrar.
     * @return d Departamento que coincide con el código.
     */
    public Producto getDepartamento(String codigoDepto) {
        for (Producto d : departamentos) {
            if (d.getCodigo().equals(codigoDepto)) {
                return d;
            }
        }
        return null;
    }


    public Producto getProducto(int numeroProducto, String codigoDepto) {
        List<Producto> productosDepto = new ArrayList<>();
        for (Producto d : departamentos) {
            if (d.getCodigo().equals(codigoDepto)) {
                productosDepto = d.getListaProductos();
                return productosDepto.get(numeroProducto);
            }
        }
        return null;
    }

    public void agregarProducto(Producto nuevoProducto, String codigoDepto) {
         /// pendiente
    }

    public void eliminarProducto(Producto producto, String codigoDepto) {
        //pendiente
    }

    public String getNombre() {
        return "Almacen CheemsMart";
    }

    public double getPrecio() {
        //// Calcular la suma de todos los dep 
        return this.precio;
    }

    public String getCodigo() {
        return "CHEMS-1351";
    }

    public List<Producto> getListaProductos() {
        return this.departamentos;
    }

    public void mostrarInformacion() {

    }

}
