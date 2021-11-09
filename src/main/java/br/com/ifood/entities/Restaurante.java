package br.com.ifood.entities;

import javax.persistence.*;

@Table(name = "TB_RESTAURANTE")
public class Restaurante {

    public Restaurante(long restauranteID, String CNPJ, String razaoSocial, String nomeRestaurante, String telefone,
                       String nomeEspecialidade, String email, String celular, String nomeCompleto, String CPF, String RG) {
        this.restauranteID = restauranteID;
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.nomeRestaurante = nomeRestaurante;
        this.telefone = telefone;
        this.nomeEspecialidade = nomeEspecialidade;
        this.email = email;
        this.celular = celular;
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.RG = RG;
    }

    public Restaurante() {
    }

    @Id
    @GeneratedValue
    @Column(name = "CD_RESTAURANTE")
    private long restauranteID;

    @Column(name = "NR_CNPJ")
    private String CNPJ;

    @Column(name = "NM_RAZAO_SOCIAL")
    private String razaoSocial;

    @Column(name = "NM_RESTAURANTE")
    private String nomeRestaurante;

    @Column(name = "NR_TELEFONE")
    private String telefone;

    @Column(name = "NM_ESPECIALIDADE")
    private String nomeEspecialidade;

    @Column(name = "DS_EMAIL")
    private String email;

    @Column(name = "NR_CELULAR")
    private String celular;

    @Column(name = "NM_COMPLETO")
    private String nomeCompleto;

    @Column(name = "NR_CPF")
    private String CPF;

    @Column(name = "NR_RG")
    private String RG;

    public long getRestauranteID() {
        return restauranteID;
    }

    public void setRestauranteID(long restauranteID) {
        this.restauranteID = restauranteID;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "restauranteID=" + restauranteID +
                ", CNPJ='" + CNPJ + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeRestaurante='" + nomeRestaurante + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nomeEspecialidade='" + nomeEspecialidade + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                '}';
    }
}
