package ldavip.exemploormbasico.tela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import ldavip.exemploormbasico.util.Operacao;
import ldavip.ormbasico.dao.Dao;
import ldavip.ormbasico.query.Operador;
import ldavip.ormbasico.util.ConnectionFactory;

/**
 *
 * @author Luis Davi
 */
public class TelaCompras extends javax.swing.JInternalFrame {
    
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
        dialogFiltro = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        txtCodigoClienteFiltro = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        txtNomeClienteFiltro = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        comboStatusClienteFiltro = new javax.swing.JComboBox<>();
        jPanel28 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        txtCodigoProdutoFiltro = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        txtDescricaoProdutoFiltro = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecoUnitarioMinimoProdutoFiltro = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecoUnitarioMaximoProdutoFiltro = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        txtCategoriaProdutoFiltro = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        txtCodigoCompraFiltro = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidadeMinimaCompraFiltro = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtQuantidadeMaximaCompraFiltro = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtValorMinimoCompraFiltro = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtValorMaximoCompraFiltro = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDataInicialCompraFiltro = new javax.swing.JFormattedTextField();
        jPanel39 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtDataFinalCompraFiltro = new javax.swing.JFormattedTextField();
        jToolBar4 = new javax.swing.JToolBar();
        btnFiltrarConsulta = new javax.swing.JButton();
        btnCancelarFiltro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jToolBar3 = new javax.swing.JToolBar();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();

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

        dialogFiltro.setSize(new java.awt.Dimension(300, 200));

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setPreferredSize(new java.awt.Dimension(506, 280));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"), javax.swing.BorderFactory.createEtchedBorder()));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jPanel19.setLayout(new java.awt.BorderLayout());

        txtCodigoClienteFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtCodigoClienteFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteFiltroActionPerformed(evt);
            }
        });
        jPanel19.add(txtCodigoClienteFiltro, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        jPanel20.setLayout(new java.awt.BorderLayout());

        txtNomeClienteFiltro.setPreferredSize(new java.awt.Dimension(300, 24));
        txtNomeClienteFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteFiltroActionPerformed(evt);
            }
        });
        jPanel20.add(txtNomeClienteFiltro, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, -1));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));
        jPanel21.setLayout(new java.awt.BorderLayout());

        comboStatusClienteFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativo", "Não ativo" }));
        jPanel21.add(comboStatusClienteFiltro, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 170, -1));

        jPanel11.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 360, 190));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Produto"), javax.swing.BorderFactory.createEtchedBorder()));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jPanel22.setLayout(new java.awt.BorderLayout());

        txtCodigoProdutoFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtCodigoProdutoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoFiltroActionPerformed(evt);
            }
        });
        jPanel22.add(txtCodigoProdutoFiltro, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        jPanel23.setLayout(new java.awt.BorderLayout());

        txtDescricaoProdutoFiltro.setPreferredSize(new java.awt.Dimension(300, 24));
        txtDescricaoProdutoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProdutoFiltroActionPerformed(evt);
            }
        });
        jPanel23.add(txtDescricaoProdutoFiltro, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço Unitário"));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(java.awt.Color.white);
        jPanel25.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mínimo");
        jPanel25.add(jLabel3, java.awt.BorderLayout.WEST);

        txtPrecoUnitarioMinimoProdutoFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtPrecoUnitarioMinimoProdutoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoUnitarioMinimoProdutoFiltroActionPerformed(evt);
            }
        });
        jPanel25.add(txtPrecoUnitarioMinimoProdutoFiltro, java.awt.BorderLayout.CENTER);

        jPanel24.add(jPanel25, java.awt.BorderLayout.WEST);

        jPanel26.setBackground(java.awt.Color.white);
        jPanel26.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setText("Máximo");
        jPanel26.add(jLabel4, java.awt.BorderLayout.WEST);

        txtPrecoUnitarioMaximoProdutoFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtPrecoUnitarioMaximoProdutoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoUnitarioMaximoProdutoFiltroActionPerformed(evt);
            }
        });
        jPanel26.add(txtPrecoUnitarioMaximoProdutoFiltro, java.awt.BorderLayout.CENTER);

        jPanel24.add(jPanel26, java.awt.BorderLayout.EAST);

        jPanel28.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 310, -1));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));
        jPanel27.setLayout(new java.awt.BorderLayout());

        txtCategoriaProdutoFiltro.setPreferredSize(new java.awt.Dimension(300, 24));
        txtCategoriaProdutoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaProdutoFiltroActionPerformed(evt);
            }
        });
        jPanel27.add(txtCategoriaProdutoFiltro, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jPanel11.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 380, 350));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Compra"), javax.swing.BorderFactory.createEtchedBorder()));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jPanel30.setLayout(new java.awt.BorderLayout());

        txtCodigoCompraFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtCodigoCompraFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCompraFiltroActionPerformed(evt);
            }
        });
        jPanel30.add(txtCodigoCompraFiltro, java.awt.BorderLayout.CENTER);

        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade do produto"), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jPanel33.setLayout(new java.awt.BorderLayout());

        jPanel34.setBackground(java.awt.Color.white);
        jPanel34.setLayout(new java.awt.BorderLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mínimo");
        jPanel34.add(jLabel5, java.awt.BorderLayout.WEST);

        txtQuantidadeMinimaCompraFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtQuantidadeMinimaCompraFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeMinimaCompraFiltroActionPerformed(evt);
            }
        });
        jPanel34.add(txtQuantidadeMinimaCompraFiltro, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel34, java.awt.BorderLayout.WEST);

        jPanel35.setBackground(java.awt.Color.white);
        jPanel35.setLayout(new java.awt.BorderLayout());

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setText("Máximo");
        jPanel35.add(jLabel6, java.awt.BorderLayout.WEST);

        txtQuantidadeMaximaCompraFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtQuantidadeMaximaCompraFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeMaximaCompraFiltroActionPerformed(evt);
            }
        });
        jPanel35.add(txtQuantidadeMaximaCompraFiltro, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel35, java.awt.BorderLayout.EAST);

        jPanel29.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, -1));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Valor da compra"), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jPanel32.setBackground(java.awt.Color.white);
        jPanel32.setLayout(new java.awt.BorderLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mínimo");
        jPanel32.add(jLabel7, java.awt.BorderLayout.WEST);

        txtValorMinimoCompraFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtValorMinimoCompraFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorMinimoCompraFiltroActionPerformed(evt);
            }
        });
        jPanel32.add(txtValorMinimoCompraFiltro, java.awt.BorderLayout.CENTER);

        jPanel31.add(jPanel32, java.awt.BorderLayout.WEST);

        jPanel36.setBackground(java.awt.Color.white);
        jPanel36.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setText("Máximo");
        jPanel36.add(jLabel8, java.awt.BorderLayout.WEST);

        txtValorMaximoCompraFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtValorMaximoCompraFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorMaximoCompraFiltroActionPerformed(evt);
            }
        });
        jPanel36.add(txtValorMaximoCompraFiltro, java.awt.BorderLayout.CENTER);

        jPanel31.add(jPanel36, java.awt.BorderLayout.EAST);

        jPanel29.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 320, -1));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Período"), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jPanel37.setLayout(new java.awt.BorderLayout());

        jPanel38.setBackground(java.awt.Color.white);
        jPanel38.setLayout(new java.awt.BorderLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Inícial");
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel38.add(jLabel9, java.awt.BorderLayout.WEST);

        txtDataInicialCompraFiltro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtDataInicialCompraFiltro.setPreferredSize(new java.awt.Dimension(90, 28));
        jPanel38.add(txtDataInicialCompraFiltro, java.awt.BorderLayout.EAST);

        jPanel37.add(jPanel38, java.awt.BorderLayout.WEST);

        jPanel39.setBackground(java.awt.Color.white);
        jPanel39.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setText("Final");
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel39.add(jLabel10, java.awt.BorderLayout.WEST);

        txtDataFinalCompraFiltro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtDataFinalCompraFiltro.setPreferredSize(new java.awt.Dimension(90, 28));
        jPanel39.add(txtDataFinalCompraFiltro, java.awt.BorderLayout.EAST);

        jPanel37.add(jPanel39, java.awt.BorderLayout.EAST);

        jPanel29.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, -1));

        jPanel11.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 350));

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jToolBar4.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar4.setFloatable(false);
        jToolBar4.setRollover(true);
        jToolBar4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToolBar4.setMaximumSize(new java.awt.Dimension(10000000, 30));
        jToolBar4.setPreferredSize(new java.awt.Dimension(100, 30));

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
        jToolBar4.add(btnFiltrarConsulta);

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
        jToolBar4.add(btnCancelarFiltro);

        jPanel10.add(jToolBar4, java.awt.BorderLayout.SOUTH);

        dialogFiltro.getContentPane().add(jPanel10, java.awt.BorderLayout.CENTER);

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

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jToolBar3.setRollover(true);

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
        jToolBar3.add(btnNovo);

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
        jToolBar3.add(btnAlterar);

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
        jToolBar3.add(btnRemover);

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
        jToolBar3.add(btnFiltrar);

        jPanel1.add(jToolBar3, java.awt.BorderLayout.PAGE_START);

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

    private void btnFiltrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarConsultaActionPerformed
        filtrar();
    }//GEN-LAST:event_btnFiltrarConsultaActionPerformed

    private void btnCancelarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFiltroActionPerformed
        dialogFiltro.setVisible(false);
        limparDialogFiltro();
        dialogFiltro.dispose();
    }//GEN-LAST:event_btnCancelarFiltroActionPerformed

    private void txtCodigoClienteFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoClienteFiltroActionPerformed

    private void txtNomeClienteFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteFiltroActionPerformed

    private void txtCodigoProdutoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoFiltroActionPerformed
        
    }//GEN-LAST:event_txtCodigoProdutoFiltroActionPerformed

    private void txtDescricaoProdutoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoFiltroActionPerformed
        
    }//GEN-LAST:event_txtDescricaoProdutoFiltroActionPerformed

    private void txtPrecoUnitarioMinimoProdutoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoUnitarioMinimoProdutoFiltroActionPerformed
        
    }//GEN-LAST:event_txtPrecoUnitarioMinimoProdutoFiltroActionPerformed

    private void txtPrecoUnitarioMaximoProdutoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoUnitarioMaximoProdutoFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoUnitarioMaximoProdutoFiltroActionPerformed

    private void txtCategoriaProdutoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaProdutoFiltroActionPerformed
        btnFiltrarConsulta.transferFocus();
    }//GEN-LAST:event_txtCategoriaProdutoFiltroActionPerformed

    private void txtCodigoCompraFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCompraFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCompraFiltroActionPerformed

    private void txtQuantidadeMinimaCompraFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeMinimaCompraFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeMinimaCompraFiltroActionPerformed

    private void txtQuantidadeMaximaCompraFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeMaximaCompraFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeMaximaCompraFiltroActionPerformed

    private void txtValorMinimoCompraFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorMinimoCompraFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorMinimoCompraFiltroActionPerformed

    private void txtValorMaximoCompraFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorMaximoCompraFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorMaximoCompraFiltroActionPerformed

    private void inicializar() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dialogNovo.setBounds((int) (screenSize.getWidth() - 360) / 2, (int) (screenSize.getHeight() - 430) / 2, 360, 430);
        dialogFiltro.setBounds((int) (screenSize.getWidth() - 780) / 2, (int) (screenSize.getHeight() - 650) / 2, 780, 650);

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
    
    private void limparDialogFiltro() {
        txtCodigoCompraFiltro.setText("");
        
    }

    private void novo() {
        limparDialog();
        operacao = Operacao.INSERIR;
        dialogNovo.setTitle("Nova compra");
        dialogNovo.setVisible(true);
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

    private void alterar() {
        if (tabela.getSelectedRow() != -1) {
            Compra c = ((Tabela) tabela.getModel()).getValor(tabela.getSelectedRow());
            preencherDialog(c);
            operacao = Operacao.ALTERAR;
            dialogNovo.setTitle("Alterar compra");
            dialogNovo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione uma compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void remover() {
        if (tabela.getSelectedRow() != -1) {
            Compra c = ((Tabela) tabela.getModel()).getValor(tabela.getSelectedRow());
            
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
        } else {
            JOptionPane.showMessageDialog(tela, "Selecione uma compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void filtrar() {
        // compra
        int idCompra = 0;
        if (!txtCodigoCompraFiltro.getText().isEmpty()) {
            try {
                idCompra = Integer.parseInt(txtCodigoCompraFiltro.getText());
            } catch (NumberFormatException e) {
                txtCodigoCompraFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Código inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        Date dataInicialCompra = null;
        try {
            dataInicialCompra = new SimpleDateFormat("dd/MM/yyyy").parse(txtDataInicialCompraFiltro.getText());
        } catch (ParseException e) {
            if (!txtDataInicialCompraFiltro.getText().isEmpty()) {
                txtDataInicialCompraFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Data inicial inválida!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        Date dataFinalCompra = null;
        try {
            dataFinalCompra = new SimpleDateFormat("dd/MM/yyyy").parse(txtDataFinalCompraFiltro.getText());
        } catch (ParseException e) {
            if (!txtDataFinalCompraFiltro.getText().isEmpty()) {
                txtDataFinalCompraFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Data inicial inválida!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        int qtdeMinimaCompra = 0;
        if (!txtQuantidadeMinimaCompraFiltro.getText().isEmpty()) {
            try {
                qtdeMinimaCompra = Integer.parseInt(txtQuantidadeMinimaCompraFiltro.getText());
            } catch (NumberFormatException e) {
                txtQuantidadeMinimaCompraFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Quantidade mínima inválida!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        int qtdeMaximaCompra = 0;
        if (!txtQuantidadeMaximaCompraFiltro.getText().isEmpty()) {
            try {
                qtdeMaximaCompra = Integer.parseInt(txtQuantidadeMaximaCompraFiltro.getText());
            } catch (NumberFormatException e) {
                txtQuantidadeMaximaCompraFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Quantidade máxima inválida!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        double valorMinimoCompra = 0D;
        if (!txtValorMinimoCompraFiltro.getText().isEmpty()) {
            try {
                valorMinimoCompra = Double.parseDouble(txtValorMinimoCompraFiltro.getText());
            } catch (Exception e) {
                txtValorMinimoCompraFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Valor mínimo inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        double valorMaximoCompra = 0D;
        if (!txtValorMaximoCompraFiltro.getText().isEmpty()) {
            try {
                valorMaximoCompra = Double.parseDouble(txtValorMaximoCompraFiltro.getText());
            } catch (Exception e) {
                txtValorMaximoCompraFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Valor máximo inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // cliente
        int idCliente = 0;
        if (!txtCodigoClienteFiltro.getText().isEmpty()) {
            try {
                idCliente = Integer.parseInt(txtCodigoClienteFiltro.getText());
            } catch (NumberFormatException e) {
                txtCodigoClienteFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Código do cliente inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        String nomeCliente = txtNomeClienteFiltro.getText();

        int ativo = 0;
        if (comboStatusClienteFiltro.getSelectedIndex() > 0) {
            ativo = comboStatusClienteFiltro.getSelectedIndex();
        }
        
        // produto
        int idProduto = 0;
        if (!txtCodigoProdutoFiltro.getText().isEmpty()) {
            try {
                idProduto = Integer.parseInt(txtCodigoProdutoFiltro.getText());
            } catch (NumberFormatException e) {
                txtCodigoProdutoFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Código do produto inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        String descricaoProduto = txtDescricaoProdutoFiltro.getText();

        double precoMinimoProduto = 0D;
        if (!txtPrecoUnitarioMinimoProdutoFiltro.getText().isEmpty()) {
            try {
                precoMinimoProduto = Double.parseDouble(txtPrecoUnitarioMinimoProdutoFiltro.getText().replace(",", "."));
            } catch (NumberFormatException e) {
                txtPrecoUnitarioMinimoProdutoFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Preço mínimo do produto inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        double precoMaximoProduto = 0D;
        if (!txtPrecoUnitarioMaximoProdutoFiltro.getText().isEmpty()) {
            try {
                precoMaximoProduto = Double.parseDouble(txtPrecoUnitarioMaximoProdutoFiltro.getText().replace(",", "."));
            } catch (NumberFormatException e) {
                txtPrecoUnitarioMaximoProdutoFiltro.grabFocus();
                JOptionPane.showMessageDialog(tela, "Preço máximo do produto inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        String categoriaProduto = txtCategoriaProdutoFiltro.getText();

        try (Connection conexao = ConnectionFactory.getConnection()) {
            Dao dao = new CompraDao(conexao).buscaLista();

            // compra
            if (idCompra != 0) {
                dao.where("compra.id", Operador.IGUAL, idCompra);
            }
            
            if (dataInicialCompra != null) {
                dao.where("compra.dataCompra", Operador.MAIOR_OU_IGUAL_QUE, dataInicialCompra);
            }
            
            if (dataFinalCompra != null) {
                dao.where("compra.dataCompra", Operador.MENOR_OU_IGUAL_QUE, dataFinalCompra);
            }
            
            if (qtdeMinimaCompra != 0) {
                dao.where("compra.quantidade", Operador.MAIOR_OU_IGUAL_QUE, qtdeMinimaCompra);
            }
            
            if (qtdeMaximaCompra != 0) {
                dao.where("compra.quantidade", Operador.MENOR_OU_IGUAL_QUE, qtdeMaximaCompra);
            }
            
            if (valorMinimoCompra != 0) {
                dao.where("compra.valorTotal", Operador.MAIOR_OU_IGUAL_QUE, valorMinimoCompra);
            }
            
            if (valorMaximoCompra != 0) {
                dao.where("compra.valorTotal", Operador.MENOR_OU_IGUAL_QUE, valorMaximoCompra);
            }

            // cliente
            if (idCliente != 0) {
                dao.where("compra.cliente.id", Operador.IGUAL, idCliente);
            }
            
            if (!nomeCliente.isEmpty()) {
                dao.where("compra.cliente.nome", Operador.SIMILAR, nomeCliente);
            }

            if (ativo != 0) {
                ativo = ativo == 1 ? 1 : 0;
                dao.where("compra.cliente.ativo", Operador.IGUAL, ativo);
            }
            
            // produto
            if (idProduto != 0) {
                dao.where("compra.produto.id", Operador.IGUAL, idProduto);
            }

            if (!descricaoProduto.isEmpty()) {
                dao.where("compra.produto.descricao", Operador.SIMILAR, descricaoProduto);
            }

            if (precoMinimoProduto != 0D) {
                dao.where("compra.produto.precoUnitario", Operador.MAIOR_OU_IGUAL_QUE, precoMinimoProduto);
            }

            if (precoMaximoProduto != 0D) {
                dao.where("compra.produto.precoUnitario", Operador.MENOR_OU_IGUAL_QUE, precoMaximoProduto);
            }

            if (!categoriaProduto.isEmpty()) {
                dao.where("compra.produto.categoria.descricao", Operador.SIMILAR, categoriaProduto);
            }

            List<Compra> lista = dao.toList();
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

        private List<Compra> lista;

        public Tabela(List<Compra> lista) {
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
    private javax.swing.JButton btnCancelarFiltro;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnFiltrarConsulta;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboCliente;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JComboBox<String> comboStatusClienteFiltro;
    private javax.swing.JDialog dialogFiltro;
    private javax.swing.JDialog dialogNovo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JSpinner spinnerQuantidade;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCategoriaProdutoFiltro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoClienteFiltro;
    private javax.swing.JTextField txtCodigoCompraFiltro;
    private javax.swing.JTextField txtCodigoProdutoFiltro;
    private javax.swing.JFormattedTextField txtDataFinalCompraFiltro;
    private javax.swing.JFormattedTextField txtDataInicialCompraFiltro;
    private javax.swing.JTextField txtDescricaoProdutoFiltro;
    private javax.swing.JTextField txtNomeClienteFiltro;
    private javax.swing.JTextField txtPrecoUnitarioMaximoProdutoFiltro;
    private javax.swing.JTextField txtPrecoUnitarioMinimoProdutoFiltro;
    private javax.swing.JTextField txtQuantidadeMaximaCompraFiltro;
    private javax.swing.JTextField txtQuantidadeMinimaCompraFiltro;
    private javax.swing.JTextField txtValorMaximoCompraFiltro;
    private javax.swing.JTextField txtValorMinimoCompraFiltro;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
