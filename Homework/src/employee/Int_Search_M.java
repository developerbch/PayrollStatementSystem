package employee;

import java.util.Scanner;

public interface Int_Search_M extends Int_Search_C{
	/*
	 * ����� �̸� ����� ���� � ����� ������ �� ������ �����Ѵ�.
	 * ��ü ��ȸ�� �� ������ �κ� ��ȸ�� �� ������ ���´�.
	 * ��ü ��ȸ�� viewTotal()�� �����Ͽ� ��ü ������ ���
	 * �κ� ��ȸ�� �Ӽ����� ����� ���� �Ӽ��� �����Ѵ�.
	 * ������ �Ӽ��� ������ ���
	 * */
	
	String selectMan(Scanner sc); // ������ ����� ����� ��ȯ
	
	void choice(Scanner sc);//��ü, �κ� ����
	
		//��ü ��ȸ
		void viewTotal(String emNum) ;
		
		//�κ� ��ȸ
		void viewPW(String emNum);
		void viewManage(String emNum);
}
