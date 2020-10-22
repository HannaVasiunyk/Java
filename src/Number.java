import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter Number: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(bufferedReader.readLine());

        String x = String.valueOf(Math.pow(n, 2));
        System.out.println(x.contains("3") ? "Number contains '3'" : "Number doesn't contain '3'");
        System.out.println("Change place numbers: " + new StringBuilder(n.toString()).reverse());

        String replace = n.toString();
        replace = replace.length() > 1 ? replace.charAt(replace.length() - 1) + replace.substring(1, replace.length() - 1)
                + n.toString().charAt(0) : replace;

        System.out.println("Replace numbers : " + replace);

        System.out.println("Add 1 at the begin and end " + "1" + n.toString() + "1");
    }
}




