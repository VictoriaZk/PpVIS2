package ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class StartGame {
    private JButton button1;
    private JPanel panel1;

    public StartGame() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChooseAction chooseAction = new ChooseAction();
                chooseAction.createUI();
            }
        });
    }

    public void paintComponent(Graphics g){
        Image im = null;
        try {
            im = ImageIO.read(new File("D:\\Tests\\fon.jpg"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0, null);
    }

    public void createUI() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
