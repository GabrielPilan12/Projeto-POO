/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.Curso;
import fatec.poo.model.Turma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas M
 */
public class Gui_Turma extends javax.swing.JFrame {

    /**
     * Creates new form Gui_Turma
     */
    public Gui_Turma() {
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

        lblCurso = new javax.swing.JLabel();
        lblSiglaTurma = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblQtdeVagas = new javax.swing.JLabel();
        lblDataInicio = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        lblDataTermino = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtSiglaTurma = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtQtdeVagas = new javax.swing.JTextField();
        ftxtDataInicio = new javax.swing.JFormattedTextField();
        ftxtDataTermino = new javax.swing.JFormattedTextField();
        cmbCurso = new javax.swing.JComboBox<>();
        cmbPeriodo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Turma");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCurso.setText("Curso");

        lblSiglaTurma.setText("Sigla da Turma");

        lblNome.setText("Nome");

        lblQtdeVagas.setText("Qtde Vagas");

        lblDataInicio.setText("Data inìcio");

        lblPeriodo.setText("Período");

        lblDataTermino.setText("Data término");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtSiglaTurma.setEnabled(false);

        txtNome.setEnabled(false);

        txtQtdeVagas.setEnabled(false);

        try {
            ftxtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataInicio.setEnabled(false);

        try {
            ftxtDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataTermino.setEnabled(false);

        cmbCurso.setEditable(true);

        cmbPeriodo.setEditable(true);
        cmbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manha", "Tarde", "Noite" }));
        cmbPeriodo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDataInicio)
                            .addComponent(lblCurso)
                            .addComponent(lblSiglaTurma)
                            .addComponent(lblNome)
                            .addComponent(lblQtdeVagas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ftxtDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(txtQtdeVagas))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDataTermino)
                                    .addComponent(lblPeriodo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftxtDataTermino)
                                    .addComponent(cmbPeriodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSiglaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSiglaTurma)
                    .addComponent(txtSiglaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeVagas)
                    .addComponent(lblPeriodo)
                    .addComponent(txtQtdeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataInicio)
                    .addComponent(lblDataTermino)
                    .addComponent(ftxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtSiglaTurma.setEnabled(true);
        
        conexao = new Conexao("BD1711015","BD1711015");    
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoTurma = new DaoTurma(conexao.conectar());
        daoCurso = new DaoCurso(conexao.conectar());
        
        ArrayList<String> array = daoCurso.listar();
            
        for(int i = 0;i<array.size(); i++ ){  
           cmbCurso.addItem(array.get(i).toString());   
        } 
    }//GEN-LAST:event_formWindowOpened

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        turma = null;
        turma = daoTurma.consultar(txtSiglaTurma.getText());
        
        if(turma == null){
            txtSiglaTurma.setEnabled(false);
            cmbCurso.setEnabled(false);
            txtNome.setEnabled(true);
            txtNome.requestFocus();

            txtQtdeVagas.setEnabled(true);
            cmbPeriodo.setEnabled(true);
            ftxtDataInicio.setEnabled(true);
            ftxtDataTermino.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
        else{
            txtNome.setText(turma.getNome());
            txtQtdeVagas.setText(Integer.toString(turma.getQtdeVagas()));
            cmbPeriodo.setSelectedItem(turma.getPeriodo());
            ftxtDataInicio.setText(turma.getDataInicio());
            ftxtDataTermino.setText(turma.getDataTermino());
            
            txtSiglaTurma.setEnabled(false);
            cmbCurso.setEnabled(false);
            
            txtNome.setEnabled(true);
            txtNome.requestFocus();
            txtQtdeVagas.setEnabled(true);
            cmbPeriodo.setEnabled(true);
            ftxtDataInicio.setEnabled(true);
            ftxtDataTermino.setEnabled(true);
            
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true); 
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        turma = new Turma (txtSiglaTurma.getText(),txtNome.getText());
        Curso curso = daoCurso.consultar(cmbCurso.getSelectedItem().toString());
        curso.addTurmas(turma);
        
        turma.setQtdeVagas(Integer.parseInt(txtQtdeVagas.getText()));
        turma.setPeriodo(cmbPeriodo.getSelectedItem().toString());
        turma.setDataInicio(ftxtDataInicio.getText().replace("/", ""));
        turma.setDataTermino(ftxtDataTermino.getText().replace("/", ""));
        
        daoTurma.inserir(turma);
        
        txtSiglaTurma.setText("");
        txtNome.setText("");
        txtQtdeVagas.setText("");
        cmbPeriodo.setSelectedItem("");
        ftxtDataInicio.setText("");
        ftxtDataTermino.setText("");
        
        btnInserir.setEnabled(false);
         
        txtSiglaTurma.setEnabled(true);
        cmbCurso.setEnabled(true);
        txtSiglaTurma.requestFocus();
        
        txtNome.setEnabled(false);
        txtQtdeVagas.setEnabled(false);
        cmbPeriodo.setEnabled(false);
        ftxtDataInicio.setEnabled(false);
        ftxtDataTermino.setEnabled(false);
        btnConsultar.setEnabled(true);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
            turma.setNome(txtNome.getText());
            turma.setQtdeVagas(Integer.parseInt(txtQtdeVagas.getText()));
            turma.setPeriodo(cmbPeriodo.getSelectedItem().toString());
            turma.setDataInicio(ftxtDataInicio.getText().replace("/", ""));
            turma.setDataTermino(ftxtDataTermino.getText().replace("/", ""));

            daoTurma.alterar(turma);
        }
        
        txtSiglaTurma.setText("");
        txtNome.setText("");
        txtQtdeVagas.setText("");
        cmbPeriodo.setSelectedItem("");  //Conferir se isso funciona
        ftxtDataInicio.setText("");
        ftxtDataTermino.setText("");
        
        txtSiglaTurma.setEnabled(true);
        cmbCurso.setEnabled(true);
        txtSiglaTurma.requestFocus();
        
        txtNome.setEnabled(false);
        txtQtdeVagas.setEnabled(false);
        cmbPeriodo.setEnabled(false);
        ftxtDataInicio.setEnabled(false);
        ftxtDataTermino.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0){
            daoTurma.excluir(turma);
        }
        
        txtSiglaTurma.setText("");
        txtNome.setText("");
        txtQtdeVagas.setText("");
        cmbPeriodo.setSelectedItem("");  //Conferir se isso funciona
        ftxtDataInicio.setText("");
        ftxtDataTermino.setText("");
        
        txtSiglaTurma.setEnabled(true);
        cmbCurso.setEnabled(true);
        txtSiglaTurma.requestFocus();
        
        txtNome.setEnabled(false);
        txtQtdeVagas.setEnabled(false);
        cmbPeriodo.setEnabled(false);
        ftxtDataInicio.setEnabled(false);
        ftxtDataTermino.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose(); 
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_Curso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Curso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Curso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Curso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Curso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbPeriodo;
    private javax.swing.JFormattedTextField ftxtDataInicio;
    private javax.swing.JFormattedTextField ftxtDataTermino;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblDataTermino;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblQtdeVagas;
    private javax.swing.JLabel lblSiglaTurma;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdeVagas;
    private javax.swing.JTextField txtSiglaTurma;
    // End of variables declaration//GEN-END:variables
    
    private DaoTurma daoTurma = null;
    private Turma turma=null;
    private Conexao conexao = null;
    private DaoCurso daoCurso = null;
}
