import java.time.LocalDate;
import java.util.List;

public class USA implements TiendaVirutalPais {
    private double descuento = 0;
    private Cliente cliente;
    private String idioma = "ingles";

  

    public void saludo() {
        System.out.println("Welcome to Cheems Mart USA!");
    }

    public double cobrar(List<ProductoCheemsMart> carritoDeCompra) {
        double cuenta = 0;
        for (ProductoCheemsMart p : carritoDeCompra) {
            if (p.getDepartamento().equals("Electronicos")) {
                cuenta = cuenta + ((p.getPrecio() * descuento) / 100);
            } else {
                cuenta = cuenta + p.getPrecio();
            }
        }
        return cuenta;
    }

    public double descuentoRandom() {
        descuento = (((int) (Math.random() * (5 - 1))) + 1) * 10;
        return descuento;
    }


    public String mensajeDescuento(double descuento) {
        return "You've got a " + descuento + "% discount on electronics!";
    }

    public void mensajeDeAgregarAlCarrito() {
        System.out.println("Add to shopping cart");

    }

    public void fechaEstimada() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("The estimated delivery date of your order is: " + tomorrow);
    }

    public void despedida() {
        System.out.println("Thank you for your purchase! \n" +
                "Come back soon!");
    }

    public void mostrarMenuPrincipal() {
        System.out.println("---------------------------------------------");
        System.out.println("------------- Choose an option  --------------");
        System.out.println("-1 --- View catalog -------------------------");
        System.out.println("-2 --- Make a purchase ----------------------");
        //System.out.println("-3 --- Realizar Pago ------------------------");
        System.out.println("-3 --- Exit --------------------------------");
        System.out.println("---------------------------------------------");
    }

    public String menuCatalogo(){
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
        "-8 Exit       ------------------------------- \n" +
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
