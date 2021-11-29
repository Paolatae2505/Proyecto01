import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacadeSimulacion {

    private CatalogoTiendaProxy catalogo;
    private CheemsMart cheemsMart;
    private TiendaVirutalPais interfazUsuario;
    private ClienteTiendaProxy cliente;
    private AlmacenCheemsMart almacenCheemsMart;
    private Compra compra = new Compra();


    public FacadeSimulacion(CatalogoTiendaProxy catalogo, CheemsMart cheemsMart,
                            AlmacenCheemsMart almacenCheemsMart) {
        this.catalogo = catalogo;
        this.almacenCheemsMart = almacenCheemsMart;
        this.cheemsMart = cheemsMart;
    }

    public void inscibirUsuariosDefault() {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("1995000150302505", 30000);
        ClienteTienda cliente1 = new ClienteTienda("TaeYeontan3095", "Taehyung Reed", "Yeontan2505", "5534816406",
                cuentaBancaria1, "USA");
        cheemsMart.agregarCliente(cliente1);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("1995000150302", 4000);
        ClienteTienda cliente2 = new ClienteTienda("Dar305698", "Darcell Pemberton", "DarcellP", "5589675433",
                cuentaBancaria2, "USA");
        cheemsMart.agregarCliente(cliente2);
    }

    private void seleccionarInterfazDeUsuario(String pais) {

        switch (pais) {
            case "Mexico":

                interfazUsuario = new Mexico();
                break;

            case "USA":

                interfazUsuario = new USA();
                break;

            case "España":

                interfazUsuario = new Espana();
                break;
        }
    }

    public void iniciarSesion() {
        Scanner entrada = new Scanner(System.in);
        HashMap<ClienteTienda, List<ProductoCheemsMart>> clientesTienda =
                cheemsMart.getClientesTienda();
        boolean usuarioCorrecto = false;
        boolean contrasenaCorrecta = false;
        ClienteTienda clienteAuxiliar = null;
        String IDCliente = "";
        String pais = "";
        while (usuarioCorrecto == false || contrasenaCorrecta == false) {
            System.out.println("-------------------------------------------------------");
            System.out.println("----Usuario :                --------------------------");
            System.out.println("-------------------------------------------------------");
            String usuario = entrada.nextLine();
            System.out.println("-----Contraseña :            --------------------------");
            String contraseña = entrada.nextLine();
            System.out.println("-------------------------------------------------------");
            String usuarioReal = "";
            String contraseñaReal = "";
            for (Map.Entry<ClienteTienda, List<ProductoCheemsMart>> entry :
                clientesTienda.entrySet()) {
                clienteAuxiliar = entry.getKey();
                usuarioReal = clienteAuxiliar.getUsuario();
                contraseñaReal = clienteAuxiliar.getContraseña();
                pais = clienteAuxiliar.getPais();
                IDCliente = clienteAuxiliar.getID();
            }
            if (usuarioReal.equals(usuario)) {
                usuarioCorrecto = true;
            } else {
                System.out.println("Tu usuario es incorrecto ....");
            }
            if (contraseñaReal.equals(contraseña)) {
                contrasenaCorrecta = true;
            } else {
                System.out.println("Tu contraseña es incorrecta ....");
            }
        }
        this.cliente = cheemsMart.getClienteProxy(IDCliente);
        seleccionarInterfazDeUsuario(pais);
        cheemsMart.setInterfaz(interfazUsuario);
    }

    public void verCatalogo() {
        Scanner entrada = new Scanner(System.in);
        //boolean salir = false;
        int salir = 0;
        while (salir == 0) {
            String menuDelCatalogo = interfazUsuario.menuCatalogo();
            catalogo.menuDelCatalogo(menuDelCatalogo);
            int opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    catalogo.mostrarDepartamento("B-e-l");
                    break;

                case 2:
                    catalogo.mostrarDepartamento("E-l-e");
                    break;

                case 3:
                    ///Electrodomesticos
                    catalogo.mostrarDepartamento("D-o-m");

                    break;

                case 4:
                    catalogo.mostrarDepartamento("B-e-b");

                    break;

                case 5:
                    ///Alimentos Frescos
                    catalogo.mostrarDepartamento("F-r-e");

                    break;

                case 6:
                    catalogo.mostrarDepartamento("E-m-p");

                    break;

                case 7:
                    catalogo.mostrarDepartamento("D-u-l");
                    break;

                case 8:
                    salir = 1;
                    break;

                default:
                    if (interfazUsuario.getIdioma().equals("espanol")) {
                        System.out.println("Digita una opción válida...");
                    } else {
                        if (interfazUsuario.getIdioma().equals("ingles")) {
                            System.out.println("Type a valid input...");
                        }
                    }
            }
        }

    }

    public void verCatalogoYComprar() {
        Scanner entrada = new Scanner(System.in);
        //boolean salir = false;
        int salirDeComprar = -1;
        while (salirDeComprar == -1) {
            String menuCatalogo = interfazUsuario.menuCatalogo();
            catalogo.menuDelCatalogo(menuCatalogo);
            int opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    catalogo.mostrarDepartamento("B-e-l");
                    break;

                case 2:
                    catalogo.mostrarDepartamento("E-l-e");
                    break;

                case 3:
                    ///Electrodomesticos
                    catalogo.mostrarDepartamento("D-o-m");

                    break;

                case 4:
                    catalogo.mostrarDepartamento("B-e-b");

                    break;

                case 5:
                    ///Alimentos Frescos
                    catalogo.mostrarDepartamento("F-r-e");

                    break;

                case 6:
                    catalogo.mostrarDepartamento("E-m-p");
                    break;

                case 7:
                    catalogo.mostrarDepartamento("D-u-l");
                    break;

                case 8:
                    if (interfazUsuario.getIdioma().equals("espanol")) {
                        System.out.println("Pagar");
                    } else {
                        if (interfazUsuario.getIdioma().equals("ingles")) {
                            System.out.println("Pay");
                        }
                    }

                case 9:
                    salirDeComprar = 2;
                    break;

                default:
                    if (interfazUsuario.getIdioma().equals("espanol")) {
                        System.out.println("Digita una opción válida...");
                    } else {
                        if (interfazUsuario.getIdioma().equals("ingles")) {
                            System.out.println("Type a valid input...");
                        }
                    }
            }
        }

    }

    public void agregraAlcarrito() {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int producto = 0;
        ProductoCheemsMart productoCheemsMart = null;
        while (!salir) {
            String menuCatalogo = interfazUsuario.menuCatalogo();
            catalogo.menuDelCatalogo(menuCatalogo);
            while (!entrada.hasNextInt()) {
                if (interfazUsuario.getIdioma().equals("espanol")) {
                    System.out.println("Digita una opción válida...");
                } else {
                    if (interfazUsuario.getIdioma().equals("ingles")) {
                        System.out.println("Type a valid input...");
                    }
                }
                entrada.nextLine();
            }
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    catalogo.mostrarDepartamento("B-e-l");
                    interfazUsuario.mensajeDeAgregarAlCarrito();
                    producto = entrada.nextInt();
                    productoCheemsMart = (ProductoCheemsMart) almacenCheemsMart.getProducto(producto, "Belleza");
                    compra.agregarProducto(productoCheemsMart);
                    break;

                case 2:
                    catalogo.mostrarDepartamento("E-l-e");
                    interfazUsuario.mensajeDeAgregarAlCarrito();
                    producto = entrada.nextInt();
                    productoCheemsMart = (ProductoCheemsMart) almacenCheemsMart.getProducto(producto, "Electronica");
                    compra.agregarProducto(productoCheemsMart);
                    break;

                case 3:
                    catalogo.mostrarDepartamento("D-o-m");
                    interfazUsuario.mensajeDeAgregarAlCarrito();
                    producto = entrada.nextInt();
                    productoCheemsMart = (ProductoCheemsMart) almacenCheemsMart.getProducto(producto, "Electrodomesticos");
                    compra.agregarProducto(productoCheemsMart);
                    break;

                case 4:
                    catalogo.mostrarDepartamento("B-e-b");
                    interfazUsuario.mensajeDeAgregarAlCarrito();
                    producto = entrada.nextInt();
                    productoCheemsMart = (ProductoCheemsMart) almacenCheemsMart.getProducto(producto, "Bebidas");
                    compra.agregarProducto(productoCheemsMart);
                    break;

                case 5:
                    catalogo.mostrarDepartamento("F-r-e");
                    interfazUsuario.mensajeDeAgregarAlCarrito();
                    producto = entrada.nextInt();
                    productoCheemsMart = (ProductoCheemsMart) almacenCheemsMart.getProducto(producto, "Alimentos Frescos");
                    compra.agregarProducto(productoCheemsMart);
                    break;

                case 6:
                    catalogo.mostrarDepartamento("E-m-p");
                    interfazUsuario.mensajeDeAgregarAlCarrito();
                    producto = entrada.nextInt();
                    productoCheemsMart = (ProductoCheemsMart) almacenCheemsMart.getProducto(producto, "Empaquetados");
                    compra.agregarProducto(productoCheemsMart);
                    break;

                case 7:
                    catalogo.mostrarDepartamento("Dul");
                    interfazUsuario.mensajeDeAgregarAlCarrito();
                    producto = entrada.nextInt();
                    productoCheemsMart = (ProductoCheemsMart) almacenCheemsMart.getProducto(producto, "Dulces");
                    compra.agregarProducto(productoCheemsMart);
                    break;

                case 8:
                    pagarCarritoDeCompra();

                case 9:
                    salir = true;
                    break;

                default:
                    if (interfazUsuario.getIdioma().equals("espanol")) {
                        System.out.println("Digita una opción válida...");
                    } else {
                        if (interfazUsuario.getIdioma().equals("ingles")) {
                            System.out.println("Type a valid input...");
                        }
                    }
            }
        }
    }

    public void pagarCarritoDeCompra() {
        double totalAPagar = interfazUsuario.cobrar(compra.getCarritoDeCompra());
        cliente.pagarCompra(totalAPagar);
        if (cliente.getTransaccionExitosa()) {
            compra.generarTicketDeCompra(totalAPagar); //ticket pendiente
        }
    }

    public TiendaVirutalPais getInterfaz() {
        return interfazUsuario;
    }
}
