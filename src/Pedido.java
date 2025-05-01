public class Pedido {

    private Producto[] cesta;
    private String status;

    public Pedido() {
        this("iniciando");
    }

    public Pedido(String status) {
        this.status = status;
    }

    public boolean procesarPedido(){
        if (cesta == null){
            return false;
        }
        if(cesta.length == 0){
            return false;
        }
        if(cesta.length >27){
            System.out.println("Demasiados productos");
            return false;
        }

        status = "listo para envío";
        return true;
    }


    public boolean chequearPedido(){
        if (cesta == null){
            return false;
        }
        if(cesta.length == 0){
            return false;
        }
        if(cesta.length >27){
            System.out.println("Demasiados productos");
            return false;
        }

        System.out.println("El pedido es válido para enviarse");
        return true;
    }

}

