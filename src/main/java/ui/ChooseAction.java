package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseAction {
    private JRadioButton собратьУрожайRadioButton;
    private JPanel panel1;
    private ButtonGroup buttonGroup;
    private JRadioButton посадитьКультуруRadioButton;
    private JRadioButton подготовитьПочвуRadioButton;
    private JRadioButton украстьУСоседаRadioButton;
    private JButton выбратьButton;

    public ChooseAction() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(собратьУрожайRadioButton);
        buttonGroup.add(посадитьКультуруRadioButton);
        buttonGroup.add(подготовитьПочвуRadioButton);
        buttonGroup.add(украстьУСоседаRadioButton);

        выбратьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (собратьУрожайRadioButton.isSelected()) {
                    Harvest harvest = new Harvest();
                    harvest.createUI();
                }
                if(посадитьКультуруRadioButton.isSelected()){
                    Plant plant = new Plant();
                    plant.createUI();
                }
                if(подготовитьПочвуRadioButton.isSelected()){
                    Soil soil = new Soil();
                    soil.createUI();
                }
                if(украстьУСоседаRadioButton.isSelected()){
                    Neighbour neighbour = new Neighbour();
                    neighbour.createUI();
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
