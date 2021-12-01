import java.time.LocalDate;
import java.util.Scanner;

public class InterfazMexico implements InterfazPais {
    private Catalogo catalogo;
    private ClienteTiendaProxy cliente;
    private Compra compra;
    private Sucursal sucursalMexico;
    private AlmacenCheemsMart almacenCheemsMart;


    public InterfazMexico(Catalogo catalogo, ClienteTiendaProxy cliente,
                          Compra compra, Sucursal sucursalMexico, AlmacenCheemsMart almacenCheemsMart) {
        this.catalogo = catalogo;
        this.cliente = cliente;
        this.compra = compra;
        this.sucursalMexico = sucursalMexico;
        this.almacenCheemsMart = almacenCheemsMart;
    }

    public void mostrarMenuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("---------------------------------------------");
            System.out.println("------------- Elige una opción --------------");
            System.out.println("-1 --- Mostrar Catalogo----------------------");
            System.out.println("-2 --- Realizar Compra ----------------------");
            System.out.println("-3 --- Salir --------------------------------");
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
                    System.out.println("Gracias por su compra! \n" +
                            "Vuelva pronto!");
                    salir = true;
                    break;

                case 5:
                    System.out.println("Esa no es una opción!!!!");
                    System.out.println("Por favor, ingrese un número del 1 al 3!!!!");
            }

        }
    }

    public void verCatalogo() {
        Scanner entrada = new Scanner(System.in);
        int salir = 0;
        while (salir == 0) {
            String menuCatalogo = "----------------------------------------------\n" +
                    "---------- CheemsMart Catálogo ---------------\n" +
                    "----------------------------------------------\n" +
                    "----------------Departmentos------------------\n" +
                    "-1 --- Belleza -------------------------------\n" +
                    "-2 --- Electronicos --------------------------\n" +
                    "-3 --- Electrodomésticos ---------------------\n" +
                    "-4 --- Bebidas -------------------------------\n" +
                    "-5 --- Alimentos Frescos ---------------------\n" +
                    "-6 --- Enlatados -----------------------------\n" +
                    "-7 --- Dulces --------------------------------\n" +
                    "-8 --- Salir ---------------------------------\n" +
                    "----------------------------------------------\n";
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
                    System.out.println("Esa no es una opción!!!!");
                    System.out.println("Por favor, ingrese un número del 1 al 3!!!!");

            }
        }

    }

    public void realizarCompra() {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int numProducto;
        Producto producto = null;
        while (!salir) {
            String menuCatalogo = "----------------------------------------------\n" +
                    "---------- CheemsMart Catálogo ---------------\n" +
                    "----------------------------------------------\n" +
                    "----------------Departmentos------------------\n" +
                    "-1 --- Belleza -------------------------------\n" +
                    "-2 --- Electronicos --------------------------\n" +
                    "-3 --- Electrodomésticos ---------------------\n" +
                    "-4 --- Bebidas -------------------------------\n" +
                    "-5 --- Alimentos Frescos ---------------------\n" +
                    "-6 --- Enlatados -----------------------------\n" +
                    "-7 --- Dulces --------------------------------\n" +
                    "-9 --- Continuar al pago ---------------------\n" +
                    "-8 --- Salir      ----------------------------\n" +
                    "----------------------------------------------\n";
            System.out.println(menuCatalogo);
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    catalogo.mostrarSeccionDepto("Belleza");
                    System.out.println("Agregar al carrito");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Belleza", numProducto);
                    compra.agregarProducto(producto);
                    break;

                case 2:
                    catalogo.mostrarSeccionDepto("Electronica");
                    System.out.println("Agregar al carrito");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Electronica", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 3:
                    catalogo.mostrarSeccionDepto("Electrodomesticos");
                    System.out.println("Agregar al carrito");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Electrodomesticos", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 4:
                    catalogo.mostrarSeccionDepto("Bebidas");
                    System.out.println("Agregar al carrito");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Bebidas", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 5:
                    catalogo.mostrarSeccionDepto("Alimentos : Frescos");
                    System.out.println("Agregar al carrito");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Alimentos : Frescos", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 6:
                    catalogo.mostrarSeccionDepto("Alimentos :Empaquetados");
                    System.out.println("Agregar al carrito");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Alimentos :Empaquetados", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 7:
                    catalogo.mostrarSeccionDepto("Alimentos : Dulces");
                    System.out.println("Agregar al carrito");
                    numProducto = entrada.nextInt();
                    compra.agregarProducto(producto);
                    producto = almacenCheemsMart.getProducto("Alimentos : Dulces", numProducto);
                    compra.agregarProducto(producto);

                    break;

                case 8:
                    compra.cancelarCompra();
                    salir = true;
                    System.out.println("Cancelar compra ....");
                    break;

                case 9:
                    if (compra.esVaciaLaCompra()) {
                        System.out.println("No has añadido nada al carrito ...");
                        salir = false;
                    } else {
                        pagarCompra();
                        salir = true;
                    }
                    break;

                default:

                    System.out.println("Digite una opción válida...");
                    break;

            }
        }
    }


    public void pagarCompra() {
        Scanner entrada = new Scanner(System.in);
        String numeroDeCuenta;
        System.out.println("--------------------------------------------------");
        System.out.println("---------------   Compra Segura   ----------------");
        System.out.println("--------------------------------------------------");
        System.out.println("-- Digite su numero de cuenta      ---------------");
        System.out.println("--------------------------------------------------");
        numeroDeCuenta = entrada.nextLine();
        double totalAPagar = sucursalMexico.cobrar(compra.getCarritoDeCompra());
        cliente.numeroDeCuenta(numeroDeCuenta);
        cliente.pagarCompra(totalAPagar);
        if (cliente.getTransaccionExitosa()) {
            compra.generarTicketDeCompra(totalAPagar); //ticket pendiente
        }
    }


    public String mensajeDeDescuento(double descuento) {
        return "Tienes un descuento de " + descuento + "% en alimentos frescos!!";
    }

    public void fechaEstimada() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("La fecha estimada de entrega de su orden es: " + tomorrow);
    }

}
