package com.pedidos.PedidosAPI;

import com.pedidos.PedidosAPI.Controladores.ControladorCrearPedido;
import com.pedidos.PedidosAPI.Controladores.VerEstadoPedidoGETController;


import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    public HelloApplication() {
        // Register our hello service
        singletons.add(new HelloResource());
        singletons.add(new VerEstadoPedidoGETController());
        singletons.add(new ControladorCrearPedido());
    }    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
