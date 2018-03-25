package ldavip.exemploormbasico.tela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import ldavip.exemploormbasico.dao.ClienteDao;
import ldavip.exemploormbasico.dao.CompraDao;
import ldavip.exemploormbasico.dao.ProdutoDao;
import ldavip.exemploormbasico.model.Cliente;
import ldavip.exemploormbasico.model.Compra;
import ldavip.exemploormbasico.model.Produto;
import ldavip.ormbasico.util.ConnectionFactory;

/**
 *
 * @author Luis Davi
 */
public class TelaCompras extends javax.swing.JInternalFrame {

    private enum Operacao {
        INSERIR, ALTERAR, CONSULTA
    }
    
    private JFrame tela;
    private Operacao operacao;

    public TelaCompras(JFrame tela) {
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
        comboCliente = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        comboProduto = new javax.swing.JComboBox();
        labelPreco = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtValorTotal = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        spinnerQuantidade = new javax.swing.JSpinner();
        jToolBar2 = new javax.swing.JToolBar();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCompras = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(506, 360));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jPanel4.setLayout(new java.awt.BorderLayout());

        txtCodigo.setEnabled(false);
        txtCodigo.setPreferredSize(new java.awt.Dimension(100, 24));
        jPanel4.add(txtCodigo, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel5.setLayout(new java.awt.BorderLayout());

        comboCliente.setPreferredSize(new java.awt.Dimension(300, 26));
        jPanel5.add(comboCliente, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 73, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));
        jPanel6.setLayout(new java.awt.BorderLayout());

