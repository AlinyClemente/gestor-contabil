package janelas;

/**
 *
 * @author Andre Luis
 */
public class FrameCadastroCliente extends ModalInternalFrame {

    /** Creates new form NewFrameCadastroCliente */
    public FrameCadastroCliente() {
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

        lblDadosPessoais1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        lblSexo1 = new javax.swing.JLabel();
        comboBoxSexo2 = new componentes.ComboBoxSexo();
        lblDataNascimento1 = new javax.swing.JLabel();
        ftxtDataNascimento1 = new componentes.FormattedTextDataObrigatoria();
        lblRG = new javax.swing.JLabel();
        ftxtRG = new componentes.FormattedTextNumero();
        lblOrgaoEmissor1 = new javax.swing.JLabel();
        txtOrgaoEmissor1 = new javax.swing.JTextField();
        lblNomePai1 = new javax.swing.JLabel();
        txtNomePai2 = new javax.swing.JTextField();
        lblNomeMae1 = new javax.swing.JLabel();
        txtNomeMae1 = new javax.swing.JTextField();
        lblCPF1 = new javax.swing.JLabel();
        ftxtCPF = new componentes.FormattedTextCPF();
        lblEstadoCivil1 = new javax.swing.JLabel();
        cmbEstadoCivil1 = new componentes.ComboBoxEstadoCivil();
        lblCodigo = new javax.swing.JLabel();
        formattedTextNumero1 = new componentes.FormattedTextNumero();
        lblDadosContato = new javax.swing.JLabel();
        lblTelefoneResidencial = new javax.swing.JLabel();
        ftxtTelefoneResidencial = new componentes.FormattedTextTelefone();
        lblTelefoneComercial = new javax.swing.JLabel();
        ftxtTelefoneComercial = new componentes.FormattedTextTelefone();
        lblTelefoneComercial1 = new javax.swing.JLabel();
        ftxtTelefoneCelular = new componentes.FormattedTextTelefone();
        lblFax = new javax.swing.JLabel();
        ftxtFax = new componentes.FormattedTextTelefone();
        lblEmail = new javax.swing.JLabel();
        formattedTextEmail1 = new componentes.FormattedTextEmail();
        lblEndereco = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JFormattedTextField();
        txtComplemento = new javax.swing.JFormattedTextField();
        lblNumero1 = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JFormattedTextField();
        ftxtCEP = new componentes.FormattedTextCEP();
        lblCEP = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox();
        lblCEP1 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblNomeConjuge1 = new javax.swing.JLabel();
        txtNomePai3 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de Cliente - Gestor Contábil");

        lblDadosPessoais1.setFont(new java.awt.Font("Dialog", 1, 14));
        lblDadosPessoais1.setText("Dados Pessoais");

        lblNome1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblNome1.setText("Nome"); // NOI18N

        lblSexo1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblSexo1.setText("Sexo"); // NOI18N

        lblDataNascimento1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblDataNascimento1.setText("Data de Nascimento"); // NOI18N

        lblRG.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblRG.setText("RG");

        lblOrgaoEmissor1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblOrgaoEmissor1.setText("Orgão Emissor");

        lblNomePai1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblNomePai1.setText("Filiação (Nome do Pai)");

        lblNomeMae1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNomeMae1.setText("Filiação (Nome da Mãe)");

        lblCPF1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblCPF1.setText("CPF");

        lblEstadoCivil1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEstadoCivil1.setText("Estado Civil");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 11));
        lblCodigo.setText("Código do Clienete:");

        lblDadosContato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDadosContato.setText("Dados de Contato");

        lblTelefoneResidencial.setFont(new java.awt.Font("Dialog", 1, 11));
        lblTelefoneResidencial.setText("Telefone Residencial");

        lblTelefoneComercial.setFont(new java.awt.Font("Dialog", 1, 11));
        lblTelefoneComercial.setText("Telefone Comercial");

        lblTelefoneComercial1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblTelefoneComercial1.setText("Telefone Celular");

        lblFax.setFont(new java.awt.Font("Dialog", 1, 11));
        lblFax.setText("Fax");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 11));
        lblEmail.setText("E-mail");

        lblEndereco.setFont(new java.awt.Font("Dialog", 1, 14));
        lblEndereco.setText("Endereco");

        lblEnd.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEnd.setText("Endereço"); // NOI18N

        lblNumero.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNumero.setText("Número");

        lblNumero1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNumero1.setText("Complemento");

        lblBairro.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblBairro.setText("Bairro");

        lblCEP.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblCEP.setText("CEP");

        lblEstado.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEstado.setText("Estado");

        lblCEP1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblCEP1.setText("Cidade");

        lblNomeConjuge1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNomeConjuge1.setText("Nome da Conjuge:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeConjuge1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(formattedTextNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNomePai3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(lblDadosPessoais1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(lblDataNascimento1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(ftxtDataNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(txtOrgaoEmissor1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNomeMae1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomePai1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSexo1)
                                    .addComponent(comboBoxSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRG)
                                    .addComponent(ftxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCPF1)
                                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEstadoCivil1)
                                    .addComponent(lblOrgaoEmissor1)))
                            .addComponent(txtNomeMae1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePai2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(formattedTextEmail1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(ftxtFax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(lblDadosContato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTelefoneComercial1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefoneComercial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(ftxtTelefoneResidencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(ftxtTelefoneComercial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(ftxtTelefoneCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(lblTelefoneResidencial, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEndereco)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblEnd)
                                .addContainerGap(213, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(37, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(lblNumero1)
                                .addContainerGap(115, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(txtComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblNumero)
                                                    .addComponent(lblBairro)
                                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblEstado)
                                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblCEP1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE))
                                                    .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCEP)
                                                    .addComponent(ftxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(37, 37, 37))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(formattedTextNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDadosPessoais1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo1)
                            .addComponent(lblDataNascimento1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtDataNascimento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRG)
                            .addComponent(lblOrgaoEmissor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrgaoEmissor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomePai1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomePai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeMae1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeMae1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDadosContato)
                                    .addComponent(lblEndereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTelefoneResidencial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTelefoneComercial)
                                    .addComponent(lblNumero)
                                    .addComponent(lblNumero1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ftxtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTelefoneComercial1)
                                    .addComponent(lblCEP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ftxtTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formattedTextEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEstado)
                                    .addComponent(lblCEP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF1)
                    .addComponent(lblEstadoCivil1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeConjuge1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePai3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbEstado;
    private componentes.ComboBoxEstadoCivil cmbEstadoCivil1;
    private componentes.ComboBoxSexo comboBoxSexo2;
    private componentes.FormattedTextEmail formattedTextEmail1;
    private componentes.FormattedTextNumero formattedTextNumero1;
    private componentes.FormattedTextCEP ftxtCEP;
    private componentes.FormattedTextCPF ftxtCPF;
    private componentes.FormattedTextDataObrigatoria ftxtDataNascimento1;
    private componentes.FormattedTextTelefone ftxtFax;
    private componentes.FormattedTextNumero ftxtRG;
    private componentes.FormattedTextTelefone ftxtTelefoneCelular;
    private componentes.FormattedTextTelefone ftxtTelefoneComercial;
    private componentes.FormattedTextTelefone ftxtTelefoneResidencial;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCEP1;
    private javax.swing.JLabel lblCPF1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDadosContato;
    private javax.swing.JLabel lblDadosPessoais1;
    private javax.swing.JLabel lblDataNascimento1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoCivil1;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNomeConjuge1;
    private javax.swing.JLabel lblNomeMae1;
    private javax.swing.JLabel lblNomePai1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblOrgaoEmissor1;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblTelefoneComercial;
    private javax.swing.JLabel lblTelefoneComercial1;
    private javax.swing.JLabel lblTelefoneResidencial;
    private javax.swing.JFormattedTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtComplemento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNomeMae1;
    private javax.swing.JTextField txtNomePai2;
    private javax.swing.JTextField txtNomePai3;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextField txtOrgaoEmissor1;
    // End of variables declaration//GEN-END:variables

}