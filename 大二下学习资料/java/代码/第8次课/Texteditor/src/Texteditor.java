import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Texteditor extends JFrame implements ActionListener
{
	private JMenu filemenu= new JMenu("File");
	private JMenuItem fopen=new JMenuItem("Open");
	private JMenuItem exit=new JMenuItem("Exit");
	private JTextArea text=new JTextArea();
	private Container c;
	
	public Texteditor()
	{
		super("Text editor");
		filemenu.add(fopen);
		filemenu.add(exit);
		JMenuBar menu= new JMenuBar();
		menu.add(filemenu);
		setJMenuBar(menu);
		setLayout(new BorderLayout());
		add(text,BorderLayout.CENTER);
		fopen.addActionListener(this);
		exit.addActionListener(this);
		setSize(400,400);
		setVisible(true);	
	}
	
	public void readFile(String file)
	{
		text.setText("");
		try{
             //���û����������ļ����׽�
			BufferedReader in= new BufferedReader(new FileReader(file));
			String line;
			
            //���ļ��������ļ�������ʾ���ı���
			while((line=in.readLine())!= null)
			  text.append(line+"\n");
			
            //�رջ�����
			in.close();
			
            //���ù���λ��
			text.setCaretPosition(0);
		}catch(IOException ioe){
			System.err.println(ioe);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==exit)
		  System.exit(0);
		else if(e.getSource()==fopen)
		     {
                 //ʹ���ļ�ѡ��Ի���
		     	JFileChooser fileChooser=new JFileChooser();
		     	
                 //�������û�����ͨ���öԻ���ѡ���ļ�
		     	fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		     	
                //�������ļ��Ի���
		     	int result=fileChooser.showOpenDialog(this);
		     	
                //���û����ȡ�����򷵻�
		     	if(result==JFileChooser.CANCEL_OPTION)
		     	  return;
		     	
                //������ѡ����ļ�
		     	File filename=fileChooser.getSelectedFile();
		     	
		     	if(filename==null)
		     	  JOptionPane.showMessageDialog(this,"Invalid File Name","Invalid File Name",JOptionPane.ERROR_MESSAGE);
		     	else{
		     		readFile(filename.toString());
		     	}
		     }
		       
		       
	}
	
	public static void main(String arg[])
	{
		Texteditor te= new Texteditor();
	}
}
