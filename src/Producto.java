/**
 * Clase que representa un producto dentro de un pedido.
 */
public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Constructor completo para crear un producto.
     *
     * @param nombre    Nombre del producto.
     * @param precio    Precio del producto. No debe ser negativo.
     * @param categoria Categoría a la que pertenece el producto.
     */
    public Producto(String nombre, double precio, String categoria) {
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
    }

    /**
     * Constructor vacío necesario para algunos frameworks o serialización.
     */
    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("La categoría no puede ser nula o vacía");
        }
        this.categoria = categoria;
    }

    /**
     * Representación en texto del producto.
     *
     * @return una cadena con los datos del producto.
     */
    @Override
    public String toString() {
        return String.format("Producto[nombre=%s, precio=%.2f, categoría=%s]", nombre, precio, categoria);
    }
}
