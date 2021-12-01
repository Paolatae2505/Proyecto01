public class CatalogoTiendaProxy implements Catalogo {

    private CatalogoTienda catalogoTiendaReal;
    private String codigo;

    public CatalogoTiendaProxy(CatalogoTienda catalogoTiendaReal) {
        this.catalogoTiendaReal = catalogoTiendaReal;
    }
      public void mostrarSeccionDepto(String nombreDepto){
          catalogoTiendaReal.mostrarSeccionDepto(nombreDepto);
    }

}
