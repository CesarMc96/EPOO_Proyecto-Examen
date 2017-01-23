
package Pantallas;

import Objetos.Archivos;
import Objetos.Modelo;
import Objetos.Persona;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UsuariosDialog extends JDialog{

    private final JButton btnNuevo;
    private final JButton btnModificar;
    private final JButton btnBloquearDesbloquear;
    private final JPanel pnlBotones;
    private final JButton btnAceptar;
    private final JPanel pnlboton;
    private JTable tblUsuarios;
    private Modelo modelo;
    private ArrayList<Persona> Usuarios;

    public UsuariosDialog(Frame f) throws IOException, FileNotFoundException, ClassNotFoundException {
        super(f,true);
        super.setSize(500, 300);
        super.setTitle("UsuariosDialog");
        super.getContentPane().setBackground(Color.WHITE);        
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        
        pnlBotones = new JPanel();
        btnNuevo = new JButton("Nuevo");
        btnModificar = new JButton("Modificar");
        btnBloquearDesbloquear = new JButton("Bloquear / Desbloquear");
        pnlBotones.add(btnNuevo);
        pnlBotones.add(btnModificar);
        pnlBotones.add(btnBloquearDesbloquear);
        
        pnlboton = new JPanel();
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener((ActionEvent ae) -> {
            this.setVisible(false);     
            //System.exit(0);z
        });
        
        btnNuevo.addActionListener((ActionEvent ae) -> {
            UserDialog u = new UserDialog(this);
            u.setVisible(true);
            modelo.fireTableDataChanged();
            
        });
        
        btnModificar.addActionListener((ActionEvent ae) -> {
            UserDialogModificar u = new UserDialogModificar(this);
            u.setVisible(true);            
        });
        
        pnlboton.add(btnAceptar);
        
        Usuarios = Archivos.cargarUsuariosIniciales();
        modelo = new Modelo(Usuarios);
        tblUsuarios = new JTable(modelo);
        
                
        btnBloquearDesbloquear.addActionListener((ActionEvent ae) -> {
           for (Persona UIniciale : Usuarios) {
               if(UIniciale.getPermitido().contains("Permitido")){
                   UIniciale.setPermitido("Bloqueado");
               } else {
                   UIniciale.setPermitido("Permitido");
               }
           } 
           modelo.fireTableDataChanged();
           
            try {
                Archivos.escribirUsuarios(Usuarios);
            } catch (IOException ex) {
                Logger.getLogger(UsuariosDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        super.add(new JScrollPane(tblUsuarios));
        super.add(pnlboton, BorderLayout.PAGE_END);        
        super.add(pnlBotones, BorderLayout.PAGE_START);
    }

}
