package com.pedidos.Conectores.Pago;

import javax.ejb.Local;

@Local
public interface IServicioPago {
    public boolean realizarPago(String cardNumber, String expDate, String secCode, String owner, String payments, String tipo);
}
