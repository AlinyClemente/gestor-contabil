/*
 * Esta biblioteca e um software livre, que pode ser redistribuido e/ou
 * modificado sob os termos da Licença Publica Geral Reduzida GNU,
 * conforme publicada pela Free Software Foundation, versao 2.1 da licenca.
 *
 * Esta biblioteca e distribuida na experanca de ser util aos seus usuarios,
 * porem NAO TEM NENHUMA GARANTIA, EXPLICITAS OU IMPLICITAS, COMERCIAIS OU
 * DE ATENDIMENTO A UMA DETERMINADA FINALIDADE.
 * Veja a Licenca Publica Geral Reduzida GNU para maiores detalhes.
 * A licenca se encontra no arquivo lgpl-br.txt
 */


package boleto.org.jboleto.bancos;

import boleto.org.jboleto.Banco;
import boleto.org.jboleto.JBoletoBean;

/**
 * Classe responsavel por gerar o boleto do Banco Real
 * @author Fabio Souza
 */
public class BancoReal implements Banco {
    
    JBoletoBean boleto;
    
    /**
     * Metdodo responsavel por resgatar o numero do banco, coloque no return o codigo do seu banco
     */
    public String getNumero() {
        return "356";
    }
    
    /**
     * Metodo responsavel por fazer o calculo do digitao da cobranca.
     */
    public String getDigitao() {
        String campo = boleto.getNossoNumero() + boleto.getAgencia() + boleto.getContaCorrente();
        
        return boleto.getDigitoCampo(campo,1).substring(campo.length());
    }
    
    /**
     * Classe construtura, recebe como parametro a classe jboletobean
     */
    public BancoReal(JBoletoBean boleto) {
        this.boleto = boleto;
    }
    
    /**
     * Metodo que monta o primeiro campo do codigo de barras
     * Este campo como os demais e feito a partir do da documentacao do banco
     * A documentacao do banco tem a estrutura de como monta cada campo, depois disso
     * é só concatenar os campos como no exemplo abaixo.
     */
    private String getCampo1() {
        String campo = getNumero() + String.valueOf(boleto.getMoeda()) + boleto.getAgencia() + boleto.getContaCorrente().substring(0,1);
        
        return boleto.getDigitoCampo(campo,2);
    }
    
    /**
     * ver documentacao do banco para saber qual a ordem deste campo
     */
    private String getCampo2() {
        String campo = boleto.getContaCorrente().substring(1) + getDigitao() + boleto.getNossoNumero().substring(0,3);
        
        return boleto.getDigitoCampo(campo,1);
    }
    
    /**
     * ver documentacao do banco para saber qual a ordem deste campo
     */
    private String getCampo3() {
        String campo = boleto.getNossoNumero().substring(3);
        
        return boleto.getDigitoCampo(campo,1);
    }
    
    /**
     * ver documentacao do banco para saber qual a ordem deste campo
     */
    private String getCampo4() {
        String campo = 	getNumero() + String.valueOf(boleto.getMoeda()) +
                boleto.getFatorVencimento() + boleto.getValorTitulo() + boleto.getAgencia() +
                boleto.getContaCorrente() + getDigitao() + boleto.getNossoNumero();
        
        return boleto.getDigitoCodigoBarras(campo);
    }
    
    /**
     * ver documentacao do banco para saber qual a ordem deste campo
     */
    private String getCampo5() {
        String campo = boleto.getFatorVencimento() + boleto.getValorTitulo();
        return campo;
    }
    
    /**
     * Metodo para monta o desenho do codigo de barras
     * A ordem destes campos tambem variam de banco para banco, entao e so olhar na documentacao do seu banco
     * qual a ordem correta
     */
    public String getCodigoBarras() {
        return getNumero() + String.valueOf(boleto.getMoeda()) + String.valueOf(getCampo4()) +
                boleto.getFatorVencimento() + boleto.getValorTitulo() + boleto.getAgencia() + boleto.getContaCorrente() + getDigitao() +
                boleto.getNossoNumero();
    }
    
    /**
     * Metodo que concatena os campo para formar a linha digitavel
     * E necessario tambem olhar a documentacao do banco para saber a ordem correta a linha digitavel
     */
    public String getLinhaDigitavel() {
        return 	getCampo1().substring(0,5) + "." + getCampo1().substring(5) + "  " +
                getCampo2().substring(0,5) + "." + getCampo2().substring(5) + "  " +
                getCampo3().substring(0,5) + "." + getCampo3().substring(5) + "  " +
                getCampo4() + "  " + getCampo5();
    }
    
    /**
     * Recupera a carteira no padrao especificado pelo banco
     * @author Gladyston Batista/Eac Software
     */
    public String getCarteiraFormatted() {
        return boleto.getCarteira();
    }
    
    /**
     * Recupera a agencia / codigo cedente no padrao especificado pelo banco
     * @author Gladyston Batista/Eac Software
     */
    public String getAgenciaCodCedenteFormatted() {
        return boleto.getAgencia() + " / " + boleto.getContaCorrente() + "-" + boleto.getDvContaCorrente();
    }
    
    /**
     * Recupera o nossoNumero no padrao especificado pelo banco
     * @author Gladyston Batista/Eac Software
     */
    public String getNossoNumeroFormatted() {
        return String.valueOf(Long.parseLong(boleto.getNossoNumero()));
    }
    
}