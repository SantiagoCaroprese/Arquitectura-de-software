package com.pedidos.Conectores.Notificaciones;

import javax.ejb.Local;

@Local
public interface IServicioNotificaciones {
    public void enviarCorreo(String email, String asunto, String mensaje);
}
