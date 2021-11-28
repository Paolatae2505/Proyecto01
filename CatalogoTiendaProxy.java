public class CatalogoTiendaProxy implements Catalogo {

    private CatalogoTienda catalogoTiendaReal;
    private String codigo;

    public CatalogoTiendaProxy(CatalogoTienda catalogoTiendaReal) {
        this.catalogoTiendaReal = catalogoTiendaReal;
    }

    public void mostrarDepartamento(String codigoDepto) {
        //// revision del if ?
        catalogoTiendaReal.mostrarDepartamento(codigoDepto);

    }

    /**
     * public void mostrarDepartamentoDeBebidas() {
     * catalogoTiendaReal.mostrarDepartamentoDeBebidas();
     * }
     * <p>
     * public void mostrarDepartamentoDeBelleza() {
     * catalogoTiendaReal.mostrarDepartamentoDeBelleza();
     * }
     * <p>
     * public void mostrarDepartamentoDeDulces() {
     * catalogoTiendaReal.mostrarDepartamentoDeDulces();
     * }
     * <p>
     * public void mostrarDepartamentoDeAlimentosFrescos() {
     * catalogoTiendaReal.mostrarDepartamentoDeAlimentosFrescos();
     * }
     * <p>
     * public void mostrarDepartamentoElectrodomesticos() {
     * catalogoTiendaReal.mostrarDepartamentoElectrodomesticos();
     * }
     * <p>
     * public void mostrarDepartamentoEmpaquetados() {
     * catalogoTiendaReal.mostrarDepartamentoEmpaquetados();
     * }
     * <p>
     * public void mostrarDepartamentoElectronica() {
     * catalogoTiendaReal.mostrarDepartamentoElectronica();
     * }
     */
    public void menuDelCatalogo(String idioma) {
        catalogoTiendaReal.menuDelCatalogo(idioma);
    }

    public AlmacenCheemsMart getAlmacenCheemsMart() {
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
