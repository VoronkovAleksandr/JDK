import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Connect extends JFrame {
    private static final int WINDOW_HEIGHT = 200;
    private static final int WINDOW_WIDTH = 250;
    private static final int WINDOW_POSY = 350;
    private static final int WINDOW_POSX = 550;
    private String login;
    private String password;

    private JTextField txtFieldLogin = new JTextField();
    private JTextField txtFieldPassword = new JTextField();
    private JButton btnConnectServer = new JButton("Подключиться к серверу");
    private JPanel pnlConnect = new JPanel(new GridLayout(5,1));
    Chat chat;

    public Connect(Chat chat){
        this.chat = chat;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Подключение");
        setResizable(false);


        btnConnectServer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login = txtFieldLogin.getText();
                password = txtFieldPassword.getText();
                setVisible(false);
                chat.startChat(login);
            }
        });

        pnlConnect.add(new JLabel("Введите имя пользователя"));
        pnlConnect.add(txtFieldLogin);
        pnlConnect.add(new JLabel("Введите пароль пользователя"));
        pnlConnect.add(txtFieldPassword);
        pnlConnect.add(btnConnectServer);
        add(pnlConnect);
        setVisible(true);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
