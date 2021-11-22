import java.util.List;

public class CatalogoTienda implements Catalogo , Producto{
    
    private AlmacenCheemsMart  almacenCheemsMart;
    private String codigo;


    public CatalogoTienda(){
            CheemsMart.inventario();
            codigo = "2505-3095";
    }

    public void mostrarDepartamentoDeBebidas(){

        Departamento departamentoBebidas = almacenChemsMart.getDepartamento("Bebidas");
        List<Producto> bebidas = departamentoBebidas.getListaDeProductos();
        for(Producto bebida : bebidas){
            bebida.mostrarInformacion();
        }
    }

    public void mostrarDepartamentoDeBelleza(){
        Departamento departamentoBelleza = almacenChemsMart.getDepartamento("Belleza");
        List<Producto> productosBelleza = departamentoBelleza.getListaDeProductos();
        for(Producto productoBelleza : productosBelleza){
            productoBelleza.mostrarInformacion();
        }
        
    }

    public void mostrarDepartamentoDeDulces(){
        Departamento departamentoDulces = almacenChemsMart.getDepartamento("Belleza");
        List<Producto> dulces = departamentoDulces.getListaDeProductos();
        for(Producto dulce : dulces){
            dulce.mostrarInformacion();
        }
    }
    public void mostrarDepartamentoDeAlimentosFrescos(){
        Departamento departamentAlimentosFrescos = almacenChemsMart.getDepartamento("Alimentos Frescos");
        List<Producto> alimentosFrecos = departamentAlimentosFrescos.getListaDeProductos();
        for(Producto alimentoFresco : alimentosFrecos){
            alimentoFresco.mostrarInformacion();
        }
    }

    public void mostrarDepartamentoElectrodomesticos(){
        Departamento departamentoElectrodomesticos = almacenChemsMart.getDepartamento("Electrodomesticos");
        List<Producto> electrodomesticos = departamentoElectrodomesticos.getListaDeProductos();
        for(Producto  electrodomestico:  electrodomesticos ){
            electrodomestico.mostrarInformacion();
        }
    }
    public void mostrarDepartamentoEmpaquetados(){
        Departamento departamentoEmpaquetados = almacenChemsMart.getDepartamento("Empaquetados");
        List<Producto>  empaquetados =  departamentoEmpaquetados .getListaDeProductos();
        for(Producto  empaquetado :  empaquetados ){
            empaquetado.mostrarInformacion();
        }
    }

    public void mostrarDepartamentoElectronica(){
        Departamento departamentoElectronica = almacenChemsMart.getDepartamento("Electronica");
        List<Producto>  productoelectronicos = departamentoElectronica .getListaDeProductos();
        for(Producto  Productoelectronico : productoelectronicos ){
            Productoelectronico.mostrarInformacion();
        }
    }
    public void mostrarInformacion(){
        almacenCheemsMart.mostrarInformacion();
    }


    public double getPrecio(){
        almacenCheemsMart.getPrecio();
    }

    public String getNombre(){
        return "--------Catalogo Cheems Mart-------------";

    }

    public String getCodigo(){
        return codigo;
    }

}
