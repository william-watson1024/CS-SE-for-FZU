import javax.swing.*;

public class JFrameSample extends JFrame{
	
	JButton b_exit;
	
    JFrameSample(String str)
    {
        super(str);
        setSize(400,300);       //���ô��ڴ�С
        //������ť����
        b_exit=new JButton(" Exit ");
        add(b_exit);    
    }

    public static void main(String args[])
    {
        //��������������ô������
        JFrame frame = new JFrameSample("sample frame");
        frame.setVisible(true);    //��ʾ����
    }

}
