package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plant {
    private JPanel panel1;
    private JButton посадитьButton;
    private JTextField textField1;

    public Plant() {
        посадитьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField1.getText().equals("")) {
                    String name = textField1.getText();
                }
            }
        });
    }

    public void createUI() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.pack();
        frame.setVisible(true);
    }
}
