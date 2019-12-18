package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Harvest {
    private JTextField textField1;
    private JPanel panel1;
    private JButton собратьУрожайButton;

    public Harvest() {
        собратьУрожайButton.addActionListener(new ActionListener() {
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
