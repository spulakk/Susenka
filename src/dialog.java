import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;

public class dialog extends JDialog {
    private JPanel contentPane;
    private JPanel moznosti;
    private JButton buttonOK;
    private JPanel vnitrek;
    private JLabel l1;
    private JTextField t1;
    private JLabel img;

    public dialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        Color c = new Color(225, 168, 80);
        t1.setBorder(BorderFactory.createLineBorder(c));

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void onOK() {
        String susenka = t1.getText();
        if (susenka.equals("susenka"))
            dispose();
    }

    public static void main(String[] args) {

        dialog dialog = new dialog();
        dialog.pack();

        ImageIcon icon = new ImageIcon("src/cookie.png");
        dialog.setIconImage(icon.getImage());

        Random random = new Random();
        int x = random.nextInt(1280) + 1;
        int y = random.nextInt(720) + 1;
        dialog.setLocation(x, y);

        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        System.exit(0);
    }
}
