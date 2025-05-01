/**
 * Representa un producto que puede incluirse en un pedido.
 * <p>
 * Esta clase encapsula la información básica de un producto, incluyendo
 * su nombre, precio y categoría. Se considera válida cuando todos los
 * atributos han sido correctamente asignados.
 * </p>
 *
 * <p>
 * Ejemplo de uso:
 * <pre>{@code
 * Producto p = new Producto("Camiseta", 19.99, "Ropa");
 * }</pre>
 * </p>
 *
 * @author [Jorge de Pablos]
 * @version 1.0
 */
public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Crea un producto con todos sus atributos definidos.
     *
     * @param nombre    el nombre del producto (no debe estar vacío)
     * @param precio    el precio del producto en euros (no puede ser negativo)
     * @param categoria la categoría a la que pertenece (no debe estar vacía)
     * @throws IllegalArgumentException si algún parámetro no cumple los requisitos
     */
    public Producto(String nombre, double precio, String categoria) {
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
    }

    /**
     * Constructor vacío útil para frameworks que requieren instanciación sin parámetros.
     */
    public Producto() {
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return el nombre asignado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre nombre deseado
     * @throws IllegalArgumentException si el nombre es nulo o vacío
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return el precio en euros
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio nuevo precio
     * @throws IllegalArgumentException si el precio es negativo
     */
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    /**
     * Obtiene la categoría del producto.
     *
     * @return la categoría actual
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Asigna una categoría al producto.
     *
     * @param categoria categoría deseada
     * @throws IllegalArgumentException si es nula o vacía
     */
    public void setCategoria(String categoria) {
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("La categoría no puede ser nula o vacía");
        }
        this.categoria = categoria;
    }

    /**
     * Devuelve una representación en forma de cadena del producto.
     *
     * @return representación del producto en formato nombre/precio/categoría
     */
    @Override
    public String toString() {
        return String.format("Producto[nombre='%s', precio=%.2f€, categoría='%s']", nombre, precio, categoria);
    }
}
