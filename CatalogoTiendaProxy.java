public class CatalogoTiendaProxy implements Catalogo, Producto {

    private CatalogoTienda catalogoTiendaReal;
    private String codigo;

    public CatalogoTiendaProxy(CatalogoTienda catalogoTiendaReal) {
        this.catalogoTiendaReal = catalogoTiendaReal;
    }

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

    public void mostrarInformacion() {
        catalogoTiendaReal.mostrarInformacion();
    }

    public double getPrecio() {
        double precio = 0;
        if (checarAcceso()) {
            precio = catalogoTiendaReal.getPrecio();
        }
        return precio;
    }

    public String getNombre() {
        String nombre = "";
        if (checarAcceso()) {
            nombre = catalogoTiendaReal.getNombre();
        }
        return nombre;
    }

    public String getCodigo() {
        String codigo = "";
        if (checarAcceso()) {
            codigo = catalogoTiendaReal.getNombre();
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
