package com.aykutsahin.muhasabe_yonetim_programi_javafx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public interface IGenericsMethod <T>{

    // GENERICS METOT (LIST,FIND)
    // ResultSet'ten UserDTO oluşturmayı tek bir yardımcı metot
    // ResultSetten UserDTO oluştur
    public T mapToObjectDTO(ResultSet resultSet) throws SQLException;

    // dizi elemanları(Değişkenler birden fazla olabilir)
    // ID veya NAME ile veri çektiğimizde bu ortak metot kullanılır
    // Generics ile Tek kayıt Döndüren Metot
    public Optional<T> selectSingle(String sql, Object... params);
}
