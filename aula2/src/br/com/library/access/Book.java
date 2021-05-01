package br.com.library.access;

public class Book {
    private Long code;
    private User user;
    private Book book;
    private String tookBookDate;
    private String devolutionDate;

    public Book(Long code, User user, Book book, String tookBookDate, String devolutionDate) {
        this.code = code;
        this.user = user;
        this.book = book;
        this.tookBookDate = tookBookDate;
        this.devolutionDate = devolutionDate;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getTookBookDate() {
        return tookBookDate;
    }

    public void setTookBookDate(String tookBookDate) {
        this.tookBookDate = tookBookDate;
    }

    public String getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(String devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public void imprimeLibrary(){
        System.out.println("code: " + this.getCode());
        System.out.println("User: " + this.getUser().getFullName());
        System.out.println("Book:" + this.getBook().getUser());
        System.out.println("Data do empréstimo:" + this.getTookBookDate());
        System.out.println("Data da devolução:" + this.getDevolutionDate());
    }
}
