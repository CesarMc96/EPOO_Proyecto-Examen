
package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExamenDialog extends JDialog{

    private final JPanel pnlBotones;
    private final JPanel pnlBotonesIn;
    private final JButton btnAceptar;
    private final JButton btnCancelar;
    private final JLabel lblEspcaio;
    private final JLabel lblMateria;    
    private final String[] Parciales = {"", "1 Parcial", "2 Parcial", "3 Parcial", "Ordinario"};    
    private final Integer[] TotalPreg = {40, 35, 30, 25, 20, 15, 10};
    private final Integer[] PreguntasRealizar = {10, 15, 20, 25, 30, 35, 40};
    private final Integer[] Intentos = {1, 2, 3, 4};
    private final JTextField txtMateria;
    private final JLabel lblParcial;
    private final JComboBox ListaParciales;
    private final JLabel lblTema;
    private final JTextField txtTema;
    private final JLabel lblTotalPreguntas;
    private final JComboBox TotalPreguntas;
    private final JLabel lblRealizar;
    private final JComboBox PregRealizar;
    private final JLabel lblIntentos;
    private final JComboBox NumeroIntentos;
    private final JPanel pnlArriba;
    private final JPanel pnlArribaAdentro;
    private final JPanel pnlArribaArriba;
    private final JPanel pnlArribaAbajo;
    private final JPanel pnlAbajo;
    private final JPanel pnlAbajoArriba;
    private final JPanel pnlAbajoAdentro;
    private final JPanel pnlAbajoAbajo;

    public ExamenDialog(Frame f) {
        super(f, true);
        super.setSize(400, 280);
        super.setTitle("ExamenDialog");
        super.getContentPane().setBackground(Color.WHITE);        
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        
        pnlBotones = new JPanel();
        pnlBotones.setLayout(new BorderLayout());
        
        pnlBotonesIn = new JPanel();
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");
        lblEspcaio = new JLabel("      ");
        pnlBotonesIn.add(btnAceptar);
        pnlBotonesIn.add(btnCancelar);
        pnlBotonesIn.add(lblEspcaio);      
        pnlBotones.add(pnlBotonesIn, BorderLayout.EAST);
        pnlBotones.setBackground(Color.WHITE);
        pnlBotonesIn.setBackground(Color.WHITE);
        
        lblMateria = new JLabel("Materia :");
        txtMateria = new JTextField(20);
        lblParcial = new JLabel("Parcial: ");
        ListaParciales = new JComboBox(Parciales);
        ListaParciales.setBackground(Color.WHITE);
        lblTema = new JLabel("Tema: ");
        txtTema = new JTextField(15);
        lblTotalPreguntas = new JLabel("Total de Preguntas");
        TotalPreguntas = new JComboBox(TotalPreg);
        lblRealizar = new JLabel("Preguntas a realizar: ");
        PregRealizar = new JComboBox(PreguntasRealizar);
        lblIntentos = new JLabel("Intentos Permitidos: ");
        NumeroIntentos = new JComboBox(Intentos);

        pnlArriba = new JPanel();
        pnlArriba.setLayout(new BorderLayout());
        
        pnlArribaArriba = new JPanel();
        pnlArribaArriba.add(lblMateria);
        pnlArribaArriba.add(txtMateria);
        pnlArribaArriba.add(new JLabel("     "));
        pnlArribaArriba.setBackground(Color.WHITE);
        
        pnlArribaAdentro = new JPanel();
        pnlArribaAdentro.add(lblParcial);
        pnlArribaAdentro.add(ListaParciales);
        pnlArribaAdentro.add(new JLabel("                                                     "));
        pnlArribaAdentro.setBackground(Color.WHITE);
        
        pnlArribaAbajo = new JPanel();
        pnlArribaAbajo.add(lblTema);
        pnlArribaAbajo.add(txtTema);
        pnlArribaAbajo.add(new JLabel("                          "));
        pnlArribaAbajo.setBackground(Color.WHITE);
        
        pnlArriba.add(pnlArribaArriba, BorderLayout.PAGE_START);
        pnlArriba.add(pnlArribaAdentro, BorderLayout.CENTER);
        pnlArriba.add(pnlArribaAbajo, BorderLayout.PAGE_END);
        
        pnlAbajo = new JPanel();
        pnlAbajo.setLayout(new BorderLayout());
        
        pnlAbajoArriba = new JPanel();
        pnlAbajoArriba.add(lblTotalPreguntas);
        pnlAbajoArriba.add(TotalPreguntas);
        pnlAbajoArriba.setBackground(Color.WHITE);
        pnlAbajoArriba.add(new JLabel("                                            "));
        
        pnlAbajoAdentro = new JPanel();
        pnlAbajoAdentro.add(lblRealizar);
        pnlAbajoAdentro.add(PregRealizar);
        pnlAbajoAdentro.setBackground(Color.WHITE);
        pnlAbajoAdentro.add(new JLabel("                                       "));
        
        pnlAbajoAbajo = new JPanel();
        pnlAbajoAbajo.add(lblIntentos);
        pnlAbajoAbajo.add(NumeroIntentos);
        pnlAbajoAbajo.setBackground(Color.WHITE);
        pnlAbajoAbajo.add(new JLabel("                                          "));
        
        pnlAbajo.add(pnlAbajoArriba, BorderLayout.PAGE_START);
        pnlAbajo.add(pnlAbajoAdentro, BorderLayout.CENTER);
        pnlAbajo.add(pnlAbajoAbajo, BorderLayout.PAGE_END);
        
        super.add(pnlArriba, BorderLayout.PAGE_START);
        super.add(pnlAbajo, BorderLayout.CENTER);
        super.add(pnlBotones, BorderLayout.PAGE_END);
    }
    
}
