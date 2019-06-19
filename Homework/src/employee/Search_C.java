package employee;

import java.util.Scanner;

public class Search_C implements Int_Search_C {
	Personal_DB pdb;
	
	public Search_C() {
		pdb = new Personal_DB();
	}
	
	@Override
	public void choice(Scanner sc, String emNum) {
		
		int choice;
		int detail;
		
		
		System.out.println("������ ��ȸ�Ͻðڽ��ϱ�? \n 1. ��ü��ȸ, 2. �κ���ȸ\n");
		choice = sc.nextInt();

		switch (choice) {

		case 1:
			viewTotal(emNum);
			break;
		case 2:
			System.out.println("������ ��ȸ�Ͻðڽ��ϱ�? \n1. �̸�\t   2. ���̵�\t3. �����ȣ\t4. �������\t5. ����\t\t6. ����\n7. �Ի���\t   8. �μ� \t9. e-mail\t10.�ּ�\t\t11. �޴��� ��ȣ\n");
			detail = sc.nextInt();

			switch (detail) {
			case 1:
				viewName(emNum);
				break;
			case 2:
				viewId(emNum);
				break;
			case 3:
				viewEmNum(emNum);
				break;
			case 4:
				viewBirth(emNum);
				break;
			case 5:
				viewSex(emNum);
				break;
			case 6:
				viewLevel(emNum);
				break;
			case 7:
				viewStaD(emNum);
				break;
			case 8:
				viewGroup(emNum);
				break;
			case 9:
				viewEMail(emNum);
				break;
			case 10:
				viewAddress(emNum);
				break;
			case 11:
				viewPhone(emNum);
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. ���� �� �ش�Ǵ� ���ڸ� �Է����ּ���.\n");
			}
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. ���� �� �ش�Ǵ� ���ڸ� �Է����ּ���.\n");
		}
//		do {
//			System.out.println("������ ��ȸ�Ͻðڽ��ϱ�? \n 1. ��ü��ȸ, 2. �κ���ȸ");
//			choice = sc.next();
//
//			if(!choice.equals("��ü��ȸ")||!choice.equals("�κ���ȸ")||!choice.equals("1")||!choice.equals("2")) {
//				System.out.println("");
//			}
//		} while(!choice.equals("��ü��ȸ")||!choice.equals("�κ���ȸ")||!choice.equals("1")||!choice.equals("2"));
//
//		if(choice.equals("��ü��ȸ")||choice.equals("1")) {
//			sec.viewTotal(emNum);
//		}else if(choice.equals("�κ���ȸ")||choice.equals("2")) {
//			
//			do {
//			System.out.println("������ ��ȸ�Ͻðڽ��ϱ�? \n 1. �̸�, 2. ���̵�, 3. �����ȣ, 4. �������, 5. ����, 6. ����, 7. �Ի���, 8.�μ�, 9. �̸���, 10.�ּ�, 11. �޴��� ��ȣ");
//			if()
//			}while();
//			
//		}
		//sec.veiwTotal(emNum);
		

	}

	@Override
		public void viewTotal(String emNum) {
			System.out.println("�̸� : " + pdb.getName(emNum));
			System.out.println("���̵� : " + pdb.getId(emNum));
			System.out.println("�����ȣ : " + emNum);
			System.out.println("������� : " + pdb.getBirth(emNum));
			System.out.println("���� : " + pdb.getSex(emNum));
			System.out.println("���� : " + pdb.getLevel(emNum));
			System.out.println("�Ի��� : " + pdb.getStaD(emNum));
			System.out.println("�μ� : " + pdb.getGroup(emNum));
			System.out.println("�̸��� : " + pdb.getEMail(emNum));
			System.out.println("�ּ� : " + pdb.getAddress(emNum));
			System.out.println("�޴��� ��ȣ : " + pdb.getPhone(emNum));
		
	}

	@Override
	public void viewName(String emNum) {
		System.out.println("�̸� : " + pdb.getName(emNum));

	}

	@Override
	public void viewId(String emNum) {
		System.out.println("���̵� : " + pdb.getId(emNum));

	}

	@Override
	public void viewEmNum(String emNum) {
		System.out.println("�����ȣ : " + emNum);

	}

	@Override
	public void viewBirth(String emNum) {
		System.out.println("������� : " + pdb.getBirth(emNum));

	}

	@Override
	public void viewSex(String emNum) {
		System.out.println("���� : " + pdb.getSex(emNum));

	}

	@Override
	public void viewLevel(String emNum) {
		System.out.println("���� : " + pdb.getLevel(emNum));

	}

	@Override
	public void viewStaD(String emNum) {
		System.out.println("�Ի��� : " + pdb.getStaD(emNum));

	}

	@Override
	public void viewGroup(String emNum) {
		System.out.println("�μ� : " + pdb.getGroup(emNum));

	}

	@Override
	public void viewEMail(String emNum) {
		System.out.println("e-mail : " + pdb.getEMail(emNum));

	}

	@Override
	public void viewAddress(String emNum) {
		System.out.println("�ּ� : " + pdb.getAddress(emNum));

	}

	@Override
	public void viewPhone(String emNum) {
		System.out.println("�޴��� ��ȣ : " + pdb.getPhone(emNum));

	}

}
