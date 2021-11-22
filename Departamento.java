import java.util.ArrayList;
import java.util.List;

public class Departamento implements Producto{

    private String nombre;
    private List<Producto> productos = new ArrayList<>();


    public Departamento(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        double precioTotal = 0;
        for(Producto producto : productos){
           precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    public String getNombre(){
        return nombre;
    }

    public Producto getProducto(String nombreDelProducto ){
        Producto productoFInal = null;
        for(Producto producto : productos){
            String nombre = producto.getNombre();
            if(nombre.equals(nombreDelProducto)== true)
                  productoFInal = producto;
        }
        return productoFInal;

    } 
    
    public void mostrarInformacion(){
         /// Ver que formato le dare jaja 
    }

    public List<Producto> getListaDeProductos(){
        return productos;
    }
}
