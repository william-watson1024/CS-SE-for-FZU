import java.awt.*;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;


public class CardLayoutdemo extends JFrame implements ActionListener{

   JButton nextbutton,preButton;

   JPanel cardPanel=new JPanel();

   JPanel controlpaPanel=new JPanel();

        //���忨Ƭ���ֶ���

   CardLayout card=new CardLayout();

       
        public CardLayoutdemo() {

                  super("��Ƭ���ֹ�����");

                  



                  //����cardPanel������Ϊ��Ƭ����

                  cardPanel.setLayout(card);    



                  //ѭ������cardPanel�����������4����ť

                  //��ΪcardPanel������Ϊ��Ƭ���֣���˳�ʼʱ��ʾ������ӵ����

                  for (int i = 0; i< 4; i++) {

                           //�������ӵ�ÿ����ť��Ӧ����һ����Ƭ��

                           cardPanel.add(new JButton("��ť"+i));

                  }


                //ʵ������ť����

                  nextbutton=new JButton("��һ�ſ�Ƭ");

                  preButton=new JButton("��һ�ſ�Ƭ");



                  //Ϊ��ť����ע�������

                  nextbutton.addActionListener(this);

                  preButton.addActionListener(this);
                  
                  
                  controlpaPanel.add(preButton);

                  controlpaPanel.add(nextbutton);
                  
                  //������������Ϊ��ǰ������������

                  Container container=getContentPane();


                //�� cardPanel�������ڴ��ڱ߽粼�ֵ��м䣬����Ĭ��Ϊ�߽粼��

                  container.add(cardPanel,BorderLayout.CENTER);

                  // ��controlpaPanel�������ڴ��ڱ߽粼�ֵ��ϱߣ�

                  container.add(controlpaPanel,BorderLayout.SOUTH);
                  
                  setSize(400,200);

                  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                  setLocationRelativeTo(null);

                  setVisible(true);
    }
        
        //ʵ�ְ�ť�ļ�������ʱ�Ĵ���

        public void actionPerformed(ActionEvent e){

                  //����û�����nextbutton��ִ�е����

                  if (e.getSource()==nextbutton){

                           //�л�cardPanel����е�ǰ���֮���һ�����

                           //����ǰ���Ϊ�����ӵ����������ʾ��һ�����������Ƭ�����ʾ��ѭ���ġ�

                           card.next(cardPanel);     

                  }

                  if (e.getSource()==preButton){

                           //�л�cardPanel����е�ǰ���֮ǰ��һ�����

                           //����ǰ���Ϊ��һ����ӵ����������ʾ���һ�����������Ƭ�����ʾ��ѭ���ġ�

                           card.previous(cardPanel);

                  }

        }
        
        public static void main(String[] args) {

        	CardLayoutdemo testCardLayout=new CardLayoutdemo();

           

  }
}