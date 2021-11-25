public class SimulacionCheemsMart {
    public static void main(String[] args) {
        

        Compra compraCliente = new Compra();
        CheemsMart cheemsMart = new CheemsMart();
        TiendaVirutalPais interfaz ;
        AlmacenCheemsMart almacenCheemsMart = new AlmacenCheemsMart();
        CatalogoTienda catalogoReal = new CatalogoTienda(almacenCheemsMart);
        CatalogoTiendaProxy catalogo = new CatalogoTiendaProxy(catalogoReal);
        FacadeSimulacion facadeSimulacion = new FacadeSimulacion(catalogo,cheemsMart,
        almacenCheemsMart);
        facadeSimulacion.inscibirUsuariosDefault();
        facadeSimulacion.iniciarSesion();
        interfaz = facadeSimulacion.getInterfaz();
        interfaz.saludo();
        
        

    }
    
}
