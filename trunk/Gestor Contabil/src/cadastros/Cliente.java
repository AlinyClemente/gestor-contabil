package cadastros;

import enums.EstadoCivil;
import enums.Sexo;
import java.util.Calendar;

/**
 *
 * @author Táizel Girão
 */
public class Cliente {

    private int codigo;
    private String nome;
    private Sexo sexo;
    private Calendar dataNascimento;
    private String rg;
    private String cpf;
    private EstadoCivil estadoCivil;
    private String orgaoEmissor;
    private String filiacaoPai;
    private String filiacaoMae;
    private String nomeConjuge;
    private String[] telefones = new String[3];
    private String endereco;
    private String bairro;
    private String cep;
    private String estado;
    private String cidade;
    private String email;

    public Cliente(int codigo, String nome, Sexo sexo, Calendar dataNascimento, String rg, String cpf, EstadoCivil estadoCivil, String orgaoEmissor, String filiacaoPai, String filiacaoMae, String nomeConjuge, String endereco, String bairro, String cep, String estado, String cidade, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.orgaoEmissor = orgaoEmissor;
        this.filiacaoPai = filiacaoPai;
        this.filiacaoMae = filiacaoMae;
        this.nomeConjuge = nomeConjuge;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFiliacaoMae() {
        return filiacaoMae;
    }

    public void setFiliacaoMae(String filiacaoMae) {
        this.filiacaoMae = filiacaoMae;
    }

    public String getFiliacaoPai() {
        return filiacaoPai;
    }

    public void setFiliacaoPai(String filiacaoPai) {
        this.filiacaoPai = filiacaoPai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeConjuge() {
        return nomeConjuge;
    }

    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String[] getTelefones() {
        return telefones;
    }

    public void setTelefones(String[] telefones) {
        this.telefones = telefones;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
}
