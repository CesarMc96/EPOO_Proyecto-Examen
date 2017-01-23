
package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VerDialog extends JDialog {

    private final JPanel pnlboton;
    private final JButton btnAceptar;
    private final JPanel pnlTodo;
    private final JLabel lblTuCalificacion;
    private final JLabel lblNumeroCalificacion;
    private final JLabel lblCalificacion;
    private final JPanel pnlTuCalificacion;
    private final JPanel pnlNumeroCalificacion;
    private final JPanel pnlCalificacion;
    
    public VerDialog(JFrame f) {
        super(f, true);
        super.setSize(300, 150);
        super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        super.setTitle("VerDialog");
        super.getContentPane().setBackground(Color.WHITE);        
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        
        pnlboton = new JPanel();
        pnlTodo = new JPanel();
        pnlTodo.setLayout(new BorderLayout());
        
        lblTuCalificacion = new JLabel("Tu Calificacion es:");
        lblTuCalificacion.setFont(new Font("Tahoma", 0, 20));
        pnlTuCalificacion = new JPanel();
        pnlTuCalificacion.add(lblTuCalificacion);
        
        lblNumeroCalificacion = new JLabel("8.3");
        lblNumeroCalificacion.setFont(new Font("Tahoma", 0, 25));
        pnlNumeroCalificacion = new JPanel();
        pnlNumeroCalificacion.add(lblNumeroCalificacion);
        
        lblCalificacion = new JLabel("Calificacion.");
        lblCalificacion.setFont(new Font("Tahoma", 0, 20));
        pnlCalificacion = new JPanel();
        pnlCalificacion.add(lblCalificacion);
        
        pnlTodo.add(pnlTuCalificacion, BorderLayout.NORTH);
        pnlTodo.add(pnlNumeroCalificacion, BorderLayout.CENTER);
        pnlTodo.add(pnlCalificacion, BorderLayout.PAGE_END);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener((ActionEvent ae) -> {
            this.setVisible(false);     
        });
        pnlboton.add(btnAceptar);
        
        super.add(pnlTodo, BorderLayout.CENTER);
        super.add(pnlboton, BorderLayout.PAGE_END);
        
        
        super.setUndecorated(true);
    }
    
    
}
