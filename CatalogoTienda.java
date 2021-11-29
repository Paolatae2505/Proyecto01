public class CatalogoTienda implements Catalogo {

    private AlmacenCheemsMart almacenCheemsMart;
    private String codigo;


    public CatalogoTienda(AlmacenCheemsMart almacenCheemsMart) {
        this.almacenCheemsMart = almacenCheemsMart;
        //almacenCheemsMart.inventario();
        codigo = "2505-3095";
    }

    public void mostrarDepartamento(String codigoDepto) {
        //// revision del if ?
        Producto departamento = almacenCheemsMart.getDepartamento(codigoDepto);
        departamento.mostrarInformacion();
    }

    public void menuDelCatalogo(String menu) {
           System.out.println(menu);
    }

    public AlmacenCheemsMart getAlmacenCheemsMart() {
        return almacenCheemsMart;
    }

    public String getCodigo() {
        return codigo;
    }

}
