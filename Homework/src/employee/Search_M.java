package employee;

import java.util.Scanner;

public class Search_M extends Search_C implements Int_Search_M  {

	
	String emNum ;
	int choice ;
	int detail ;
	Personal_DB pdb;
	public Search_M() {
		pdb = new Personal_DB();
		emNum = null ;
		choice = 0 ;
		detail = 0 ;
	}
	
	
	@Override
	public String selectMan(Scanner sc) {
		String[] name = pdb.getName();
		String[] emn = pdb.getEmNum();
		boolean check = true;
		
		System.out.println("    ��� \t �̸�");
		for(int i=0;i<name.length;i++) {

			System.out.println((i+1) + ". " + emn[i] +"\t"+name[i]);
		}
			
		System.out.println("��ȸ�� ����� �����ȣ�� �Է��ϼ���");
		emNum = sc.next();							//selectMan�� ���� �����ȣ�� �����!�׹�ȣ�³��߿�ó������!
		
		do {  //��� ��Ͽ� �°� ����� �Է��ߴµ� Ȯ���ϴ� do-while��

			for(int i =0;i<emn.length;i++) {
				if(emn[i].equals(emNum)) {
					check = false;
					break;
				}
			}
			if(check){
				System.out.println("����� �߸��Է��߽��ϴ�. ");
			}
		}while(check);
		
		return emNum;
	}

	@Override
	public void choice(Scanner sc) {
		System.out.println("������ ��ȸ�Ͻðڽ��ϱ�? \n 1. ��ü��ȸ, 2. �κ���ȸ \n");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			viewTotal(emNum);
			;
			break;
		case 2:
			System.out.println("������ ��ȸ�Ͻðڽ��ϱ�? \n1. �̸�\t   2. ���̵�\t3. �����ȣ\t4. �������\t5. ����\t\t6. ����\t      7. �Ի���\n8. �μ� \t   9. e-mail\t10.�ּ�\t\t11. �޴��� ��ȣ\t12. ��й�ȣ\t13. ������ ����\n");
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
			case 12:
				viewPW(emNum);
				break;
			case 13:
				viewManage(emNum);
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. ���� �� �ش�Ǵ� ���ڸ� �Է����ּ���.\n");
			}
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. ���� �� �ش�Ǵ� ���ڸ� �Է����ּ���. \n");
		}

	}// end method choice

	public void viewTotal(String emNum) {
		super.viewTotal(emNum);
		viewPW(emNum);
		viewManage(emNum);
	}
	
	@Override
	public void viewPW(String emNum) {
		System.out.println("��й�ȣ : " + pdb.getPW(emNum));
		
	}

	@Override
	public void viewManage(String emNum) {
		String manage = null;
		if (pdb.getManage(emNum)) {
			manage = "��";
		} else {
			manage = "�ƴϿ�";
		}
		
		System.out.println("������ ���� : " + manage);
		
	}


}
