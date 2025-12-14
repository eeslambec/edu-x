package uz.edu_x.edux.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String preview;
    private List<Mentor> mentors;
    private List<User> users;
    private BigDecimal price;
    private Integer discount;
    private Integer videosCount;
    @OneToMany
    private List<Rating> rating;
}
