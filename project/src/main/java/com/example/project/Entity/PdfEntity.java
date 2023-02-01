package com.example.project.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "folder")
public class PdfEntity {
    @Id
    Long id;
    @Column(name = "name")
    String name;

    @Lob
    @Column(name ="file")
    byte[] data;

}
