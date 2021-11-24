import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheemsMart {

    private TiendaVirutalPais interfazUsuario;
    private List<ClienteTiendaProxy> clientesTiendaProxy = new ArrayList<>();
    private HashMap<ClienteTienda, List<Producto>> clientesTienda = new HashMap<>();


    public void seleccionarInterfazDeUsuario(String pais) {

        switch (pais) {
            case "Mexico":

                interfazUsuario = Mexico.getTiendaVirtual();

                break;

            case "USA":

                interfazUsuario = USA.getTiendaVirtual();
                break;

            case "España":

                interfazUsuario = Espana.getTiendaVirtual();

                break;
        }
    }

    public TiendaVirutalPais getInterfaz() {
        return interfazUsuario;
    }

    public void agregarCliente(ClienteTienda cliente) {
        clientesTienda.put(cliente, null);
        ClienteTiendaProxy clienteTiendaProxy = new ClienteTiendaProxy(cliente);
        clientesTiendaProxy.add(clienteTiendaProxy);

    }

    public void eliminarCliente(ClienteTienda cliente) {
        clientesTienda.remove(cliente);
        String IDCliente = cliente.getID();
        for (ClienteTiendaProxy proxy : clientesTiendaProxy) {
            String ID = proxy.getClienteReal().getID();
            if (IDCliente.equals(ID) == true)
                clientesTiendaProxy.remove(proxy);
        }
    }

    public void notificarCliente() {
        double descuento = interfazUsuario.descuentoRandom();
        String notificacion = interfazUsuario.mensajeDescuento(descuento);
        /*for (Map.Entry<ClienteTienda, List<Producto>> entry : clientesTienda.entrySet()) {
              Correo correo = entry.getKey().getCorreo();
              correo.recibirNotificacion(notificacion);
          }
        */
        clientesTienda.forEach((k, v) -> k.getCorreo().recibirNotificacion(notificacion));
    }

    public double cobrar(List<ProductoCheemsMart> carritoDeCompra) {
        interfazUsuario.cobrar(carritoDeCompra);
        return 0;
    }

    public HashMap<ClienteTienda, List<Producto>> getClientesTienda() {
        return clientesTienda;
    }
}
