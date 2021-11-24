public class CuentaBancaria {

    private double dinero;
    private String numeroDeCuenta;

    public CuentaBancaria(String numeroDeCuenta, double dinero) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dinero = dinero;
    }

    public void transaccion(double dinero) {
        
    }

    public void visualizarEstadoActual() {
        System.out.println("El estado actual de tu cuenta es: $" + String.format("%.2f", +dinero));
    }

    public String getNumeroDeCuenta() {
        return this.numeroDeCuenta;
    }

}
