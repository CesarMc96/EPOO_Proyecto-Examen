package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class PrincipalFrameAdmin extends JFrame {

    private final JMenuBar barraMenu;
    private final JMenu menuSistema;
    private final JMenu menuExamen;
//    private final JMenu menuAlumnos;
    private final JMenu menuAyuda;
    private final JMenuItem itmUsuarios;
    private final JMenuItem itmSalir;
    private final JMenuItem itmCrearExamen;
    private final JMenuItem itmModificar;
//    private final JMenuItem itmContestar;
//    private final JMenuItem itmVerCalificacion;
//    private final JMenuItem itmNoIntentos;
    private final JMenuItem itmContenido;
    private final JMenuItem itmAcerca;
    private final JLabel lblBuscar;
    private final TextField txtBuscar;
    private final JButton btnBuscar;
    private final JPanel pnlBuscar;
    private final JToolBar menuHerramientas;
    private final JButton btnUsuario;
    private final ImageIcon usuario;
    private final ImageIcon usuarioescala;
    private final ImageIcon salir;
    private final ImageIcon salirescala;
    private final JButton btnSalir;
    private final ImageIcon cexamen;
    private final ImageIcon cexamenescala;
    private final JButton btnCrearExamen;
    private final JButton btnModificarExamen;
    private final ImageIcon mexamen;
    private final ImageIcon mexamenescala;
//    private final ImageIcon coexamen;
//    private final ImageIcon coexamenescala;
//    private final JButton btnMContestarExamen;
//    private final ImageIcon verCalificacion;
//    private final ImageIcon verCalificacionescala;
//    private final JButton btnverCalificacion;
//    private final ImageIcon intentos;
//    private final ImageIcon intentosescala;
//    private final JButton btnIntentos;
    private final ImageIcon Contenido;
    private final ImageIcon Contenidoescala;
    private final JButton btnContenido;
    private final JButton btnAcercaDe;
    private final ImageIcon AcercaDe;
    private final ImageIcon AcercaDeescala;
    private final JPanel pnlHerramientas;

    public PrincipalFrameAdmin() {
        barraMenu = new JMenuBar();

        menuSistema = new JMenu("Sistema   ");
        menuExamen = new JMenu("Examen   ");
        //menuAlumnos = new JMenu("Alumnos   ");
        menuAyuda = new JMenu("Ayuda   ");

        itmUsuarios = new JMenuItem("Usuarios");
        itmSalir = new JMenuItem("Salir");
        itmCrearExamen = new JMenuItem("Crear Examen");
        itmModificar = new JMenuItem("Modificar");
        //itmContestar = new JMenuItem("Contestar");
        //itmVerCalificacion = new JMenuItem("Ver Calificacion");
        //itmNoIntentos = new JMenuItem("No. Intentos");
        itmContenido = new JMenuItem("Contenidos");
        itmAcerca = new JMenuItem("Acerca de");

        barraMenu.add(menuSistema);
        menuSistema.add(itmUsuarios);
        menuSistema.addSeparator();
        menuSistema.add(itmSalir);

        barraMenu.add(menuExamen);
        menuExamen.add(itmCrearExamen);
        menuExamen.add(itmModificar);

        //barraMenu.add(menuAlumnos);
        //menuAlumnos.add(itmContestar);
        //menuAlumnos.add(itmVerCalificacion);
        //menuAlumnos.add(itmNoIntentos);
        barraMenu.add(menuAyuda);
        menuAyuda.add(itmContenido);
        menuAyuda.add(itmAcerca);

        itmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        itmUsuarios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_DOWN_MASK));
        itmModificar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
        itmAcerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK));
        itmCrearExamen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
        //itmContestar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
        //itmVerCalificacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
        itmContenido.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));

        setJMenuBar(this.barraMenu);

        super.setSize(800, 600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setTitle("Ventana Principal");
        super.getContentPane().setBackground(Color.WHITE);
        super.setLocationRelativeTo(null);

        pnlBuscar = new JPanel();
        lblBuscar = new JLabel("Buscar examen: ");
        txtBuscar = new TextField(40);
        btnBuscar = new JButton("Buscar");

        pnlBuscar.add(lblBuscar);
        pnlBuscar.add(txtBuscar);
        pnlBuscar.add(btnBuscar);

        super.add(pnlBuscar, BorderLayout.PAGE_END);

        menuHerramientas = new JToolBar();
        usuario = new ImageIcon(getClass().getResource("/Iconos/IconoUsuario.jpg"));
        usuarioescala = new ImageIcon(usuario.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnUsuario = new JButton();
        btnUsuario.setIcon(usuarioescala);
        btnUsuario.setToolTipText("Usuario (CTRL + U)");

        salir = new ImageIcon(getClass().getResource("/Iconos/SalirIcono.png"));
        salirescala = new ImageIcon(salir.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnSalir = new JButton();
        btnSalir.setIcon(salirescala);
        btnSalir.setToolTipText("Salir (CTRL + Q)");

        cexamen = new ImageIcon(getClass().getResource("/Iconos/CrearExamenIcono.jpg"));
        cexamenescala = new ImageIcon(cexamen.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnCrearExamen = new JButton();
        btnCrearExamen.setIcon(cexamenescala);
        btnCrearExamen.setToolTipText("Crear Examen (F2)");

        mexamen = new ImageIcon(getClass().getResource("/Iconos/ModificarExamenIcono.png"));
        mexamenescala = new ImageIcon(mexamen.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnModificarExamen = new JButton();
        btnModificarExamen.setIcon(mexamenescala);
        btnModificarExamen.setToolTipText("Modificar Examen (CTRL + M)");

//        coexamen = new ImageIcon(getClass().getResource("/Iconos/ContestarIcono.jpg"));
//        coexamenescala = new ImageIcon(coexamen.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
//        btnMContestarExamen = new JButton();
//        btnMContestarExamen.setIcon(coexamenescala);
//        btnMContestarExamen.setToolTipText("Contestar Examen (F5)");
//        
//        verCalificacion = new ImageIcon(getClass().getResource("/Iconos/CalificacionIcono.png"));
//        verCalificacionescala = new ImageIcon(verCalificacion.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
//        btnverCalificacion = new JButton();
//        btnverCalificacion.setIcon(verCalificacionescala);
//        btnverCalificacion.setToolTipText("Ver Calificacion (F12)");
//        
//        
//        intentos = new ImageIcon(getClass().getResource("/Iconos/noIntentosIcono.jpg"));
//        intentosescala = new ImageIcon(intentos.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
//        btnIntentos = new JButton();
//        btnIntentos.setIcon(intentosescala);
//        btnIntentos.setToolTipText("Numero Intentos");
        Contenido = new ImageIcon(getClass().getResource("/Iconos/ContenidoIcono.png"));
        Contenidoescala = new ImageIcon(Contenido.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnContenido = new JButton();
        btnContenido.setIcon(Contenidoescala);
        btnContenido.setToolTipText("Contenido (F1)");

        AcercaDe = new ImageIcon(getClass().getResource("/Iconos/AcercaIcono.png"));
        AcercaDeescala = new ImageIcon(AcercaDe.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnAcercaDe = new JButton();
        btnAcercaDe.setIcon(AcercaDeescala);
        btnAcercaDe.setToolTipText("Acerca (CTRL + F1)");

        menuHerramientas.add(btnUsuario);
        menuHerramientas.add(btnSalir);
        menuHerramientas.add(btnCrearExamen);
        menuHerramientas.add(btnModificarExamen);
//        menuHerramientas.add(btnMContestarExamen);
//        menuHerramientas.add(btnverCalificacion);
//        menuHerramientas.add(btnIntentos);        
        menuHerramientas.add(btnContenido);
        menuHerramientas.add(btnAcercaDe);
        menuHerramientas.setFloatable(false);
        pnlHerramientas = new JPanel();
        pnlHerramientas.add(menuHerramientas);
        super.add(pnlHerramientas, BorderLayout.NORTH);

        itmSalir.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });

        btnSalir.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });

        itmAcerca.addActionListener((ActionEvent ae) -> {
            AcercaDialog ac = new AcercaDialog(this);
            ac.setVisible(true);
        });

        btnAcercaDe.addActionListener((ActionEvent ae) -> {
            AcercaDialog ac = new AcercaDialog(this);
            ac.setVisible(true);
        });

//        itmVerCalificacion.addActionListener((ActionEvent ae) -> {
//            VerDialog vd = new VerDialog();
//        });
//        btnverCalificacion.addActionListener((ActionEvent ae) -> {
//            VerDialog vd = new VerDialog();
//        });
        itmUsuarios.addActionListener((ActionEvent ae) -> {
            UsuariosDialog de = null;
            try {
                de = new UsuariosDialog(this);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalFrameDocentes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PrincipalFrameDocentes.class.getName()).log(Level.SEVERE, null, ex);
            }
            de.setVisible(true);
        });

        btnUsuario.addActionListener((ActionEvent ae) -> {
            UsuariosDialog de = null;
            try {
                de = new UsuariosDialog(this);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalFrameDocentes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PrincipalFrameDocentes.class.getName()).log(Level.SEVERE, null, ex);
            }
            de.setVisible(true);
        });

        itmCrearExamen.addActionListener((ActionEvent ae) -> {
            ExamenDialog dee = new ExamenDialog(this);
            dee.setVisible(true);
        });

        btnCrearExamen.addActionListener((ActionEvent ae) -> {
            ExamenDialog dee = new ExamenDialog(this);
            dee.setVisible(true);
        });

        btnContenido.addActionListener((ActionEvent ae) -> {
            try {
                File path = new File("C:\\Users\\cesar_000\\Documents\\NetBeansProjects\\Proyecto_Curso\\src\\Iconos\\shortcuts.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        
        itmContenido.addActionListener((ActionEvent ae) -> {
            try {
                File path = new File("C:\\Users\\cesar_000\\Documents\\NetBeansProjects\\Proyecto_Curso\\src\\Iconos\\shortcuts.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        
        
        super.setUndecorated(false);
        super.setVisible(true);
    }

}
