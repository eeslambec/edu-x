package uz.edu_x.edux.model;

import jakarta.persistence.*;
import lombok.*;
import uz.edu_x.edux.model.enums.AttachmentStatus;

@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attachments")
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalName;
    private String type;
    private Long size;
    private String path;
    private AttachmentStatus attachmentStatus;
}
