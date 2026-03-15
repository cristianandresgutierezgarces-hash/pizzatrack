
public class Pizza {

    String nombre;
    String[] ingredientes;

    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public void mostrarPizza() {
        System.out.println("Pizza: " + nombre);
        System.out.println("Ingredientes:");
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("- " + ingredientes[i]);
        }
    }
}
