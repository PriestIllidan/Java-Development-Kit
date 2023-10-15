package Task_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Основной класс
public class GameWindow extends JFrame {
    private static final int WINDOW_HIGHT = 400; // зададим константы для расширения окна
    private static final int WINDOW_WIDHT = 600;
    private static final int WINDOW_POSX = 600;
    private static final int WINDOW_POSY = 200;

    JButton buttonStart = new JButton("New game"); // JButton - класс отвечающий за кнопки
    JButton buttonExit = new JButton("Exit");
    GameMap map;
    SettingsWindow settingsWindow;


    GameWindow() { // создадим конструктор игры "Крестики и нолики"
        setDefaultCloseOperation(EXIT_ON_CLOSE); // действие, которое необходимо выполнить при "выходе из программы"
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_HIGHT, WINDOW_WIDHT);
        setTitle("Крестики и нолики"); // установим название игры
        setResizable(false); // запретим изменять размер окна (по умолянию было true)
        // add(buttonStart); // добавили кнопку в окно (занимает все окно)
        JPanel panBottom = new JPanel(new GridLayout(1, 3)); // компоновщие для группы элементов
        // (невидимы прямоугольник в котором указываем необходимое количество строк и столбцов)
        panBottom.add(buttonStart);
        panBottom.add(buttonExit);
        map = new GameMap();
        map.setVisible(false);
        settingsWindow = new SettingsWindow(this);
        settingsWindow.setVisible(true);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });


        add(panBottom, BorderLayout.SOUTH);
        add(map);

        setVisible(true);
    }

    public void startNewGame(boolean mode, int fieldSizeX, int fieldSizeY, int winLen) {
        map.setVisible(true);
        map.startNewGame(mode, fieldSizeX, fieldSizeY, winLen);
    }
}
