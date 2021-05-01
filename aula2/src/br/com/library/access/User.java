package br.com.library.access;

public class User {

    // atributos com suas devidas caracteristicas
    private Long codigo;
    private String fullName;
    private String birthDate;
    private String address;

    // construtores
    public User(Long codigo, String nomeCompleto, String dataNascimento, String endereco) {
        this.codigo = codigo;
        this.fullName = nomeCompleto;
        this.birthDate = dataNascimento;
        this.address = endereco;
    }

    // encapsulamento dos objetos
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void userPrint() {
        System.out.println("Codigo" +this.getCodigo());
        System.out.println("Nome Compelto" +this.getFullName());
        System.out.println("Nascimento" +this.getBirthDate());
        System.out.println("Endereco" +this.getAddress());
    }

}
