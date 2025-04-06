package com.aykutsahin.muhasabe_yonetim_programi_javafx.dao;

import com.aykutsahin.muhasabe_yonetim_programi_javafx.dto.NotificationDTO;
import com.aykutsahin.muhasabe_yonetim_programi_javafx.enums.NotificationType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class NotificationDAO {
    public void addNotification(String message, NotificationType notificationType) {
        NotificationDTO notification = new NotificationDTO();
        notification.setMessage(message);
        notification.setNotificationType(notificationType);
        notification.setTimestamp(LocalDateTime.now());
        notification.saveToFile(message);
        notifications.add(notification);

    }

    private List<NotificationDTO> notifications = new ArrayList<>();

    public List<NotificationDTO> getAllNotifications() {
        return notifications;
    }
}