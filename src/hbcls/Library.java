package hbcls;

import javax.persistence.*;

@Entity
public class Library {
    
    @Id
    @Column(name="libid", length = 30)
    private String lib_id;
    
    @Column(name="libname",length = 100)
    private String lib_name;
    
    @OneToOne(targetEntity = Book.class, cascade = CascadeType.ALL)
    private Book book;

    public String getLib_id() {
        return lib_id;
    }

    public void setLib_id(String lib_id) {
        this.lib_id = lib_id;
    }

    public String getLib_name() {
        return lib_name;
    }

    public void setLib_name(String lib_name) {
        this.lib_name = lib_name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    
}
