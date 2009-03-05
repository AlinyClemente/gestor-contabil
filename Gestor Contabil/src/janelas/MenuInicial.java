package janelas;

import boleto.org.jboleto.JBoleto;
import boleto.org.jboleto.JBoletoBean;
import boleto.org.jboleto.bancos.Itau;
import boleto.org.jboleto.control.PDFGenerator;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MenuInicial extends javax.swing.JFrame {

    private JDesktopPane desktop;

    public MenuInicial() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MenuInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MenuInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        // seta o contentPane do JFrame, assim teremos suporte a JInternalFrame.
        desktop = new JDesktopPane();
        desktop.setBackground(Color.LIGHT_GRAY);
        this.setContentPane(desktop);
        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        mitemEmpresa = new javax.swing.JMenuItem();
        mitemBackup = new javax.swing.JMenuItem();
        mitemSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        mitemClientes = new javax.swing.JMenuItem();
        mitemFornecedores = new javax.swing.JMenuItem();
        mitemProdutos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        mitemContasCorrentes = new javax.swing.JMenuItem();
        mitemBancos = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        mitemLancamentoContasReceber = new javax.swing.JMenuItem();
        mitemLancamentoContasPagar = new javax.swing.JMenuItem();
        separatorEditar = new javax.swing.JSeparator();
        mitemPlanoContas = new javax.swing.JMenuItem();
        menuRecibosBoletos = new javax.swing.JMenu();
        mitemBaixaContasReceber = new javax.swing.JMenuItem();
        mitemBaixaContasPagar = new javax.swing.JMenuItem();
        mitemImprimirRecBol = new javax.swing.JMenuItem();
        mitemRetornoCobranca = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();
        mitemAjuda = new javax.swing.JMenuItem();
        mitemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicial - Gestor Contábil");

        menuArquivo.setText("Arquivo");
        menuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoActionPerformed(evt);
            }
        });

        mitemEmpresa.setText("Empresa");
        mitemEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemEmpresaActionPerformed(evt);
            }
        });
        menuArquivo.add(mitemEmpresa);

        mitemBackup.setText("Backup");
        menuArquivo.add(mitemBackup);

        mitemSair.setText("Sair");
        mitemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(mitemSair);

        jMenuBar1.add(menuArquivo);

        menuCadastro.setText("Cadastro");

        mitemClientes.setText("Clientes");
        menuCadastro.add(mitemClientes);

        mitemFornecedores.setText("Fornecedores");
        menuCadastro.add(mitemFornecedores);

        mitemProdutos.setText("Produtos");
        menuCadastro.add(mitemProdutos);
        menuCadastro.add(jSeparator1);

        mitemContasCorrentes.setText("Contas Correntes");
        menuCadastro.add(mitemContasCorrentes);

        mitemBancos.setText("Bancos");
        menuCadastro.add(mitemBancos);

        jMenuBar1.add(menuCadastro);

        menuEditar.setText("Editar");

        mitemLancamentoContasReceber.setText("Lançamento de contas a receber");
        menuEditar.add(mitemLancamentoContasReceber);

        mitemLancamentoContasPagar.setText("Lançamento de contas a pagar");
        menuEditar.add(mitemLancamentoContasPagar);
        menuEditar.add(separatorEditar);

        mitemPlanoContas.setText("Plano de Contas");
        menuEditar.add(mitemPlanoContas);

        jMenuBar1.add(menuEditar);

        menuRecibosBoletos.setText("Recibos/Boletos");

        mitemBaixaContasReceber.setText("Baixa de contas a receber");
        menuRecibosBoletos.add(mitemBaixaContasReceber);

        mitemBaixaContasPagar.setText("Baixa de contas a pagar");
        menuRecibosBoletos.add(mitemBaixaContasPagar);

        mitemImprimirRecBol.setText("Imprimir Recibos/Boletos");
        menuRecibosBoletos.add(mitemImprimirRecBol);

        mitemRetornoCobranca.setText("Retorno Cobrança");
        menuRecibosBoletos.add(mitemRetornoCobranca);

        jMenuBar1.add(menuRecibosBoletos);

        menuRelatorios.setText("Relatórios");
        jMenuBar1.add(menuRelatorios);

        menuAjuda.setText("Ajuda");
        menuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaActionPerformed(evt);
            }
        });

        mitemAjuda.setText("Ajuda");
        menuAjuda.add(mitemAjuda);

        mitemSobre.setText("Sobre");
        mitemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(mitemSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitemEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemEmpresaActionPerformed

        JBoletoBean jbean = new JBoletoBean();
        jbean.setDataDocumento("08/08/2009");
        jbean.setDataProcessamento("01/08/2009");
        jbean.setCedente("Grupo Analisi");
        jbean.setCarteira("175");
        jbean.setNomeSacado("Fábio Souza");
        jbean.setEnderecoSacado("Rua Francisco Xerez 80 Apt 502");
        jbean.setBairroSacado("Cocó");
        jbean.setCidadeSacado("Fortaleza");
        jbean.setUfSacado("CE");
        jbean.setCepSacado("22753-212");
        jbean.setCpfSacado("09876634567");
        jbean.setDataVencimento("05/06/2008");
        jbean.setInstrucao1("Após o vencimento cobrar 2% de juros.");
        jbean.setInstrucao2("Após o vencimento cobrar R$ 0,50 centavos de mora por dia.");
        jbean.setAgencia("2971");
        jbean.setContaCorrente("08690");
        jbean.setDvContaCorrente("1");
        jbean.setNossoNumero("123456", 8);
        jbean.setValorBoleto("580.45");
        Vector descr = new Vector();
        descr.add("gfdg");
        jbean.setDescricoes(descr);
        PDFGenerator pdf = new PDFGenerator(jbean, JBoleto.BANCO_DO_BRASIL);
        pdf.addBoleto(jbean, new Itau(jbean));
        JBoleto jbol = new JBoleto(pdf, jbean, JBoleto.BANCO_DO_BRASIL);
        jbol.closeBoleto("c:/caixa.pdf");
        try {
            File arq = new File("c:/caixa.pdf");
            Desktop desk = Desktop.getDesktop();
            desk.open(arq);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_mitemEmpresaActionPerformed

    private void menuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuArquivoActionPerformed

    private void mitemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemSobreActionPerformed
        FrameSobre s = new FrameSobre();
        desktop.add(s);
        s.setModal(true);
        s.setVisible(true);
    }//GEN-LAST:event_mitemSobreActionPerformed

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
        
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void mitemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mitemSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuRecibosBoletos;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenuItem mitemAjuda;
    private javax.swing.JMenuItem mitemBackup;
    private javax.swing.JMenuItem mitemBaixaContasPagar;
    private javax.swing.JMenuItem mitemBaixaContasReceber;
    private javax.swing.JMenuItem mitemBancos;
    private javax.swing.JMenuItem mitemClientes;
    private javax.swing.JMenuItem mitemContasCorrentes;
    private javax.swing.JMenuItem mitemEmpresa;
    private javax.swing.JMenuItem mitemFornecedores;
    private javax.swing.JMenuItem mitemImprimirRecBol;
    private javax.swing.JMenuItem mitemLancamentoContasPagar;
    private javax.swing.JMenuItem mitemLancamentoContasReceber;
    private javax.swing.JMenuItem mitemPlanoContas;
    private javax.swing.JMenuItem mitemProdutos;
    private javax.swing.JMenuItem mitemRetornoCobranca;
    private javax.swing.JMenuItem mitemSair;
    private javax.swing.JMenuItem mitemSobre;
    private javax.swing.JSeparator separatorEditar;
    // End of variables declaration//GEN-END:variables
}
