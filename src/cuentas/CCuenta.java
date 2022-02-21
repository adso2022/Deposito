package cuentas;

/**
 * Clase cuenta, permite comprobar el saldo de una cuenta, 
 * retirar efectivo o hacer ingresos en una cuenta
 * 
 * @author Sergio Moreno Ochoa
 * @version 1.0 
 * @since 21/02/2022
 */
public class CCuenta {
    /**
     * Atributos de la clase cuenta
     * nombre para el titular de la cuenta
     * cuenta el número de cuenta
     * saldo cantidad de dinero que hay depositado en la cuenta
     * tipoInteres interes que genera la cuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor, no hace nada
     */
    public CCuenta()
    {
    }

    /**
     * Constructor, crea una nueva cuenta
     * @param nom, cadena nombre del propietario
     * @param cue, cadena número de cuenta
     * @param sal, número saldo de la cuenta
     * @param tipo, número tipo de interes 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método get del atributo nombre
     * @return una cadena, nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set del atributo nombre
     * @param nombre una cadena, nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get del atributo cuenta
     * @return una cadena, es la cuenta
     */    
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método set del atributo cuenta
     * @param cuenta una cadena, es la cuenta
     */    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método get del atributo saldo
     * @return un número, saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método set del atributo nombre
     * @param saldo un número, saldo de la cuenta
     */    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método get del atributo tipoInteres
     * @return un número, interes que genera la cuenta
     */    
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método set del atributo tipoInteres
     * @param tipoInteres un número, interes que genera la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Método que proporciona el saldo actual de la cuenta.
     * 
     * @return numero doble que es el saldo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que permite ingresar una cantidad en cuenta
     * 
     * @param cantidad, número doble que es la cantidad que se ingresa en cuenta
     * @throws Exception excepción que avisa de que la cantidad introducida es un número negativo.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que permite retirar una cantidad de la cuenta
     * 
     * @param cantidad importe a retirar
     * @throws Exception lanza excepciones para avisar de las siguientes situaciones no permitidas:
     * - Se intenta retirar una cantidad negativa.
     * - La cantidad a retirar es superior al saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}