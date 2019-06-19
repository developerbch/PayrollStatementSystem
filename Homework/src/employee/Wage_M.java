package employee;

import java.util.Scanner;

public class Wage_M extends Wage_C implements Int_Wage_M {
	/*
	 * ��ȸ�� �� ������ ������ �� ������ ���´�. ��� ���,�̸� ����� ���� ����� ���� ��ȸ�� ��ü �޿� ������ ��� �����̸� �޿����� �Ӽ�
	 * ����� ���� ������ �Ӽ��� ���� �� ����
	 */

	@Override
	public void choice(Scanner sc) {

		int choiceNum;
		String emNum;
		System.out.println("� ������ �����Ͻðڽ��ϱ�? \n1.����޿���ȸ 2.����޿�����");
		choiceNum = sc.nextInt();

		if (choiceNum == 1) {
			emNum = selectMan(sc); // ������� �޼ҵ� ȣ��
			viewTotal(emNum);
		} else if (choiceNum == 2) {

			emNum = selectMan(sc);

			System.out.println("\t���");
			for (int i = 0; i < list.length; i++) { // �޿� ��� ���
				System.out.println((i + 1) + ". " + list[i]);
			}
			System.out.println("������ ����� �����ϼ���.(��ȣ�� �Է�)");
			choiceNum = sc.nextInt();
			switch (choiceNum) {
			case 1:
				System.out.println("�⺻�޿� ���� ����\n ������ ���� �Է��ϼ���");
				changeBasicM(emNum, sc);
				break;
			case 2:
				System.out.println("��å���� ���� ����\n ������ ���� �Է��ϼ���");
				changeLevelM(emNum, sc);
				break;
			case 3:
				System.out.println("�Ĵ� ���� ����\n ������ ���� �Է��ϼ���");
				changeEatM(emNum, sc);
				break;
			case 4:
				System.out.println("�ð��� �޿� ���� ����\n ������ ���� �Է��ϼ���");
				changeTimeM(emNum, sc);
				break;
			case 5:
				System.out.println("�ֹμ� ���� ����\n ������ ���� �Է��ϼ���");
				changeReTax(emNum, sc);
				break;
			case 6:
				System.out.println("��뺸�� ���� ����\n ������ ���� �Է��ϼ���");
				changeEmTax(emNum, sc);
				break;

			}
		}

	}

	@Override
	public String selectMan(Scanner sc) {
		String[] emnum = pdb.getEmNum();
		String[] name = pdb.getName();
		boolean check = true;
		String emNum;

		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + ". " + emnum[i] + "\t" + name[i]);
		}
		System.out.println("����� ���� ����� �Է����ּ���.");

		do { // ��� ��Ͽ� �°� ����� �Է��ߴµ� Ȯ���ϴ� do-while��
			emNum = sc.next(); // ��� �Է�
			for (int i = 0; i < emnum.length; i++) {
				if (emnum[i].equals(emNum)) {
					check = false;
					break;
				}
			}

			if (check) {
				System.out.println("����� �߸��Է��߽��ϴ�.");
			}

		} while (check);
		return emNum;
	}

	@Override
	public void changeBasicM(String emNum, Scanner sc) {
		int bm;
		int max = 1000000000;
		System.out.println("�⺻��\t: " + wage_m.getBasicM(emNum));
		do {
			bm = sc.nextInt();

			if (bm > max) { // �ݺ� ����
				System.out.println("�⺻���� �ٽ� �ۼ����ּ���.");
				continue;
			}
			
			break;
		} while (true);
		wage_m.setBasicM(emNum, bm);

	}

	@Override
	public void changeLevelM(String emNum, Scanner sc) {
		int lm;
		int max = 1000000000;

		System.out.println("��å�޿�\t: " + wage_m.getLevelM(emNum));
		do {
			lm = sc.nextInt();

			if (lm > max) { // �ݺ� ����
				System.out.println("��å�޿��� �ٽ� �ۼ����ּ���.");
				continue;
			}
			
			break;
		} while (true);
		wage_m.setLevelM(emNum, lm);
	}

	@Override
	public void changeEatM(String emNum, Scanner sc) {
		int em;
		int max = 1000000000;

		System.out.println("�ĺ�\t: " + wage_m.getEatM(emNum));
		do {
			em = sc.nextInt();

			if (em > max) { // �ݺ� ����
				System.out.println("�ĺ� �ٽ� �ۼ����ּ���.");
				continue;
			}

			break;
		} while (true);
		wage_m.setEatM(emNum, em);
	}

	@Override
	public void changeTimeM(String emNum, Scanner sc) {
		int tm;
		int max = 1000000000;

		System.out.println("�ð��� �޿�\t: " + wage_m.getTimeM(emNum));
		do {
			tm = sc.nextInt();
			if (tm > max) { // �ݺ� ����
				System.out.println("�ð��� �޿��� �ٽ� �ۼ����ּ���.");
				continue;
			}
			break;
		} while (true);
		wage_m.setTimeM(emNum, tm);
	}

	@Override
	public void changeReTax(String emNum, Scanner sc) {
		int rt;
		int max = 1000000000;

		System.out.println("�ֹμ�\t: " + wage_m.getReTax(emNum));
		do {
			rt = sc.nextInt();
			
			if (rt > max) { // �ݺ� ����
				System.out.println("�ֹμ��� �ٽ� �ۼ����ּ���.");
				continue;
			}
			break;
		} while (true);
		wage_m.setReTax(emNum, rt);
	}

	@Override
	public void changeEmTax(String emNum, Scanner sc) {
		int et;
		int max = 1000000000;

		System.out.println("��뺸��\t: " + wage_m.getEmTax(emNum));
		do {
			et = sc.nextInt();

			if (et > max) { // �ݺ� ����
				System.out.println("��뺸���� �ٽ� �ۼ����ּ���.");
				continue;
			}
			break;
		} while (true);
		wage_m.setEmTax(emNum, et);
	}
}
