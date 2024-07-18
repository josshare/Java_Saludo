public class Saludo {
    //variable privada
    private final String name;
    //constructor con el parametro nombre
    public Saludo(String nombre) {
        this.name = nombre;
    }
    //metodo imprime en mensaje.
    public void sayName() {
        System.out.println("Hola " + name);
    }
    //metodo main se asigna el nombre a la clase saludo.
    public static void main(String[] args) {
        new Saludo("José").sayName();
    }
}
