
public class GestionPedidos {

    PilaPizza pilaPrincipal = new PilaPizza();
    PilaPizza pilaSecundaria = new PilaPizza();

    public void registrarPizza(Pizza pizza) {

        pilaPrincipal.push(pizza);

        pilaSecundaria = new PilaPizza();

        System.out.println("Pedido registrado.");
    }

    public void deshacer() {

        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaPrincipal.pop();
        pilaSecundaria.push(pizza);

        System.out.println("Se deshizo el último pedido.");
    }

    public void rehacer() {

        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaSecundaria.pop();
        pilaPrincipal.push(pizza);

        System.out.println("Pedido restaurado.");
    }

    public void mostrarActual() {

        Pizza pizza = pilaPrincipal.peek();

        if (pizza == null) {
            System.out.println("No hay pedidos.");
        } else {
            System.out.println("\nPedido actual:");
            pizza.mostrarPizza();
        }
    }
}
