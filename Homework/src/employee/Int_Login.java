package employee;

import java.util.Scanner;

public interface Int_Login {
	/*
	 * �α��� Ŭ������ ���̵� �޾� ���̵� ���ڼ��� �˻��Ͽ� 10������ ũ�� �ٽ� �޴´�.
	 * ���̵� ���ڼ��� 10���� ������ ����� �ް� ���̵� �����ϴ��� Ȯ���Ѵ�.
	 * ���̵� �����ϸ� ����� Ȯ���ϰ� �α��� �Ǹ� ���������� Ȯ���Ͽ� �ٸ� Ŭ�������� �����Ѵ�.
	 * �� ���ǿ��� false�� �Ǹ� ó������ �ٽ� ���ư���.
	*/
	//���̵� �Է¹ް� ���ڼ� Ȯ�� �޼ҵ�
	
	
	String inputId(Scanner sc);
	String inputPW(Scanner sc);
	boolean check(String id, String pw);
	
	boolean checkManage(String id); 
	
	
	
}