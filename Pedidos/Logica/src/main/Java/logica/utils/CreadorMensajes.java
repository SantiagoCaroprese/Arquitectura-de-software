package logica.utils;

public class CreadorMensajes {

    public static String crearHtmlConfirmacion(String nombre, Double costo){
        String mensaje = "<i>" + nombre + "! tu pedido ha sido confirmado</i><br>";
        mensaje += "<b>Tu pago de " +  costo + " ha sido procesado exitosamente!</b><br>";
        mensaje += "<b>Pronto tendras tu pedido!</b><br>";
        mensaje += "<b>Gracias por elegirnos!</b><br>";
        mensaje += "<font color=black>Duke</font>";

        return mensaje;
    }

}
