package kg.ebook.model;

/*
kg.ebook.model
Tarih: 06.07.2022, Saat: 12:28, Author: Grey 
*/




import kg.ebook.enums.Genre;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Book")


public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotNull(message = "*Please enter book name")
    @NotBlank(message = "*Please enter book name")
    @Size(min=2, max=30)
    private String name;

    @Column(name = "Genre")
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name ="price")
    @NotNull
    @Min(1)
    private BigDecimal price;


















}
