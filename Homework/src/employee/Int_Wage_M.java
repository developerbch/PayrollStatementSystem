package employee;

import java.util.Scanner;

public interface Int_Wage_M extends Int_Wage_C {
	/*
	 * ��ȸ�� �� ������ ������ �� ������ ���´�.
	 * ��� ���,�̸� ����� ���� ����� ����
	 * ��ȸ�� ��ü �޿� ������ ���
	 * �����̸� �޿����� �Ӽ� ����� ���� ������ �Ӽ��� ���� �� ����
	 */
	
	static final String[] list = {"�⺻�޿�", "��å����", "�Ĵ�", "�ð��� �޿�", "�ֹμ�", "��뺸��"}; // �޿��������� ������ ���
	
	void choice(Scanner sc);
	String selectMan(Scanner sc);
	
	void changeBasicM(String emNum, Scanner sc);
	void changeLevelM(String emNum, Scanner sc);
	void changeEatM(String emNum, Scanner sc);
	void changeTimeM(String emNum, Scanner sc);
	void changeReTax(String emNum, Scanner sc);
	void changeEmTax(String emNum, Scanner sc);
}
