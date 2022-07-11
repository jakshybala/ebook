package kg.ebook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.Authentication;


import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Table(name = "vendors")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private int phoneNumber;

    private int password;

    private boolean isActive;

    @OneToMany
    private List<Book> books;

    private Authentication authentication;

    @OneToMany
    private List<PromoCode> promoCodes;

    private int messages;

}
