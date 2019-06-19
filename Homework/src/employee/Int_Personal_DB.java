package employee;


public interface Int_Personal_DB {

	/*
	 *  set�Լ����� DB�� ���� �����ϰų� �߰��Ѵ�.(�����ȣ�� �޾� �����Ѵ�.)
	 * 
	 *  get�Լ����� DB���� ���� �����´�.(��� ��ȣ�� �޾� ���� �����´�.)
	 */
	
	/*
	 * String id : ���̵�
	 * String emNum : ��� ��ȣ
	 * String pw : ��� ��ȣ
	 * boolean manage : true�� ������, false�� �Ϲݻ��
	 * int birth : �������
	 * String sex : ����
	 * int staD : �Ի���
	 * String level : ����
	 * String group : �μ�
	 * String eMail : �̸��� �ּ�
	 * String address : �� �ּ�
	 * String phone : �޴��� ��ȣ
	*/
	
	// set�Լ�
	public void setName(String emNum, String name) ;
	public void setId(String emNum, String id) ;
	public void setPW(String emNum, String pw) ;
	public void setManage(String emNum, String manage) ;
	public void setEmNum(String id,String emNum) ; // �����ȣ�� �����ϱ� ���� id�� �����Ѵ�.
	public void createEmNum(String emNum,String id); // �����ȣ�� ����
	public void setBirth(String emNum, int birth) ;
	public void setSex(String emNum,String sex) ;
	public void setStaD(String emNum, int staD ) ;
	public void setLevel(String emNum, String level) ;
	public void setGroup(String emNum,String group) ;
	public void setEMail(String emNum,String eMail) ;
	public void setAddress(String emNum, String address) ;
	public void setPhone(String emNum,String phone) ;
	
	// get�Լ�
	public String[] getId() ; // ��ü ���̵� ��ȸ
	public String[] getEmNum() ; // ��ü �����ȣ ��ȸ
	public String[] getName() ; // ��ü �̸�
	public String getName(String emNum) ;
	public String getId(String emNum) ;
	public String getPW(String emNum) ;
	public boolean getManage(String emNum) ;
	public String getEmNum(String id) ;
	public int getBirth(String emNum) ;
	public String getSex(String emNum) ;
	public int getStaD(String emNum) ;
	public String getLevel(String emNum) ;
	public String getGroup(String emNum) ;
	public String getEMail(String emNum) ;
	public String getAddress(String emNum) ;
	public String getPhone(String emNum) ;
	
	// �����ϴ� �Լ�
	void delete(String emNum); // ��� ��ȣ�� �� ����� �����͸� �����Ѵ�.
}
