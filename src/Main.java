
void main() {

// Consultar el total antes de crear objetos (Debe ser 0)
    System.out.println("Total: " + Dispositivo.getTotalCreados());

    System.out.println("-------------------");

    Dispositivo d1 = new Dispositivo("Laptop Asus", "Hardware");
    Dispositivo d2 = new Dispositivo("Servidor Cloud", "Infraestructura");
    Dispositivo d3 = new Dispositivo("Router Core", "Networking");

    d1.mostrarInformacion();
    System.out.println("-------------------");
    d2.mostrarInformacion();
    System.out.println("-------------------");
    d3.mostrarInformacion();

    System.out.println("-------------------");

    // Consultar el total
    System.out.println("Total: " + Dispositivo.getTotalCreados());
}