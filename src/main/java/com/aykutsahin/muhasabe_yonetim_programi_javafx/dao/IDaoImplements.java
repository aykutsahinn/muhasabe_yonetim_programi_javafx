package com.aykutsahin.muhasabe_yonetim_programi_javafx.dao;

import com.aykutsahin.muhasabe_yonetim_programi_javafx.database.SingletonPropertiesDBConnection;

import java.sql.Connection;

public interface IDaoImplements <T> extends ICrud<T>,IGenericsMethod<T> {

    // Gövdeli Method
    default Connection iDaoImplementsDatabaseConnection() {
        // Singleton DB
        //return SingletonDBConnection.getInstance().getConnection();

        // Singleton Config
        return SingletonPropertiesDBConnection.getInstance().getConnection();
    }
}
