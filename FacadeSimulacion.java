import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class FacadeSimulacion{

    private CatalogoTiendaProxy catalogo;
    private CheemsMart cheemsMart;
    private TiendaVirutalPais interfaz;
    private ClienteTiendaProxy cliente;
    private AlmacenCheemsMart almacenCheemsMart;
    private Compra compra = new Compra();
   

    public FacadeSimulacion(CatalogoTiendaProxy catalogo, CheemsMart cheemsMart){
           this.catalogo = catalogo;
             almacenCheemsMart = catalogo.getAlmacenCheemsMart();
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

    public void iniciarSesion(){
        Scanner entrada = new Scanner(System.in);
        HashMap<ClienteTienda, List<Producto>> clientesTienda  = cheemsMart.getClientesTienda();
        boolean usuarioCorrecto = false;
        boolean contraseñaCorrecta = false;
        ClienteTienda clienteAuxiliar = null;
        String IDCliente = "";
        String pais = "";
        while(usuarioCorrecto == false || contraseñaCorrecta == false){
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("----------BIENVENIDO A LA TIENDA CHEEMSMART------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("----Usuario :                --------------------------");
        System.out.println("-------------------------------------------------------");
        String usuario = entrada.nextLine();
        System.out.println("-----Contraseña :            --------------------------");
        String contraseña = entrada.nextLine();
        System.out.println("-------------------------------------------------------");
        String usuarioReal = "";
        String contraseñaReal  = "";
        for (Map.Entry<ClienteTienda, List<Producto> > entry : clientesTienda.entrySet()) {
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
      cheemsMart.seleccionarInterfazDeUsuario(pais);
      interfaz = cheemsMart.getInterfaz();
      
    }

    public void verCatalogo(){
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
        catalogo.mostrarInformacion();
        int opcion = entrada.nextInt();
        switch(opcion){

            case 1 :
            catalogo.mostrarDepartamentoDeBelleza();
            break;

            case 2 :
            catalogo.mostrarDepartamentoElectronica();
             break;

            case 3 :
            catalogo.mostrarDepartamentoElectrodomesticos();
            
            break;

            case 4 :
            catalogo.mostrarDepartamentoDeBebidas();
         
            break;

            case 5 :
            catalogo.mostrarDepartamentoDeAlimentosFrescos();
         
            break;

            case 6 :
            catalogo.mostrarDepartamentoEmpaquetados();
        
            break;

            case 7 :
            catalogo.mostrarDepartamentoDeDulces();
          
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
        Scanner entradaIn = new Scanner(System.in);
        boolean salir = false;
        int producto = 0;
        ProductoCheemsMart productoCheemsMart = null;
        while(salir == false){
        catalogo.mostrarInformacion();

        int opcion = entrada.nextInt();
        switch(opcion){

            case 1 :
            catalogo.mostrarDepartamentoDeBelleza();
            interfaz.mensajeDeAgregarAlCarrito();
            producto = entradaIn.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Belleza");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 2 :
            catalogo.mostrarDepartamentoElectronica();
            interfaz.mensajeDeAgregarAlCarrito();
            producto = entradaIn.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Electronica");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 3 :
            catalogo.mostrarDepartamentoElectrodomesticos();
            interfaz.mensajeDeAgregarAlCarrito();
            producto = entradaIn.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Electrodomesticos");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 4 :
            catalogo.mostrarDepartamentoDeBebidas();
            interfaz.mensajeDeAgregarAlCarrito();
            producto = entradaIn.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Bebidas");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 5 :
            catalogo.mostrarDepartamentoDeAlimentosFrescos();
            interfaz.mensajeDeAgregarAlCarrito();
            producto = entradaIn.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Alimentos Frescos");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 6 :
            catalogo.mostrarDepartamentoEmpaquetados();
            interfaz.mensajeDeAgregarAlCarrito();
            producto = entradaIn.nextInt();
            productoCheemsMart = almacenCheemsMart.getProducto(producto,"Empaquetados");
            compra.agregarProducto(productoCheemsMart);
            break;

            case 7 :
            catalogo.mostrarDepartamentoDeDulces();
            interfaz.mensajeDeAgregarAlCarrito();
            producto = entradaIn.nextInt();
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
}
