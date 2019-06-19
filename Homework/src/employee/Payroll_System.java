package employee;

import java.util.Scanner;

public class Payroll_System {
	
	String emNum;
	
	public Payroll_System() {
		emNum = null;
	}

	boolean start(Scanner sc) {
		Login login = new Login();
		boolean yes = false; // �α��� ���� ����
		boolean manage = false; // ������ ����
		String id = null;
		String pw = null;
		
		System.out.println("�ȳ��ϼ���. �ݰ����ϴ�.");
		
		do {
			id = login.inputId(sc);
			pw = login.inputPW(sc);
			yes = login.check(id, pw);
			if(!yes) {
				System.out.println("�н����� �Ǵ� ���̵� Ʋ�Ƚ��ϴ�.");
			}
		} while (!yes);
		
		manage = login.checkManage(id);
		
		Personal_DB pdb = new Personal_DB();
		
		emNum = pdb.getEmNum(id);
		
		return manage;
	}
	
	boolean select(Scanner sc) {
		Select gaein = new Select();
		return gaein.selectP(sc);
	}
	
	void end(boolean manage, Scanner sc) {
		
		boolean sel = false;
		
		if (manage) { // ������ �� ��� �����ϴ� ����
			System.out.println("����� ���� �Ǵ� ������ �Ͻðڽ��ϱ�?\n(Yes : y, No : n)");
			if(sc.next().toLowerCase().equals("y")) {
				Create_Employee ce = new Create_Employee();
				
				System.out.println("� �۾��� �Ͻðڽ��ϱ�?(��ȣ�� �Է�)\n1. ����\t2. ����");
				if(sc.nextInt() == 1) {
					ce.delete(sc);
				}else {
					ce.create(sc);
				}
				
				return;
			}
			
			sel = select(sc); // ��������, �޿����� ���� ����
			
			if (sel) { // ���������� ��� ����
				Search_M scm = new Search_M();
				scm.selectMan(sc);
				scm.choice(sc);
			} else { // �޿������� ��� ����
				Wage_M wm = new Wage_M();
				wm.choice(sc);
				
			}
		} else { // �Ϲ� ������� ��� �����ϴ� ����
			
			sel = select(sc); // ��������, �޿����� ���� ����
			
			if (sel) { // ���������� ��� ����
				Search_C scc = new Search_C();
				scc.choice(sc, emNum);
			} else { // �޿������� ��� ����
				Wage_C wc = new Wage_C();
				wc.viewTotal(emNum);
			}
		}
	}
	

	public static void main(String[] args) {
		boolean manage = false; // ������ ����
		boolean repeat = false; // �ٽ� �ݺ��� ���� ��
		
		Scanner sc = new Scanner(System.in);
		Payroll_System ps = new Payroll_System();
		
		// �α��� 
				manage = ps.start(sc);
		
		do {
			//���� ������ ��ȸ
			ps.end(manage, sc);
			
			System.out.println("�ٽ� �̿��Ͻðڽ��ϱ�?\n(Yes : y, No : n)");
			repeat = sc.next().toLowerCase().equals("y"); 
			// yes�� true�� ���� ������ ���� ���� ���´�. 
			
		} while (repeat);
		
		System.out.println("�̿��� �ּż� �����մϴ�.");

		
	}// end method main

}// end class Payroll_System
