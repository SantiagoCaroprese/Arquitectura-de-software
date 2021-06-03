package com.pedidos.PedidosAPI;

import com.pedidos.PedidosAPI.endpoints.ControladorCrearPedido;



import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("/")
public class HelloApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    public HelloApplication() {
        // Register our hello service
        singletons.add(new ControladorCrearPedido());
        //singletons.add(new VerEstadoPedidoGETController());
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
