package app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    private final String url = "jdbc:postgresql://localhost:5432/d11?useSSL=false";
    private final String username = "postgres";
    private final String password = "Giuseppe01";

    public void insertStudent(Student s) {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO school_students (name, lastname, gender, birthdate, avg, min_vote, max_vote) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, s.getName());
            statement.setString(2, s.getLastName());
            statement.setString(3, s.getGender());
            statement.setDate(4, s.getBirthdate());
            statement.setDouble(5, s.getAvg());
            statement.setInt(6, s.getMinVote());
            statement.setInt(7, s.getMaxVote());

            statement.executeUpdate();
            System.out.println("Studente inserito con successo.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
