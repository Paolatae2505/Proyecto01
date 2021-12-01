import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class AlmacenCheemsMart {

    private HashMap<String,List<Producto>> departamentos = new HashMap<>();

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

    public void llenarDepartamentoDeElectronica() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Reloj", 6800, "Electronica"));
        productos.add(new Producto("Televisión HD", 7200, "Electronica"));
        productos.add(new Producto("Radio", 600, "Electronica"));
        productos.add(new Producto("iPod", 13000, "Electronica"));
        productos.add(new Producto("x-box", 6064, "Electronica"));
        departamentos.put("Electronica", productos);
    }

    public void llenarDepartamentoDeBelleza() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Labial Revon", 240, "Belleza"));
        productos.add(new Producto("Barniz de uñas Revon", 275, "Belleza"));
        productos.add(new Producto("Mascara de Pestañas Revon", 300, "Belleza"));
        productos.add(new Producto("Rubor Revon", 290, "Belleza"));
        productos.add(new Producto("Polvo Compacto Revon", 290, "Belleza"));
        departamentos.put("Belleza", productos);
    }

    public void llenarDepartamentoDeAlimentosFrescos() {
         List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pollo 1kg",
         98, "Alimentos :Frescos"));
        productos.add(new Producto("Pescado 1kg", 102.50,
        "Alimentos :Frescos"));
        productos.add(new Producto("Mandarinas 1kg", 32, 
        "Alimentos :Frescos"));
        productos.add(new Producto("Granada 1kg", 
        60, "Alimentos :Frescos"));
        productos.add(new Producto("Lechuga 1kg", 15,
         "Alimentos :Frescos"));
         departamentos.put( "Alimentos :Frescos", productos);
    }

    public void llenarDepartamentoDeElectrodomesticos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Lavadora", 12560, 
        "Electrodomesticos"));
        productos.add(new Producto("Secadora HD", 13067,
         "Electrodomesticos"));
        productos.add(new Producto("Licuadora", 970,
         "Electrodomesticos"));
        productos.add(new Producto("Tostadora", 895,
         "Electrodomesticos"));
        productos.add(new Producto("Sandwichera", 579,
         "Electrodomesticos"));
         departamentos.put( "Electrodomesticos", productos);
    }

    public void llenarDepartamentoDeEmpaquetados() {
        List<Producto> productos = new ArrayList<>();
         productos.add(new Producto("Frijoles", 49.90, "Alimentos :Empaquetados"));
         productos.add(new Producto("Sopa Instanténea", 16, "Alimentos :Empaquetados"));
         productos.add(new Producto("Tamales", 9, "Alimentos :Empaquetados"));
         productos.add(new Producto("Sardinas", 39, "Alimentos :Empaquetados"));
         productos.add(new Producto("Palmitos", 35, "Alimentos :Empaquetados"));
         departamentos.put("Alimentos :Empaquetados", productos);
    }

    public void llenarDepartamentoDeBebidas() {
        List<Producto> productos = new ArrayList<>();
         productos.add(new Producto("CocaCola", 12, "Bebidas"));
         productos.add(new Producto("Mundet", 13, "Bebidas"));
         productos.add(new Producto("Leche Entera", 27, "Bebidas"));
         productos.add(new Producto("Agua Mineral", 21, "Bebidas"));
         productos.add(new Producto("Jugo de Naranja", 30, "Bebidas"));
         departamentos.put("Bebidas", productos);
    }

    public void llenarDepartamentoDeDulces() {
        List<Producto> productos = new ArrayList<>();
         productos.add(new Producto("Mangos Enchilados",40, "Alimentos :Dulces"));
         productos.add(new Producto("Bombones", 30, "Alimentos :Dulces"));
         productos.add(new Producto("Chocolate Ferrero Rocha",200, "Alimentos :Dulces"));
         productos.add(new Producto("Gomitas Cola De Unicornio",24, "Alimentos :Dulces"));
         productos.add(new Producto("Hormiguitas",20,"Alimentos :Dulces"));
         departamentos.put("Alimentos :Dulces", productos);
    }

    public Producto getProducto(String nombreDepto, int numProducto) {
        numProducto--;
        List<Producto> productos = new ArrayList<>();
        Producto producto = null;
        for (Map.Entry<String,List<Producto>> entry : departamentos.entrySet()) {
            if(entry.getKey().equals(nombreDepto)){
                productos  = entry.getValue();
                producto = productos.get(numProducto);
            }
        }
        return producto;
    }

    public void mostrarDepartamento(String nombreDepto) {
        List<Producto> productos = new ArrayList<>();
        for (Map.Entry<String,List<Producto>> entry : departamentos.entrySet()) {
            if(entry.getKey().equals(nombreDepto)){
                productos  = entry.getValue();
            }
        }
        mostrarProductosDepto(productos);
        
    }

    private void mostrarProductosDepto(List<Producto> productos){
        int i = 1;
        for (Producto producto : productos) {
            System.out.print(i +") ");
            producto.mostrarInformacion();
            i++;
        }
    }


    
}
