package employee;

import java.util.Scanner;

public interface Int_Search_C {
	/*
	 * ��ü ��ȸ�� �� ������ �κ� ��ȸ�� �� ������ ���´�.
	 * ��ü ��ȸ�� viewTotal()�� �����Ͽ� ��ü ������ ���
	 * �κ� ��ȸ�� �Ӽ����� ����� ���� �Ӽ��� �����Ѵ�.
	 * ������ �Ӽ��� ������ ���
	 * */
	
	// �Ӽ��� ���
	static final String[] list = {"�����ȣ", "�������", "����", "�̸���", "�ּ�", "�޴��� ��ȣ", "�̸�", "����", "�Ի���", "�μ�", "��й�ȣ", "���̵�", "������ ����"};
	
	void choice(Scanner sc, String emNum); // ��ü, �κ� ����
		//��	���� ������ �ٽ�
		
		// ��ü ���
		void viewTotal(String emNum); 		
		
		//�κ� ���
		void viewName(String emNum);
		void viewId(String emNum);
		void viewEmNum(String emNum);
		void viewBirth(String emNum); //���̵� ��� �� ���
		void viewSex(String emNum);
		void viewLevel(String emNum);
		void viewStaD(String emNum);
		void viewGroup(String emNum);
		void viewEMail(String emNum);
		void viewAddress(String emNum);
		void viewPhone(String emNum);
		
}
