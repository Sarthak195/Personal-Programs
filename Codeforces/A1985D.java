import java.io.*;
import java.util.*;

public class A1985D {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while(t-- > 0){
            int n = fs.nextInt();
            int m = fs.nextInt();

            int minRow = Integer.MAX_VALUE, maxRow = -1;
            int minCol = Integer.MAX_VALUE, maxCol = -1;

            for(int i = 1; i <= n; i++){
                String s = fs.next();
                for(int j = 1; j <= m; j++){
                    if(s.charAt(j - 1) == '#'){
                        minRow = Math.min(minRow, i);
                        maxRow = Math.max(maxRow, i);
                        minCol = Math.min(minCol, j);
                        maxCol = Math.max(maxCol, j);
                    }
                }
            }

            int centerRow = (minRow + maxRow) / 2;
            int centerCol = (minCol + maxCol) / 2;

            out.append(centerRow).append(" ").append(centerCol).append("\n");
        }

        System.out.print(out);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while(st == null || !st.hasMoreElements())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
