/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

/**
 *
 * @author 0030481711015
 */
public class Gui_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Gui_Menu
     */
    public Gui_Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCurso = new javax.swing.JMenuItem();
        jMenuItemTurma = new javax.swing.JMenuItem();
        jMenuItemInstrutor = new javax.swing.JMenuItem();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuOperacoes = new javax.swing.JMenu();
        jMenuItemAlocarInstrutor = new javax.swing.JMenuItem();
        jMenuItemEfetuarMatricula = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho POO");

        jMenuCadastros.setText("Cadastros");

        jMenuItemCurso.setText("Curso");
        jMenuItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCursoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCurso);

        jMenuItemTurma.setText("Turma");
        jMenuItemTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTurmaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemTurma);

        jMenuItemInstrutor.setText("Instrutor");
        jMenuItemInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInstrutorActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemInstrutor);

        jMenuItemAluno.setText("Aluno");
        jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemAluno);
        jMenuCadastros.add(jSeparator2);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemSair);

        jMenuBar1.add(jMenuCadastros);

        jMenuOperacoes.setText("Operações");

        jMenuItemAlocarInstrutor.setText("Alocar Instrutor");
        jMenuOperacoes.add(jMenuItemAlocarInstrutor);

        jMenuItemEfetuarMatricula.setText("Efetuar Matricula");
        jMenuOperacoes.add(jMenuItemEfetuarMatricula);

        jMenuBar1.add(jMenuOperacoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCursoActionPerformed
         new Gui_Curso().setVisible(true);
    }//GEN-LAST:event_jMenuItemCursoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoActionPerformed
        new Gui_Aluno().setVisible(true);
    }//GEN-LAST:event_jMenuItemAlunoActionPerformed

    private void jMenuItemInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInstrutorActionPerformed
        new Gui_Instrutor().setVisible(true);
    }//GEN-LAST:event_jMenuItemInstrutorActionPerformed

    private void jMenuItemTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTurmaActionPerformed
        new Gui_Turma().setVisible(true);
    }//GEN-LAST:event_jMenuItemTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItemAlocarInstrutor;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemCurso;
    private javax.swing.JMenuItem jMenuItemEfetuarMatricula;
    private javax.swing.JMenuItem jMenuItemInstrutor;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTurma;
    private javax.swing.JMenu jMenuOperacoes;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
