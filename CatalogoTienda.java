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

    public void mostrarInformacion() {
        almacenCheemsMart.mostrarInformacion();
    }

    public double getPrecio() {
        almacenCheemsMart.getPrecio(); /// Muestra los cinco departamentos :)
        return 0;
    }

    public String getNombre() {
        return "--------Catalogo Cheems Mart-------------";

    }

    public String getCodigo() {
        return codigo;
    }

}
