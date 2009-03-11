package janelas;

import componentes.FormattedTextCNPJ;
import componentes.FormattedTextCPF;
/**
 *
 * @author Táizel Girão
 */
public class FrameCadastroFornecedor extends ModalInternalFrame {

    /** Creates new form FrameCadastroFornecedor */
    public FrameCadastroFornecedor() {
        initComponents();
        setModal(true);
        

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipo = new javax.swing.ButtonGroup();
        rdbFisica = new javax.swing.JRadioButton();
        rdbJurifica = new javax.swing.JRadioButton();
        lblClassificacao = new javax.swing.JLabel();
        ftxtRegistro = new javax.swing.JFormattedTextField();
        lblRegistro = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JTextField();
        lblInscricaoEstadual = new javax.swing.JLabel();
        lblRazaoSocial = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        lblNomeFantasia = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        ftxtCep = new componentes.FormattedTextCEP();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblDadosEmpresa = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        lblEstado1 = new javax.swing.JLabel();
        lblEnderecoEmpresa = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox();
        lblDadosContato = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        formattedTextTelefone1 = new componentes.FormattedTextTelefone();
        lblTelefone1 = new javax.swing.JLabel();
        formattedTextTelefone2 = new componentes.FormattedTextTelefone();
        lblTelefone2 = new javax.swing.JLabel();
        formattedTextEmail1 = new componentes.FormattedTextEmail();
        lblTelefone3 = new javax.swing.JLabel();
        formattedTextTelefone3 = new componentes.FormattedTextTelefone();
        cmbEstado = new javax.swing.JComboBox();
        lblHomepage = new javax.swing.JLabel();
        txtHomepage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        formattedTextNumero1 = new componentes.FormattedTextNumero();

        grpTipo.add(rdbFisica);
        grpTipo.add(rdbJurifica);

        setClosable(true);
        setTitle("Cadastro de Fornecedor - Gestor Contábil");

        rdbFisica.setText("Física");
        rdbFisica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbFisicaItemStateChanged(evt);
            }
        });

        rdbJurifica.setText("Jurídica");
        rdbJurifica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbJurificaItemStateChanged(evt);
            }
        });
        rdbJurifica.setSelected(true);

        lblClassificacao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblClassificacao.setText("Classificação:");

        ftxtRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validarRegistro(evt);
            }
        });

        lblRegistro.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblRegistro.setText("CNPJ ou CPF:");

        lblInscricaoEstadual.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblInscricaoEstadual.setText("Inscrição Estadual:");

        lblRazaoSocial.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblRazaoSocial.setText("Razão Social:");

        lblNomeFantasia.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNomeFantasia.setText("Nome Fantasia:");

        lblCEP.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblCEP.setText("CEP:");

        lblEndereco.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEndereco.setText("Endereço:");

        lblDadosEmpresa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDadosEmpresa.setText("Dados da Empresa");

        lblBairro.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblBairro.setText("Bairro:");

        lblEstado.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEstado.setText("Estado:");

        lblEstado1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEstado1.setText("Cidade:");

        lblEnderecoEmpresa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEnderecoEmpresa.setText("Endereço da Empresa");

        lblDadosContato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDadosContato.setText("Dados de Contato da Empresa");

        lblTelefone.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblTelefone.setText("Telefone:");

        lblTelefone1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblTelefone1.setText("Fax:");

        lblTelefone2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblTelefone2.setText("E-mail:");

        lblTelefone3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblTelefone3.setText("Celular:");

        lblHomepage.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblHomepage.setText("Homepage:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("Código da Empresa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(lblDadosEmpresa)
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(lblDadosContato)
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formattedTextNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHomepage)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblRazaoSocial)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblNomeFantasia))
                                            .addComponent(lblEnderecoEmpresa, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblBairro)
                                                    .addComponent(lblEstado1))
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cmbCidade, 0, 196, Short.MAX_VALUE)
                                                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                                            .addComponent(txtNomeFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblClassificacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbJurifica)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbFisica)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRegistro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblInscricaoEstadual)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEndereco)
                                            .addComponent(lblCEP))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(ftxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblEstado)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtHomepage))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(formattedTextTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblTelefone3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(formattedTextTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblTelefone1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(formattedTextTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblTelefone2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(formattedTextEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))))
                                .addGap(47, 47, 47))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblDadosEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbJurifica)
                    .addComponent(rdbFisica)
                    .addComponent(lblRegistro)
                    .addComponent(ftxtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInscricaoEstadual)
                    .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazaoSocial)
                    .addComponent(lblNomeFantasia)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblEnderecoEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lblCEP)
                    .addComponent(ftxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(lblEstado1)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDadosContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(formattedTextTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone3)
                    .addComponent(formattedTextTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone1)
                    .addComponent(formattedTextTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone2)
                    .addComponent(formattedTextEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHomepage)
                    .addComponent(txtHomepage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(formattedTextNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbJurificaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbJurificaItemStateChanged
        if(rdbJurifica.isSelected()){
            ftxtRegistro.setValue(null);
            FormattedTextCNPJ f = new FormattedTextCNPJ();
            ftxtRegistro.setFormatterFactory(f.getFormatterFactory());
        }
    }//GEN-LAST:event_rdbJurificaItemStateChanged

    private void rdbFisicaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbFisicaItemStateChanged
        if(rdbFisica.isSelected()){
            ftxtRegistro.setValue(null);
            FormattedTextCPF f = new FormattedTextCPF();
            ftxtRegistro.setFormatterFactory(f.getFormatterFactory());
        }
    }//GEN-LAST:event_rdbFisicaItemStateChanged

    private void validarRegistro(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validarRegistro
        if(rdbJurifica.isSelected()){
            FormattedTextCNPJ f = new FormattedTextCNPJ();
            f.setText(ftxtRegistro.getText());
            if(!f.validarCNPJ()){
                ftxtRegistro.setValue(null);
            }
            return;
        }
        if(rdbFisica.isSelected()){
            FormattedTextCPF f = new FormattedTextCPF();
            f.setText(ftxtRegistro.getText());
            if(!f.validarCPF()){
                ftxtRegistro.setValue(null);
            }
            return;
        }
}//GEN-LAST:event_validarRegistro


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbCidade;
    private javax.swing.JComboBox cmbEstado;
    private componentes.FormattedTextEmail formattedTextEmail1;
    private componentes.FormattedTextNumero formattedTextNumero1;
    private componentes.FormattedTextTelefone formattedTextTelefone1;
    private componentes.FormattedTextTelefone formattedTextTelefone2;
    private componentes.FormattedTextTelefone formattedTextTelefone3;
    private componentes.FormattedTextCEP ftxtCep;
    private javax.swing.JFormattedTextField ftxtRegistro;
    private javax.swing.ButtonGroup grpTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblClassificacao;
    private javax.swing.JLabel lblDadosContato;
    private javax.swing.JLabel lblDadosEmpresa;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEnderecoEmpresa;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblHomepage;
    private javax.swing.JLabel lblInscricaoEstadual;
    private javax.swing.JLabel lblNomeFantasia;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTelefone2;
    private javax.swing.JLabel lblTelefone3;
    private javax.swing.JRadioButton rdbFisica;
    private javax.swing.JRadioButton rdbJurifica;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtHomepage;
    private javax.swing.JTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoSocial;
    // End of variables declaration//GEN-END:variables

}