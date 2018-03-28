package ldavip.exemploormbasico.tela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ldavip.exemploormbasico.dao.CategoriaDao;
import ldavip.exemploormbasico.model.Categoria;
import ldavip.exemploormbasico.util.Operacao;
import ldavip.exemploormbasico.util.TabelaBase;
import ldavip.ormbasico.dao.Dao;
import ldavip.ormbasico.query.Operador;
import ldavip.ormbasico.util.ConnectionFactory;

/**
 *
 * @author Luis Davi
 */
public class TelaCategorias extends javax.swing.JInternalFrame {
    
    private JFrame tela;
    private Operacao operacao;

    public TelaCategorias(JFrame tela) {
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
        setTitle("Categorias");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Categorias"), javax.swing.BorderFactory.createEtchedBorder()));
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dialogNovo.setVisible(false);
        limparDialog();
        dialogNovo.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        btnSalvar.transferFocus();
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novo();
    }//GEN-LAST:event_btnNovoActionPerformed

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

    private void txtCodigoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoFiltroActionPerformed
        txtDescricaoFiltro.transferFocus();
    }//GEN-LAST:event_txtCodigoFiltroActionPerformed

    private void txtDescricaoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoFiltroActionPerformed
        btnFiltrarConsulta.transferFocus();
    }//GEN-LAST:event_txtDescricaoFiltroActionPerformed

    private void btnFiltrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarConsultaActionPerformed
        filtrar();
    }//GEN-LAST:event_btnFiltrarConsultaActionPerformed

    private void btnCancelarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFiltroActionPerformed
        dialogFiltro.setVisible(false);
        limparDialogFiltro();
        dialogFiltro.dispose();
    }//GEN-LAST:event_btnCancelarFiltroActionPerformed

    private void inicializar() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dialogNovo.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 350) / 2, 360, 350);
        dialogFiltro.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 250) / 2, 360, 250);

        carregaCategorias();
    }

    private void preencherDialog(Categoria categoria) {
        txtCodigo.setText("" + categoria.getId());
        txtDescricao.setText(categoria.getDescricao());
    }

    private void limparDialog() {
        txtCodigo.setText("");
        txtDescricao.setText("");
    }
    
    private void limparDialogFiltro() {
        txtCodigo.setText("");
        txtDescricao.setText("");
    }
    
    private void novo() {
        limparDialog();
        operacao = Operacao.INSERIR;
        dialogNovo.setTitle("Nova Categoria");
        dialogNovo.setVisible(true);
    }

    private void salvar() {
        Categoria categoria = new Categoria();
        
        if (operacao == Operacao.ALTERAR) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            categoria.setId(codigo);
        }
        
        if (!txtDescricao.getText().isEmpty()) {
            categoria.setDescricao(txtDescricao.getText());
        } else {
            txtDescricao.grabFocus();
            JOptionPane.showMessageDialog(tela, "Informe a descrição do produto!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection conexao = ConnectionFactory.getConnection()) {
            CategoriaDao dao = new CategoriaDao(conexao);
            String msg;
            
            if (operacao == Operacao.ALTERAR) {
                dao.altera(categoria);
                msg = "Categoria alterada com sucesso!";
            } else {
                dao.insere(categoria);
                msg = "Nova categoria salva com sucesso!";
            }

            JOptionPane.showMessageDialog(tela, msg, "Informação", JOptionPane.INFORMATION_MESSAGE);
            
            dialogNovo.dispose();
            carregaCategorias();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterar() {
        if (tabela.getSelectedRow() != -1) {
            Categoria c = ((Tabela) tabela.getModel()).getValor(tabela.getSelectedRow());
            preencherDialog(c);
            operacao = Operacao.ALTERAR;
            dialogNovo.setTitle("Alterar Categoria");
            dialogNovo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione uma categoria!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void remover() {
        if (tabela.getSelectedRow() != -1) {
            Categoria c = ((Tabela) tabela.getModel()).getValor(tabela.getSelectedRow());
            int resposta = JOptionPane.showConfirmDialog(tela,
                    "Tem certeza que deseja remove o ítem selecionado?",
                    "Confirma remoção",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (resposta == JOptionPane.YES_OPTION) {
                try (Connection conexao = ConnectionFactory.getConnection()) {
                    CategoriaDao dao = new CategoriaDao(conexao);
                    dao.remove(c);

                    JOptionPane.showMessageDialog(tela, "Categoria removida com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);

                    carregaCategorias();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione uma categoria!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void carregaCategorias() {
        try (Connection conexao = ConnectionFactory.getConnection()) {
            // Carrega categorias
            CategoriaDao categoriaDao = new CategoriaDao(conexao);
            List<Categoria> categorias = categoriaDao.buscaLista().toList();
            // Preenche a tabela de categorias
            tabela.setModel(new Tabela(categorias));
            ((Tabela) tabela.getModel()).fireTableDataChanged();
            tabela.validate();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(tela, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
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

        try (Connection conexao = ConnectionFactory.getConnection()) {
            Dao dao = new CategoriaDao(conexao).buscaLista();

            if (id != 0) {
                dao.where("categoria.id", Operador.IGUAL, id);
            }

            if (!descricao.isEmpty()) {
                dao.where("categoria.descricao", Operador.SIMILAR, descricao);
            }

            List<Categoria> lista = dao.toList();
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

    class Tabela extends TabelaBase<Categoria> {

        public Tabela(List<Categoria> lista) {
            super(lista);
        }

        @Override
        public int getColumnCount() {
            return 2;
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

                default:
                    valor = "";
            }
            return valor;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Categoria item = lista.get(rowIndex);
            Object valor;
            switch (columnIndex) {
                case 0:
                    valor = item.getId();
                    break;

                case 1:
                    valor = item.getDescricao();
                    break;

                default:
                    valor = "";
            }
            return valor;
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
    private javax.swing.JDialog dialogFiltro;
    private javax.swing.JDialog dialogNovo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoFiltro;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDescricaoFiltro;
    // End of variables declaration//GEN-END:variables
}
