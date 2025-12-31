package com.simple.My;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Myint extends JFrame {

    JTextField textField;
    JLabel resultLabel;
    Random random = new Random();

    public Myint() {

        setTitle("숫자 맞추기 게임");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 패널
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JLabel label = new JLabel("1~10 숫자를 입력하세요 (0 = 종료)", JLabel.CENTER);
        textField = new JTextField();
        JButton button = new JButton("확인");
        resultLabel = new JLabel("결과가 여기에 표시됩니다", JLabel.CENTER);

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(resultLabel);

        add(panel);

        // 버튼 이벤트
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playGame();
            }
        });

        setVisible(true);
    }

    // 게임 로직
    private void playGame() {
        try {
            int user = Integer.parseInt(textField.getText());

            if (user == 0) {
                JOptionPane.showMessageDialog(this, "게임을 종료합니다.");
                System.exit(0);
            }

            if (user < 1 || user > 10) {
                resultLabel.setText("❗ 1~10 사이 숫자만 입력하세요");
                return;
            }

            int computer = random.nextInt(10) + 1;

            if (user == computer) {
                resultLabel.setText("🎉 당첨! (랜덤 숫자: " + computer + ")");
                JOptionPane.showMessageDialog(this, "🎉 당첨!");
            } else {
                resultLabel.setText("❌ 실패 (랜덤 숫자: " + computer + ")");
            }

        } catch (NumberFormatException e) {
            resultLabel.setText("⚠ 숫자만 입력하세요");
        }

        textField.setText("");
    }

    public static void main(String[] args) {
        new Myint();
    }
}
