package app;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Student con i dati dello studente da inserire
        Student student = new Student(3, "Maria", "Verde", "f", Date.valueOf("2001-05-07"), 10, 6, 10);

        // Creazione dell'oggetto StudentDAO
        StudentDAO studentDAO = new StudentDAO();

        // Inserimento dello studente nel database
        studentDAO.insertStudent(student);
    }
}
