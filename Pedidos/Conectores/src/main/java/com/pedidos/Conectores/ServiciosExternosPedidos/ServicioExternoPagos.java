package com.pedidos.Conectores.ServiciosExternosPedidos;

import com.pedidos.Conectores.Pago.IServicioPago;
import com.pedidos.Conectores.ServiciosExternosPedidosLocal.IServicioExternoPagosLocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ServicioExternoPagos implements IServicioExternoPagosLocal {

    private @EJB
    IServicioPago servicioPago;

    @Override
    public boolean realizarPago(String cardNumber, String expDate, String secCode, String owner, String payments, String tipo) {
        return servicioPago.realizarPago(cardNumber,expDate,secCode,owner,payments,tipo);
    }
}
