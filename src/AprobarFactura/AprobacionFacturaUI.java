package AprobarFactura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AprobacionFacturaUI extends JFrame {
   
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /*new AprobacionFacturaUI().setVisible(true);*/
                
                AprobacionFacturaUserInterface interfase = new AprobacionFacturaUserInterface();
               interfase.setVisible(true);
                
            }
        });
    }
}
