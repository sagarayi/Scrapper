/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vtu;

import java.util.jar.Attributes;

/**
 *
 * @author Admin
 */
public class ResultPage extends javax.swing.JFrame {
MainMenu mm=new MainMenu();
String na,us,se,re,ma,pe;    
/**
     * Creates new form ResultPage
     */
public ResultPage()
{
    initComponents();
}
    public ResultPage(String n,String u,String s,String r,String m,String p) {
        
        na=n;
        us=u;
        se=s;
        re=r;
        ma=m;
        pe=p;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        usn = new javax.swing.JLabel();
        sem = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        per = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("jLabel2");
        name.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                nameAncestorRemoved(evt);
            }
        });

        usn.setText("jLabel4");
        usn.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                usnAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        sem.setText("jLabel6");
        sem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                semAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        result.setText("jLabel8");
        result.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                resultAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setText("Total Marks : ");

        total.setText("jLabel10");
        total.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                totalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel11.setText("Percentage : ");

        per.setText("jLabel12");
        per.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                perAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result)
                    .addComponent(name)
                    .addComponent(usn)
                    .addComponent(sem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(per))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addGap(16, 16, 16)
                .addComponent(usn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(sem)
                .addGap(18, 18, 18)
                .addComponent(result)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(per))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(total))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameAncestorAdded
      // System.out.println(mm.n);
       name.setText(na);// TODO add your handling code here:
    }//GEN-LAST:event_nameAncestorAdded

    private void usnAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_usnAncestorAdded
       usn.setText(us); // TODO add your handling code here:
    }//GEN-LAST:event_usnAncestorAdded

    private void semAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_semAncestorAdded
        sem.setText(se);// TODO add your handling code here:
    }//GEN-LAST:event_semAncestorAdded

    private void nameAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_nameAncestorRemoved

    private void resultAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_resultAncestorAdded
result.setText(re);        // TODO add your handling code here:
    }//GEN-LAST:event_resultAncestorAdded

    private void totalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_totalAncestorAdded
total.setText(pe.substring(0,5));        // TODO add your handling code here:
    }//GEN-LAST:event_totalAncestorAdded

    private void perAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_perAncestorAdded
per.setText(ma);        // TODO add your handling code here:
    }//GEN-LAST:event_perAncestorAdded

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
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel name;
    private javax.swing.JLabel per;
    private javax.swing.JLabel result;
    private javax.swing.JLabel sem;
    private javax.swing.JLabel total;
    private javax.swing.JLabel usn;
    // End of variables declaration//GEN-END:variables
}
