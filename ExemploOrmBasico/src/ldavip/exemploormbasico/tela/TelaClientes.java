package ldavip.exemploormbasico.tela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ldavip.exemploormbasico.dao.ClienteDao;
import ldavip.exemploormbasico.model.Cliente;
import ldavip.exemploormbasico.util.Operacao;
import ldavip.exemploormbasico.util.TabelaBase;
import ldavip.ormbasico.dao.Dao;
import ldavip.ormbasico.query.Operador;

/**
 *
 * @author Luis Davi
 */
public class TelaClientes extends javax.swing.JInternalFrame {
    
    private JFrame tela;
    private Operacao operacao;
    private ClienteDao dao;

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
        dialogFiltro = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtCodigoFiltro = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtNomeFiltro = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        comboStatusFiltro = new javax.swing.JComboBox<>();
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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        jPanel7.setLayout(new java.awt.BorderLayout());

        txtNomeFiltro.setPreferredSize(new java.awt.Dimension(300, 24));
        txtNomeFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFiltroActionPerformed(evt);
            }
        });
        jPanel7.add(txtNomeFiltro, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 73, 310, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));
        jPanel10.setLayout(new java.awt.BorderLayout());

        comboStatusFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativo", "Não ativo" }));
        jPanel10.add(comboStatusFiltro, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

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

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        btnSalvar.transferFocus();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCodigoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoFiltroActionPerformed
        txtNomeFiltro.transferFocus();
    }//GEN-LAST:event_txtCodigoFiltroActionPerformed

    private void btnFiltrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarConsultaActionPerformed
        filtrar();
    }//GEN-LAST:event_btnFiltrarConsultaActionPerformed

    private void btnCancelarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFiltroActionPerformed
        dialogFiltro.setVisible(false);
        limparDialogFiltro();
        dialogFiltro.dispose();
    }//GEN-LAST:event_btnCancelarFiltroActionPerformed

    private void txtNomeFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFiltroActionPerformed

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

    private void inicializar() {
        
        dao = new ClienteDao();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dialogNovo.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 350) / 2, 360, 350);
        dialogFiltro.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 350) / 2, 360, 350);

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

    private void limparDialogFiltro() {
        txtCodigoFiltro.setText("");
        txtNomeFiltro.setText("");
        comboStatusFiltro.setSelectedIndex(0);
    }
    
    private void novo() {
        limparDialog();
        operacao = Operacao.INSERIR;
        dialogNovo.setTitle("Novo Cliente");
        dialogNovo.setVisible(true);
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

        try {
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

    private void alterar() {
        if (tabela.getSelectedRow() != -1) {
            Cliente c = ((Tabela) tabela.getModel()).getValor(tabela.getSelectedRow());
            preencherDialog(c);
            operacao = Operacao.ALTERAR;
            dialogNovo.setTitle("Alterar Cliente");
            dialogNovo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione um cliente!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void remover() {
        if (tabela.getSelectedRow() != -1) {
            Cliente c = ((Tabela) tabela.getModel()).getValor(tabela.getSelectedRow());
            
            int resposta = JOptionPane.showConfirmDialog(tela,
                    "Tem certeza que deseja remove o ítem selecionado?",
                    "Confirma remoção",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    dao.remove(c);

                    JOptionPane.showMessageDialog(tela, "Cliente removido com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);

                    carregaClientes();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }   
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione um cliente!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void carregaClientes() {
        try {
            // Carrega clientes
            List<Cliente> clientes = dao.buscaLista().toList();
            // Preenche a tabela de clientes
            tabela.setModel(new Tabela(clientes));
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

        String nome = txtNomeFiltro.getText();
        
        int ativo = 0;
        if (comboStatusFiltro.getSelectedIndex() > 0) {
            ativo = comboStatusFiltro.getSelectedIndex();
        }

        try {
            dao.buscaLista();

            if (id != 0) {
                dao.where("cliente.id", Operador.IGUAL, id);
            }

            if (!nome.isEmpty()) {
                dao.where("cliente.nome", Operador.SIMILAR, nome);
            }

            if (ativo != 0) {
                ativo = ativo == 1 ? 1 : 0;
                dao.where("cliente.ativo", Operador.IGUAL, ativo);
            }
            
            List<Cliente> lista = dao.toList();
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

    class Tabela extends TabelaBase<Cliente> {

        public Tabela(List<Cliente> lista) {
            super(lista);
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
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JComboBox<String> comboStatusFiltro;
    private javax.swing.JDialog dialogFiltro;
    private javax.swing.JDialog dialogNovo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoFiltro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFiltro;
    // End of variables declaration//GEN-END:variables
}
