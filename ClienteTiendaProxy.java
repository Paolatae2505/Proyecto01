public class ClienteTiendaProxy implements Cliente {


    private ClienteTienda clienteReal;
    private String numeroDeCuenta;
    private boolean transaccionExitosa;
    
    public ClienteTiendaProxy(ClienteTienda clienteReal){
        this.clienteReal = clienteReal;
    }

    public void reportar(){
        clienteReal.reportar();
    }

    public boolean verificarCuenta(String numeroDeCuenta){
        String numeroDeCuentaReal = clienteReal.getCuentaBancaria().getNumeroDeCuenta();
        return numeroDeCuenta.equals(numeroDeCuentaReal);
    }

    public void numeroDeCuenta(String numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void pagarCompra(double dinero){
        if(verificarCuenta(numeroDeCuenta) == true){
            clienteReal.pagarCompra(dinero);
            transaccionExitosa = true;
        }else{
            System.out.println("Numero de Cuenta Fallido...");
            System.out.println("Se cancelara tu compra ...");
            transaccionExitosa = false;
        }
    }
    public boolean getTransaccionExitosa(){
        return transaccionExitosa;
    }

    public String getID(){
        return clienteReal.getID();
    } 
}
