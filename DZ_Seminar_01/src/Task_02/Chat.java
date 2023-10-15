package Task_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
//Задание 4
// Задача: Создать окно клиента чата. Окно должно содержать JtextField для ввода логина, пароля, IP-адреса сервера, порта подключения
// к серверу, область ввода сообщений, JTextArea область просмотра сообщений чата и JButton подключения к серверу и отправки сообщения
// в чат. Желательно сразу сгруппировать компоненты, относящиеся к серверу сгруппировать на JPanel сверху экрана, а компоненты,
// относящиеся к отправке сообщения – на JPanel снизу.

public class Chat extends JFrame {
    private static final int WINDOW_HIGHT = 400; // зададим константы для расширения окна
    private static final int WINDOW_WIDHT = 600;
    private static final int WINDOW_POSX = 600;
    private static final int WINDOW_POSY = 200;
    JTextField loginField = new JTextField("Login: ");
    JTextField passwordField = new JTextField("Password: ");
    JTextField IPField = new JTextField("IP-server: ");
    JButton connect = new JButton("Connect to the server");
    JButton sendMessage = new JButton("Send message");
    JTextField sendTextServer = new JTextField("Enter message ");
    JPanel grid = new JPanel(new GridLayout(4, 1));

    JTextArea textOut = new JTextArea();

    Chat(String login) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_HIGHT, WINDOW_WIDHT);
        setTitle("Chat");
        setResizable(false);
        setVisible(true);


        grid.add(sendTextServer);
        grid.add(textOut);
        grid.add(sendMessage);
        sendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textOut.append(login + " " + sendTextServer.getText() + "\n");

            }
        });
        add(grid);


    }

    Chat() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_HIGHT, WINDOW_WIDHT);
        setTitle("Chat");
        setResizable(false);
        setVisible(true);

        grid.add(loginField);
        grid.add(passwordField);
        grid.add(IPField);
        grid.add(connect);

        add(grid);

        connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                new Chat(login);

            }
        });

    }


}
