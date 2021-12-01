import java.util.ArrayList;
import java.util.List;


public class SucursalUSA implements Sucursal {

    private List<ClienteTiendaProxy> clientesUSA = new ArrayList<>();
    private double descuento = 0;
    private Cliente cliente;
    private InterfazPais interfaz;
    private boolean aplicarDescuento;

    public SucursalUSA(List<ClienteTiendaProxy> clientesUSA) {
        this.clientesUSA = clientesUSA;
    }

    public void setInterfaz(InterfazPais interfazPais) {
        interfaz = interfazPais;
    }

    public double cobrar(List<Producto> carritoDeCompra) {
        double cuenta = 0;
        for (Producto p : carritoDeCompra) {
            if (aplicarDescuento) {
                if (p.getDepartamento().equals("Electronica")) {
                    cuenta = cuenta + ((p.getPrecio() * descuento) / 100);
                }
            } else {

                cuenta = cuenta + p.getPrecio();
            }
        }
        return cuenta;
    }

    @Override
    public ClienteTiendaProxy verificarClienteExistente(String usuario, String contrasena) {
        for (ClienteTiendaProxy proxy : clientesUSA) {
            if (proxy.verificarContrasena(contrasena) && proxy.verificacionUsuario(usuario)) {
                return proxy;
            }
        }
        return null;
    }

    public boolean tieneDescuento() {
        int[] binarios = {0, 1, 0, 1};
        int numeroRandom = (int) (Math.random() * 3);
        return binarios[numeroRandom] != 0;
    }

    public double descuentoRandom() {
        this.descuento = (((int) (Math.random() * (5 - 1))) + 1) * 10;
        return descuento;
    }

}
