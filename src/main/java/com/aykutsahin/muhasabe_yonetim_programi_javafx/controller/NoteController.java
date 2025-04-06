package com.aykutsahin.muhasabe_yonetim_programi_javafx.controller;

import com.aykutsahin.muhasabe_yonetim_programi_javafx.dto.NotebookDTO;
import com.aykutsahin.muhasabe_yonetim_programi_javafx.dto.UserDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.application.Platform;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class NoteController {

    @FXML
    public TextField titleField;

    @FXML
    public TextArea contentArea;

    @FXML
    public CheckBox pinnedCheckBox;

    @FXML
    public Button btnSaveNote;

    @Setter
    private NotebookDTO createdNote;

    @FXML
    private void saveNote(ActionEvent event) {
        System.out.println("Kaydet butonuna tıklandı!");

        createdNote = NotebookDTO.builder()
                .title(titleField.getText())
                .content(contentArea.getText())
                .pinned(pinnedCheckBox.isSelected())
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        System.out.println("Note saved");

        // Zamanlayıcıyı başlat
        startTimer(createdNote);

        // Pencereyi kapat
        Stage stage = (Stage) titleField.getScene().getWindow();
        stage.close();
    }

    public NotebookDTO getCreatedNote() {
        System.out.println(createdNote.toString());
        return createdNote;
    }

    public void setUser(UserDTO currentUser) {
        createdNote.setUserDTO(currentUser);
    }

    private void startTimer(NotebookDTO notebook) {
        // Zamanlayıcı oluşturuluyor
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Zaman geldiğinde pop-up göstermek için Platform.runLater kullanıyoruz
                Platform.runLater(() -> showPopUp(notebook));
            }
        }, 10000); // 10 saniye sonra
    }

    private void showPopUp(NotebookDTO notebook) {
        if (notebook != null) {
            // JavaFX Alert kullanarak pop-up gösterme
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Not Bilgisi");
            alert.setHeaderText("Notunuz başarıyla kaydedildi!");
            alert.setContentText("Başlık: " + notebook.getTitle() + "\nİçerik: " + notebook.getContent());

            alert.showAndWait(); // Pop-up penceresini göster
        } else {
            System.out.println("Notebook null, pop-up gösterilemiyor.");
        }
    }
}
