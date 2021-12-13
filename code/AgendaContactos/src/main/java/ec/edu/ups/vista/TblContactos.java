/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.vista;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Core i5 11va
 */
public class TblContactos {
    public void verTabla(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new Render());
        
        JButton btnModificar = new JButton("Modificar");
        btnModificar.setName("M");
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setName("E");
        
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{{"Guillermo", "Pizarro", "0947384929", btnModificar, btnEliminar},
                               {"Angela", "Vasquez", "0947123429", btnModificar, btnEliminar}},
                new Object[]{"Nombre", "Apellido", "Teléfono", "Modificar", "Eliminar"}
        );
        
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
    }
}
