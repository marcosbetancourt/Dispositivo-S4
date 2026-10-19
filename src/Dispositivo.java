public class Dispositivo {

    // Atributos privados
    private String nombre;
    private String tipo;
    private int id;

    // Atributo static compartido por toda la clase
    private static int contador = 0;

    // Constructor
    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        contador++;         // Incrementa el contador compartido
        this.id = contador; // Asigna el id
    }

    // Getters y Setters

    // NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    // TIPO
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        }
    }

    // ID
    public int getId() {
        return id;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public void mostrarInformacion() {
        System.out.println("ID del Dispositivo: " + id +
                "\nNombre: " + nombre +
                "\nTipo: " + tipo);
    }
}