import java.net.*;
import java.io.*;

public class 範例程式3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine).append("\n");
            }

            in.close();
            connection.disconnect();

            System.out.println("網站內容：");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("無法連接到網站：" + e.getMessage());
        }
    }
}
