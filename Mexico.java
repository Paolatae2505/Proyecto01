import java.util.*;

public class Mexico implements TiendaVirutalPais{


    private Mexico(){
    }
    
    public void saludo(){}

    public double cobrar(List<Producto> carritoDeCompra ,
    String IDCliente ){ 
        return 0;
    }

    public double descuentoRandom(){return 0;}

    public double aplicarDescuento(Producto producto){return 0;}

    public String mensajeDescuento(){
          return "";
    }
    
    public void fechaEstimada(){}

    public void despedida(){}

    public static TiendaVirutalPais getTiendaVirtual(){
            return null;
    }


    
    
}
