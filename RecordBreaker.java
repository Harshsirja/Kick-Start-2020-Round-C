import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RecordBreaker {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        try {
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int N = sc.nextInt();
                int V[] = new int[N + 2];

                V[0] = -1;
                V[N + 1] = -1;
                for (int j = 0; j < N; j++) {
                    V[j + 1] = sc.nextInt();
                }

                boolean flag = true;
                int max = -1;
                int count = 0;
                int p = -1;
                int current;

                for (int j = 0; j < N + 2; j++) {
                    current = V[j];
                    if (flag && current < p && max < p) {
                        count++;
                        max = p;
                    }
                    flag = current > p;
                    p = current;
                }

                System.out.println("Case #" + (i + 1) + ": " + count);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
