import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class second_task {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String a = reader.readLine(); int num1 = Integer.parseInt(a);
        String b = reader.readLine(); int num2 = Integer.parseInt(b);
        String c = reader.readLine(); int num3 = Integer.parseInt(c);

        int sumP = 0;
        int sumN = 0;

        if (num1 > 0) { sumP++; }
            else if (num1 < 0) { sumN++; }

        if (num2 > 0) { sumP++; }
            else if (num2 < 0) { sumN++; }

        if (num3 > 0) { sumP++; }
            else if (num3 < 0) { sumN++; }

        System.out.println(sumN);
        System.out.print(sumP);

    }
}
