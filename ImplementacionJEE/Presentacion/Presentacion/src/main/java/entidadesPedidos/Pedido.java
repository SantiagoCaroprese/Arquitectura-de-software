package modelos;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Pedido {
    private String idPedido;
    private String idFranquicia;
    private String estado;
    private Timestamp fechaHoraInicio;
    private Double totalPrecio;
    private byte domicilio;
    private String direccionEntrega;
    private String nombreCliente;
    private String correoCliente;
    private String productoSerializado;
    private String idRepartidor;

    public Pedido(String idPedido, String idFranquicia, String estado, Timestamp fechaHoraInicio, byte domicilio, String nombreCliente, String correoCliente) {
        this.idPedido = idPedido;
        this.idFranquicia = idFranquicia;
        this.estado = estado;
        this.fechaHoraInicio = fechaHoraInicio;
        this.domicilio = domicilio;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
    }

    @Id
    @Column(name = "idPedido")
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    @Basic
    @Column(name = "idFranquicia")
    public String getIdFranquicia() {
        return idFranquicia;
    }

    public void setIdFranquicia(String idFranquicia) {
        this.idFranquicia = idFranquicia;
    }

    @Basic
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "fechaHoraInicio")
    public Timestamp getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Timestamp fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    @Basic
    @Column(name = "totalPrecio")
    public Double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(Double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    @Basic
    @Column(name = "domicilio")
    public byte getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(byte domicilio) {
        this.domicilio = domicilio;
    }

    @Basic
    @Column(name = "direccionEntrega")
    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    @Basic
    @Column(name = "nombreCliente")
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Basic
    @Column(name = "correoCliente")
    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    @Basic
    @Column(name = "productoSerializado")
    public String getProductoSerializado() {
        return productoSerializado;
    }

    public void setProductoSerializado(String productoSerializado) {
        this.productoSerializado = productoSerializado;
    }

    @Basic
    @Column(name = "idRepartidor")
    public String getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(String idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pedido pedido = (Pedido) o;

        if (domicilio != pedido.domicilio) return false;
        if (idPedido != null ? !idPedido.equals(pedido.idPedido) : pedido.idPedido != null) return false;
        if (idFranquicia != null ? !idFranquicia.equals(pedido.idFranquicia) : pedido.idFranquicia != null)
            return false;
        if (estado != null ? !estado.equals(pedido.estado) : pedido.estado != null) return false;
        if (fechaHoraInicio != null ? !fechaHoraInicio.equals(pedido.fechaHoraInicio) : pedido.fechaHoraInicio != null)
            return false;
        if (totalPrecio != null ? !totalPrecio.equals(pedido.totalPrecio) : pedido.totalPrecio != null) return false;
        if (direccionEntrega != null ? !direccionEntrega.equals(pedido.direccionEntrega) : pedido.direccionEntrega != null)
            return false;
        if (nombreCliente != null ? !nombreCliente.equals(pedido.nombreCliente) : pedido.nombreCliente != null)
            return false;
        if (correoCliente != null ? !correoCliente.equals(pedido.correoCliente) : pedido.correoCliente != null)
            return false;
        if (productoSerializado != null ? !productoSerializado.equals(pedido.productoSerializado) : pedido.productoSerializado != null)
            return false;
        if (idRepartidor != null ? !idRepartidor.equals(pedido.idRepartidor) : pedido.idRepartidor != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPedido != null ? idPedido.hashCode() : 0;
        result = 31 * result + (idFranquicia != null ? idFranquicia.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fechaHoraInicio != null ? fechaHoraInicio.hashCode() : 0);
        result = 31 * result + (totalPrecio != null ? totalPrecio.hashCode() : 0);
        result = 31 * result + (int) domicilio;
        result = 31 * result + (direccionEntrega != null ? direccionEntrega.hashCode() : 0);
        result = 31 * result + (nombreCliente != null ? nombreCliente.hashCode() : 0);
        result = 31 * result + (correoCliente != null ? correoCliente.hashCode() : 0);
        result = 31 * result + (productoSerializado != null ? productoSerializado.hashCode() : 0);
        result = 31 * result + (idRepartidor != null ? idRepartidor.hashCode() : 0);
        return result;
    }
}
