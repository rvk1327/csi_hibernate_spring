package hbcls;

import javax.persistence.*;

@Entity
public class Book {
    
    @Id
    @Column(name="bookid", length = 30)
    private String book_id;
    
    @Column(name="bookname", length = 100)
    private String book_name;
    
    @OneToOne(targetEntity = Library.class,cascade = CascadeType.ALL)
    private Library lib;

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Library getLib() {
        return lib;
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }
    
    
}
