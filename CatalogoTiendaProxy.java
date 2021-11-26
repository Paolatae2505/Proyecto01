public class CatalogoTiendaProxy implements Catalogo{

    private CatalogoTienda catalogoTiendaReal;
    private String codigo;

    public CatalogoTiendaProxy(CatalogoTienda catalogoTiendaReal) {
        this.catalogoTiendaReal = catalogoTiendaReal;
    }

    public void mostrarDepartamento(String codigoDepto){
        //// revision del if ?
        catalogoTiendaReal.mostrarDepartamento(codigoDepto);

    }
    /** 
    public void mostrarDepartamentoDeBebidas() {
        catalogoTiendaReal.mostrarDepartamentoDeBebidas();
    }

    public void mostrarDepartamentoDeBelleza() {
        catalogoTiendaReal.mostrarDepartamentoDeBelleza();
    }

    public void mostrarDepartamentoDeDulces() {
        catalogoTiendaReal.mostrarDepartamentoDeDulces();
    }

    public void mostrarDepartamentoDeAlimentosFrescos() {
        catalogoTiendaReal.mostrarDepartamentoDeAlimentosFrescos();
    }

    public void mostrarDepartamentoElectrodomesticos() {
        catalogoTiendaReal.mostrarDepartamentoElectrodomesticos();
    }

    public void mostrarDepartamentoEmpaquetados() {
        catalogoTiendaReal.mostrarDepartamentoEmpaquetados();
    }

    public void mostrarDepartamentoElectronica() {
        catalogoTiendaReal.mostrarDepartamentoElectronica();
    }
    */
    public void menuDelCatalogo(){
         catalogoTiendaReal.menuDelCatalogo();
    }

    public AlmacenCheemsMart getAlmacenCheemsMart(){
        return catalogoTiendaReal.getAlmacenCheemsMart();
    }
    public String getCodigo() {
        String codigo = "";
        if (checarAcceso()) {
            codigo = catalogoTiendaReal.getCodigo();
        }
        return codigo;
    }

    public boolean checarAcceso() {
        return catalogoTiendaReal.getCodigo().equals(codigo);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
