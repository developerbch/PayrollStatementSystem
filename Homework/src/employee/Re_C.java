package employee;

import java.util.Scanner;

public class Re_C implements Int_Re_C{

	Personal_DB perDB;
	Re_C(){perDB= new Personal_DB();}
	@Override
	public void choice(Scanner sc, String emNum) {
		// TODO Auto-generated method stub
		int choiceNum;
		System.out.println("\t���");
		for(int i=1;i<=6;i++) {
			System.out.println(i+list[i]);
		}
		System.out.println("������ ����� �����ϼ���.");
		choiceNum = sc.nextInt();
		switch(choiceNum) {
		case 1:
			System.out.println("������� ���� ����\n ������ ���� �Է��ϼ���");
			changeBirth(emNum,sc);
			break;
		case 2:
			System.out.println("���� ���� ����\n ������ ���� �Է��ϼ���");
			changeSex(emNum,sc);
			break;
		case 3:
			System.out.println("�̸��� ���� ����\n ������ ���� �Է��ϼ���");
			changeEMail(emNum,sc);
			break;
		case 4:
			System.out.println("�ּ� ���� ����\n ������ ���� �Է��ϼ���");
			changeAddress(emNum,sc);
			break;
		case 5:
			System.out.println("�޴�����ȣ ���� ����\n ������ ���� �Է��ϼ���");
			changePhone(emNum,sc);
			break;
		case 6:
			System.out.println("��й�ȣ ���� ����\n ������ ���� �Է��ϼ���");
			changePW(emNum,sc);
			break;
		
		}
	}

	@Override
	public void changePW(String emNum, Scanner sc) { //20
		String pw;

		do{
			pw = sc.next();
			System.out.println("PW�� 20�� ���Ϸ� �ۼ����ּ���.");
		}while(pw.length()>20);
		
		perDB.setPW(emNum,pw);
	}

	@Override
	public void changeBirth(String emNum, Scanner sc) { //38
		int staD;
		int max = 1000000000;
		do{
			staD = sc.nextInt();
			System.out.println("�Ի����� �ٽ� �ۼ����ּ���.");
		}while(staD>max);
		perDB.setBirth(emNum,staD);		
	}

	@Override
	public void changeSex(String emNum, Scanner sc) { //1
		String sex;
		do {
		System.out.println("m : ����  w : ����");
		sex = sc.next();
		}while(!sex.equals("m") || !sex.equals("w"));
		perDB.setSex(emNum,sex);
	}

	@Override
	public void changeEMail(String emNum, Scanner sc) { //100
		String email = null;

		do{
			email = sc.next();
			System.out.println("EMail�� 200�� ���Ϸ� �ۼ����ּ���.");
		}while(email.length()>200);
		
		perDB.setEMail(emNum,email);
	}

	@Override
	public void changeAddress(String emNum, Scanner sc) { //200
		String address;

		do{
			address = sc.next();
			System.out.println("�ּҸ� 200�� ���Ϸ� �ۼ����ּ���.");
		}while(address.length()>200);
		
		perDB.setAddress(emNum,address);
	}

	@Override
	public void changePhone(String emNum, Scanner sc) { //13
		String phone;

		do{
			phone = sc.next();
			System.out.println("EMail�� 200�� ���Ϸ� �ۼ����ּ���.");
		}while(phone.length()>13);
		
		perDB.setPhone(emNum,phone);
	}


}
