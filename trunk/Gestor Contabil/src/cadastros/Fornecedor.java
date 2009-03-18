/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

/**
 *
 * @author Arthur Guilherme
 */
public class Fornecedor {

    /**
     * Declaração de variáveis
     *
     */
    private int codigo;
    private String registro;
    private String endereco;
    private String bairro;
    private String cep;
    private String estado;
    private String cidade;
    private String email;
    private String homePage;
    private String razaoSocial;
    private String nomeFantasia;
    private String[] telefones = new String[3];

    public Fornecedor(int codigo, String registro, String endereco, String bairro,
            String cep, String estado, String cidade, String email, String homePage,
            String razaoSocial, String nomeFantasia, String[]telefones) {
        this.codigo = codigo;
        this.registro = registro;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
        this.homePage = homePage;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.telefones=telefones;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String[] getTelefones() {
        return telefones;
    }

    public void setTelefones(String[] telefones) {
        this.telefones = telefones;
    }
}
