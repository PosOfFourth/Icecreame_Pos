package view;

import java.util.List;
import java.util.Map;

import model.dto.Dealer;
import model.dto.Goods;
import model.dto.Ib;
import model.dto.Orders;

public class EndView {
	/**
	 * ��ü ��ǰ ���
	 * */
	public static void printGoodsList(List<Goods> list) {
		
	}
	
	/**
	 * �� ������ ���
	 * */
	public static void printOrderTotal(List<Orders> orderList) {
		
	}
	
	/**
	 * ��ü �ŷ�ó ���
	 * */
	public static void printDealerList(List<Dealer> dealerList) {
		
	}
	
	/**
	 * ���� ������ ���
	 * */
	public static void printIbTotal(List<Ib> ibList) {
		
	}
	
	/**
	 * ��ü ���� ���
	 * */
	
	
	/**
	 * ���� �ȸ� ���� 5�� ��� 
	 * */
	public static void printMessage(Map<Integer, String> map) {
		System.out.println(map);
	}
	
	
	/**
	 * �޼��� ���
	 * */
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
