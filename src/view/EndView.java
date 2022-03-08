package view;

import java.util.List;
import java.util.Map;

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
	 * 많이 팔린 상위 5개 출력 
	 * */
	public static void printMessage(Map<Integer, String> map) {
		System.out.println(map);
	}
	
	
	/**
	 * 메세지 출력
	 * */
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
