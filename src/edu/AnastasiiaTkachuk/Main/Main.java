package edu.AnastasiiaTkachuk.Main;
import edu.AnastasiiaTkachuk.Service.Service;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(Service.DateToString(now));
    }
}
