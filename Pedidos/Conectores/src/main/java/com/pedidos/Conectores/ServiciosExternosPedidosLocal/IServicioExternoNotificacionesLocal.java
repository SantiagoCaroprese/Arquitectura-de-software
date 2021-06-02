package com.pedidos.Conectores.ServiciosExternosPedidosLocal;

import javax.ejb.Local;

@Local
public interface IServicioExternoNotificacionesLocal {
    public void enviarCorreo(String email, String asunto, String mensaje);
}
