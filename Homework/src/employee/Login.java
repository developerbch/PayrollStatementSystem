package employee;

import java.util.Scanner;

public class Login implements Int_Login{

	Personal_DB db = new Personal_DB();	
	
	@Override
	public String inputId(Scanner sc) {
		
		String idstore;


		do{
			System.out.println("ID�� �Է����ּ���. : ");
			idstore = sc.next();
			
			if(idstore.length()>10) {  //���̵� �Է¹ް� 10���ں��� ũ�� �ٽ��Է��ϰԲ� �ϴ� �� 
				System.out.println("ID�� 10���� �̻��Դϴ�.");
			}
			
		}while(idstore.length()>10);
		
		return idstore;    //ȣ���ϴ� ������ �����ִ� ��
	}

	@Override
	public String inputPW(Scanner sc) {  //��й�ȣ�� �Է�

		String pwstore;

		System.out.println("PW�� �Է����ּ���. : ");
		pwstore = sc.next();
		
		return pwstore;
	}

	@Override
	public boolean check(String id, String pw) { //�α��� Ȯ��
		
		String[] ids = db.getId();
		boolean yes = false;
		
		for(int i=0;i<ids.length;i++) {
		
			if(ids[i].equals(id)) {
				String dbPW = db.getPW(db.getEmNum(id));
				if(dbPW.equals(pw)) {
					yes = true;
				}
			}
		}
		return yes;
	}

	@Override
	public boolean checkManage(String id) {
		
		boolean m = db.getManage(db.getEmNum(id));
		
		return m;
	}
}
