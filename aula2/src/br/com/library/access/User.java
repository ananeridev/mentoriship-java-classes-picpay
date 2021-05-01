package br.com.library.access;

public class User {

    // atributos com suas devidas caracteristicas
    private Long codigo;
    private String nomeCompleto;
    private String dataNascimento;
    private String endereco;

    // construtores
    public User(Long codigo, String nomeCompleto, String dataNascimento, String endereco) {
        this.codigo = codigo;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    // encapsulamento dos objetos
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void userPrint() {
        System.out.println("Codigo" +this.getCodigo());
        System.out.println("Nome Compelto" +this.getNomeCompleto());
        System.out.println("Nascimento" +this.getDataNascimento());
        System.out.println("Endereco" +this.getEndereco());
    }

}
