import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class FacadeSimulacion{

    private CatalogoTiendaProxy catalogo;
    private CheemsMart cheemsMart;
    private TiendaVirutalPais interfazUsuario;
    private ClienteTiendaProxy cliente;
    private AlmacenCheemsMart almacenCheemsMart;
    private Compra compra = new Compra();
   

    public FacadeSimulacion(CatalogoTiendaProxy catalogo, CheemsMart cheemsMart,
    AlmacenCheemsMart almacenCheemsMart){
           this.catalogo = catalogo;
            this.almacenCheemsMart = almacenCheemsMart;
           this.cheemsMart = cheemsMart;
    }

    public void inscibirUsuariosDefault(){
          CuentaBancaria cuentaBancaria1 = new CuentaBancaria("1995000150302505", 30000);
          ClienteTienda cliente1 = new ClienteTienda("TaeYeontan3095","Taehyung Reed","Yeontan2505", "5534816406",
          cuentaBancaria1, "USA");
          cheemsMart.agregarCliente(cliente1);
          CuentaBancaria cuentaBancaria2 = new CuentaBancaria("1995000150302", 4000);
          ClienteTienda cliente2 = new ClienteTienda("Dar305698","Darcell Pemberton","DarcellP", "5589675433",
          cuentaBancaria2, "USA");
          cheemsMart.agregarCliente(cliente2);
    }

    private void seleccionarInterfazDeUsuario(String pais) {

        switch (pais) {
            case "Mexico":

                interfazUsuario = Mexico.getTiendaVirtual();

                break;

            case "USA":

                interfazUsuario = USA.getTiendaVirtual();
                break;

            case "España":

                interfazUsuario = Espana.getTiendaVirtual();

                break;
        }
    }

    public void iniciarSesion(){
        Scanner entrada = new Scanner(System.in);
        HashMap<ClienteTienda, List<ProductoCheemsMart>> clientesTienda  = 
        cheemsMart.getClientesTienda();
        boolean usuarioCorrecto = false;
        boolean contraseñaCorrecta = false;
        ClienteTienda clienteAuxiliar = null;
        String IDCliente = "";
        String pais = "";
        while(usuarioCorrecto == false || contraseñaCorrecta == false){
        System.out.println("-------------------------------------------------------");
        System.out.println("----Usuario :                --------------------------");
        System.out.println("-------------------------------------------------------");
        String usuario = entrada.nextLine();
        System.out.println("-----Contraseña :            --------------------------");
        String contraseña = entrada.nextLine();
        System.out.println("-------------------------------------------------------");
        String usuarioReal = "";
        String contraseñaReal  = "";
        for (Map.Entry<ClienteTienda, List<ProductoCheemsMart> > entry : 
        clientesTienda.entrySet()) {
             clienteAuxiliar =  entry.getKey();
             usuarioReal =   clienteAuxiliar.getUsuario();
             contraseñaReal = clienteAuxiliar.getContraseña();
             pais = clienteAuxiliar.getPais();
             IDCliente = clienteAuxiliar.getID();
        }
        if(usuarioReal.equals(usuario)){
            usuarioCorrecto = true;
        }else{
            System.out.println("Tu usuario es incorrecto ....");
        }
        if(contraseñaReal.equals(contraseña)){
            contraseñaCorrecta = true;
        }else{
            System.out.println("Tu contraseña es incorrecta ....");
        }
     }
      this.cliente = cheemsMart.getClienteProxy(IDCliente);
      seleccionarInterfazDeUsuario(pais); 
      cheemsMart.setInterfaz(interfazUsuario);
    }

    public void verCatalogo(){
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
        catalogo.menuDelCatalogo();
        int opcion = entrada.nextInt();
        switch(opcion){

            case 1 :
            catalogo.mostrarDepartamento("Bel");
            break;

            case 2 :
            catalogo.mostrarDepartamento("Ele");
             break;

            case 3 :
            ///Electrodomesticos
            catalogo.mostrarDepartamento("Dom");
            
            break;

            case 4 :
            catalogo.mostrarDepartamento("Beb");
         
            break;

            case 5 :
            ///Alimentos Frescos
            catalogo.mostrarDepartamento("Fre");
         
            break;

            case 6 :
            catalogo.mostrarDepartamento("Emp");
        
            break;

            case 7 :
            catalogo.mostrarDepartamento("Dul");
          
            break;

            case 8 :
            salir = true;
            break;

            default :
            System.out.println("Opcion incorrecta !!!!"); /// Depende del pais?
            System.out.println("Digita una opcion valida ....");
        }
        }
        
    }

    public void agregraAlcarrito(){
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int producto = 0;
        ProductoCheemsMart productoCheemsMart = null;
        while(salir == false){
        catalogo.menuDelCatalogo();
        while (!entrada.hasNextInt()) {
            System.out.println("<Da una opción válida !!!>");
            entrada.nextLine();
        }
        int opcion = entrada.nextInt();
        switch(opcion){

            case 1 :
            catalogo.mostrarDepartamento("Bel");
            interfazUsuario.mensajeDeAgregarAlCarrito();
            producto = entrada.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Belleza");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 2 :
            catalogo.mostrarDepartamento("Ele");
            interfazUsuario.mensajeDeAgregarAlCarrito();
            producto = entrada.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Electronica");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 3 :
            catalogo.mostrarDepartamento("Dom");
            interfazUsuario.mensajeDeAgregarAlCarrito();
            producto = entrada.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Electrodomesticos");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 4 :
            catalogo.mostrarDepartamento("Beb");
            interfazUsuario.mensajeDeAgregarAlCarrito();
            producto = entrada.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Bebidas");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 5 :
            catalogo.mostrarDepartamento("Fre");
            interfazUsuario.mensajeDeAgregarAlCarrito();
            producto = entrada.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Alimentos Frescos");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 6 :
            catalogo.mostrarDepartamento("Emp");
            interfazUsuario.mensajeDeAgregarAlCarrito();
            producto = entrada.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Empaquetados");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 7 :
            catalogo.mostrarDepartamento("Dul");
            interfazUsuario.mensajeDeAgregarAlCarrito();
            producto = entrada.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Dulces");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 8 :
            salir = true;
            break;

            default :
            System.out.println("Opcion incorrecta !!!!");
            System.out.println("Digita una opcion valida ....");
        }
        }
    }

    public void pagarCarritoDeCompra(){

    }

    public TiendaVirutalPais getInterfaz(){
        return  interfazUsuario;
    }
}
