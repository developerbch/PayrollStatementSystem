package employee;

import java.util.Scanner;

public class Create_Employee implements Int_Create_Employee {
	private Personal_DB pdb;
	private String[] emNumList;
	private String[] nameList;
	private String[] idList;

	public Create_Employee() {
		pdb = new Personal_DB();
		emNumList = pdb.getEmNum();
		nameList = pdb.getName();
		idList = pdb.getId();
	}

	@Override
	public void create(Scanner sc) {
		String emNum = null;
		boolean logical = true;
		String id = null;
		System.out.println("������ ����� �����ȣ�� �Է��� �ּ���.");
		go: while (logical) {
			emNum = sc.next();

			for (String i : emNumList) {
				if (i.equals(emNum)) {
					System.out.println("������ �����ȣ�� �����մϴ�.\n �����ȣ�� �ٽ� �Է��� �ּ���");
					logical = true;
					continue go;
				}
			}
			System.out.println("������ ����� ID�� �Է��� �ּ���.");
			id = sc.next();
			
			for (String i : idList) {
				if (i.equals(id)) {
					System.out.println("������ ���̵� �����մϴ�.\n ID�� �ٽ� �Է��� �ּ���");
					logical = true;
					id = sc.next();
				}
			}

			logical = false;
		}
		pdb.createEmNum(emNum, id);

	}

	@Override
	public void delete(Scanner sc) {
		String emNum = null;

		System.out.println("   ���\t�̸�");
		for (int i = 0; i < emNumList.length; i++) {
			System.out.println((i + 1) + ". " + emNumList[i] + "\t" + nameList[i]);
		}

		System.out.println("������ �����ȣ�� �Է��� �ּ���.");
		emNum = sc.next();

		pdb.delete(emNum);

	}

}
