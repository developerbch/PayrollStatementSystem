package employee;

import java.util.Scanner;

public class Re_M  extends Re_C implements Int_Re_M{
	
	public Re_M() {
		super();
	}
	public void choice(Scanner sc, String emNum) {
		int choiceNum;

		System.out.println("\n\n\n\t���");
		for(int i=0;i<list.length;i++) {
			System.out.println((i+1)+". "+list[i]);
		}
		System.out.println("\n������ ����� �����ϼ���.");
		choiceNum = sc.nextInt();
		switch(choiceNum) {
		case 1:
			System.out.println("�����ȣ ���� ����\n ������ ���� �Է��ϼ���");
			changeEmNum(emNum,sc);
			break;
		case 2:
			System.out.println("������� ���� ����\n ������ ���� �Է��ϼ���");
			changeBirth(emNum,sc);
			break;
		case 3:
			System.out.println("���� ���� ����\n ������ ���� �Է��ϼ���");
			changeSex(emNum,sc);
			break;
		case 4:
			System.out.println("�̸��� ���� ����\n ������ ���� �Է��ϼ���");
			changeEMail(emNum,sc);
			break;
		case 5:
			System.out.println("�ּ� ���� ����\n ������ ���� �Է��ϼ���");
			changeAddress(emNum,sc);
			break;
		case 6:
			System.out.println("�޴�����ȣ ���� ����\n ������ ���� �Է��ϼ���");
			changePhone(emNum,sc);
			break;
		case 7:
			System.out.println("��й�ȣ ���� ����\n ������ ���� �Է��ϼ���");
			changePW(emNum,sc);
			break;
		case 8:
			System.out.println("�̸� ���� ����\n ������ ���� �Է��ϼ���");
			changeName(emNum,sc);
			break;
		case 9:
			System.out.println("���� ���� ����\n ������ ���� �Է��ϼ���");
			changeLevel(emNum,sc);
			break;
		case 10:
			System.out.println("�Ի��� ���� ����\n ������ ���� �Է��ϼ���");
			changeSatD(emNum,sc);
			break;
		case 11:
			System.out.println("�μ� ���� ����\n ������ ���� �Է��ϼ���");
			changeGroup(emNum,sc);
			break;
		case 12:
			System.out.println("���̵� ���� ����\n ������ ���� �Է��ϼ���");
			changeId(emNum,sc);
			break;
		case 13:
			System.out.println("�����ڿ��� ���� ����\n ������ ���� �Է��ϼ���");
			changeManage(emNum,sc);
			break;
		default:
			System.out.println("�̻��Ѱ� ���������� �Ѥ�");

		}
	}


	@Override
	public void changeName(String emNum, Scanner sc) {
		String name;

		do{
			name = sc.next();
			System.out.println("�̸��� 10�� ���Ϸ� �ۼ����ּ���.");
		}while(name.length()>10);
		perDB.setName(emNum,name);
	}

	@Override
	public void changeEmNum(String emNum, Scanner sc) {
		String EmNum;
		do{
			EmNum = sc.next();
			System.out.println("��� ��ȣ�� 10�� ���Ϸ� �ۼ����ּ���.");
		}while(EmNum.length()>10);
		perDB.setEmNum(emNum,EmNum);
	}

	@Override
	public void changeSatD(String emNum, Scanner sc) {
		int staD;
		int max = 1000000000;
		do{
			staD = sc.nextInt();
			System.out.println("�Ի����� �ٽ� �ۼ����ּ���.");
		}while(staD>max);
		perDB.setStaD(emNum,staD);
	}

	@Override
	public void changeLevel(String emNum, Scanner sc) {
		String name;

		do{
			name = sc.next();
			System.out.println("��å�� 40�� ���Ϸ� �ۼ����ּ���.");
		}while(name.length()>40);
		perDB.setLevel(emNum,name);
	}

	@Override
	public void changeGroup(String emNum, Scanner sc) {
		String group;

		do{
			group = sc.next();
			System.out.println("�μ����� 40�� ���Ϸ� �ۼ����ּ���.");
		}while(group.length()>40);
		
		perDB.setGroup(emNum,group);
	}

	@Override
	public void changeId(String emNum, Scanner sc) {//10
		String id;

		do{
			id = sc.next();
			System.out.println("ID�� 10�� ���Ϸ� �ۼ����ּ���.");
		}while(id.length()>10);
		
		perDB.setId(emNum,id);
	}

	@Override
	public void changeManage(String emNum, Scanner sc) { //1
		String manage;
		System.out.println("y. ���Ѻο�  \nn. ���� ����");
		do{
			manage = sc.next();
			System.out.println("������ y, n�� �ۼ����ּ���.");
		}while(!manage.equals("y") || !manage.equals("n"));
		perDB.setManage(emNum,manage);
	}

}
