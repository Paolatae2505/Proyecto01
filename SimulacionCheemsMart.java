import java.util.Scanner;

public class SimulacionCheemsMart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salirSesion = false;
        CheemsMartCentral administrador = new CheemsMartCentral();
        SucursalMexico sucursalMexico = new SucursalMexico(administrador.getClientesMexico());
        SucursalEspana sucursalEspana = new SucursalEspana(administrador.getClientesEspana());
        SucursalUSA sucursalUSA = new SucursalUSA(administrador.getClientesUSA());
        ClienteTiendaProxy proxy = null;
        boolean usuarioCorrecto = false;
        boolean contrasenaCorrecta = false;
        String nacionalidad;
        InterfazPais interfazPais = null;
        AlmacenCheemsMart almacenCheemsMart = new AlmacenCheemsMart();
        CatalogoTienda catalogo = new CatalogoTienda(almacenCheemsMart);
        CatalogoTiendaProxy catalogoProxy = new CatalogoTiendaProxy(catalogo);
        Compra compra = new Compra();
        boolean salir = false;
        boolean descuento = false;
        while (!salirSesion) {
            while (!usuarioCorrecto || !contrasenaCorrecta) {
                System.out.println("-------------------------------------------------------");
                System.out.println("----Usuario :                --------------------------");
                System.out.println("-------------------------------------------------------");
                String usuario = entrada.nextLine();
                System.out.println("-----Contraseña :            --------------------------");
                String contrasena = entrada.nextLine();
                System.out.println("-------------------------------------------------------");
                String usuarioReal = "";
                String contrasenaReal = "";
                //////////////BUSCAR EN USA
                proxy = sucursalUSA.verificarClienteExistente(contrasena, usuario);
                /// mexico
                /// ESPANA
                if (proxy != null) {
                    usuarioCorrecto = true;
                    contrasenaCorrecta = true;
                }
            }
            nacionalidad = proxy.getPais();
            switch (nacionalidad) {
                case "USA":
                    interfazPais = new InterfazUSA(catalogoProxy, proxy, compra, sucursalUSA,
                            almacenCheemsMart);
                    sucursalUSA.setInterfaz(interfazPais);
                    /*descuentoUSA = sucursalUSA.tieneDescuento();
                    porcentajeDescuentoUSA = sucursalUSA.descuentoRandom();
                    if (descuentoUSA) {
                        administrador.notificarCliente(
                                interfazPais.mensajeDeDescuento(porcentajeDescuentoUSA), "USA");
                        System.out.println(interfazPais.mensajeDeDescuento
                                (sucursalUSA.descuentoRandom()));
                    }*/
                    interfazPais.mostrarMenuPrincipal();
                    break;

                case "Mexico":

                    interfazPais = new InterfazMexico(catalogoProxy, proxy, compra, sucursalUSA,
                            almacenCheemsMart);
                    sucursalMexico.setInterfaz(interfazPais);
                    break;

                case "Espana":

                    interfazPais = new InterfazEspana(catalogoProxy, proxy, compra, sucursalUSA,
                            almacenCheemsMart);
                    sucursalEspana.setInterfaz(interfazPais);
                    break;
            }

            interfazPais.mostrarMenuPrincipal();

        }

    }

}
