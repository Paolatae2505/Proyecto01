public class ClienteTienda implements Cliente{
    
    private String nombreUsuario;
    private String nombre;
    private String contraseña;
    private String telefono;
    private String direccion;
    private CuentaBancaria cuentaBancaria;
    private String pais;
    private Correo correo;
    private String ID;
    private static int numeroID = 0;

    public ClienteTienda(String nombreUsuario, String nombre, String contraseña,
                         String telefono, CuentaBancaria cuentaBancaria, String pais,
                         String direccion) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
        this.pais = pais;
        ID = this.nombre.charAt(0) + this.nombreUsuario.charAt(0) + "CM-" + numeroID;
        numeroID++;
        correo = new Correo();
        this.direccion = direccion;
    }

    public void pagarCompra(double dinero) {
        cuentaBancaria.transaccion(dinero);
        //cuentaBancaria.visualizarEstadoActual();

    }

    public void reportar() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Nombre  Usuario : " + nombreUsuario);
        System.out.println("Telefono : " + telefono);
        System.out.println("Pais: " + pais);
        System.out.println("ID : " + ID);
        System.out.println("Nombre : " + nombre);
        System.out.println("Estado Cuenta : \n");
        cuentaBancaria.visualizarEstadoActual();

    }

    public void revisarCorreo(){
          System.out.println(correo.getNotificacion());
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    public Correo getCorreo() {
        return correo;
    }

    public String getID() {
        return ID;
    }

    public String getUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getPais(){
        return pais;
    }
    
}
