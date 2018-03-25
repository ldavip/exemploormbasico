package ldavip.exemploormbasico.tela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import ldavip.exemploormbasico.dao.ClienteDao;
import ldavip.exemploormbasico.model.Cliente;
import ldavip.ormbasico.util.ConnectionFactory;

/**
 *
 * @author Luis Davi
 */
public class TelaClientes extends javax.swing.JInternalFrame {

    private enum Operacao {
        INSERIR, ALTERAR, CONSULTA
    }
    
    private JFrame tela;
    private Operacao operacao;

    public TelaClientes(JFrame tela) {
        initComponents();

        this.tela = tela;
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogNovo = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        checkAtivo = new javax.swing.JCheckBox();
        jToolBar2 = new javax.swing.JToolBar();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(506, 280));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jPanel4.setLayout(new java.awt.BorderLayout());

        txtCodigo.setEnabled(false);
        txtCodigo.setPreferredSize(new java.awt.Dimension(100, 24));
        jPanel4.add(txtCodigo, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        jPanel5.setLayout(new java.awt.BorderLayout());

        txtNome.setPreferredSize(new java.awt.Dimension(300, 24));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel5.add(txtNome, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 73, 310, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));
        jPanel6.setLayout(new java.awt.BorderLayout());

        checkAtivo.setBackground(new java.awt.Color(255, 255, 255));
        checkAtivo.setText("Ativo");
        jPanel6.add(checkAtivo, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        jPanel8.add(jPanel3, java.awt.BorderLayout.CENTER);

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToolBar2.setMaximumSize(new java.awt.Dimension(10000000, 30));
        jToolBar2.setPreferredSize(new java.awt.Dimension(100, 30));

        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setMaximumSize(new java.awt.Dimension(70, 30));
        btnSalvar.setPreferredSize(new java.awt.Dimension(70, 30));
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnSalvar);

        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(70, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(70, 30));
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnCancelar);

        jPanel8.add(jToolBar2, java.awt.BorderLayout.SOUTH);

        dialogNovo.getContentPane().add(jPanel8, java.awt.BorderLayout.PAGE_START);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"), javax.swing.BorderFactory.createEtchedBorder()));
        jPanel2.setLayout(new java.awt.BorderLayout());

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaClientes);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);

        btnNovo.setText("Novo");
        btnNovo.setFocusable(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setMaximumSize(new java.awt.Dimension(70, 30));
        btnNovo.setPreferredSize(new java.awt.Dimension(70, 30));
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovo);

        btnAlterar.setText("Alterar");
        btnAlterar.setFocusable(false);
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setMaximumSize(new java.awt.Dimension(70, 30));
        btnAlterar.setPreferredSize(new java.awt.Dimension(70, 30));
        btnAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterar);

        btnRemover.setText("Remover");
        btnRemover.setFocusable(false);
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.setMaximumSize(new java.awt.Dimension(70, 30));
        btnRemover.setPreferredSize(new java.awt.Dimension(70, 30));
        btnRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRemover);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparDialog();
        operacao = Operacao.INSERIR;
        dialogNovo.setTitle("Novo Cliente");
        dialogNovo.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dialogNovo.setVisible(false);
        limparDialog();
        dialogNovo.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tabelaClientes.getSelectedRow() != -1) {
            Cliente c = ((TabelaCliente) tabelaClientes.getModel()).getValor(tabelaClientes.getSelectedRow());
            alterar(c);
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione um cliente!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (tabelaClientes.getSelectedRow() != -1) {
            Cliente c = ((TabelaCliente) tabelaClientes.getModel()).getValor(tabelaClientes.getSelectedRow());
            remove(c);
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione um cliente!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        btnSalvar.transferFocus();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void inicializar() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dialogNovo.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 350) / 2, 360, 350);

        carregaClientes();
    }

    private void preencherDialog(Cliente cliente) {
        txtCodigo.setText("" + cliente.getId());
        txtNome.setText(cliente.getNome());
        checkAtivo.setSelected(cliente.isAtivo());
    }

    private void limparDialog() {
        txtCodigo.setText("");
        txtNome.setText("");
        checkAtivo.setSelected(false);
    }

    private void salvar() {
        Cliente cliente = new Cliente();
        
        if (operacao == Operacao.ALTERAR) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            cliente.setId(codigo);
        }
        
        if (!txtNome.getText().isEmpty()) {
            cliente.setNome(txtNome.getText());
        } else {
            txtNome.grabFocus();
            JOptionPane.showMessageDialog(tela, "Informe o nome do cliente!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        cliente.setAtivo(checkAtivo.isSelected());

        try (Connection conexao = ConnectionFactory.getConnection()) {
            ClienteDao dao = new ClienteDao(conexao);
            String msg;
            
            if (operacao == Operacao.ALTERAR) {
                dao.altera(cliente);
                msg = "Cliente alterado com sucesso!";
            } else {
                dao.insere(cliente);
                msg = "Novo cliente salvo com sucesso!";
            }

            JOptionPane.showMessageDialog(tela, msg, "Informação", JOptionPane.INFORMATION_MESSAGE);
            
            dialogNovo.dispose();
            carregaClientes();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterar(Cliente cliente) {
        preencherDialog(cliente);
        operacao = Operacao.ALTERAR;
        dialogNovo.setTitle("Alterar Cliente");
        dialogNovo.setVisible(true);
    }

    private void remove(Cliente c) {
        int resposta = JOptionPane.showConfirmDialog(tela, 
                "Tem certeza que deseja remove o ítem selecionado?", 
                "Confirma remoção", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        
        if (resposta == JOptionPane.YES_OPTION) {
            try (Connection conexao = ConnectionFactory.getConnection()) {
                ClienteDao dao = new ClienteDao(conexao);
                dao.remove(c);

                JOptionPane.showMessageDialog(tela, "Cliente removido com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                
                carregaClientes();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void carregaClientes() {
        try (Connection conexao = ConnectionFactory.getConnection()) {
            // Carrega clientes
            ClienteDao dao = new ClienteDao(conexao);
            List<Cliente> clientes = dao.buscaTodos();
            // Preenche a tabela de clientes
            tabelaClientes.setModel(new TabelaCliente(clientes));
            ((TabelaCliente) tabelaClientes.getModel()).fireTableDataChanged();
            tabelaClientes.validate();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(tela, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    class TabelaCliente extends AbstractTableModel {

        private List<Cliente> lista;

        public TabelaCliente(List<Cliente> lista) {
            this.lista = lista;
        }

        @Override
        public int getRowCount() {
            return lista.size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 2) {
                return Boolean.class;
            }
            return String.class;
        }

        @Override
        public String getColumnName(int column) {
            String valor;
            switch (column) {
                case 0:
                    valor = "ID";
                    break;

                case 1:
                    valor = "Nome";
                    break;
                    
                case 2:
                    valor = "Ativo";
                    break;

                default:
                    valor = "";
            }
            return valor;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Cliente item = lista.get(rowIndex);
            Object valor;
            switch (columnIndex) {
                case 0:
                    valor = item.getId();
                    break;

                case 1:
                    valor = item.getNome();
                    break;

                case 2:
                    valor = item.isAtivo();
                    break;

                default:
                    valor = "";
            }
            return valor;
        }

        public Cliente getValor(int linha) {
            return lista.get(linha);
        }

        public void setLista(List<Cliente> lista) {
            this.lista = lista;
        }

        public List<Cliente> getLista() {
            return lista;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JDialog dialogNovo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
