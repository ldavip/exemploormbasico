package ldavip.exemploormbasico.tela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import ldavip.exemploormbasico.dao.CategoriaDao;
import ldavip.exemploormbasico.dao.ProdutoDao;
import ldavip.exemploormbasico.model.Categoria;
import ldavip.exemploormbasico.model.Produto;
import ldavip.exemploormbasico.util.Operacao;
import ldavip.ormbasico.dao.Dao;
import ldavip.ormbasico.query.Operador;
import ldavip.ormbasico.util.ConnectionFactory;

/**
 *
 * @author Luis Davi
 */
public class TelaProdutos extends javax.swing.JInternalFrame {
    
    private JFrame tela;
    private Operacao operacao;

    public TelaProdutos(JFrame tela) {
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
        txtDescricao = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtPrecoUnitario = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        comboCategoria = new javax.swing.JComboBox();
        jToolBar2 = new javax.swing.JToolBar();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        dialogFiltro = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtCodigoFiltro = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        txtDescricaoFiltro = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPrecoUnitarioMinimoFiltro = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecoUnitarioMaximoFiltro = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        txtCategoriaFiltro = new javax.swing.JTextField();
        jToolBar3 = new javax.swing.JToolBar();
        btnFiltrarConsulta = new javax.swing.JButton();
        btnCancelarFiltro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();

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
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        jPanel5.setLayout(new java.awt.BorderLayout());

        txtDescricao.setPreferredSize(new java.awt.Dimension(300, 24));
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        jPanel5.add(txtDescricao, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 73, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço Unitário"));
        jPanel6.setLayout(new java.awt.BorderLayout());

        txtPrecoUnitario.setPreferredSize(new java.awt.Dimension(300, 24));
        txtPrecoUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoUnitarioActionPerformed(evt);
            }
        });
        jPanel6.add(txtPrecoUnitario, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 138, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));
        jPanel7.setLayout(new java.awt.BorderLayout());

        comboCategoria.setPreferredSize(new java.awt.Dimension(300, 26));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });
        jPanel7.add(comboCategoria, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 203, -1, -1));

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

        dialogFiltro.setSize(new java.awt.Dimension(300, 200));

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setPreferredSize(new java.awt.Dimension(506, 280));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jPanel12.setLayout(new java.awt.BorderLayout());

        txtCodigoFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtCodigoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoFiltroActionPerformed(evt);
            }
        });
        jPanel12.add(txtCodigoFiltro, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        jPanel13.setLayout(new java.awt.BorderLayout());

        txtDescricaoFiltro.setPreferredSize(new java.awt.Dimension(300, 24));
        txtDescricaoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoFiltroActionPerformed(evt);
            }
        });
        jPanel13.add(txtDescricaoFiltro, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 73, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço Unitário"));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(java.awt.Color.white);
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mínimo");
        jPanel10.add(jLabel1, java.awt.BorderLayout.WEST);

        txtPrecoUnitarioMinimoFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtPrecoUnitarioMinimoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoUnitarioMinimoFiltroActionPerformed(evt);
            }
        });
        jPanel10.add(txtPrecoUnitarioMinimoFiltro, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel10, java.awt.BorderLayout.WEST);

        jPanel16.setBackground(java.awt.Color.white);
        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setText("Máximo");
        jPanel16.add(jLabel2, java.awt.BorderLayout.WEST);

        txtPrecoUnitarioMaximoFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtPrecoUnitarioMaximoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoUnitarioMaximoFiltroActionPerformed(evt);
            }
        });
        jPanel16.add(txtPrecoUnitarioMaximoFiltro, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel16, java.awt.BorderLayout.EAST);

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 138, -1, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));
        jPanel15.setLayout(new java.awt.BorderLayout());

        txtCategoriaFiltro.setPreferredSize(new java.awt.Dimension(300, 24));
        txtCategoriaFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaFiltroActionPerformed(evt);
            }
        });
        jPanel15.add(txtCategoriaFiltro, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 203, -1, -1));

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jToolBar3.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);
        jToolBar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToolBar3.setMaximumSize(new java.awt.Dimension(10000000, 30));
        jToolBar3.setPreferredSize(new java.awt.Dimension(100, 30));

        btnFiltrarConsulta.setText("Filtrar");
        btnFiltrarConsulta.setFocusable(false);
        btnFiltrarConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFiltrarConsulta.setMaximumSize(new java.awt.Dimension(70, 30));
        btnFiltrarConsulta.setPreferredSize(new java.awt.Dimension(70, 30));
        btnFiltrarConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFiltrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarConsultaActionPerformed(evt);
            }
        });
        jToolBar3.add(btnFiltrarConsulta);

        btnCancelarFiltro.setText("Cancelar");
        btnCancelarFiltro.setFocusable(false);
        btnCancelarFiltro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarFiltro.setMaximumSize(new java.awt.Dimension(70, 30));
        btnCancelarFiltro.setPreferredSize(new java.awt.Dimension(70, 30));
        btnCancelarFiltro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFiltroActionPerformed(evt);
            }
        });
        jToolBar3.add(btnCancelarFiltro);

        jPanel9.add(jToolBar3, java.awt.BorderLayout.SOUTH);

        dialogFiltro.getContentPane().add(jPanel9, java.awt.BorderLayout.CENTER);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Produtos");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"), javax.swing.BorderFactory.createEtchedBorder()));
        jPanel2.setLayout(new java.awt.BorderLayout());

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);

        btnNovo.setIcon(new javax.swing.ImageIcon("/home/dev/Documents/projects/java/ExemploOrmBasico/resources/icon/16/add_16.png")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setFocusable(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNovo.setPreferredSize(new java.awt.Dimension(90, 40));
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovo);

        btnAlterar.setIcon(new javax.swing.ImageIcon("/home/dev/Documents/projects/java/ExemploOrmBasico/resources/icon/16/edit_16.png")); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setFocusable(false);
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAlterar.setMaximumSize(new java.awt.Dimension(70, 30));
        btnAlterar.setPreferredSize(new java.awt.Dimension(90, 40));
        btnAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterar);

        btnRemover.setIcon(new javax.swing.ImageIcon("/home/dev/Documents/projects/java/ExemploOrmBasico/resources/icon/16/remove_16.png")); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setFocusable(false);
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRemover.setPreferredSize(new java.awt.Dimension(90, 40));
        btnRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRemover);

        btnFiltrar.setIcon(new javax.swing.ImageIcon("/home/dev/Documents/projects/java/ExemploOrmBasico/resources/icon/16/search_16.png")); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.setFocusable(false);
        btnFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFiltrar.setMaximumSize(new java.awt.Dimension(70, 30));
        btnFiltrar.setPreferredSize(new java.awt.Dimension(90, 40));
        btnFiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFiltrar);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novo();
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
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        remover();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        limparDialogFiltro();
        dialogFiltro.setVisible(true);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnFiltrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarConsultaActionPerformed
        filtrar();
    }//GEN-LAST:event_btnFiltrarConsultaActionPerformed

    private void btnCancelarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFiltroActionPerformed
        dialogFiltro.setVisible(false);
        limparDialogFiltro();
        dialogFiltro.dispose();
    }//GEN-LAST:event_btnCancelarFiltroActionPerformed

    private void txtDescricaoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoFiltroActionPerformed
        txtPrecoUnitarioMinimoFiltro.transferFocus();
    }//GEN-LAST:event_txtDescricaoFiltroActionPerformed

    private void txtPrecoUnitarioMinimoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoUnitarioMinimoFiltroActionPerformed
        txtCategoriaFiltro.transferFocus();
    }//GEN-LAST:event_txtPrecoUnitarioMinimoFiltroActionPerformed

    private void txtCategoriaFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaFiltroActionPerformed
        btnFiltrarConsulta.transferFocus();
    }//GEN-LAST:event_txtCategoriaFiltroActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        txtPrecoUnitario.transferFocus();
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtPrecoUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoUnitarioActionPerformed
        comboCategoria.transferFocus();
    }//GEN-LAST:event_txtPrecoUnitarioActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        btnSalvar.transferFocus();
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void txtCodigoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoFiltroActionPerformed
        txtDescricaoFiltro.transferFocus();
    }//GEN-LAST:event_txtCodigoFiltroActionPerformed

    private void txtPrecoUnitarioMaximoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoUnitarioMaximoFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoUnitarioMaximoFiltroActionPerformed

    private void inicializar() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dialogNovo.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 350) / 2, 360, 350);
        dialogFiltro.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 350) / 2, 360, 350);

        try (Connection conexao = ConnectionFactory.getConnection()) {
            carregaProdutos(conexao);

            // Carrega categorias
            CategoriaDao categoriaDao = new CategoriaDao(conexao);
            List<Categoria> categorias = categoriaDao.buscaTodos();

            // preenche o combobox de categorias
            comboCategoria.removeAllItems();
            for (Categoria categoria : categorias) {
                comboCategoria.addItem(categoria);
            }
            comboCategoria.validate();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(tela, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void carregaProdutos(Connection conexao) {
        boolean nulo = false;

        try {
            if (conexao == null) {
                nulo = true;
                conexao = ConnectionFactory.getConnection();
            }
            // Carrega produtos
            ProdutoDao produtoDao = new ProdutoDao(conexao);
            List<Produto> lista = produtoDao.buscaTodos();
            // Preenche a tabela de produtos
            tabela.setModel(new Tabela(lista));
            ((Tabela) tabela.getModel()).fireTableDataChanged();
            tabela.validate();

            if (nulo) {
                conexao.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(tela, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void preencherDialog(Produto produto) {
        txtCodigo.setText("" + produto.getId());
        txtDescricao.setText(produto.getDescricao());
        txtPrecoUnitario.setText("" + produto.getPrecoUnitario());
        comboCategoria.setSelectedItem(produto.getCategoria());
    }

    private void limparDialog() {
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtPrecoUnitario.setText("");
        comboCategoria.setSelectedIndex(-1);
    }
    
    private void limparDialogFiltro() {
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtPrecoUnitario.setText("");
        txtCategoriaFiltro.setText("");
    }
    
    private void novo() {
        limparDialog();
        operacao = Operacao.INSERIR;
        dialogNovo.setTitle("Novo Produto");
        dialogNovo.setVisible(true);
        dialogNovo.setModal(true);
    }

    private void salvar() {
        Produto produto = new Produto();
        
        if (operacao == Operacao.ALTERAR) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            produto.setId(codigo);
        }
        
        if (!txtDescricao.getText().isEmpty()) {
            produto.setDescricao(txtDescricao.getText());
        } else {
            txtDescricao.grabFocus();
            JOptionPane.showMessageDialog(tela, "Informe a descrição do produto!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double precoUnitario = Double.parseDouble(txtPrecoUnitario.getText());
            produto.setPrecoUnitario(precoUnitario);
        } catch (NumberFormatException e) {
            txtPrecoUnitario.grabFocus();
            JOptionPane.showMessageDialog(tela, "Preço unitário inválido!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (comboCategoria.getSelectedIndex() != -1) {
            produto.setCategoria((Categoria) comboCategoria.getSelectedItem());
        } else {
            comboCategoria.grabFocus();
            JOptionPane.showMessageDialog(tela, "Selecione a categoria do produto!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection conexao = ConnectionFactory.getConnection()) {
            ProdutoDao dao = new ProdutoDao(conexao);
            
            String msg;
            if (operacao == Operacao.ALTERAR) {
                dao.altera(produto);
                msg = "Produto alterado com sucesso!";
            } else {
                dao.insere(produto);
                msg = "Novo produto salvo com sucesso!";
            }

            JOptionPane.showMessageDialog(tela, msg, "Informação", JOptionPane.INFORMATION_MESSAGE);
            dialogNovo.dispose();
            carregaProdutos(conexao);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterar() {
        if (tabela.getSelectedRow() != -1) {
            Produto p = ((Tabela) tabela.getModel()).getValor(tabela.getSelectedRow());
            preencherDialog(p);
            operacao = Operacao.ALTERAR;
            dialogNovo.setTitle("Alterar produto");
            dialogNovo.setVisible(true);
            dialogNovo.setModal(true);
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione um produto!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void remover() {
        if (tabela.getSelectedRow() != -1) {
            Produto p = ((Tabela) tabela.getModel()).getValor(tabela.getSelectedRow());
            int resposta = JOptionPane.showConfirmDialog(tela,
                    "Tem certeza que deseja remove o ítem selecionado?",
                    "Confirma remoção",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (resposta == JOptionPane.YES_OPTION) {
                try (Connection conexao = ConnectionFactory.getConnection()) {
                    ProdutoDao dao = new ProdutoDao(conexao);
                    dao.remove(p);

                    JOptionPane.showMessageDialog(tela, "Produto removido com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    carregaProdutos(conexao);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione um produto!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void filtrar() {
        int id = 0;
        if (!txtCodigoFiltro.getText().isEmpty()) {
            try {
                id = Integer.parseInt(txtCodigoFiltro.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(tela, "Código inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        String descricao = txtDescricaoFiltro.getText();
        
        double precoMinimo = 0D;
        if (!txtPrecoUnitarioMinimoFiltro.getText().isEmpty()) {
            try {
                precoMinimo = Double.parseDouble(txtPrecoUnitarioMinimoFiltro.getText().replace(",", "."));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(tela, "Preço mínimo inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        double precoMaximo = 0D;
        if (!txtPrecoUnitarioMaximoFiltro.getText().isEmpty()) {
            try {
                precoMaximo = Double.parseDouble(txtPrecoUnitarioMaximoFiltro.getText().replace(",", "."));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(tela, "Preço máximo inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        String categoria = txtCategoriaFiltro.getText();
        
        try (Connection conexao = ConnectionFactory.getConnection()) {
            Dao dao = new ProdutoDao(conexao).buscaLista();
            
            if (id != 0) {
                dao.where(Produto.class, "id", Operador.IGUAL, id);
            }

            if (!descricao.isEmpty()) {
                dao.where(Produto.class, "descricao", Operador.SIMILAR, descricao);
            }

            if (precoMinimo != 0D) {
                dao.where(Produto.class, "precoUnitario", Operador.MAIOR_OU_IGUAL_QUE, precoMinimo);
            }

            if (precoMaximo != 0D) {
                dao.where(Produto.class, "precoUnitario", Operador.MENOR_OU_IGUAL_QUE, precoMaximo);
            }

            if (!categoria.isEmpty()) {
                dao.where(Categoria.class, "descricao", Operador.SIMILAR, categoria);
            }
            
            List<Produto> lista = dao.toList();
            if (!lista.isEmpty()) {
                // Preenche a tabela
                tabela.setModel(new Tabela(lista));
                ((Tabela) tabela.getModel()).fireTableDataChanged();
                tabela.validate();
//                dialogFiltro.dispose();
            } else {
                JOptionPane.showMessageDialog(tela, "A consulta não retornou registros!", "Informação", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    class Tabela extends AbstractTableModel {

        private List<Produto> lista;

        public Tabela(List<Produto> lista) {
            this.lista = lista;
        }

        @Override
        public int getRowCount() {
            return lista.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public String getColumnName(int column) {
            String valor;
            switch (column) {
                case 0:
                    valor = "ID";
                    break;

                case 1:
                    valor = "Descrição";
                    break;

                case 2:
                    valor = "Preço Unitário";
                    break;

                case 3:
                    valor = "Categoria";
                    break;

                default:
                    valor = "";
            }
            return valor;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Produto p = lista.get(rowIndex);
            Object valor;
            switch (columnIndex) {
                case 0:
                    valor = p.getId();
                    break;

                case 1:
                    valor = p.getDescricao();
                    break;

                case 2:
                    valor = p.getPrecoUnitario();
                    break;

                case 3:
                    valor = p.getCategoria().getDescricao();
                    break;

                default:
                    valor = "";
            }
            return valor;
        }

        public Produto getValor(int linha) {
            return lista.get(linha);
        }

        public void setLista(List<Produto> lista) {
            this.lista = lista;
        }

        public List<Produto> getLista() {
            return lista;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarFiltro;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnFiltrarConsulta;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JDialog dialogFiltro;
    private javax.swing.JDialog dialogNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
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
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCategoriaFiltro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoFiltro;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDescricaoFiltro;
    private javax.swing.JTextField txtPrecoUnitario;
    private javax.swing.JTextField txtPrecoUnitarioMaximoFiltro;
    private javax.swing.JTextField txtPrecoUnitarioMinimoFiltro;
    // End of variables declaration//GEN-END:variables
}
