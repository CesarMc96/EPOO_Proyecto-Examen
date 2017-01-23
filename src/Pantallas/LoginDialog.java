package Pantallas;

import Objetos.Archivos;
import Objetos.Persona;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LoginDialog extends JFrame {

    private final TextField txtUsuario;
    private final JPasswordField txtContrasena;
    private final JLabel lblRol;
    private final JLabel lblUsuario;
    private final JLabel lblContrasena;
    private final JButton bttSalir;
    private final JButton bttIngresar;
    private final JPanel pnlEnmedio;
    private final JPanel pnlBotones;
    private final String[] Roles = {"", "Alumno", "Docente"};
    private final JComboBox ListaRoles;

    public LoginDialog() {
        super.setSize(430, 170);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setTitle("Login");
        super.getContentPane().setBackground(Color.WHITE);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());

        //*-------------
        pnlEnmedio = new JPanel();
        pnlEnmedio.setBackground(Color.white);

        lblUsuario = new JLabel("Usuario: ");
        txtUsuario = new TextField(15);

        lblContrasena = new JLabel("Contraseña: ");
        txtContrasena = new JPasswordField(10);

        lblRol = new JLabel("Rol: ");
        ListaRoles = new JComboBox(Roles);
        ListaRoles.setBackground(Color.white);

        pnlEnmedio.add(lblUsuario);
        pnlEnmedio.add(txtUsuario);
        pnlEnmedio.add(lblContrasena);
        pnlEnmedio.add(txtContrasena);
        pnlEnmedio.add(lblRol);
        pnlEnmedio.add(ListaRoles);

        //*-------------
        pnlBotones = new JPanel();
        pnlBotones.setBackground(Color.WHITE);

        bttSalir = new JButton("Salir");
        bttSalir.setBackground(Color.white);
        bttSalir.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });

        bttIngresar = new JButton("Ingresar");
        bttIngresar.setBackground(Color.white);
        bttIngresar.addActionListener((ActionEvent ae) -> {

            Archivos a = new Archivos();
            try {
                ArrayList<Persona> UIniciales = Archivos.cargarUsuariosIniciales();

                for (Persona UIniciale : UIniciales) {

                    if (UIniciale.getUsuario().contains(txtUsuario.getText()) && UIniciale.getContrasena().contains(txtContrasena.getText())) {
                        if (ListaRoles.getSelectedItem() == "Alumno" && UIniciale.getRol().contains("Alumno")) {
                            if (UIniciale.getPermitido().contains("Permitido")) {
                                PrincipalFrameAlumnos pf = new PrincipalFrameAlumnos();
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario Bloqueado", "Error", JOptionPane.WARNING_MESSAGE);
                            }

                        } else if (ListaRoles.getSelectedItem() == "Docente" && UIniciale.getRol().contains("Docente")) {
                            PrincipalFrameDocentes pf = new PrincipalFrameDocentes();
                        } else {
                            JOptionPane.showMessageDialog(null, "Tipo de Usuario Incorrecto", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }

            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(LoginDialog.class.getName()).log(Level.SEVERE, null, ex);
            }

            if ("Amdministrador".equals(txtUsuario.getText()) && "AccesoTotal".equals(txtContrasena.getText())) {
                PrincipalFrameAdmin pa = new PrincipalFrameAdmin();
            }

        });

        pnlBotones.add(bttIngresar);
        pnlBotones.add(bttSalir);

        super.add(pnlEnmedio);
        super.add(pnlBotones, BorderLayout.PAGE_END);

        super.setVisible(true);
    }

}
