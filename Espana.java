import java.time.LocalDate;
import java.util.List;

public class Espana implements TiendaVirutalPais {
    private double descuento = 0;
    private Cliente cliente;
    private String idioma = "espanol";
    private boolean aplicarDescuento;

    
    public Espana(boolean aplicarDescuento){
        this.aplicarDescuento = aplicarDescuento;
    }
    public void saludo() {
        System.out.println("Bienvenido(a) a Cheems Mart España!");
    }

    public double cobrar(List<ProductoCheemsMart> carritoDeCompra) {
        double cuenta = 0;
        for (ProductoCheemsMart p : carritoDeCompra) {
            if(aplicarDescuento){
                if (p.getDepartamento().equals("Electrodomesticos")) {
                    cuenta = cuenta + ((p.getPrecio() * descuento) / 100);
                }
            }else{
                cuenta = cuenta + p.getPrecio();
            }
        }
        return cuenta;
    }

    public double descuentoRandom() {
        this.descuento = (((int) (Math.random() * (5 - 1))) + 1) * 10;
        return descuento;
    }


    public String mensajeDescuento(double descuento) {
        return "Tienes un " + descuento + "% de descuento en electrodométicos!";
    }

    public void mensajeDeAgregarAlCarrito() {

        System.out.println("Dijite el numero del producto que quereis Agregar al Carrito");

    }
    
    public void fechaEstimada() {
        LocalDate hoy = LocalDate.now();
        LocalDate manana = hoy.plusDays(1);
        System.out.println("La fecha de entrega estimada de tu compra es: " + manana);
    }

    public void despedida() {
        System.out.println("Cheems Mart España agradece su compra!" +
                "\nVuelva pronto!");
    }

    public void mostrarMenuPrincipal() {
        System.out.println("---------------------------------------------");
        System.out.println("-------------- Elegid una opción -------------");
        System.out.println("-1 --- Ver Catálogo -------------------------");
        System.out.println("-2 --- Realizar Compra ----------------------");
        //System.out.println("-3 --- Realizar Pago ------------------------");
        System.out.println("-3 --- Salir --------------------------------");
        System.out.println("---------------------------------------------");
    }

    public String menuCatalogo(){
        String menuCatalogo = "---------------------------------------------\n"+
         "---------- Catálogo CheemsMart --------------\n" +
         "---------------------------------------------\n" + 
         "----------------Departamentos----------------\n" + 
         "1 --- Belleza ------------------------------\n" + 
         "-2 --- Electrónica --------------------------\n" + 
         "-3 --- Electrodomésticos --------------------\n" +
         "-4 --- Bebidas ------------------------------\n"+
         "-5 --- Alimentos Frescos --------------------\n" + 
         "-6 --- Empaquetados -------------------------\n" +
         "-7 --- Dulces -------------------------------\n" +
         "-8 Salir      -------------------------------\n"+ 
         "---------------------------------------------";
         return menuCatalogo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
