import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class playerinfo implements ActionListener{
    JFrame frame = gui.frame;
    JLabel name = new JLabel();
    JButton play = new JButton("Play");
    JTextField pname = new JTextField("");
    String plyname;


    playerinfo(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        name.setText("Hoşgeldin oyuncu, adın ne?");
        name.setFont(new Font("Arial",Font.PLAIN,38));
        name.setBounds(270, 103, 646, 54);
        

        pname.setBounds(245, 221, 550, 58);
        pname.setFont(new Font("Arial",Font.PLAIN,38));

        play.setBounds(430,325,200,50);
        play.setFont(new Font("Arial",Font.PLAIN,38));
        play.addActionListener(this);
        

        frame.add(pname);
        frame.add(name);
        frame.add(play);
    }

	@Override
	public void actionPerformed(ActionEvent e) {

        if(e.getSource()==play){
            name.setVisible(false);
            pname.setVisible(false);
            play.setVisible(false);
            new real();
            plyname=pname.getText();
            System.out.println(plyname);
        }
	}
}