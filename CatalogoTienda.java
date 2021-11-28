public class CatalogoTienda implements Catalogo {

    private AlmacenCheemsMart almacenCheemsMart;
    private String codigo;


    public CatalogoTienda(AlmacenCheemsMart almacenCheemsMart) {
        this.almacenCheemsMart = almacenCheemsMart;
        almacenCheemsMart.inventario();
        codigo = "2505-3095";
    }

    public void mostrarDepartamento(String codigoDepto) {
        //// revision del if ?
        Producto departamento = almacenCheemsMart.getDepartamento(codigoDepto);
        departamento.mostrarInformacion();
    }

    public void menuDelCatalogo(String idioma) {
        switch (idioma) {
            case "espanol":

                System.out.println("---------------------------------------------");
                System.out.println("---------- Catálogo CheemsMart --------------");
                System.out.println("---------------------------------------------");
                System.out.println("----------------Departamentos----------------");
                System.out.println("-1 --- Belleza ------------------------------");
                System.out.println("-2 --- Electrónica --------------------------");
                System.out.println("-3 --- Electrodomésticos --------------------");
                System.out.println("-4 --- Bebidas ------------------------------");
                System.out.println("-5 --- Alimentos Frescos --------------------");
                System.out.println("-6 --- Empaquetados -------------------------");
                System.out.println("-7 --- Dulces -------------------------------");
                System.out.println("-8 Salir      -------------------------------");
                System.out.println("---------------------------------------------");

                break;

            case "ingles":

                System.out.println("---------------------------------------------");
                System.out.println("---------- CheemsMart Catalog ---------------");
                System.out.println("---------------------------------------------");
                System.out.println("----------------Departments------------------");
                System.out.println("-1 --- Beauty -------------------------------");
                System.out.println("-2 --- Electronics --------------------------");
                System.out.println("-3 --- Home Appliances ----------------------");
                System.out.println("-4 --- Drinks -------------------------------");
                System.out.println("-5 --- Fresh Produce ------------------------");
                System.out.println("-6 --- Canned Foods -------------------------");
                System.out.println("-7 --- Sweets -------------------------------");
                System.out.println("-8 Exit       -------------------------------");
                System.out.println("---------------------------------------------");

                break;
        }
    }

    public AlmacenCheemsMart getAlmacenCheemsMart() {
        return almacenCheemsMart;
    }

    public String getCodigo() {
        return codigo;
    }

}
