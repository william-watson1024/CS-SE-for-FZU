//��ļ̳�
class J_Employee
{
	public int m_workyear ; //��������
	
	public J_Employee() {
		// TODO Auto-generated constructor stub
		m_workyear = 1; 
	}
	
}

public class J_Teacher extends J_Employee {
	
	public int m_classHour; 
	
	public J_Teacher() {
		// TODO Auto-generated constructor stub
		m_classHour = 96;
	}
	
	public void mb_printInfo()
	{
		System.out.println("�ý�ʦ�Ĺ�������Ϊ " + m_workyear);
		System.out.println("�ý�ʦ���ڿο�ʱΪ" + m_classHour);
	}
	
	public static void main(String[] args) {
		J_Teacher teacher = new J_Teacher();
		teacher.mb_printInfo();
	}
}
