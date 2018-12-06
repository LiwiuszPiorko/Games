import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class UI {

    public String option() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Wszystkie gry.");
        System.out.println("2. Wszystkie gry z oceną wyższą niż...");
        System.out.println("3. Wszystkie gry/ cena malejaco.");
        String odczyt = sc.nextLine();
        return odczyt;
    }

    public void choice() throws SQLException, ClassNotFoundException, FileNotFoundException {
        UI UI = new UI();
        Data baza = new Data();
        switch (UI.option()) {
            case "1":
                baza.game();
                break;
            case "2":
                System.out.println("Podaj od jakiej oceny przyznanej grze chcesz rozpocząć wyszukiwanie");
                baza.ocena();
            case "3":
                System.out.println("Cena/ malejąco ");
                baza.cenaMalejaco();
            default:
        }
    }
}
