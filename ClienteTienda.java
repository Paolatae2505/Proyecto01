public class ClienteTienda {

    private String nombreUsuario;
    private String nombre;
    private String contraseña;
    private String telefono;
    private String direccion;
    private CuentaBancaria cuentaBancaria;
    private String pais;
    private String notificacion;
    private Correo correo;
    private String ID;

    public ClienteTienda(String nombreUsuario, String nombre, String contraseña,
    String telefono , CuentaBancaria cuentaBancaria , String pais){
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
        this.pais = pais;
        /// GenerarunID AQUI
    }

    public void pagarCompra(double dinero){
        cuentaBancaria.transaccion(dinero);
        cuentaBancaria.visualizarEstadoActual();

    }

    public void reportar(){

    }

    public CuentaBancaria getCuentaBancaria(){
        return cuentaBancaria;
    }

    public Correo getCorreo(){
        return correo;
    }

    public String getID(){
        return ID;
    }

    
}