        comboProduto.setPreferredSize(new java.awt.Dimension(300, 26));
        comboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoActionPerformed(evt);
            }
        });
        jPanel6.add(comboProduto, java.awt.BorderLayout.CENTER);

        labelPreco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPreco.setText("Preço");
        labelPreco.setMaximumSize(new java.awt.Dimension(70, 30));
        labelPreco.setMinimumSize(new java.awt.Dimension(70, 30));
        labelPreco.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel6.add(labelPreco, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 138, 310, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Total"));
        jPanel7.setLayout(new java.awt.BorderLayout());

        txtValorTotal.setEnabled(false);
        jPanel7.add(txtValorTotal, java.awt.BorderLayout.PAGE_START);

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 310, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));
        jPanel9.setLayout(new java.awt.BorderLayout());

        spinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinnerQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerQuantidadeStateChanged(evt);
            }
        });
        jPanel9.add(spinnerQuantidade, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, -1));

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
        setTitle("Compras");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Compras"), javax.swing.BorderFactory.createEtchedBorder()));
        jPanel2.setLayout(new java.awt.BorderLayout());

        tabelaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaCompras);

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
        dialogNovo.setTitle("Novo produto");
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
        if (tabelaCompras.getSelectedRow() != -1) {
            Compra c = ((TabelaCompras) tabelaCompras.getModel()).getValor(tabelaCompras.getSelectedRow());
            alterar(c);
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione uma compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (tabelaCompras.getSelectedRow() != -1) {
            Compra c = ((TabelaCompras) tabelaCompras.getModel()).getValor(tabelaCompras.getSelectedRow());
            remove(c);
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione uma compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void spinnerQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerQuantidadeStateChanged
        if (comboProduto.getSelectedIndex() != -1) {
            Produto p = (Produto) comboProduto.getSelectedItem();
            labelPreco.setText("R$ " + p.getPrecoUnitario());

            int qtde = (int) spinnerQuantidade.getValue();
            double total = p.getPrecoUnitario() * qtde;
            txtValorTotal.setText("" + total);
        }
    }//GEN-LAST:event_spinnerQuantidadeStateChanged

    private void comboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoActionPerformed
        if (comboProduto.getSelectedIndex() != -1) {
            Produto p = (Produto) comboProduto.getSelectedItem();
            labelPreco.setText("R$ " + p.getPrecoUnitario());

            int qtde = (int) spinnerQuantidade.getValue();
            double total = p.getPrecoUnitario() * qtde;
            txtValorTotal.setText("" + total);
        } else {
            txtValorTotal.setText("");
        }
    }//GEN-LAST:event_comboProdutoActionPerformed

    private void inicializar() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dialogNovo.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 430) / 2, 360, 430);

        try (Connection conexao = ConnectionFactory.getConnection()) {
            carregaCompras(conexao);
            carregaClientes(conexao);
            carregaProdutos(conexao);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(tela, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void carregaClientes(final Connection conexao) throws Exception {
        // Carrega clientes
        ClienteDao clienteDao = new ClienteDao(conexao);
        List<Cliente> clientes = clienteDao.buscaTodos();
        
        // preenche o combobox de clientes
        comboCliente.removeAllItems();
        for (Cliente cliente : clientes) {
            comboCliente.addItem(cliente);
        }
        comboCliente.validate();
    }
    
    private void carregaProdutos(Connection conexao) throws Exception {
        // Carrega produtos
        ProdutoDao dao = new ProdutoDao(conexao);
        List<Produto> produtos = dao.buscaTodos();

        // preenche o combobox de produtos
        comboProduto.removeAllItems();
        for (Produto produto : produtos) {
            comboProduto.addItem(produto);
        }
        comboProduto.validate();
    }
    
    private void carregaCompras(Connection conexao) {
        boolean nulo = false;
        try {
            if (conexao == null) {
                nulo = true;
                conexao = ConnectionFactory.getConnection();
            }
            // Carrega compras
            CompraDao dao = new CompraDao(conexao);
            List<Compra> lista = dao.buscaTodos();
            // Preenche a tabela de compras
            tabelaCompras.setModel(new TabelaCompras(lista));
            ((TabelaCompras) tabelaCompras.getModel()).fireTableDataChanged();
            tabelaCompras.validate();
            
            if (nulo) {
                conexao.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(tela, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void preencherDialog(Compra compra) {
        txtCodigo.setText("" + compra.getId());
        comboCliente.setSelectedItem(compra.getCliente());
        comboProduto.setSelectedItem(compra.getProduto());
        spinnerQuantidade.setValue(compra.getQuantidade());
        txtValorTotal.setText("" + compra.getValorTotal());
        labelPreco.setText("R$ " + compra.getProduto().getPrecoUnitario());
    }

    private void limparDialog() {
        txtCodigo.setText("");
        comboCliente.setSelectedIndex(-1);
        comboProduto.setSelectedIndex(-1);
        spinnerQuantidade.setValue(1);
        txtValorTotal.setText("");
        labelPreco.setText("");
    }

    private void salvar() {
        Compra compra = new Compra();
        
        if (operacao == Operacao.ALTERAR) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            compra.setId(codigo);
        }
        
        if (comboCliente.getSelectedIndex() != -1) {
            compra.setCliente((Cliente) comboCliente.getSelectedItem());
        } else {
            comboCliente.grabFocus();
            JOptionPane.showMessageDialog(tela, "Selecione o cliente!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (comboProduto.getSelectedIndex() != -1) {
            compra.setProduto((Produto) comboProduto.getSelectedItem());
        } else {
            comboProduto.grabFocus();
            JOptionPane.showMessageDialog(tela, "Selecione o produto!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            compra.setQuantidade((int) spinnerQuantidade.getValue());
        } catch (Exception e) {
            spinnerQuantidade.grabFocus();
            JOptionPane.showMessageDialog(tela, "Quantidade inválida!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            double valorTotal = Double.parseDouble(txtValorTotal.getText());
            compra.setValorTotal(valorTotal);
        } catch (NumberFormatException e) {
            txtValorTotal.grabFocus();
            JOptionPane.showMessageDialog(tela, "Valor total inválido!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }


        try (Connection conexao = ConnectionFactory.getConnection()) {
            CompraDao dao = new CompraDao(conexao);
            
            String msg;
            if (operacao == Operacao.ALTERAR) {
                dao.altera(compra);
                msg = "Compra alterada com sucesso!";
            } else {
                dao.insere(compra);
                msg = "Nova compra salva com sucesso!";
            }

            JOptionPane.showMessageDialog(tela, msg, "Informação", JOptionPane.INFORMATION_MESSAGE);
            dialogNovo.dispose();
            carregaCompras(conexao);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterar(Compra c) {
        preencherDialog(c);
        operacao = Operacao.ALTERAR;
        dialogNovo.setTitle("Alterar compra");
        dialogNovo.setVisible(true);
    }
    
    private void remove(Compra c) {
        int resposta = JOptionPane.showConfirmDialog(tela,
                "Tem certeza que deseja remove o ítem selecionado?",
                "Confirma remoção",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION) {
            try (Connection conexao = ConnectionFactory.getConnection()) {
                CompraDao dao = new CompraDao(conexao);
                dao.remove(c);

                JOptionPane.showMessageDialog(tela, "Compra removida com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                carregaCompras(conexao);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    class TabelaCompras extends AbstractTableModel {

        private List<Compra> lista;

        public TabelaCompras(List<Compra> lista) {
            this.lista = lista;
        }

        @Override
        public int getRowCount() {
            return lista.size();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public String getColumnName(int column) {
            String valor;
            switch (column) {
                case 0:
                    valor = "ID";
                    break;

                case 1:
                    valor = "Cliente";
                    break;

                case 2:
                    valor = "Produto";
                    break;

                case 3:
                    valor = "Quantidade";
                    break;

                case 4:
                    valor = "Valor Total";
                    break;

                default:
                    valor = "";
            }
            return valor;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Compra c = lista.get(rowIndex);
            Object valor;
            switch (columnIndex) {
                case 0:
                    valor = c.getId();
                    break;

                case 1:
                    valor = c.getCliente().getNome();
                    break;

                case 2:
                    valor = c.getProduto().getDescricao();
                    break;

                case 3:
                    valor = c.getQuantidade();
                    break;

                case 4:
                    valor = c.getValorTotal();
                    break;

                default:
                    valor = "";
            }
            return valor;
        }

        public Compra getValor(int linha) {
            return lista.get(linha);
        }

        public void setLista(List<Compra> lista) {
            this.lista = lista;
        }

        public List<Compra> getLista() {
            return lista;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboCliente;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JDialog dialogNovo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JSpinner spinnerQuantidade;
    private javax.swing.JTable tabelaCompras;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
