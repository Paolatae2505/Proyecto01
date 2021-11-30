import java.util.Scanner;

public class SimulacionCheemsMart {

    public static boolean aplicarDescuento(){
        int [] binarios = {0,1,0,1};
        int numeroRandom = (int) (Math.random() * 3);
        if(numeroRandom == 0){
             return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Compra compraCliente = new Compra();
        CheemsMart cheemsMart = new CheemsMart();
        TiendaVirutalPais interfaz;
        AlmacenCheemsMart almacenCheemsMart = new AlmacenCheemsMart();
        CatalogoTienda catalogoReal = new CatalogoTienda(almacenCheemsMart);
        CatalogoTiendaProxy catalogo = new CatalogoTiendaProxy(catalogoReal);
        FacadeSimulacion facadeSimulacion = new FacadeSimulacion(catalogo, cheemsMart,
                almacenCheemsMart);
        facadeSimulacion.inscibirUsuariosDefault();
        boolean salirSesion = false;
        boolean salir = false;
        boolean descuento = false;
        while (!salirSesion){
            descuento = aplicarDescuento();
            facadeSimulacion.iniciarSesion(descuento);
            interfaz = facadeSimulacion.getInterfaz();
            interfaz.saludo();
            while(salir == false){
            interfaz.mostrarMenuPrincipal();
            int opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    facadeSimulacion.verCatalogo();
                    break;

                case 2:
                    facadeSimulacion.agregraAlcarrito();
                    facadeSimulacion.pagarCarritoDeCompra();
                     //mismo que verCatalogo pero con las opciones de
                    // salir o pagar van con esta opcion
                    break;

                case 3:
                    interfaz.despedida();
                    salir = true;
                    break;

                case 5:
                    System.out.println("Esa no es una opción !!!!");
                    System.out.println("Digite un numero positivo menor a 4!!!!");

            }

            }
            

        }


    }

}
