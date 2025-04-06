package com.aykutsahin.muhasabe_yonetim_programi_javafx.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotebookDTO {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    //private String category; // Örn: "Kişisel", "İş", "Okul"
    private boolean pinned;  // Sabitlenmiş not mu?
    private UserDTO userDTO; //Composition

    @Override
    public String toString() {
        return "NotebookDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", pinned=" + pinned +
                ", userDTO=" + userDTO +
                '}';
    }
// Constructorlar
    // Getter ve Setter'lar
}
