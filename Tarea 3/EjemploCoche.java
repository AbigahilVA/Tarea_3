public class EjemploCoche {
public static void main(String[] args) {
// Crear un objeto de la clase Coche usando el constructor con parámetros
Coche miCoche = new Coche("Toyota", "Camry", 2015, 15000.0);
// Comentando el objeto creado
System.out.println("Información de mi coche:");
System.out.println("Marca: " + miCoche.getMarca());
System.out.println("Modelo: " + miCoche.getModelo());
System.out.println("Año de Fabricación: " + miCoche.getAñoFabricacion());
System.out.println("Precio: $" + miCoche.getPrecio());
// Aplicar un descuento si es un modelo antiguo
double descuento = 2000.0;
boolean descuentoAplicado = miCoche.aplicarDescuento(descuento);
// Comentando si se aplicó el descuento
if (descuentoAplicado) {
System.out.println("Se aplicó un descuento de $" + descuento);
System.out.println("Nuevo precio: $" + miCoche.getPrecio());
} else {
System.out.println("No se aplicó ningún descuento.");
}
}
}