package view;

import java.util.Scanner;

import controller.CustomerController;
import session.Session;
import session.SessionSet;

public class MenuView {
	private static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		while(true) {
			//SessionSet ss = SessionSet.getInstance(); //�α��� Ȯ���� �޾Ƶа�
			//System.out.println(ss.getSet());		// �ּ�ó�� �ص� ������! ���߿� �����...
			
			MenuView.printMenu();
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 :
				MenuView.login();// �α���
				break;

			case 9 : 
				System.exit(0);
			}
		}
		
	}
	
	/**
	 * 1. ��ǰ���� or 2.������
	 * */
	public static void printMenu() {
		System.out.println("=== Pos of Fourth ===");
		System.out.println("1. �α���  |  9. ����");
		
	}
	
	/**
	 * 1.���̽�ũ�� ���� or 2.�ڷΰ���
	 * */
	public static void printUserMenu() {
		
	}
	
	/**
	 * �α��� �޴�
	 * */
	public static void login() {
		System.out.println("===ȸ�� �α���===");
		 System.out.print("���̵� : ");
		 String cus_id = sc.nextLine();
		 
		 System.out.print("��� : ");
		 String cus_pwd = sc.nextLine();
		 
		 CustomerController.login(cus_id, cus_pwd); 
	}
	
	/**
	 * �α׾ƿ�
	 * */
	public static void logout(String cus_id) {
		Session session = new Session(cus_id);
		
		SessionSet ss = SessionSet.getInstance();
		ss.remove(session);	
	}
	
	
	/**
	 * �̹��� �α��ǰ + ��������, �ڵ� , ���� �Է�
	 * */
	public static void printInputOrder() {
		
	}
	
	/**
	 * �����ڱ�� - 1.������ȸ 2.�ŷ�ó���� 3.��ǰ���� 4.�ڷΰ���
	 * */
	public static void printAdminMenu() {
		
	}
}
