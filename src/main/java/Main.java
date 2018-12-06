import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {
        UI UI = new UI();
        UI.option();
        UI.choice();
    }
}
