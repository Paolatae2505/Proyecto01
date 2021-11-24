public class SimulacionCheemsMart {
    public static void main(String[] args) {
        

        Compra compraCliente = new Compra();
        CheemsMart cheemsMart = new CheemsMart();
        AlmacenCheemsMart almacenCheemsMart = new AlmacenCheemsMart();
        CatalogoTienda catalogoReal = new CatalogoTienda(almacenCheemsMart);
        CatalogoTiendaProxy catalogo = new CatalogoTiendaProxy(catalogoReal);
        FacadeSimulacion facadeSimulacion = new FacadeSimulacion(catalogo,cheemsMart);

        facadeSimulacion.inscibirUsuariosDefault();
        facadeSimulacion.iniciarSesion();
        

        



      


    }
    
}
