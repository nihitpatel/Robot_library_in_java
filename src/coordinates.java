
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAVIN
 */


public class coordinates extends javax.swing.JFrame {

    /**
     * Creates new form coordinates
     */
    public coordinates() {
       initComponents();
    }

 public class pos extends Thread {
    public void run()
    {
    double a,b;
    for(int i=0;i<=100;i++)
    {
         a =  MouseInfo.getPointerInfo().getLocation().getX();
    b =  MouseInfo.getPointerInfo().getLocation().getY();
//   t1.setText(a + " " + b);
        try {
            Thread.sleep(100);
             System.out.println(a +" "+b);
        } catch (InterruptedException ex) {
            Logger.getLogger(coordinates.class.getName()).log(Level.SEVERE, null, ex);
        }
        t1.setText(a+" "+b);
   
    }

    }    
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(coordinates.class.getName()).log(Level.SEVERE, null, ex);
        }
    pos posi = new pos();
    posi.start();
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(coordinates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coordinates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coordinates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coordinates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coordinates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
