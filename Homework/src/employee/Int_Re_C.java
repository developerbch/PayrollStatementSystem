package employee;

import java.util.Scanner;

public interface Int_Re_C {
	/*
	 * �Ӽ����� ����� �����ָ� �����  ������ ������ ���´�.
	 */
	
	static final String[] list = {"�����ȣ", "�������", "����"
			, "�̸���", "�ּ�", "�޴��� ��ȣ", "��й�ȣ","�̸�", "����"
			, "�Ի���", "�μ�", "���̵�", "������ ����"};
	
	void choice(Scanner sc,String emNum); // � �Ӽ��� ������ ������ ���´�.
	
	void changePW(String emNum, Scanner sc);
	void changeBirth(String emNum, Scanner sc);
	void changeSex(String emNum, Scanner sc);
	void changeEMail(String emNum, Scanner sc);
	void changeAddress(String emNum, Scanner sc);
	void changePhone(String emNum, Scanner sc);
}
