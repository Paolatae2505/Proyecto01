public class CatalogoTienda implements Catalogo{

    private AlmacenCheemsMart almacenCheemsMart;
    private String codigo;


    public CatalogoTienda(AlmacenCheemsMart almacenCheemsMart) {
        this.almacenCheemsMart = almacenCheemsMart;
        almacenCheemsMart.inventario();
        codigo = "2505-3095";
    }

    public void mostrarDepartamento(String codigoDepto){
        //// revision del if ?
        Producto departamento = almacenCheemsMart.getDepartamento(codigoDepto);
        departamento.mostrarInformacion();

    }
   /**
    public void mostrarDepartamentoDeBebidas() {
        Producto departamentoBebidas = almacenCheemsMart.getDepartamento("Bebidas");
        departamentoBebidas.mostrarInformacion();
    }

    public void mostrarDepartamentoDeBelleza() {
        Producto departamentoBelleza = almacenCheemsMart.getDepartamento("Belleza");
        departamentoBelleza.mostrarInformacion();
    }

    public void mostrarDepartamentoDeDulces() {
        Producto departamentoDulces = almacenCheemsMart.getDepartamento("Dulces");
        departamentoDulces.mostrarInformacion();
    }

    public void mostrarDepartamentoDeAlimentosFrescos() {
        Producto departamentAlimentosFrescos = almacenCheemsMart.getDepartamento("Alimentos Frescos");
        departamentAlimentosFrescos.mostrarInformacion();
    }

    public void mostrarDepartamentoElectrodomesticos() {
        Producto departamentoElectrodomesticos = almacenCheemsMart.getDepartamento("Electrodomesticos");
        departamentoElectrodomesticos.mostrarInformacion();
    }

    public void mostrarDepartamentoEmpaquetados() {
        Producto departamentoEmpaquetados = almacenCheemsMart.getDepartamento("Empaquetados");
        departamentoEmpaquetados.mostrarInformacion();
    }

    public void mostrarDepartamentoElectronica() {
       Producto  departamentoElectronica = almacenCheemsMart.getDepartamento("Electronica");
        departamentoElectronica.mostrarInformacion();
    }

     */

    public void menuDelCatalogo(){
        System.out.println("---------------------------------------------");
        System.out.println("---------- Catalogo CheemsMart --------------");
        System.out.println("---------------------------------------------");
        System.out.println("-1 Departamento : Belleza -------------------");
        System.out.println("-2 Departamento : Electronica ---------------");
        System.out.println("-3 Departamento : Electrodomesticos ---------");
        System.out.println("-4 Departamento : Bebidas -------------------");
        System.out.println("-5 Departamento : Alimentos Frescos ---------");
        System.out.println("-6 Departamento : Empquetados ---------------");
        System.out.println("-7 Departamento : Dulces      ---------------");
        System.out.println("-8 Salir      -------------------------------");
        System.out.println("---------------------------------------------");
    }

    public AlmacenCheemsMart getAlmacenCheemsMart(){
        return almacenCheemsMart;
    }

    public String getCodigo() {
        return codigo;
    }

}
