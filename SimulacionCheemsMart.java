public class SimulacionCheemsMart {
    public static void main(String[] args) {
        

        Compra compraCliente = new Compra();
        CheemsMart cheemsMart = new CheemsMart();
        AlmacenCheemsMart almacenCheemsMart = new AlmacenCheemsMart();
        CatalogoTienda catalogoReal = new CatalogoTienda(almacenCheemsMart);
        CatalogoTiendaProxy catalogo = new CatalogoTiendaProxy(catalogoReal);
        FacadeSimulacionCheemsMart facadeSimulacionCheemsMart  = new FacadeSimulacionCheemsMart(catalogo
        ,cheemsMart);

        facadeSimulacionCheemsMart.inscibirUsuariosDefault();
        facadeSimulacionCheemsMart.iniciarSesion();
        

        



      


    }
    
}
