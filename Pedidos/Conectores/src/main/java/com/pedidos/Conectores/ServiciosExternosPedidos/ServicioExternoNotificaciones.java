package com.pedidos.Conectores.ServiciosExternosPedidos;

import com.pedidos.Conectores.Notificaciones.IServicioNotificaciones;
import com.pedidos.Conectores.Pago.IServicioPago;
import com.pedidos.Conectores.ServiciosExternosPedidosLocal.IServicioExternoNotificacionesLocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ServicioExternoNotificaciones implements IServicioExternoNotificacionesLocal {
    private @EJB
    IServicioNotificaciones servicioNotificaciones;

    @Override
    public void enviarCorreo(String email, String asunto, String mensaje) {
        servicioNotificaciones.enviarCorreo(email,asunto,mensaje);
    }
}
