public class Coche {
// Atributos
 String modelo;
 int velocidadMaxima;
 int potenciaMotor;
 boolean enMarcha;
// Constructor
public Coche(String modelo, int velocidadMaxima, int potenciaMotor) {
this.modelo = modelo;
this.velocidadMaxima = velocidadMaxima;
this.potenciaMotor = potenciaMotor;
this.enMarcha = false; // El coche comienza apagado
}
// Métodos
public void acelerar() {
if (enMarcha) {
System.out.println("El coche " + modelo + " está acelerando.");
} else {
System.out.println("Primero enciende el coche.");
}
}

public void frenar() {
if (enMarcha) {
System.out.println("El coche " + modelo + " está frenando.");
} else {
System.out.println("El coche está apagado, no se puede frenar.");
}
}
public void encender() {
enMarcha = true;
System.out.println("El coche " + modelo + " se ha encendido.");
}
public void apagar() {
enMarcha = false;
System.out.println("El coche " + modelo + " se ha apagado.");
}
}

