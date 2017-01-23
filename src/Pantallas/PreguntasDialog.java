
package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PreguntasDialog extends JDialog{

    private final JButton btnCancelar;
    private final JButton btnAnterior;
    private final JButton btnSiguiente;
    private final JButton btnFinalizar;
    private final JLabel lblCorrecta;
    private final JLabel lblInCorrecta;
    private final TextField txtCorrecta;
    private final JPanel pnlBotones;
    private final JPanel pnlBotonArriba;
    private final JPanel pnlBotonAbajo;
    private final JPanel pnlArriba;
    private final JPanel pnlEnmedio;
    private final JPanel pnlEnmedio1;
    private final JPanel pnlEnmedio2;
    private final JPanel pnlEnmedio3;
    private final TextField txtInCorrecta;
    private final TextField txtInCorrecta2;
    private final TextField txtInCorrecta3;
    private final JLabel lblInCorrecta2;
    private final JLabel lblInCorrecta3;

    public PreguntasDialog(Dialog d) {
        super(d, true);
        super.setSize(500, 250);
        super.setTitle("PreguntasDialog");
        super.getContentPane().setBackground(Color.WHITE);        
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        
        pnlArriba = new JPanel();
        pnlEnmedio = new JPanel();
        pnlEnmedio1 = new JPanel();
        pnlEnmedio2 = new JPanel();
        pnlEnmedio3 = new JPanel();
        pnlEnmedio.setLayout(new BorderLayout());
        
        lblCorrecta = new JLabel("Correcta");
        lblCorrecta.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 15));
        lblInCorrecta = new JLabel("Incorrecta");
        lblInCorrecta.setFont(new Font("Tahoma", 0, 15));
        lblInCorrecta2 = new JLabel("Incorrecta");
        lblInCorrecta2.setFont(new Font("Tahoma", 0, 15));
        lblInCorrecta3 = new JLabel("Incorrecta");
        lblInCorrecta3.setFont(new Font("Tahoma", 0, 15));
        txtCorrecta = new TextField(35);
        txtInCorrecta = new TextField(35);
        txtInCorrecta2 = new TextField(35);
        txtInCorrecta3 = new TextField(35);
        
        pnlEnmedio1.add(lblInCorrecta);
        pnlEnmedio1.add(txtInCorrecta);
        pnlEnmedio2.add(lblInCorrecta2);
        pnlEnmedio3.add(lblInCorrecta3);
        
        pnlEnmedio2.add(txtInCorrecta2);
        pnlEnmedio3.add(txtInCorrecta3);
        
        pnlEnmedio.add(pnlEnmedio1, BorderLayout.PAGE_START);        
        pnlEnmedio.add(pnlEnmedio2, BorderLayout.CENTER);
        pnlEnmedio.add(pnlEnmedio3, BorderLayout.PAGE_END);

        
        pnlArriba.add(lblCorrecta);
        pnlArriba.add(txtCorrecta);
        
        btnCancelar = new JButton("Cancelar");
        btnAnterior = new JButton("Anterior");
        btnSiguiente = new JButton("Siguiente");
        btnFinalizar = new JButton("Finalizar");
        
        pnlBotones = new JPanel();
        pnlBotones.setLayout(new BorderLayout());
        pnlBotonArriba = new JPanel();
        pnlBotonAbajo = new JPanel();
        
        pnlBotonArriba.add(btnCancelar);
        pnlBotonArriba.add(new JLabel("                                                          "));
        pnlBotonArriba.add(btnAnterior);
        pnlBotonArriba.add(new JLabel("    "));
        pnlBotonArriba.add(btnSiguiente);
        
        pnlBotonAbajo.add(new JLabel("                                                                                                                             "));
        pnlBotonAbajo.add(btnFinalizar);     
        
        pnlBotones.add(pnlBotonArriba, BorderLayout.CENTER);
        pnlBotones.add(pnlBotonAbajo, BorderLayout.PAGE_END);
      
        super.add(pnlArriba, BorderLayout.PAGE_START);
        super.add(pnlEnmedio, BorderLayout.CENTER);
        super.add(pnlBotones, BorderLayout.PAGE_END);
    }
    
}
