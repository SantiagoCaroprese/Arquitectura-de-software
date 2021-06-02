package com.pedidos.Conectores.ServiciosExternosPedidosLocal;

import javax.ejb.Local;

@Local
public interface IServicioExternoPagosLocal {
    public boolean realizarPago(String cardNumber, String expDate, String secCode, String owner, String payments, String tipo);
}
