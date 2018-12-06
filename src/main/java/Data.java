import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class Data {

    public void game() throws SQLException, ClassNotFoundException, FileNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/games?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String username = "root";
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = "select * from gameslist";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String nazwa = resultSet.getString("nazwa");
            String premiera = resultSet.getString("data");
            String ocena = resultSet.getString("ocena");
            String cena = resultSet.getString("cena");
            System.out.println("Nazwa:" + " " + nazwa + "| Premiera: " + premiera + "| Ocena: " + ocena + "| Cena: " + cena);
        }

    }

    public void ocena() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/game?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String username = "root";
        String password = "admin";
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = "select * from gameslist where ocena > 'score' ";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {

            String nazwa = resultSet.getString("nazwa");
            String premiera = resultSet.getString("data");
            String ocena = resultSet.getString("ocena");
            String cena = resultSet.getString("cena");
            System.out.println("Ocena :"+ ocena+" | Nazwa"+ nazwa);
        }
        connection.close();
    }
    public void cenaMalejaco() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/game?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String username = "root";
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM gameslist ORDER BY cena DESC";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {

            String nazwa = resultSet.getString("nazwa");
            String premiera = resultSet.getString(" data");
            String ocena = resultSet.getString("ocena");
            String cena = resultSet.getString("cena");

            System.out.println("Cena :"+ cena +" | Nazwa :"+nazwa);
        }
        connection.close();
    }
}
