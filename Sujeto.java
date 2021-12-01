public interface Sujeto {

    public void agregarCliente(ClienteTienda clienteTienda,String pais);

    public void eliminarCliente(ClienteTienda clienteTienda,String pais);

    public void notificarCliente(String notificacion,String pais);
    
}