public class CatalogoTienda implements Catalogo, Producto {

    private AlmacenCheemsMart almacenCheemsMart;
    private String codigo;


    public CatalogoTienda(AlmacenCheemsMart almacenCheemsMart) {
        this.almacenCheemsMart = almacenCheemsMart;
        almacenCheemsMart.inventario();
        codigo = "2505-3095";
    }

    public void mostrarDepartamentoDeBebidas() {
        Departamento departamentoBebidas = almacenCheemsMart.getDepartamento("Bebidas");
        departamentoBebidas.mostrarInformacion();
    }

    public void mostrarDepartamentoDeBelleza() {
        Departamento departamentoBelleza = almacenCheemsMart.getDepartamento("Belleza");
        departamentoBelleza.mostrarInformacion();
    }

    public void mostrarDepartamentoDeDulces() {
        Departamento departamentoDulces = almacenCheemsMart.getDepartamento("Dulces");
        departamentoDulces.mostrarInformacion();
    }

    public void mostrarDepartamentoDeAlimentosFrescos() {
        Departamento departamentAlimentosFrescos = almacenCheemsMart.getDepartamento("Alimentos Frescos");
        departamentAlimentosFrescos.mostrarInformacion();
    }

    public void mostrarDepartamentoElectrodomesticos() {
        Departamento departamentoElectrodomesticos = almacenCheemsMart.getDepartamento("Electrodomesticos");
        departamentoElectrodomesticos.mostrarInformacion();
    }

    public void mostrarDepartamentoEmpaquetados() {
        Departamento departamentoEmpaquetados = almacenCheemsMart.getDepartamento("Empaquetados");
        departamentoEmpaquetados.mostrarInformacion();
    }

    public void mostrarDepartamentoElectronica() {
        Departamento departamentoElectronica = almacenCheemsMart.getDepartamento("Electronica");
        departamentoElectronica.mostrarInformacion();
    }

    public void mostrarInformacion() {  //// Este se borrara
        almacenCheemsMart.mostrarInformacion();
        System.out.println("8 Salir   ---------------------------------");
        System.out.println("Digite el numero del departamento a visitar");
    }
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

    public double getPrecio() {
        return  almacenCheemsMart.getPrecio();
    }

    public String getNombre() {
        return "------------- Catalogo Cheems Mart ---------------";
    }

    public String getCodigo() {
        return codigo;
    }

}
