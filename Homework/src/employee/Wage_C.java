package employee;

public class Wage_C implements Int_Wage_C {

	Wage_DB wage_m = new Wage_DB();
	Personal_DB pdb = new Personal_DB();
	@Override
	public void viewTotal(String emNum) {
		System.out.println("�⺻��\t\t: "+wage_m.getBasicM(emNum));
		System.out.println("��å�޿�\t\t: "+wage_m.getLevelM(emNum));
		System.out.println("�ĺ�\t\t: "+wage_m.getEatM(emNum));
		System.out.println("�ð��� �޿�\t\t: "+wage_m.getTimeM(emNum));
		System.out.println("�ֹμ�\t\t: "+wage_m.getReTax(emNum));
		System.out.println("��뺸��\t\t: "+wage_m.getEmTax(emNum));
		System.out.println("���ΰǰ�����\t: "+wage_m.getHealth(emNum));
		System.out.println("���ο���\t\t: "+wage_m.getNaPen(emNum));
		System.out.println("�����հ�\t\t: "+wage_m.getOriginM(emNum));
		System.out.println("�����ݾ�\t\t: "+wage_m.getMinusM(emNum));
		System.out.println("�Ǽ��ɾ�\t\t: "+wage_m.getRealM(emNum));
	}
}
