package uz.edu_x.edux.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    @ManyToOne
    private Role role;
    @ManyToOne
    private Attachment profilePhoto;
    @ManyToMany
    private List<Course> favourites;
    @ManyToMany
    private List<Group>  groups;
}
