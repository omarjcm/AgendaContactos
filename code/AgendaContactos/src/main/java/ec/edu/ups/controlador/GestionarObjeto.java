/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.controlador;

/**
 *
 * @author Core i5 11va
 */
public interface GestionarObjeto {    
    public abstract void registrar(Object objeto);
    public abstract void modificar(Object objeto);
    public abstract void eliminar(Object objeto);
    public abstract void leer(Object objeto);
}
