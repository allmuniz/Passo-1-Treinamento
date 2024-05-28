package caelum.fj11.programa;

import java.io.*;
import java.util.Scanner;

public class TestaJavaIO {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("leitura1.txt ");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        OutputStream os = new FileOutputStream("saida1.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();
        while (linha != null) {
            bw.append(linha);
            bw.newLine();
            linha = br.readLine();
        }
        br.close();
        bw.close();

        Scanner sc = new Scanner(new FileInputStream("leitura2.txt"));
        PrintStream ps = new PrintStream("saida2.txt");

        while (sc.hasNextLine()){
            String linha2 = sc.nextLine();
            ps.println(linha2);
        }
        sc.close();
        ps.close();
    }
}
