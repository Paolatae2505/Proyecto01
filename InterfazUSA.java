import java.time.LocalDate;
import java.util.Scanner;

public class InterfazUSA implements InterfazPais {

    private Catalogo catalogo;
    private ClienteTiendaProxy cliente;
    private Compra compra;
    private Sucursal sucursalUSA;
    private AlmacenCheemsMart almacenCheemsMart;


    public InterfazUSA(Catalogo catalogo, ClienteTiendaProxy cliente,
                       Compra compra, Sucursal sucursalUSA, AlmacenCheemsMart almacenCheemsMart) {
        this.catalogo = catalogo;
        this.cliente = cliente;
        this.compra = compra;
        this.sucursalUSA = sucursalUSA;
        this.almacenCheemsMart = almacenCheemsMart;
    }

    public void mostrarMenuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("---------------------------------------------");
            System.out.println("------------- Choose an option  --------------");
            System.out.println("-1 --- View catalog -------------------------");
            System.out.println("-2 --- Make a purchase ----------------------");
            //System.out.println("-3 --- Realizar Pago ------------------------");
            System.out.println("-3 --- Exit --------------------------------");
            System.out.println("---------------------------------------------");

            int opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    verCatalogo();
                    break;

                case 2:
                    realizarCompra();

                    break;

                case 3:
                    System.out.println("Thank you for your purchase! \n" +
                            "Come back soon!");
                    salir = true;
                    break;

                case 5:
                    System.out.println("Thats not option !!!!");
                    System.out.println("Please tipe numbre in the range !!!!");

            }

        }
    }

    public void verCatalogo() {
        Scanner entrada = new Scanner(System.in);
        int salir = 0;
        while (salir == 0) {
            String menuCatalogo = "---------------------------------------------\n" +
                    "---------- CheemsMart Catalog ---------------\n" +
                    "---------------------------------------------\n" +
                    "----------------Departments------------------\n" +
                    "-1 --- Beauty ------------------------------- \n" +
                    "-2 --- Electronics --------------------------\n" +
                    "-3 --- Home Appliances ----------------------\n" +
                    "-4 --- Drinks ------------------------------- \n" +
                    "-5 --- Fresh Produce ------------------------ \n" +
                    "-6 --- Canned Foods ------------------------- \n" +
                    "-7 --- Sweets ------------------------------- \n" +
                    "-8 --- Exit       --------------------------- \n" +
                    "---------------------------------------------\n";
            System.out.println(menuCatalogo);
            int opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    catalogo.mostrarSeccionDepto("Belleza");
                    break;

                case 2:
                    catalogo.mostrarSeccionDepto("Electronica");
                    break;

                case 3:
                    ///Electrodomesticos
                    catalogo.mostrarSeccionDepto("Electrodomesticos");

                    break;

                case 4:
                    catalogo.mostrarSeccionDepto("Bebidas");

                    break;

                case 5:
                    ///Alimentos Frescos
                    catalogo.mostrarSeccionDepto("Alimentos :Frescos");

                    break;

                case 6:
                    catalogo.mostrarSeccionDepto("Alimentos :Empaquetados");

                    break;

                case 7:
                    catalogo.mostrarSeccionDepto("Alimentos :Dulces");
                    break;

                case 8:
                    salir = 1;
                    break;

                default:
                    System.out.println("FAILED (poner mensaje bien ;)..");
                    break;

            }
        }

    }

    public void realizarCompra() {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int numProducto = 0;
        Producto producto = null;
        while (!salir) {
            String menuCatalogo = "---------------------------------------------\n" +
                    "---------- CheemsMart Catalog ---------------\n" +
                    "---------------------------------------------\n" +
                    "----------------Departments------------------\n" +
                    "-1 --- Beauty -------------------------------\n" +
                    "-2 --- Electronics --------------------------\n" +
                    "-3 --- Home Appliances ----------------------\n" +
                    "-4 --- Drinks -------------------------------\n" +
                    "-5 --- Fresh Produce ------------------------\n" +
                    "-6 --- Canned Foods -------------------------\n" +
                    "-7 --- Sweets -------------------------------\n" +
                    "-9 --- Continue to checkout -----------------\n" +
                    "-8 --- Exit       ---------------------------\n" +
                    "---------------------------------------------\n";
            System.out.println(menuCatalogo);
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    catalogo.mostrarSeccionDepto("Belleza");
                    System.out.println("Add to shopping cart");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Belleza", numProducto);
                    compra.agregarProducto(producto);
                    break;

                case 2:
                    catalogo.mostrarSeccionDepto("Electronica");
                    System.out.println("Add to shopping cart");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Electronica", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 3:
                    catalogo.mostrarSeccionDepto("Electrodomesticos");
                    System.out.println("Add to shopping cart");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Electrodomesticos", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 4:
                    catalogo.mostrarSeccionDepto("Bebidas");
                    System.out.println("Add to shopping cart");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Bebidas", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 5:
                    catalogo.mostrarSeccionDepto("Alimentos : Frescos");
                    System.out.println("Add to shopping cart");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Alimentos : Frescos", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 6:
                    catalogo.mostrarSeccionDepto("Alimentos :Empaquetados");
                    System.out.println("Add to shopping cart");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Alimentos :Empaquetados", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 7:
                    catalogo.mostrarSeccionDepto("Alimentos : Dulces");
                    System.out.println("Add to shopping cart");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Alimentos : Dulces", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 8:
                    compra.cancelarCompra();
                    salir = true;
                    System.out.println("Cancele your shopping ....");
                    break;

                case 9:
                    if (compra.esVaciaLaCompra()) {
                        System.out.println("You still do not buy ...");
                        salir = false;
                    } else {
                        pagarCompra();
                        salir = true;
                    }
                    break;

                default:

                    System.out.println("Type a valid option...");
                    break;

            }
        }
    }


    public void pagarCompra() {
        Scanner entrada = new Scanner(System.in);
        String numeroDeCuenta = "";
        System.out.println("--------------------------------------------------");
        System.out.println("---------------   Safe Shopping   ----------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Digite your numbre count       ------------------ ");
        System.out.println("--------------------------------------------------");
        numeroDeCuenta = entrada.nextLine();
        double totalAPagar = sucursalUSA.cobrar(compra.getCarritoDeCompra());
        cliente.numeroDeCuenta(numeroDeCuenta);
        cliente.pagarCompra(totalAPagar);
        if (cliente.getTransaccionExitosa()) {
            compra.generarTicketDeCompra(totalAPagar); //ticket pendiente
        }
    }


    public String mensajeDeDescuento(double descuento) {
        return "You've got a " + descuento + "% discount on electronics!";
    }

    public void fechaEstimada() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("The estimated delivery date of your order is: " + tomorrow);
    }

}
