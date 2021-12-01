import java.util.ArrayList;
import java.util.List;

public class CheemsMartCentral implements Sujeto {

    private List<ClienteTiendaProxy> clientesUSA = new ArrayList<>();
    private List<ClienteTiendaProxy> clientesMexico = new ArrayList<>();
    private List<ClienteTiendaProxy> clientesEspana = new ArrayList<>();
    private List<ClienteTienda> clientes = new ArrayList<>();

    public CheemsMartCentral() {
        defaultclientesUSA();
        defaultclientesMexico();
        defaultclientesEspana();
    }

    private void defaultclientesUSA() {
        CuentaBancaria cuentaUno = new CuentaBancaria("318074755", 5000);
        CuentaBancaria cuentaDos = new CuentaBancaria("31876549", 10000);
        ClienteTienda clienteUno = new ClienteTienda("Daysi", "Cordelia Castairs", "Cortana346",
                "3456789", cuentaUno, "USA", "------");
        ClienteTienda clienteDos = new ClienteTienda("ShadowHunter", "James Herondale",
                "Belial234", "2346579", cuentaDos, "USA", "------");
        ClienteTiendaProxy proxyUno = new ClienteTiendaProxy(clienteUno);
        ClienteTiendaProxy proxyDos = new ClienteTiendaProxy(clienteDos);
        clientes.add(clienteUno);
        clientes.add(clienteDos);
        clientesUSA.add(proxyUno);
        clientesUSA.add(proxyDos);
    }

    private void defaultclientesMexico() {
        CuentaBancaria cuentaUno = new CuentaBancaria("4999123495", 12000);
        CuentaBancaria cuentaDos = new CuentaBancaria("4999123846", 3000);
        ClienteTienda clienteUno = new ClienteTienda("Juan32", "Juan Manuel Sanchez", "JmanS3232.",
                "5255670293", cuentaUno, "Mexico", "------");
        ClienteTienda clienteDos = new ClienteTienda("Alejandra", "Alejandra Garcia Perez",
                "AleGP2909", "5255492749", cuentaDos, "Mexico", "------");
        ClienteTiendaProxy proxyUno = new ClienteTiendaProxy(clienteUno);
        ClienteTiendaProxy proxyDos = new ClienteTiendaProxy(clienteDos);
        clientes.add(clienteUno);
        clientes.add(clienteDos);
        clientesUSA.add(proxyUno);
        clientesUSA.add(proxyDos);
    }

    private void defaultclientesEspana() {
        CuentaBancaria cuentaUno = new CuentaBancaria("50205825792", 8000);
        CuentaBancaria cuentaDos = new CuentaBancaria("50209485216", 9500);
        ClienteTienda clienteUno = new ClienteTienda("Sergio", "Juan Guzman", "SGzman360.",
                "406596932", cuentaUno, "Espana", "------");
        ClienteTienda clienteDos = new ClienteTienda("Mariana", "Mariana Pedraza",
                "PedMar.2302", "4065954892", cuentaDos, "Espana", "------");
        ClienteTiendaProxy proxyUno = new ClienteTiendaProxy(clienteUno);
        ClienteTiendaProxy proxyDos = new ClienteTiendaProxy(clienteDos);
        clientes.add(clienteUno);
        clientes.add(clienteDos);
        clientesUSA.add(proxyUno);
        clientesUSA.add(proxyDos);
    }

    public void agregarCliente(ClienteTienda cliente, String pais) {
        clientes.add(cliente);
        ClienteTiendaProxy proxy = new ClienteTiendaProxy(cliente);
        switch (pais) {

            case "USA":
                clientesUSA.add(proxy);

                break;

            case "Mexico":
                clientesMexico.add(proxy);
                break;

            case "Espana":

                clientesEspana.add(proxy);
                break;
        }
    }

    public void eliminarCliente(ClienteTienda cliente, String pais) {
        clientes.remove(cliente);
        String id = cliente.getID();
        switch (pais) {

            case "USA":
                String IDCliente = cliente.getID();
                for (ClienteTiendaProxy proxy : clientesUSA) {
                    String ID = proxy.getID();
                    if (IDCliente.equals(ID))
                        clientesUSA.remove(proxy);
                }
                break;

            case "Mexico":
                String IDCliente1 = cliente.getID();
                for (ClienteTiendaProxy proxy : clientesMexico) {
                    String ID = proxy.getID();
                    if (IDCliente1.equals(ID))
                        clientesUSA.remove(proxy);
                }
                break;

            case "Espana":

                String IDCliente2 = cliente.getID();
                for (ClienteTiendaProxy proxy : clientesEspana) {
                    String ID = proxy.getID();
                    if (IDCliente2.equals(ID))
                        clientesUSA.remove(proxy);
                }
                break;
        }

    }

    public void notificarCliente(String notificacion, String pais) {
        Correo correo = null;
        switch (pais) {

            case "USA":
                for (ClienteTiendaProxy proxy : clientesUSA) {
                    correo = proxy.getCorreo();
                    correo.recibirNotificacion(notificacion);
                }

                break;

            case "Mexico":

                for (ClienteTiendaProxy proxy : clientesMexico) {
                    correo = proxy.getCorreo();
                    correo.recibirNotificacion(notificacion);
                }

                break;

            case "Espana":

                for (ClienteTiendaProxy proxy : clientesEspana) {
                    correo = proxy.getCorreo();
                    correo.recibirNotificacion(notificacion);
                }

                break;
        }

    }

    public List<ClienteTiendaProxy> getClientesUSA() {
        return clientesUSA;
    }

    public List<ClienteTiendaProxy> getClientesMexico() {
        return clientesMexico;
    }

    public List<ClienteTiendaProxy> getClientesEspana() {
        return clientesEspana;
    }


}
