import java.io.*;

public class 範例程式2 {
    public static void main(String[] args) {
        String filePath = "example.txt";
        
        // 寫入檔案
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, Java I/O!");
            System.out.println("寫入成功！");
        } catch (IOException e) {
            System.out.println("檔案寫入失敗：" + e.getMessage());
        }

        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("檔案內容：");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("檔案讀取失敗：" + e.getMessage());
        }
    }
}
