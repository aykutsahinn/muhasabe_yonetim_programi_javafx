package com.aykutsahin.muhasabe_yonetim_programi_javafx.dao;

import java.util.Optional;

public interface ILogin <T>{
    // Login
    Optional<T> loginUser(String username, String password);
}
