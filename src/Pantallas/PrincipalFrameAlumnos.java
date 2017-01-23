package Pantallas;

import Objetos.Archivos;
import Objetos.Examen;
import Objetos.ModeloExamen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class PrincipalFrameAlumnos extends JFrame {

    private final JMenuBar barraMenu;
    private final JMenu menuSistema;
    private final JMenu menuAlumnos;
    private final JMenu menuAyuda;
    private final JMenuItem itmSalir;
    private final JMenuItem itmContestar;
    private final JMenuItem itmVerCalificacion;
    private final JMenuItem itmNoIntentos;
    private final JMenuItem itmContenido;
    private final JMenuItem itmAcerca;
    private final JLabel lblBuscar;
    private final TextField txtBuscar;
    private final JButton btnBuscar;
    private final JPanel pnlBuscar;
    private final JToolBar menuHerramientas;
    private final ImageIcon salir;
    private final ImageIcon salirescala;
    private final JButton btnSalir;
    private final ImageIcon coexamen;
    private final ImageIcon coexamenescala;
    private final JButton btnMContestarExamen;
    private final ImageIcon verCalificacion;
    private final ImageIcon verCalificacionescala;
    private final JButton btnverCalificacion;
    private final ImageIcon intentos;
    private final ImageIcon intentosescala;
    private final JButton btnIntentos;
    private final ImageIcon Contenido;
    private final ImageIcon Contenidoescala;
    private final JButton btnContenido;
    private final JButton btnAcercaDe;
    private final ImageIcon AcercaDe;
    private final ImageIcon AcercaDeescala;
    private final JPanel pnlHerramientas;
    private final ArrayList<Examen> Examenes;
    private final ModeloExamen modelo;
    private final JTable tblExamenes;
    
    public PrincipalFrameAlumnos() throws IOException, FileNotFoundException, ClassNotFoundException {
        barraMenu = new JMenuBar();

        menuSistema = new JMenu("Sistema   ");
        menuAlumnos = new JMenu("Examen   ");
        menuAyuda = new JMenu("Ayuda   ");

        itmSalir = new JMenuItem("Salir");
        itmContestar = new JMenuItem("Contestar");
        itmVerCalificacion = new JMenuItem("Ver Calificacion");
        itmNoIntentos = new JMenuItem("No. Intentos");
        itmContenido = new JMenuItem("Contenidos");
        itmAcerca = new JMenuItem("Acerca de");

        barraMenu.add(menuSistema);
        menuSistema.addSeparator();
        menuSistema.add(itmSalir);

        barraMenu.add(menuAlumnos);
        menuAlumnos.add(itmContestar);
        menuAlumnos.add(itmVerCalificacion);
        menuAlumnos.add(itmNoIntentos);

        barraMenu.add(menuAyuda);
        menuAyuda.add(itmContenido);
        menuAyuda.add(itmAcerca);

        itmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        itmAcerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK));
        itmContestar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
        itmVerCalificacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
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

        salir = new ImageIcon(getClass().getResource("/Iconos/SalirIcono.png"));
        salirescala = new ImageIcon(salir.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnSalir = new JButton();
        btnSalir.setIcon(salirescala);
        btnSalir.setToolTipText("Salir (CTRL + Q)");

        coexamen = new ImageIcon(getClass().getResource("/Iconos/ContestarIcono.jpg"));
        coexamenescala = new ImageIcon(coexamen.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnMContestarExamen = new JButton();
        btnMContestarExamen.setIcon(coexamenescala);
        btnMContestarExamen.setToolTipText("Contestar Examen (F5)");

        verCalificacion = new ImageIcon(getClass().getResource("/Iconos/CalificacionIcono.png"));
        verCalificacionescala = new ImageIcon(verCalificacion.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnverCalificacion = new JButton();
        btnverCalificacion.setIcon(verCalificacionescala);
        btnverCalificacion.setToolTipText("Ver Calificacion (F12)");

        intentos = new ImageIcon(getClass().getResource("/Iconos/noIntentosIcono.jpg"));
        intentosescala = new ImageIcon(intentos.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnIntentos = new JButton();
        btnIntentos.setIcon(intentosescala);
        btnIntentos.setToolTipText("Numero Intentos");

        Contenido = new ImageIcon(getClass().getResource("/Iconos/ContenidoIcono.png"));
        Contenidoescala = new ImageIcon(Contenido.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnContenido = new JButton();
        btnContenido.setIcon(Contenidoescala);
        btnContenido.setToolTipText("Contenida (F1)");

        AcercaDe = new ImageIcon(getClass().getResource("/Iconos/AcercaIcono.png"));
        AcercaDeescala = new ImageIcon(AcercaDe.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT));
        btnAcercaDe = new JButton();
        btnAcercaDe.setIcon(AcercaDeescala);
        btnAcercaDe.setToolTipText("Acerca (CTRL + F1)");

        menuHerramientas.add(btnMContestarExamen);
        menuHerramientas.add(btnverCalificacion);
        menuHerramientas.add(btnIntentos);
        menuHerramientas.add(btnContenido);
        menuHerramientas.add(btnAcercaDe);
        menuHerramientas.add(btnSalir);
        menuHerramientas.setFloatable(false);
        pnlHerramientas = new JPanel();
        pnlHerramientas.setLayout(new BorderLayout());
        pnlHerramientas.add(menuHerramientas, BorderLayout.WEST);
        
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

        itmVerCalificacion.addActionListener((ActionEvent ae) -> {
            VerDialog vd = new VerDialog(this);
            vd.setVisible(true);
        });

        btnverCalificacion.addActionListener((ActionEvent ae) -> {
            VerDialog vd = new VerDialog(this);
            vd.setVisible(true);
        });

        btnContenido.addActionListener((ActionEvent ae) -> {
            try {
                File path = new File("C:\\Users\\cesar_000\\Documents\\NetBeansProjects\\Proyecto_Curso\\src\\Iconos\\shortcuts.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
            }
        });

        itmContenido.addActionListener((ActionEvent ae) -> {
            try {
                File path = new File("C:\\Users\\cesar_000\\Documents\\NetBeansProjects\\Proyecto_Curso\\src\\Iconos\\shortcuts.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
            }
        });

        itmNoIntentos.addActionListener((ActionEvent ae) -> {
            IntentosDialog in = new IntentosDialog(this);
            in.setVisible(true);
        });
        
        btnIntentos.addActionListener((ActionEvent ae) -> {
            IntentosDialog in = new IntentosDialog(this);
            in.setVisible(true);
        });
        
        Examenes = Archivos.cargarExamenes();
        modelo = new ModeloExamen(Examenes);
        tblExamenes = new JTable(modelo);
        
        super.add(new JScrollPane(tblExamenes));
        super.setResizable(false);
        super.setVisible(true);
    }

}
