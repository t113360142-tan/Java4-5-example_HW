package example;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class example1 {
    private static int count = 0;

    public static void main(String[] args) {
        Frame frame = new Frame("範例一：按鈕點擊事件");
        frame.setSize(320, 150);

        Label label = new Label("目前點擊次數：0 次", Label.CENTER);
        Button btn = new Button("點我增加次數");

        // 註冊按鈕點擊監聽器 (ActionListener)
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("目前點擊次數：" + count + " 次");
                System.out.println("觸發 ActionEvent，目前次數：" + count);
            }
        });

        // 註冊視窗關閉事件 (WindowAdapter / WindowEvent)
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(label, BorderLayout.NORTH);
        frame.add(btn, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}