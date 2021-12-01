public class CatalogoTienda implements Catalogo{

    private AlmacenCheemsMart almacenCheemsMart;
    private String codigo;


    public CatalogoTienda(AlmacenCheemsMart almacenCheemsMart) {
        this.almacenCheemsMart = almacenCheemsMart;
        codigo = "2505-3095";
    }

    public void mostrarSeccionDepto(String nombreDepto){
          almacenCheemsMart.mostrarDepartamento(nombreDepto);
    }

    public AlmacenCheemsMart getAlmacenCheemsMart() {
     return almacenCheemsMart;
    }

    public String getCodigo() {
     return codigo;
    }
    
}
