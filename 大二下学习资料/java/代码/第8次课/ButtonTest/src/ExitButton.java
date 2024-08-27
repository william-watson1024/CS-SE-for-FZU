import java.awt.event.*;
import javax.swing.*;

public class ExitButton extends JFrame implements ActionListener
{
	private JButton B_Exit;
	public ExitButton(String str)
	{
		super(str);
		
        //������ť����
        B_Exit=new JButton(" Exit ");
        
        //����ť���ص�JFrame��
        add(B_Exit);  
        
        //Ϊ��ť���ؼ�����
        B_Exit.addActionListener(this);  
	}
	
	public void actionPerformed(ActionEvent e)
    {
        dispose();
    }
	
	public static void main(String args[])
	{
		ExitButton eb=new ExitButton("Exit Test");
		eb.setSize(400,300); 
		eb.setVisible(true); 
		
	}

}
