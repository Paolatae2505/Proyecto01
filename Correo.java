public class Correo implements Observador {

    public String notificacion;


    public void recibirNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }

    public String getNotificacion() {
        return notificacion;
    }
}
