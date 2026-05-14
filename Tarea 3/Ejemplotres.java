public class Coche {
// Atributos
/**
* Marca del coche
*/
private String marca;
/**
* Modelo del coche
*/
private String modelo;
/**
* Año de fabricación del coche
*/
private int añoFabricacion;
/**
* Precio del coche
*/
private double precio;
// Métodos
/**
* Aplica un descuento al precio del coche si es un modelo antiguo
* @param descuento
*
*/
public boolean aplicarDescuento(double descuento){
boolean descuentoAplicado = false;
if (añoFabricacion < 2010){
precio -= descuento;
descuentoAplicado = true;
}
return descuentoAplicado;
}
// Constructores
/**
* Constructor por defecto
*/
public Coche(){
this.marca = "";
this.modelo = "";
this.añoFabricacion = 0;
this.precio = 0.0;
}
/**
* Constructor con 4 parámetros
* @param marca Marca del coche
* @param modelo Modelo del coche
* @param añoFabricacion Año de fabricación del coche
* @param precio Precio del coche
*/
public Coche(String marca, String modelo, int añoFabricacion, double precio){
this.marca = marca;
this.modelo = modelo;
this.añoFabricacion = añoFabricacion;
this.precio = precio;
}
}