package employee;

import java.util.Scanner;

public class Select implements Int_Select {

	@Override

	public boolean selectP(Scanner sc) {


		int select;

		do {

			System.out.println("� ������ �����Ͻðڽ��ϱ�? \n 1. ��������, 2. �޿�����");
			select = sc.nextInt();


			switch(select) {

			case 1 : 
				return true;
			case 2 : 
				return false;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. ���� �� �ش�Ǵ� ���ڸ� �Է����ּ���.");
			}
		}while(true);

	}
}

//		do {
//			System.out.println("� ������ �����Ͻðڽ��ϱ�? \n 1. ��������, 2. �޿�����");
//			select = sc.next();
//			
//			if(!select.equals("��������")||!select.equals("�޿�����")||!select.equals("1")||!select.equals("2")) {
//				System.out.println("�߸��Է��ϼ̽��ϴ�. �־��� �׸� �߿��� �������ּ���.");
//			}
//			
//		}while(!select.equals("��������")||!select.equals("�޿�����")||!select.equals("1")||!select.equals("2"));
//
//		//System.out.println("�ش� ��� �߿��� �ٽ� �Է��ϼ���.");
//
//		if(select.equals("��������") || select.equals("1")) {
//			//���������� ������ �޼ҵ�? 
//			Search_C sec= new Search_C();			 //Search_C�� Ŭ������ sec��� ���� ������ ����.
//			sec.choice(); 							//Search_C�� �ִ� choice�޼ҵ带 ����ϰڴ�?,���ڴ�?
//		}else if(select.equals("�޿�����") || select.equals("2")){
//			Wage_C wac = new Wage_C();
//			wac.viewTotal();
//		}

//
//		return false;
//	}
//}