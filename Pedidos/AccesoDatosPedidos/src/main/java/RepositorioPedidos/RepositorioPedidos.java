package RepositorioPedidos;

import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

@Stateless
@LocalBean
public class RepositorioPedidos implements IRepositorioPedidos {


    @Override
    public Pedido addPedido(Pedido pedido) {
        EntityManager em = Persistence.createEntityManagerFactory("EntidadesPedidos").createEntityManager();
        em.getTransaction().begin();
        em.persist(pedido);
        em.getTransaction().commit();
        em.close();
        return pedido;
    }

    @Override
    public Pedido delete(Pedido pedido){
        EntityManager em = Persistence.createEntityManagerFactory("EntidadesPedidos").createEntityManager();
        em.getTransaction().begin();
        if (!em.contains(pedido)) {
            pedido = em.merge(pedido);
        }
        em.remove(pedido);
        em.getTransaction().commit();
        em.close();
        return pedido;
    }

    @Override
    public Pedido update(Pedido pedido) {

        EntityManager em = Persistence.createEntityManagerFactory("EntidadesPedidos").createEntityManager();
        em.getTransaction().begin();
        Pedido res = em.merge(pedido);
        em.getTransaction().commit();
        em.close();
        return res;

    }

    @Override
    public Pedido find(String idPedido) {
        EntityManager em = Persistence.createEntityManagerFactory("EntidadesPedidos").createEntityManager();
        return em.find(Pedido.class,idPedido);
    }

    @Override
    public List<Pedido> findPedidosFranquicia(String idFranquicia) {
        EntityManager em = Persistence.createEntityManagerFactory("EntidadesPedidos").createEntityManager();

        return em.createQuery(
                "SELECT c FROM Pedido c WHERE c.idFranquicia LIKE :id")
                .setParameter("id", idFranquicia)
                .getResultList();
    }

    /*

   <properties>
			<property name="eclipselink.jdbc.url" value="jdbc:mysql://localhost:3306"/>
			<property name="eclipselink.jdbc.driver" value="com.mysql.jdbc.Driver"/>
		</properties>

     */




}
