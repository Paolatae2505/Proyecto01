import java.util.List;

public class CatalogoTienda implements Catalogo , Producto{
    
    private AlmacenCheemsMart  almacenCheemsMart;
    private String codigo;


    public CatalogoTienda(AlamacenCheemsMart almacenCheemsMart){
            this.almacenCheemsMart = almacenCheemsMart;
            CheemsMart.inventario();
            codigo = "2505-3095";
    }

    public void mostrarDepartamentoDeBebidas(){

        Departamento departamentoBebidas = almacenChemsMart.getDepartamento("Bebidas");
       departamentoBebidas.mostrarInformacion();
    }

    public void mostrarDepartamentoDeBelleza(){
        Departamento departamentoBelleza = almacenChemsMart.getDepartamento("Belleza");
        departamentoBelleza.mostrarInformacion();
        
    }

    public void mostrarDepartamentoDeDulces(){
        Departamento departamentoDulces = almacenChemsMart.getDepartamento("Belleza");
        departamentoDulces.mostrarInformacion();
    }
    public void mostrarDepartamentoDeAlimentosFrescos(){
        Departamento departamentAlimentosFrescos = almacenChemsMart.getDepartamento("Alimentos Frescos");
        departamentAlimentosFrescos.mostrarInformacion();
    }

    public void mostrarDepartamentoElectrodomesticos(){
        Departamento departamentoElectrodomesticos = almacenChemsMart.getDepartamento("Electrodomesticos");
        departamentoElectrodomesticos.mostrarInformacion();
    }
    public void mostrarDepartamentoEmpaquetados(){
        Departamento departamentoEmpaquetados = almacenChemsMart.getDepartamento("Empaquetados");
        departamentoEmpaquetados.mostrarInformacion();
    }

    public void mostrarDepartamentoElectronica(){
        Departamento departamentoElectronica = almacenChemsMart.getDepartamento("Electronica");
        departamentoElectronica.mostrarInformacion();
    }
    public void mostrarInformacion(){
        almacenCheemsMart.mostrarInformacion();
    }

    public double getPrecio(){
        almacenCheemsMart.getPrecio(); /// Muestra los cinco departamentos :)
    }

    public String getNombre(){
        return "--------Catalogo Cheems Mart-------------";

    }
    public String getCodigo(){
        return codigo;
    }

}
