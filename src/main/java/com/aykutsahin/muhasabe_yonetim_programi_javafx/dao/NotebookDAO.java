package com.aykutsahin.muhasabe_yonetim_programi_javafx.dao;

import com.aykutsahin.muhasabe_yonetim_programi_javafx.dto.NotebookDTO;
import lombok.Getter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotebookDAO {
    // Geçici olarak bellekte tutulan not listesi
    private static final List<NotebookDTO> notebookList = new ArrayList<>();

    @Getter
    private static Long idCounter = 1L;

    private Long generatedId(){
        idCounter++;
        return idCounter;
    }

    public static void setIdCounter(Long idCounter) {
        NotebookDAO.idCounter = idCounter;
    }

    public void saveToFile(NotebookDTO notebook) {

        try (FileWriter fw = new FileWriter("notes.txt", true)) {
            fw.write(notebook.toString() + "\n");
            System.out.println("Dosyaya yazıldı: " + notebook.getTitle());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(NotebookDTO notebook) {
        if(notebook.getId()==null || notebook.getId()==0){
            notebook.setId(generatedId());
            System.out.println(idCounter);
            System.out.println(generatedId());
        }
        notebookList.add(notebook);
        System.out.println("Not kaydedildi: " + notebook.getTitle());
    }

    public List<NotebookDTO> findAll() {
        return new ArrayList<>(notebookList); // dışarıya kopyasını ver
    }
}
