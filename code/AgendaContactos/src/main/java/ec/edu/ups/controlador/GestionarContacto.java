/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Contacto;
import java.util.ArrayList;

/**
 *
 * @author Core i5 11va
 */
public class GestionarContacto implements GestionarObjeto {
    
    private ArrayList<Contacto> contactos;
    
    public GestionarContacto(){
        this.contactos = new ArrayList<Contacto>();
    }

    @Override
    public void registrar(Object objeto) {
        this.contactos.add( (Contacto) objeto );
    }

    @Override
    public void modificar(Object objeto) {
        Contacto contacto = (Contacto) objeto;
        for (int i=0; i<this.contactos.size(); i++) {
            Contacto temp = this.contactos.get(i);
            if (temp.getNombre().equals( contacto.getNombre() )&& temp.getApellido().equals( contacto.getApellido() )) {
                this.contactos.set(i, contacto);
                break;
            }
        }
    }

    @Override
    public void eliminar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void leer(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
