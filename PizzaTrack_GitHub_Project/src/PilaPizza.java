
public class PilaPizza {

    private Nodo cima;

    public PilaPizza() {
        cima = null;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);

        nuevo.siguiente = cima;

        cima = nuevo;
    }

    public Pizza pop() {

        if (isEmpty()) {
            return null;
        }

        Pizza pizza = cima.dato;

        cima = cima.siguiente;

        return pizza;
    }

    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return cima.dato;
    }
}
