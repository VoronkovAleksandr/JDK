import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

public class Chat extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSY = 300;
    private static final int WINDOW_POSX = 500;
    private JPanel panClient = new JPanel(new GridLayout(6, 1));
    private JPanel panMain = new JPanel(new GridLayout(1, 2));
    private JPanel panLeft = new JPanel(new GridLayout(2, 1));

    private JTextField txtFieldInputText = new JTextField();
    private JTextArea txtAreaOutputText = new JTextArea();
    private JScrollPane scrollBar = new JScrollPane(txtAreaOutputText);
    private JLabel lblClient = new JLabel("Зарегистрируйтесь");
    private JButton btnSendMessage = new JButton("Отправить сообщение");
    private JButton btnExit = new JButton("Выход");
    private Connect connect;
    private File logFile = new File("log.txt");

    public Chat() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Чат");
        setResizable(false);

        connect = new Connect(this);
    }
    public void startChat(String login){

        lblClient.setText(login);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnSendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        txtFieldInputText.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        panClient.add(lblClient);
        panClient.add(new JLabel("Введите сообщение"));
        panClient.add(txtFieldInputText);
        panClient.add(btnSendMessage);

        panLeft.add(panClient);

        panMain.add(panLeft);
        panMain.add(scrollBar);

        add(panMain);
        add(btnExit, BorderLayout.SOUTH);

        readFormLogFile();
        setVisible(true);
    }

    private void sendMessage() {
        txtAreaOutputText.setText(txtAreaOutputText.getText() +
                "\n Вы: " + txtFieldInputText.getText());
        addToLogFile("Вы: " + txtFieldInputText.getText());
        txtFieldInputText.setText("");

    }

    private void addToLogFile(String message) {
        try (FileWriter writer = new FileWriter(logFile, true)){
            writer.append(message + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл \n" + e.getMessage());;
        }


    }

    private void readFormLogFile(){
        try (FileReader fileReader = new FileReader(logFile)){
            BufferedReader reader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();
            while (line != null){
                sb.append(line);
                sb.append("\n");
                line = reader.readLine();
            }
            txtAreaOutputText.setText(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла \n" + e.getMessage());
        }

    }

}
