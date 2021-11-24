import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class FarcadeSimulacionCheemsMart {

    private Catalogo catalogo;
    private CheemsMart cheemsMart;
    private Cliente cliente;
    private Compra compra;

    public FarcadeSimulacionCheemsMart(Catalogo catalogo, CheemsMart cheemsMart){
           this.catalogo = catalogo;
           this.cheemsMart = cheemsMart;
    }

    public void inscibirUsuariosDefault(){
          CuentaBancaria cuentaBancaria1 = new CuentaBancaria("1995000150302505", 30000);
          ClienteTienda cliente1 = new ClienteTienda("TaeYeontan3095","Taehyung","Yeontan2505", "5534816406",
        cuentaBancaria1, "USA");
    }
    
    public void iniciarSesion(){
        Scanner entrada = new Scanner(System.in);
        HashMap<ClienteTienda, List<Producto>> clientesTienda  = cheemsMart.getClientesTienda();
        boolean usuarioCorrecto = false;
        boolean contraseñaCorrecta = false;
        while(usuarioCorrecto == false || contraseñaCorrecta == false){
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("----------BIENVENIDO A LA TIENDA CHEEMSMART------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("----Usuario :                --------------------------");
        System.out.println("-------------------------------------------------------");
        String usuario = entrada.nextLine();
        System.out.println("-----Contraseña :            --------------------------");
        String contraseña = entrada.nextLine();
        System.out.println("-------------------------------------------------------");
        String usuarioReal = "";
        String contraseñaReal  = "";
        for (Map.Entry<ClienteTienda, List<Producto> > entry : clientesTienda.entrySet()) {
            ClienteTienda cliente =  entry.getKey();
              usuarioReal =   cliente.getUsuario();
             contraseñaReal = cliente.getContraseña();
        }
        if(usuarioReal.equals(usuario)){
            usuarioCorrecto = true;
        }else{
            System.out.println("Tu usuario es incorrecto ....");
        }
        if(contraseñaReal.equals(contraseña)){
            contraseñaCorrecta = true;
        }else{
            System.out.println("Tu contraseña es incorrecta ....");
        }
     }
    }

    public void verCatalogo(){

    }

    public void agregraAlcarrito(){

    }

    public void pagarCarritoDeCompra(){

    }
}
