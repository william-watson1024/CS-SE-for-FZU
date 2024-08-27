import java.io.*;

public class FileStreamDemo {
	public static void main(String[] args)
	{
		String file1,file2 ;
		int ch = 0 ;
		file1 = "��7�ο�/FileStreamDemo/file1.txt";
		file2="file2.txt";
		try
		{
			//�������������
			FileInputStream fis = new FileInputStream(file1);
			FileOutputStream fos=new FileOutputStream(file2);
			
			int size=fis.available();
			System.out.println("�ֽ���Ч����"+size);
			
			//�����ļ�����
			while ((ch=fis.read())!=-1)
			{
				fos.write(ch);
			}
			fis.close();
			fos.close();
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		} 
	}
}
