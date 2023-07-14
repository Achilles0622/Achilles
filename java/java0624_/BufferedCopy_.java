package java0624_;


import java.io.*;

public class BufferedCopy_ {

    public static void main(String[] args) {
        String scrFilePath = "e:\\a.java";
        String destFilePath = "e:\\a2.java";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(scrFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            while ((line = br.readLine()) != null) {
                //每读取一行 就写入
                bw.write(line);
                bw.newLine();
                System.out.println("OK");
            }
            //读取写入
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
