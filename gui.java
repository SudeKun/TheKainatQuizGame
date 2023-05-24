import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui implements ActionListener{
    
    public static JFrame frame = new JFrame("The Kainat Quiz Game");
    JButton start = new JButton("Start");
    JButton settings = new JButton("Settings");
    JButton credits = new JButton("Credits");
    JLabel label = new JLabel("The Kainat Quiz Game");

    gui() {
        start.setBounds(400, 250, 200, 50);
        settings.setBounds(400, 312, 200, 50);
        credits.setBounds(400, 375, 200, 50);
        label.setBounds(287, 106, 574, 60);

        start.setFocusable(false);
        start.addActionListener(this);
        start.setFont(new Font("Arial",Font.PLAIN,20));
        settings.setFocusable(false);
        settings.addActionListener(this);
        settings.setFont(new Font("Arial",Font.PLAIN,20));
        credits.setFocusable(false);
        credits.addActionListener(this);
        credits.setFont(new Font("Arial",Font.PLAIN,20));
        label.setFont(new Font("Arial",Font.BOLD,38));

        frame.add(start);
        frame.add(settings);
        frame.add(credits);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start){
            label.setVisible(false);
            start.setVisible(false);
            settings.setVisible(false);
            credits.setVisible(false);
            new playerinfo();
            start.setEnabled(false);
        }
        if (e.getSource()==settings){
            new settings();
        }
        if (e.getSource()==credits){
            new credits();
        }
    }
    
}
