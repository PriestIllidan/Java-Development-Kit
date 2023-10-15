package Task_01;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {

    public static final int WINDOW_HIGHT = 400;
    public static final int WINDOW_WIDHT = 300;
    public static final int WINDOW_POSX = 600;
    public static final int WINDOW_POSY = 350;

    JButton buttonStart = new JButton("Start new game");

    JLabel gameModes = new JLabel("Выберите режим игры");
    JLabel gameSize = new JLabel("Установите размер поля");
    JLabel gameWin = new JLabel("Установите размер для победы");
    JRadioButton humanVsPC = new JRadioButton("Человек проив компьютера", true);
    JRadioButton humanVshuman = new JRadioButton("Человек проив человека", false);
    ButtonGroup gameModesGroup = new ButtonGroup();

    public static JSlider sliderSize = new JSlider(3, 10, 3);
    public static JSlider sliderWin = new JSlider(3, 10, 3);

    JPanel sliders = new JPanel(new GridLayout(8, 1));

    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_HIGHT, WINDOW_WIDHT);
        setTitle("Окно настроек");

        sliders.add(gameModes);
        gameModesGroup.add(humanVshuman);
        gameModesGroup.add(humanVsPC);
        sliders.add(humanVshuman);
        sliders.add(humanVsPC);

        sliders.add(gameSize);
        sliderSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gameSize.setText(String.format("Установите размер поля: %d", sliderSize.getValue()));
            }
        });
        sliders.add(gameSize.add(sliderSize));
        sliderWin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gameWin.setText(String.format("Установите размер для победы: %d", sliderWin.getValue()));
            }
        });
        sliders.add(gameWin);

        sliders.add(gameWin.add(sliderWin));
        sliders.add(buttonStart);

        add(sliders);


        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(humanVshuman.isSelected(), sliderSize.getValue(), sliderSize.getValue(),
                        sliderWin.getValue());
                setVisible(false);
            }
        });


    }
}
