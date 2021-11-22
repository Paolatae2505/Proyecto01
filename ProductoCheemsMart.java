public class ProductoCheemsMart implements Producto {


    private String nombre ;
    private double precio;
    private String departamento;
    private String codigoDeBarras;
    
    public ProductoCheemsMart(String nombre , double precio,
    String departamento, String codigoDeBarras){
        this.nombre= nombre;
        this.precio = precio;
        this.departamento = departamento;
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPrecio(){
          return precio;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Precio : " + precio);
        System.out.println("Departamento :" + departamento);
        System.out.println("Codigo De Barras :" + codigoDeBarras);
    }
    
}
