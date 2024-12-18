import java.awt.*;
import java.awt.event.*;

public class 範例程式1 {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me");

        button.setBounds(50, 100, 80, 30); // 設定按鈕位置與大小
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

        frame.add(button);
        frame.setSize(200, 200); // 設定視窗大小
        frame.setLayout(null); // 使用絕對佈局
        frame.setVisible(true);
    }
}
