import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class CheemsMart implements Sujeto {

    private TiendaVirutalPais interfazUsuario;
    private List<ClienteTiendaProxy> clientesTiendaProxy = new ArrayList<>();
    private HashMap<ClienteTienda, List<ProductoCheemsMart>> clientesTienda = new HashMap<>();
    
    public void agregarCliente(ClienteTienda cliente) {
        clientesTienda.put(cliente, null);
        ClienteTiendaProxy clienteTiendaProxy = new ClienteTiendaProxy(cliente);
        clientesTiendaProxy.add(clienteTiendaProxy);

    }

    public void eliminarCliente(ClienteTienda cliente) {
        clientesTienda.remove(cliente);
        String IDCliente = cliente.getID();
        for (ClienteTiendaProxy proxy : clientesTiendaProxy) {
            String ID = proxy.getID();
            if (IDCliente.equals(ID) == true)
                clientesTiendaProxy.remove(proxy);
        }
    }
    public void setInterfaz(TiendaVirutalPais interfazUsuario){
        this.interfazUsuario = interfazUsuario;

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
    private boolean containsClienteID(String ID){
        boolean containsClienteID = false;
        for (Map.Entry<ClienteTienda, List<ProductoCheemsMart>> entry 
        : clientesTienda.entrySet()) {
            ClienteTienda clienteTienda =   entry.getKey();
            if(clienteTienda.getID().equals(ID)){
                 containsClienteID = true;
            }
        }
        return containsClienteID;
    }
    public void productosDelCliente(List<ProductoCheemsMart> carritoDeCompra,String ID) {
      
        if(containsClienteID(ID)){
           ClienteTienda clienteTienda =getClienteTienda(ID);
           clientesTienda.put(clienteTienda,carritoDeCompra);
        }else{
            System.out.println("No existe el cliente ...");
        }  
    }

    public HashMap<ClienteTienda, List<ProductoCheemsMart>> getClientesTienda() {
        return clientesTienda;
    }

    public ClienteTienda getClienteTienda(String ID){
        ClienteTienda clienteTienda = null;
        for (Map.Entry<ClienteTienda, List<ProductoCheemsMart>> entry 
        : clientesTienda.entrySet()) {
            ClienteTienda cliente =   entry.getKey();
            if(cliente.getID().equals(ID)){
                 clienteTienda = cliente;
            }
        }
        return clienteTienda;

    }

    public ClienteTiendaProxy getClienteProxy(String IDCliente){
        ClienteTiendaProxy proxy = null;
        for(ClienteTiendaProxy clienteTiendaProxy : clientesTiendaProxy){
              if(clienteTiendaProxy.getID().equals(IDCliente))
                  proxy =  clienteTiendaProxy;
              
        }
        return proxy;
    }
}
