import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class result implements ActionListener {
    JFrame frame = gui.frame;
    JLabel info = new JLabel();
    JButton play = new JButton("Play Again");
    JLabel ppoint = new JLabel(Integer.toString(real.point));

    String plyname;

    result(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        info.setText("Puanın: ");
        info.setFont(new Font("Arial",Font.PLAIN,38));
        info.setBounds(370, 200, 646, 54);

        ppoint.setBounds(550, 200, 646, 54);
        ppoint.setFont(new Font("Arial",Font.PLAIN,38));

        play.setBounds(370,300,300,50);
        play.setFont(new Font("Arial",Font.PLAIN,38));
        play.addActionListener(this);


        frame.add(ppoint);
        frame.add(info);
        frame.add(play);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==play){
            info.setVisible(false);
            play.setVisible(false);
            ppoint.setVisible(false);
            new real();
            System.out.println(plyname);
        }
    }
}
