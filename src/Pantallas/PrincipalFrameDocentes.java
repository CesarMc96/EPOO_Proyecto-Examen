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

public class PrincipalFrameDocentes extends JFrame {

    private final JMenuBar barraMenu;
    private final JMenu menuSistema;
    private final JMenu menuExamen;
    private final JMenu menuAyuda;
    private final JMenuItem itmSalir;
    private final JMenuItem itmCrearExamen;
    private final JMenuItem itmModificar;
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
    private final ImageIcon cexamen;
    private final ImageIcon cexamenescala;
    private final JButton btnCrearExamen;
    private final JButton btnModificarExamen;
    private final ImageIcon mexamen;
    private final ImageIcon mexamenescala;
    private final ImageIcon Contenido;
    private final ImageIcon Contenidoescala;
    private final JButton btnContenido;
    private final JButton btnAcercaDe;
    private final ImageIcon AcercaDe;
    private final ImageIcon AcercaDeescala;
    private final JPanel pnlHerramientas;
    private JTable tblExamenes;
    private ModeloExamen modelo;
    private ArrayList<Examen> Examenes;

    public PrincipalFrameDocentes() throws IOException, FileNotFoundException, ClassNotFoundException {
        barraMenu = new JMenuBar();

        menuSistema = new JMenu("Sistema   ");
        menuExamen = new JMenu("Examen   ");
        menuAyuda = new JMenu("Ayuda   ");

        itmSalir = new JMenuItem("Salir");
        itmCrearExamen = new JMenuItem("Crear Examen");
        itmModificar = new JMenuItem("Modificar");
        itmContenido = new JMenuItem("Contenidos");
        itmAcerca = new JMenuItem("Acerca de");

        barraMenu.add(menuSistema);
        menuSistema.addSeparator();
        menuSistema.add(itmSalir);

        barraMenu.add(menuExamen);
        menuExamen.add(itmCrearExamen);
        menuExamen.add(itmModificar);

        barraMenu.add(menuAyuda);
        menuAyuda.add(itmContenido);
        menuAyuda.add(itmAcerca);

        itmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        itmModificar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
        itmAcerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK));
        itmCrearExamen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
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

        menuHerramientas = new JToolBar();
        
        
        menuHerramientas.add(btnCrearExamen);
        menuHerramientas.add(btnModificarExamen);
        menuHerramientas.add(btnContenido);
        menuHerramientas.add(btnAcercaDe);
        menuHerramientas.add(btnSalir);
        menuHerramientas.setFloatable(false);
        
        pnlHerramientas = new JPanel();
        pnlHerramientas.add(menuHerramientas);
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
            }
        });
        
        itmContenido.addActionListener((ActionEvent ae) -> {
            try {
                File path = new File("C:\\Users\\cesar_000\\Documents\\NetBeansProjects\\Proyecto_Curso\\src\\Iconos\\shortcuts.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
            }
        });
        
        Examenes = Archivos.cargarExamenes();
        modelo = new ModeloExamen(Examenes);
        tblExamenes = new JTable(modelo);
        
        super.add(new JScrollPane(tblExamenes));
        super.setUndecorated(false);
        super.setVisible(true);
    }

}
