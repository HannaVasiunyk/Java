import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brick {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a, b, c:");
        String A = reader.readLine();
        String B = reader.readLine();
        String C = reader.readLine();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);
        System.out.println("Enter x, y:");
        String X = reader.readLine();
        String Y = reader.readLine();
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        if (((x >= a) && (y >= b)) ||
                ((x >= b) && (y >= a)) ||
                ((x >= a) && (y >= c)) ||
                ((x >= c) && (y >= a)) ||
                ((x >= b) && (y >= c)) ||
                ((x >= c) && (y >= b)))
            System.out.println("Good job");
        else
            System.out.println("Error, hole is too small");
    }
    }

