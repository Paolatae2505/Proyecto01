

import java.util.Scanner;
public class SimulacionCheemsMart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Compra compraCliente = new Compra();
        CheemsMart cheemsMart = new CheemsMart();
        TiendaVirutalPais interfaz ;
        AlmacenCheemsMart almacenCheemsMart = new AlmacenCheemsMart();
        CatalogoTienda catalogoReal = new CatalogoTienda(almacenCheemsMart);
        CatalogoTiendaProxy catalogo = new CatalogoTiendaProxy(catalogoReal);
        FacadeSimulacion facadeSimulacion = new FacadeSimulacion(catalogo,cheemsMart,
        almacenCheemsMart);
        facadeSimulacion.inscibirUsuariosDefault();
        boolean salirSesion = false;
        while(salirSesion == false){
        facadeSimulacion.iniciarSesion();
        interfaz = facadeSimulacion.getInterfaz();
        interfaz.saludo();
        ///////MENU//////////////
        int opcion = entrada.nextInt();
        switch(opcion){

            case 1 :
            facadeSimulacion.verCatalogo();
            break;

            case 2 :
            facadeSimulacion.agregraAlcarrito();
            break;


            case 3 :
            facadeSimulacion.pagarCarritoDeCompra();
            break;

            case 4 :
            // 
            break;

            case 5 :
            System.out.println("Esa no es una opcion !!!!");
            System.out.println("Digite un numero positivo menor a 4!!!!");

        }

        }
        
        

    }
    
}
