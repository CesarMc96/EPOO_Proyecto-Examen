
package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class IntentosDialog extends JDialog {

    private final JPanel pnlboton;
    private final JButton btnAceptar;
    private final JPanel pnlTabla;

    public IntentosDialog(Frame f) {
        super(f, true);
        super.setSize(300, 150);
        super.setTitle("VerDialog");
        super.getContentPane().setBackground(Color.WHITE);        
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener((ActionEvent ae) -> {
            this.setVisible(false);     
            //System.exit(0);
        });
        
        pnlboton = new JPanel();
        pnlboton.add(btnAceptar);
        
        
        pnlTabla = new JPanel();

        super.add(pnlTabla, BorderLayout.CENTER);
        super.add(pnlboton, BorderLayout.PAGE_END);
        super.setResizable(false);
        super.setUndecorated(true);
    }
    
    
}