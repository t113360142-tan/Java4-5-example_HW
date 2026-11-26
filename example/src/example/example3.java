package example;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class example3 {
    public static void main(String[] args) {
        Frame frame = new Frame("範例三：鍵盤按鍵事件");
        frame.setSize(350, 160);

        TextField textField = new TextField();
        Label label = new Label("請在上方輸入框按下任意鍵", Label.CENTER);

        // 註冊鍵盤事件監聽器 (KeyAdapter / KeyEvent)
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar();
                int keyCode = e.getKeyCode();
                String msg = "按下按鍵：" + keyChar + "（代碼：" + keyCode + "）";
                label.setText(msg);
                System.out.println("觸發 KeyEvent -> " + msg);
            }
        });

        // 註冊視窗關閉事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(textField, BorderLayout.NORTH);
        frame.add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}