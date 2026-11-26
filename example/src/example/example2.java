package example;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class example2 {
    public static void main(String[] args) {
        Frame frame = new Frame("範例二：滑鼠座標事件");
        frame.setSize(350, 220);

        Label label = new Label("請在視窗空白處點擊滑鼠左鍵", Label.CENTER);

        // 註冊滑鼠事件監聽器 (MouseAdapter / MouseEvent)
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                String msg = "點擊座標：X = " + x + ", Y = " + y;
                label.setText(msg);
                System.out.println("觸發 MouseEvent -> " + msg);
            }
        });

        // 註冊視窗關閉事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(label, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}