package Pantallas;

import Objetos.Archivos;
import Objetos.Persona;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UserDialogModificar extends JDialog {

    private final JPanel pnlBotones;
    private final JButton btnAceptar;
    private final JButton btnCancelar;
    private final JPanel pnlBotonesIn;
    private final JLabel lblEspcaio;
    private final JPanel pnlDatos;
    private final JLabel lblNombre;
    private final TextField txtNombre;
    private final JLabel lblNickName;
    private final TextField txtNickName;
    private final JLabel lblRol;
    private final JComboBox ListaRoles;
    private final String[] Roles = {"", "Alumno", "Docente"};
    private final JPanel pnlDatos1;
    private final JPanel pnlDatos2;
    private final JPanel pnlDatos3;
    private final JCheckBox checkPermitido;
    private ArrayList<Persona> Usuarios;
    private final JLabel lblContrasena;
    private final TextField txtContrasena;
    private final JPanel pnlDatos4;
    private final JPanel pnlDatos5;

    public UserDialogModificar(Dialog f) {
        super(f, true);
        super.setSize(400, 210);
        super.setTitle("Modificar Usuario");
        super.getContentPane().setBackground(Color.WHITE);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());

        pnlBotones = new JPanel();
        pnlBotones.setLayout(new BorderLayout());

        pnlBotonesIn = new JPanel();
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");
        lblEspcaio = new JLabel("   ");
        pnlBotonesIn.add(btnAceptar);
        pnlBotonesIn.add(btnCancelar);
        pnlBotonesIn.add(lblEspcaio);
        pnlBotones.add(pnlBotonesIn, BorderLayout.EAST);

        pnlDatos = new JPanel();
        pnlDatos.setLayout(new BorderLayout());

        pnlDatos1 = new JPanel();
        pnlDatos1.setLayout(new BorderLayout());
        lblNombre = new JLabel("          Nombre  ");
        txtNombre = new TextField(15);
        pnlDatos2 = new JPanel();
        lblNickName = new JLabel("NickName  ");
        txtNickName = new TextField(10);
        lblRol = new JLabel("Rol: ");
        ListaRoles = new JComboBox(Roles);
        pnlDatos3 = new JPanel();
        checkPermitido = new JCheckBox("Permitido");
        checkPermitido.setBackground(Color.WHITE);

        pnlDatos3.add(checkPermitido);
        pnlDatos3.add(new JLabel("                                                                       "));
        ListaRoles.setBackground(Color.WHITE);
        lblContrasena = new JLabel("Contraseña:  ");
        txtContrasena = new TextField(10);

        pnlBotones.setBackground(Color.WHITE);
        pnlBotonesIn.setBackground(Color.WHITE);
        pnlDatos.setBackground(Color.WHITE);
        pnlDatos1.setBackground(Color.WHITE);
        pnlDatos2.setBackground(Color.WHITE);
        pnlDatos3.setBackground(Color.WHITE);

        pnlDatos1.add(lblNombre, BorderLayout.WEST);
        pnlDatos1.add(txtNombre);
        pnlDatos1.add(new JLabel("                                    "), BorderLayout.EAST);

        pnlDatos2.add(lblNickName);
        pnlDatos2.add(txtNickName);
        pnlDatos2.add(new JLabel("   "));
        pnlDatos2.add(lblRol);
        pnlDatos2.add(ListaRoles);
        pnlDatos2.add(new JLabel("           "));

        pnlDatos4 = new JPanel();
        pnlDatos5 = new JPanel();
        pnlDatos4.setLayout(new BorderLayout());
        pnlDatos5.add(lblContrasena);
        pnlDatos5.add(txtContrasena);
        pnlDatos5.add(new JLabel("                                              "));
        pnlDatos5.setBackground(Color.WHITE);

        pnlDatos4.add(pnlDatos5, BorderLayout.CENTER);
        pnlDatos4.add(pnlDatos3, BorderLayout.PAGE_END);

        pnlDatos.add(pnlDatos1, BorderLayout.PAGE_START);
        pnlDatos.add(pnlDatos2, BorderLayout.CENTER);
        pnlDatos.add(pnlDatos4, BorderLayout.PAGE_END);

        btnAceptar.addActionListener((ActionEvent ae) -> {

        });

        btnCancelar.addActionListener((ActionEvent ae) -> {
            int n = JOptionPane.showConfirmDialog(
                    f,
                    "¿Deseas cancelar cambio?",
                    "¿Seguro",
                    JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                this.setVisible(false);
            }
        });
        
        super.add(pnlDatos, BorderLayout.CENTER);
        super.add(pnlBotones, BorderLayout.PAGE_END);
    }

}
