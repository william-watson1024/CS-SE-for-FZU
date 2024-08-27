import java.net.*;
import java.io.*;
import java.util.Scanner;
// �������
public class Server {
    public static void main(String[] argc) {
        try {
            // ����ServerSocket���󣬼���8888�˿ڣ��ȴ��ͻ�������
            ServerSocket ss = new ServerSocket(8888);

            // ����һ���ͻ��˵���������
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            // ��ȡSocket�������������ڶ�ȡ�ͻ��˷���������
            InputStream is = s.getInputStream();
            // ��ȡSocket���������������ͻ��˷�������
            PrintWriter writer = new PrintWriter(os);
            // ʹ��BufferedReader��װ���������Ա㰴�ж�ȡ�ı�
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // ����Scanner�������ڶ�ȡ����̨���루ʵ��������Ӧֱ���ṩ��Ӧ��ʾ���п�������
            Scanner sc = new Scanner(System.in);
            // ����ѭ����������ȡ�ͻ��˷��͵���Ϣ����Ӧ
            while (true) {
                String msg = br.readLine(); // ��ȡһ�пͻ��˷��͵���Ϣ
                if (msg == null) { // �����ϢΪnull����ʾ���ӹرգ��˳�ѭ��
                    break;
                }
                // ����ʵ����Ӧ��ֱ�ӷ��ʹ�������Ϣ��̶���Ӧ���ͻ��ˣ������Ƕ�ȡ����̨����
                // ��Ϊ����ʾ�����뱣��һ�£������˶�ȡ����̨���߼�
                writer.println(sc.next()); // ���ʹӿ���̨��ȡ��һ���ı���Ϊ��Ӧ
                writer.flush(); // ��������������ȷ�����ݱ�����
            }

            // �ر���Դ
            writer.close();
            is.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            // ��ӡ�쳣��ջ��Ϣ�����ڵ���
            e.printStackTrace();
        }
    }
}