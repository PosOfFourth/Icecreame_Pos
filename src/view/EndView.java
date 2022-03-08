package view;

import java.util.List;

import model.dto.Dealer;
import model.dto.Goods;
import model.dto.Ib;
import model.dto.Orders;

public class EndView {
	/**
	 * 전체 상품 출력
	 * */
	public static void printGoodsList(List<Goods> list) {
		
	}
	
	/**
	 * 고객 영수증 출력
	 * */
	public static void printOrderTotal(List<Orders> orderList) {
		
	}
	
	/**
	 * 전체 거래처 출력
	 * */
	public static void printDealerList(List<Dealer> dealerList) {
		System.out.println("***************************************");
		System.out.println("                                거래처 조회                              ");
		System.out.println("***************************************");
		System.out.println("거래처 코드  | 취급 종류 | 거래처 이름 | 주소 | 전화번호");
		for(Dealer dealer : dealerList) {
			System.out.println(dealer);
		}
		System.out.println();
	}
	
	/**
	 * 발주 영수증 출력
	 * */
	public static void printIbTotal(List<Ib> ibList) {
		
	}
	
	/**
	 * 전체 매출 출력
	 * */
	
	/**
	 * 메세지 출력
	 * */
	public static void printMessage(String message) {
		
	}
}
