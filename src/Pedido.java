import java.util.Objects;

/**
 * Clase que representa un pedido realizado por un cliente.
 */
public class Pedido {

    private Producto[] cesta;
    private String status;

    public Pedido() {
        this("iniciando");
    }

    public Pedido(String status) {
        this.status = status;
    }

    /**
     * Valida si el pedido cumple con los requisitos básicos.
     *
     * @return true si es válido, false en caso contrario
     */
    private boolean esPedidoValido() {
        if (Objects.isNull(cesta)) return false;
        if (cesta.length == 0) return false;
        if (cesta.length > 27) {
            System.out.println("Demasiados productos");
            return false;
        }
        return true;
    }

    /**
     * Procesa el pedido si es válido.
     *
     * @return true si se pudo procesar, false en caso contrario
     */
    public boolean procesarPedido() {
        if (!esPedidoValido()) return false;
        status = "listo para envío";
        return true;
    }

    /**
     * Muestra si el pedido puede ser enviado.
     *
     * @return true si es válido, false en caso contrario
     */
    public boolean chequearPedido() {
        if (!esPedidoValido()) return false;
        System.out.println("El pedido es válido para enviarse");
        return true;
    }

    public Producto[] getCesta() {
        return cesta;
    }

    public void setCesta(Producto[] cesta) {
        this.cesta = cesta;
    }

    public String getStatus() {
        return status;
    }
}
