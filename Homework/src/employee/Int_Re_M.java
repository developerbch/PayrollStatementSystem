package employee;

import java.util.Scanner;

public interface Int_Re_M extends Int_Re_C {
	
	/*
	 * �Ӽ����� ����� �����ָ� �����  ������ ������ ���´�.
	 */
	
	void choice(Scanner sc, String emNum); // ��ü, �κ� ����

		void changeName(String emNum, Scanner sc);
		void changeEmNum(String emNum, Scanner sc);
		void changeSatD(String emNum, Scanner sc);
		void changeLevel(String emNum, Scanner sc);
		void changeGroup(String emNum, Scanner sc);
		void changeId(String emNum, Scanner sc);
		void changeManage(String emNum, Scanner sc);
}
