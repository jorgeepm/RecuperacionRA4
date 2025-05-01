import java.util.Arrays;

/**
 * Representa un pedido compuesto por una lista de productos y un estado actual.
 * <p>
 * Esta clase permite construir pedidos, verificar su validez y procesarlos según
 * unas reglas predefinidas. Cada pedido contiene una cesta de productos y un estado
 * que describe en qué fase del ciclo se encuentra (por ejemplo: "iniciando", "procesado").
 * </p>
 *
 * <p>
 * Reglas de negocio implementadas:
 * <ul>
 *     <li>Un pedido vacío o nulo no es válido.</li>
 *     <li>No se permiten pedidos con más de 27 productos.</li>
 *     <li>El estado se actualiza automáticamente al procesar un pedido válido.</li>
 * </ul>
 * </p>
 *
 * @author [Jorge de Pablos]
 * @version 1.0
 */
public class Pedido {

    private Producto[] cesta;
    private String status;

    /**
     * Crea un pedido con el estado por defecto "iniciando".
     */
    public Pedido() {
        this("iniciando");
    }

    /**
     * Crea un pedido con el estado especificado.
     *
     * @param status el estado inicial del pedido (por ejemplo, "en preparación")
     */
    public Pedido(String status) {
        this.status = status;
    }

    /**
     * Procesa el pedido actual si cumple con los requisitos establecidos.
     * <p>
     * El procesamiento verifica si la cesta no está vacía, no es nula y no excede
     * el número máximo de productos. Si es válido, cambia el estado a
     * "listo para envío".
     * </p>
     *
     * @return {@code true} si el pedido fue procesado correctamente;
     *         {@code false} si el pedido no es válido.
     */
    public boolean procesarPedido() {
        if (!esPedidoValido()) {
            return false;
        }

        status = "listo para envío";
        return true;
    }

    /**
     * Verifica si el pedido cumple con los criterios mínimos para poder ser enviado.
     * <p>
     * Comprueba que la cesta no sea nula, que contenga al menos un producto y que no
     * supere el límite máximo establecido (27 productos).
     * </p>
     *
     * @return {@code true} si el pedido es válido; {@code false} en caso contrario.
     */
    public boolean chequearPedido() {
        boolean esValido = esPedidoValido();

        if (esValido) {
            System.out.println("El pedido es válido para enviarse");
        }

        return esValido;
    }

    /**
     * Método auxiliar privado para verificar la validez del pedido.
     *
     * @return {@code true} si la cesta es válida según las reglas de negocio
     */
    private boolean esPedidoValido() {
        if (cesta == null) {
            return false;
        }
        if (cesta.length == 0) {
            return false;
        }
        if (cesta.length > 27) {
            System.out.println("Demasiados productos");
            return false;
        }
        return true;
    }

    /**
     * Asigna una lista de productos a la cesta del pedido.
     *
     * @param productos array de objetos {@link Producto}
     */
    public void setCesta(Producto[] productos) {
        this.cesta = productos;
    }

    /**
     * Obtiene la lista actual de productos del pedido.
     *
     * @return un array de productos, o {@code null} si no ha sido asignado
     */
    public Producto[] getCesta() {
        return cesta;
    }

    /**
     * Establece el estado actual del pedido.
     *
     * @param status cadena representando el estado (por ejemplo: "enviado")
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Obtiene el estado actual del pedido.
     *
     * @return una cadena con el estado actual
     */
    public String getStatus() {
        return status;
    }

    /**
     * Devuelve una representación del pedido como cadena de texto,
     * incluyendo el estado y el número de productos en la cesta.
     *
     * @return representación textual del pedido
     */
    @Override
    public String toString() {
        return String.format("Pedido[estado='%s', productos=%s]",
                status,
                cesta == null ? "sin asignar" : cesta.length + " items");
    }
}
