import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pohui_class {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
        System.out.println("Сосать, сука.");
    }
}
