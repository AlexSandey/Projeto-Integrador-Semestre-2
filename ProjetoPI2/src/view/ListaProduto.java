/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import BancoDAO.ProdutoDAO;
import Model.Produto;

/**
 *
 * @author matheus.dcosta2
 */
public class ListaProduto extends javax.swing.JFrame {

    private TableRowSorter trsFiltro;

    /**
     * Creates new form telaProdutos
     */
    public ListaProduto() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        this.LoadTable();
                
        
    }

    public void LoadTable() {
        ArrayList<String[]> listaProdutos = ProdutoController.getProdutos();

        DefaultTableModel tblModProduto = new DefaultTableModel();
        tblModProduto.addColumn("Produto ID");
        tblModProduto.addColumn("Nome");
        tblModProduto.addColumn("Marca");
        tblModProduto.addColumn("Preco");
        tblProduto.setModel(tblModProduto);

        for (String[] c : listaProdutos) {
            tblModProduto.addRow(c);
        }

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(100);//Nome
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(300);//Deescrição
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(50);//Valor
    }

    public void Filtro() {
        int ColumTable = 1;
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtPesquisa.getText(), ColumTable));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        lblDigNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Produtos");
        setResizable(false);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos cadastrados"));

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto ID ", "Nome", "Marca", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProduto);

        btnNovo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyTyped(evt);
            }
        });

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Procurar-18dp.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Camada 2.png"))); // NOI18N

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        jbtnDeletar.setText("Deletar");
        jbtnDeletar.setMaximumSize(new java.awt.Dimension(58, 28));
        jbtnDeletar.setMinimumSize(new java.awt.Dimension(58, 28));
        jbtnDeletar.setPreferredSize(new java.awt.Dimension(58, 28));
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });

        lblDigNome.setText("Digite o nome do Produto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDigNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDigNome))
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        new CadProduto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (tblProduto.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)

            if (tblProduto.getSelectedRow() >= 0) {
                int op = JOptionPane.showConfirmDialog(null, "Deseja modificar o produto?", "", WIDTH);
                if (op == 0) {
                    int numeroLinha = tblProduto.getSelectedRow();
                    int salvarId = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
                    new ModificaProdutoView(salvarId).setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um produto!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos cadastrados");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        if (tblProduto.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)

            if (tblProduto.getSelectedRow() >= 0) {
                int op = JOptionPane.showConfirmDialog(null, "Deseja exibir o produto?", "", WIDTH);
                if (op == 0) {
                    int numeroLinha = tblProduto.getSelectedRow();
                    int salvarId = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());

                    new ExibirProdutoView(salvarId).setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos cadastrados");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnExibirActionPerformed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed

        if (tblProduto.getRowCount() > 0) {
            int numeroLinha = tblProduto.getSelectedRow(); //Salva o numero da linha do TABLE
            int idProduto = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString()); // Resga o id

            if (tblProduto.getSelectedRow() >= 0) {

                int op = JOptionPane.showConfirmDialog(null, "Deseja deletar o produto?", "", WIDTH);
                if (op == 0) {
                    ProdutoController.excluir(idProduto);
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Produto deletado com sucesso");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos cadastrados");
        }


    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void txtPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyTyped
        // TODO add your handling code here:
        txtPesquisa.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String nome = (txtPesquisa.getText());
                txtPesquisa.setText(nome);
                Filtro();
            }

        });

        trsFiltro = new TableRowSorter(tblProduto.getModel());
        tblProduto.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtPesquisaKeyTyped

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
            java.util.logging.Logger.getLogger(ListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JLabel lblDigNome;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
