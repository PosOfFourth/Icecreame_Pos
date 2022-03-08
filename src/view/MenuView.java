package view;

import java.util.Scanner;

import controller.CustomerController;
import session.Session;
import session.SessionSet;

public class MenuView {
	private static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		while(true) {
			//SessionSet ss = SessionSet.getInstance(); //로그인 확인차 달아둔것
			//System.out.println(ss.getSet());		// 주석처리 해도 무방함! 나중에 지우기...
			
			MenuView.printMenu();
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 :
				MenuView.login();// 로그인
				break;

			case 9 : 
				System.exit(0);
			}
		}
		
	}
	
	/**
	 * 1. 상품구매 or 2.관리자
	 * */
	public static void printMenu() {
		System.out.println("=== Pos of Fourth ===");
		System.out.println("1. 로그인  |  9. 종료");
		
	}
	
	/**
	 * 1.아이스크림 종류 or 2.뒤로가기
	 * */
	public static void printUserMenu() {
		
	}
	
	/**
	 * 로그인 메뉴
	 * */
	public static void login() {
		System.out.println("===회원 로그인===");
		 System.out.print("아이디 : ");
		 String cus_id = sc.nextLine();
		 
		 System.out.print("비번 : ");
		 String cus_pwd = sc.nextLine();
		 
		 CustomerController.login(cus_id, cus_pwd); 
	}
	
	/**
	 * 로그아웃
	 * */
	public static void logout(String cus_id) {
		Session session = new Session(cus_id);
		
		SessionSet ss = SessionSet.getInstance();
		ss.remove(session);	
	}
	
	
	/**
	 * 이번달 인기상품 + 종류선택, 코드 , 개수 입력
	 * */
	public static void printInputOrder() {
		
	}
	
	/**
	 * 관리자기능 - 1.매출조회 2.거래처관리 3.상품관리 4.뒤로가기
	 * */
	public static void printAdminMenu() {
		
	}
}
