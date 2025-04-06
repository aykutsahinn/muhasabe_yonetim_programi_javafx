package com.aykutsahin.muhasabe_yonetim_programi_javafx.utils;

import com.aykutsahin.muhasabe_yonetim_programi_javafx.dao.NotificationDAO;
import com.aykutsahin.muhasabe_yonetim_programi_javafx.dto.NotificationDTO;
import com.aykutsahin.muhasabe_yonetim_programi_javafx.enums.NotificationType;
import javafx.scene.control.Alert;

import javax.management.Notification;
import java.util.List;

public class NotificationUtil {
    private static final NotificationDAO notificationDAO;

    static {
        notificationDAO = new NotificationDAO();
    }

    public static void showNotification(String message, NotificationType type) {
        // DAO'ya bildirimi ekle
        notificationDAO.addNotification(message, type);

        // Pop-up göster
        Alert alert;
        switch (type) {
            case SUCCESS -> alert = new Alert(Alert.AlertType.INFORMATION);
            case ERROR -> alert = new Alert(Alert.AlertType.ERROR);
            case WARNING -> alert = new Alert(Alert.AlertType.WARNING);
            default -> alert = new Alert(Alert.AlertType.NONE);
        }

        alert.setTitle("Bildirim");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static List<NotificationDTO> getAll() {
        return notificationDAO.getAllNotifications();
    }
}
