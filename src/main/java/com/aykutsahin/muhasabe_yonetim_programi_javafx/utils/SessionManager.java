package com.aykutsahin.muhasabe_yonetim_programi_javafx.utils;

import com.aykutsahin.muhasabe_yonetim_programi_javafx.dto.UserDTO;

public class SessionManager {
    public static UserDTO currentUser;

    public static void setCurrentUser(UserDTO user) {
        currentUser = user;
    }

    public static UserDTO getCurrentUser() {
        return currentUser;
    }

    public static void clear() {
        currentUser = null;
    }
}
