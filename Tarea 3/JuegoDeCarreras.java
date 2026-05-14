public class JuegoDeCarreras {
public static void main(String[] args) {
// Crear objetos coche
Coche cocheDeportivo = new Coche("Deportivo A", 250, 400);
Coche cocheTodoTerreno = new Coche("Todoterreno B", 180, 350);
// Encender los coches
cocheDeportivo.encender();
cocheTodoTerreno.encender();
// Acelerar y frenar los coches
cocheDeportivo.acelerar();
cocheTodoTerreno.acelerar();
cocheDeportivo.frenar();
cocheTodoTerreno.frenar();
// Apagar los coches
cocheDeportivo.apagar();
cocheTodoTerreno.apagar();
}
}
