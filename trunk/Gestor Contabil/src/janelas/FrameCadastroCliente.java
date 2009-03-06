package janelas;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Táizel Girão
 */
public class FrameCadastroCliente extends ModalInternalFrame {

    /** Creates new form FrameCadastroCliente */
    public FrameCadastroCliente() {
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

        pnlDadosPessoais = new javax.swing.JPanel();
        lblNomeConjuge1 = new javax.swing.JLabel();
        lblCPF1 = new javax.swing.JLabel();
        lblRG1 = new javax.swing.JLabel();
        lblSexo1 = new javax.swing.JLabel();
        ftxtRG = new javax.swing.JFormattedTextField();
        ftxtCPF1 = new componentes.FormattedTextCPF();
        lblEstadoCivil1 = new javax.swing.JLabel();
        lblOrgaoEmissor1 = new javax.swing.JLabel();
        txtOrgaoEmissor1 = new javax.swing.JTextField();
        cmbEstadoCivil1 = new componentes.ComboBoxEstadoCivil();
        comboBoxSexo2 = new componentes.ComboBoxSexo();
        lblNomeMae1 = new javax.swing.JLabel();
        lblNomePai1 = new javax.swing.JLabel();
        txtNomeMae1 = new javax.swing.JTextField();
        txtNomePai2 = new javax.swing.JTextField();
        txtNomePai3 = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        lblDataNascimento1 = new javax.swing.JLabel();
        ftxtDataNascimento1 = new componentes.FormattedTextDataObrigatoria();
        lblDadosPessoais1 = new javax.swing.JLabel();
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

        setTitle("Cadastro de Cliente - Gestor Contábil");

        lblNomeConjuge1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblNomeConjuge1.setText("Nome da Conjuge:");

        lblCPF1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblCPF1.setText("CPF:");

        lblRG1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblRG1.setText("RG:");

        lblSexo1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblSexo1.setText("Sexo:"); // NOI18N

        try {
            MaskFormatter mask = new MaskFormatter("****************");
            mask.setValidCharacters(" 0123456789");
            ftxtRG.setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException p) {
        }

        lblEstadoCivil1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblEstadoCivil1.setText("Estado Civil:");

        lblOrgaoEmissor1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblOrgaoEmissor1.setText("Orgão Emissor:");

        lblNomeMae1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblNomeMae1.setText("Filiação (Nome da Mãe):");

        lblNomePai1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblNomePai1.setText("Filiação (Nome do Pai):");

        lblNome1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblNome1.setText("Nome:"); // NOI18N

        lblDataNascimento1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblDataNascimento1.setText("Data de Nascimento:"); // NOI18N

        lblDadosPessoais1.setFont(new java.awt.Font("Dialog", 1, 14));
        lblDadosPessoais1.setText("Dados Pessoais");

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lblNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lblDadosPessoais1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lblEstadoCivil1)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(lblNomeConjuge1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomePai3, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeMae1)
                                    .addComponent(lblNomePai1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeMae1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(txtNomePai2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCPF1)
                                    .addComponent(lblRG1)
                                    .addComponent(lblSexo1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftxtCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosPessoaisLayout.createSequentialGroup()
                                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOrgaoEmissor1)
                                            .addComponent(lblDataNascimento1))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ftxtDataNascimento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtOrgaoEmissor1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                                    .addComponent(cmbEstadoCivil1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );

        pnlDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbEstadoCivil1, ftxtDataNascimento1, txtOrgaoEmissor1});

        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDadosPessoais1)
                .addGap(18, 18, 18)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo1)
                            .addComponent(comboBoxSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRG1)
                            .addComponent(ftxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome1)
                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataNascimento1)
                            .addComponent(ftxtDataNascimento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrgaoEmissor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrgaoEmissor1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePai1)
                    .addComponent(txtNomePai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMae1)
                    .addComponent(txtNomeMae1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF1)
                    .addComponent(ftxtCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoCivil1)
                    .addComponent(cmbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeConjuge1)
                    .addComponent(txtNomePai3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        lblDadosContato.setFont(new java.awt.Font("Dialog", 1, 14));
        lblDadosContato.setText("Dados de Contato");

        lblTelefoneResidencial.setFont(new java.awt.Font("Dialog", 1, 11));
        lblTelefoneResidencial.setText("Telefone Residencial:");

        lblTelefoneComercial.setFont(new java.awt.Font("Dialog", 1, 11));
        lblTelefoneComercial.setText("Telefone Comercial:");

        lblTelefoneComercial1.setFont(new java.awt.Font("Dialog", 1, 11));
        lblTelefoneComercial1.setText("Telefone Celular:");

        lblFax.setFont(new java.awt.Font("Dialog", 1, 11));
        lblFax.setText("Fax");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 11));
        lblEmail.setText("E-mail:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDadosContato)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefoneResidencial)
                            .addComponent(lblTelefoneComercial)
                            .addComponent(lblTelefoneComercial1)
                            .addComponent(lblFax)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formattedTextEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ftxtTelefoneComercial, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(ftxtTelefoneResidencial, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(ftxtTelefoneCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(ftxtFax, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblDadosContato)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefoneResidencial)
                            .addComponent(ftxtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefoneComercial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefoneComercial1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(formattedTextEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.ComboBoxEstadoCivil cmbEstadoCivil1;
    private componentes.ComboBoxSexo comboBoxSexo2;
    private componentes.FormattedTextEmail formattedTextEmail1;
    private componentes.FormattedTextCPF ftxtCPF1;
    private componentes.FormattedTextDataObrigatoria ftxtDataNascimento1;
    private componentes.FormattedTextTelefone ftxtFax;
    private javax.swing.JFormattedTextField ftxtRG;
    private componentes.FormattedTextTelefone ftxtTelefoneCelular;
    private componentes.FormattedTextTelefone ftxtTelefoneComercial;
    private componentes.FormattedTextTelefone ftxtTelefoneResidencial;
    private javax.swing.JLabel lblCPF1;
    private javax.swing.JLabel lblDadosContato;
    private javax.swing.JLabel lblDadosPessoais1;
    private javax.swing.JLabel lblDataNascimento1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstadoCivil1;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNomeConjuge1;
    private javax.swing.JLabel lblNomeMae1;
    private javax.swing.JLabel lblNomePai1;
    private javax.swing.JLabel lblOrgaoEmissor1;
    private javax.swing.JLabel lblRG1;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblTelefoneComercial;
    private javax.swing.JLabel lblTelefoneComercial1;
    private javax.swing.JLabel lblTelefoneResidencial;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNomeMae1;
    private javax.swing.JTextField txtNomePai2;
    private javax.swing.JTextField txtNomePai3;
    private javax.swing.JTextField txtOrgaoEmissor1;
    // End of variables declaration//GEN-END:variables

}