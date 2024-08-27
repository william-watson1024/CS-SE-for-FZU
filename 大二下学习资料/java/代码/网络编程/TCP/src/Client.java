import java.io.*;
import java.net.*;
import java.util.Scanner;

// �ͻ�����
public class Client {
    public static void main(String[] argc) {
        try {
            // ����һ��Socket�������ӵ�����������8888�˿�
            Socket s = new Socket("localhost", 8888);
            InputStream is = s.getInputStream();
            // ��ȡSocket����������������������������
            OutputStream os = s.getOutputStream();
            // ʹ��PrintWriter��װ��������Ա�������д���ı�
            PrintWriter writer = new PrintWriter(os);
            // ��ȡSocket�������������ڽ��շ�����������
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // ����Scanner�������ڶ�ȡ����̨����
            Scanner sc = new Scanner(System.in);
            // ����ѭ����������ȡ�û����벢���͵�������
            while (true) {
                String str = sc.next(); // ��ȡ�û������һ���ı�
                if (str == null) { // �������Ϊnull���˳�ѭ��
                    break;
                }
                writer.println(str); // ���û�����д�������������ӻ��з�
                writer.flush(); // ������������������ȷ�����ݱ�����
                System.out.println(br.readLine());
            }

            // �ر���Դ
            writer.close();
            os.close();
            s.close();
        } catch (Exception e) {
            // ��ӡ�쳣��ջ��Ϣ�����ڵ���
            e.printStackTrace();
        }
    }
}

