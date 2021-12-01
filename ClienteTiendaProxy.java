public class ClienteTiendaProxy implements Cliente {

    private ClienteTienda clienteReal;
    private String numeroDeCuenta;
    private boolean transaccionExitosa;

    public ClienteTiendaProxy(ClienteTienda clienteReal) {
        this.clienteReal = clienteReal;
    }

    public void reportar() {
        clienteReal.reportar();
    }

    public void revisarCorreo() {
        clienteReal.revisarCorreo();
    }

    public boolean verificarCuenta(String numeroDeCuenta) {
        String numeroDeCuentaReal = clienteReal.getCuentaBancaria().getNumeroDeCuenta();
        return numeroDeCuenta.equals(numeroDeCuentaReal);
    }

    public void numeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public boolean verificarContrasena(String contrasena) {
        String contrasenaReal = clienteReal.getContraseña();
        return contrasenaReal.equals(contrasena);
    }

    public boolean verificacionUsuario(String usuario) {
        String usuarioReal = clienteReal.getUsuario();
        return usuarioReal.equals(usuarioReal);

    }

    public void pagarCompra(double dinero) {
        if (verificarCuenta(numeroDeCuenta)) {
            clienteReal.pagarCompra(dinero);
            transaccionExitosa = true;
        } else {
            System.out.println("Número de Cuenta Fallido...");
            System.out.println("Se cancelará tu compra ...");
            transaccionExitosa = false;
        }
    }

    public boolean getTransaccionExitosa() {
        return transaccionExitosa;
    }

    public String getID() {
        return clienteReal.getID();
    }

    public Correo getCorreo() {
        return clienteReal.getCorreo();
    }

    public String getPais() {
        return clienteReal.getPais();
    }
}
