package br.com.library.access;

public class Library {

    private Long codigo;
    private String author;
    private String name;

    public Library(Long codigo, String author, String name) {
        this.codigo = codigo;
        this.author = author;
        this.name = name;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void imprimeLivro() {
        System.out.println("Codigo" +this.getCodigo());
        System.out.println("Name" +this.getName());
        System.out.println("Author" +getAuthor());
    }
}
