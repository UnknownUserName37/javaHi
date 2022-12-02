import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_rush_test {

    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String a = reader.readLine(); int num1 = Integer.parseInt(a);
        String b = reader.readLine(); int num2 = Integer.parseInt(b);
        String c = reader.readLine(); int num3 = Integer.parseInt(c);
        int sum = 0;
        if (num1 > 0) { sum = sum + 1; }
        if (num2 > 0) { sum = sum + 1; }
        if (num3 > 0) {sum = sum + 1; }
        System.out.print(sum);

    }
}





















