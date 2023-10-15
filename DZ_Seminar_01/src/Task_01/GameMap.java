package Task_01;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {
    public static int panelWidth;
    public static int panelHeight;
    public static int cellHeight;
    public static int cellWidth;

    public GameMap() {
        setBackground(Color.GREEN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        panelWidth = getWidth();
        panelHeight = getHeight();
        cellWidth = panelWidth / SettingsWindow.sliderSize.getValue();
        cellHeight = panelHeight / SettingsWindow.sliderSize.getValue();

        g.setColor(Color.BLACK);

        for (int h = 0; h < SettingsWindow.WINDOW_HIGHT; h++) {
            int y = h * cellHeight;
            g.drawLine(0, y, panelWidth, y);

        }

        for (int w = 0; w < SettingsWindow.WINDOW_WIDHT; w++) {
            int x = w * cellWidth;
            g.drawLine(x, 0, x, panelHeight);

        }

    }
    public void startNewGame(boolean mode, int fieldSizeX, int fieldSizeY, int winLen) {
        System.out.printf("Mode: %b;\nSize: x=%d, y=%d\nWin Length: %d", mode, fieldSizeX, fieldSizeY, winLen);
        repaint();
    }

}
