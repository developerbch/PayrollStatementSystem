package employee;

public interface Int_Wage_DB {
	/*
	 *  set�Լ����� DB�� ���� �����ϰų� �߰��Ѵ�.(�����ȣ�� �޾� �����Ѵ�.)
	 * 
	 *  get�Լ����� DB���� ���� �����´�.(��� ��ȣ�� �޾� ���� �����´�.)
	 */
	
	/*
	 * int basicM : �⺻�޿�
	 * int levelM : ��å����
	 * int eatM : �ĺ�
	 * int timeM : �ð��� �޿�
	 * int reTax : �ֹμ�
	 * int emTax : ��뺸��
	 * 
	 */
	
	public void setBasicM(String emNum, int basicM) ;
	public void setLevelM(String emNum, int levelM) ;
	public void setEatM(String emNum, int eatM) ;
	public void setTimeM(String emNum, int timeM) ;
	public void setReTax(String emNum, int reTax) ; // �ֹμ� 
	public void setEmTax(String emNum, int emTax) ; // ��뺸�� 
	
	public int getBasicM(String emNum) ;
	public int getLevelM(String emNum) ;
	public int getEatM(String emNum) ;
	public int getTimeM(String emNum) ;
	public int getReTax(String emNum) ; // �ֹμ� 
	public int getEmTax(String emNum) ; // ��뺸�� 
	public String[] getEmNum() ; // ��ü �����ȣ ��ȸ
	
	public int getHealth(String emNum) ; // ���ΰǰ����� - �����հ迡�� 6%
	public int getNaPen(String emNum) ; // ���ο��� - 10%
	public int getOriginM(String emNum) ; // �����հ� - ���
	public int getMinusM(String emNum) ; // �����ݾ� - ���
	public int getRealM(String emNum) ; // �Ǽ��ɾ� - ���
	
	
}
