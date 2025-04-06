package com.aykutsahin.muhasabe_yonetim_programi_javafx.dto;

import com.aykutsahin.muhasabe_yonetim_programi_javafx.enums.NotificationType;
import lombok.Getter;
import lombok.Setter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@Getter
@Setter
public class NotificationDTO {
    private NotificationType notificationType;

    private String message;

    private LocalDateTime timestamp;

    public void saveToFile(String message) {
        try (FileWriter fw = new FileWriter("notification.txt", true)) {
            fw.write(message + " - " + LocalDateTime.now() + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("⚠️ Bildirim dosyasına yazılamadı: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
