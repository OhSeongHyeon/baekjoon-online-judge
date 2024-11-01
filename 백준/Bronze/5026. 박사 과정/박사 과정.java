import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
        	String s = br.readLine();
        	if( "P=NP".equals(s) ) {
        		sb.append("skipped\n");
        		continue;
        	}
        	String[] sp = s.split("\\+");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			sb.append(a+b).append("\n");
		}
        
        System.out.print(sb);
    }

}