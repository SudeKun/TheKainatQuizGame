import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class real implements ActionListener{
    int x = 0;
    public static int point = 0;
    
    String answer;
    questions q0 = new questions("Koca dudak kimdir?","Barcai","Lilith","Meggi","Gordinfirimin");
    questions q1 = new questions("Mount & Blade oynayan kişi kimdir?","Gordinfirimin","TheDex","Narni","Barcai");
    questions q2 = new questions("'Berkay'ın ağzında saksafon' şarkısını kim yazmıştır?","Shude","TheDex","PAC","Gordinfirimin");
    questions q3 = new questions("Shude hangi dili ÖĞRENMİYOR?","Çince","Kırgızca","Rusça","Hititçe");
    questions q4 = new questions("İlk modlu mc kaç moddan oluşmaktadır?","64","32","142","117");
    questions q5 = new questions("'Ege'nin bazı sevdiğim özellikleri' listesi kimin fikridir?","Shude","Narni","The Dex","Gordinfirimin");
    questions q6 = new questions("2x64 Obsidyen kazan kimdir?","Narni","Shude","Barcai","Lilith");
    questions q7 = new questions("Obsidyen rekorunu kıran kişi kimdir (3x64)?","Barcai","Lilith","Narni","Meggi");
    questions q8 = new questions("'Antegenar' kelimesini kim bulmuştur?","The Dex","Barcai","Narni","Gordinfirimin");
    questions q9 = new questions("İçeriden sesler geliyor...","10 saniye","1 dakika","15 dakika","2 saat");
    questions [] q = {q0,q1,q2,q3,q4,q5,q6,q7,q8,q9};
    JFrame frame = gui.frame;

    JLabel soru = new JLabel(q[x].que);
    JRadioButton y1 = new JRadioButton(q[x].anw1,false);
    JRadioButton y2 = new JRadioButton(q[x].anw2,false);
    JRadioButton y3 = new JRadioButton(q[x].anw3,false);
    JRadioButton y4 = new JRadioButton(q[x].anw4,false);
    ButtonGroup anws = new ButtonGroup();


    JButton next = new JButton("Next");
    JLabel pint = new JLabel(Integer.toString(point));
    
    
    
    real(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        anws.add(y1);
        anws.add(y2);
        anws.add(y3);
        anws.add(y4);
        
        y1.setBounds(228, 181, 493, 54);
        y2.setBounds(228, 224, 493, 54);
        y3.setBounds(228, 268, 493, 54);
        y4.setBounds(228, 305, 493, 54);
        soru.setBounds(80, 80, 950, 54);
        next.setBounds(750,400, 200, 50);
        pint.setBounds(863, 32, 80, 34);

        y1.setFont(new Font("Arial",Font.PLAIN,20));
        y2.setFont(new Font("Arial",Font.PLAIN,20));
        y3.setFont(new Font("Arial",Font.PLAIN,20));
        y4.setFont(new Font("Arial",Font.PLAIN,20));
        soru.setFont(new Font("Arial",Font.PLAIN,38));
        next.setFont(new Font("Arial",Font.PLAIN,20));
        pint.setFont(new Font("Arial",Font.PLAIN,20));

        y1.addActionListener(this);
        y2.addActionListener(this);
        y3.addActionListener(this);
        y4.addActionListener(this);
        next.addActionListener(this);
        
        frame.add(soru);
        frame.add(y1);
        frame.add(y2);
        frame.add(y3);
        frame.add(y4);
        frame.add(next);

    }

    public void nextque(){
        soru.setText(q[x].que);
        y1.setText(q[x].anw1);
        y2.setText(q[x].anw2);
        y3.setText(q[x].anw3);
        y4.setText(q[x].anw4);
    }

    void getpoint(int x){
        switch (x){
            case 0:
                if (answer=="a") point+=10;
                else point-=10;
                break;
            case 1:
                if (answer=="b") point+=10;
                else point-=10;
                break;
            case 2:
                if (answer=="c") point+=10;
                else point-=10;
                break;
            case 3:
                if (answer=="d") point+=10;
                else point-=10;
                break;
            case 4:
                if (answer=="d") point+=10;
                else point-=10;
                break;
            case 5:
                if (answer=="c") point+=10;
                else point-=10;
                break;
            case 6:
                if (answer=="d") point+=10;
                else point-=10;
                break;
            case 7:
                if (answer=="c") point+=10;
                else point-=10;
                break;
            case 8:
                if (answer=="c") point+=10;
                else point-=10;
                break;
            case 9:
                if (answer=="d") point+=10;
                else point-=10;
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==y1){
            answer="a";
        }
        if (e.getSource()==y2){
            answer="b";
        }
        if (e.getSource()==y3){
            answer="c";
        }
        if (e.getSource()==y4){
            answer="d";
        }

        if(e.getSource()==next){
            anws.clearSelection();
            getpoint(x);
            x++;
            if(x==2){
                soru.setBounds(50, 80, 950, 54);
            }
            if (x<=9) nextque();
            else {
                soru.setVisible(false);
                y1.setVisible(false);
                y2.setVisible(false);
                y3.setVisible(false);
                y4.setVisible(false);
                next.setVisible(false);
                new result();
            }
        }
    }
}