package Files;

import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Splash extends JFrame {

    public Splash() {
       
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("rev.PNG"))));
        
        initComponents();
        setUndecorated(true);
        
        new Thread() {
            
            
            
            
            
            

            public void run() {
                int i = 0;
                
                progresslabel.setVisible(true);
                progresslabel.setText("Please Wait While The System Loads");
                while (i < 130) {    // Runs for 130 milliseconds
                    jProgressBar1.setStringPainted(true);
                    jProgressBar1.setValue(i);
                   
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    i++;
                    try {
                        sleep(40);//sleeps for 40 milliseconds
                    } catch (InterruptedException e) {
                       JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", 
                               JOptionPane.ERROR_MESSAGE);
                    }
                }
                new Login().setVisible(true);
                dispose();
                

            }
        }.start();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);      

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        progresslabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(2, 2, 10, 8));
        setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 343, Short.MAX_VALUE)
                .addComponent(progresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(567, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        new Splash().setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel progresslabel;
    // End of variables declaration//GEN-END:variables
}
