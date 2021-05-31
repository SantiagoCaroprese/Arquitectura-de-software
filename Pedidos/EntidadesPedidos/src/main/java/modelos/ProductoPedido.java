package modelos;

import java.util.List;

public class ProductoPedido {
    private String id;
    private String nombre;
    private int precioBase;
    private List<IngredientePedido> ingredientes;

    public ProductoPedido(String id, String nombre, int precioBase, int precioTotal, List<IngredientePedido> ingredientes) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;

        this.ingredientes = ingredientes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }


    public List<IngredientePedido> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<IngredientePedido> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double calcularPrecioProducto(){
        double total = precioBase ;

        for(IngredientePedido ingredientePedido : ingredientes){
            total += ingredientePedido.precioTotal();
        }
        return total;
    }
}
