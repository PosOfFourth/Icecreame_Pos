package view;

import java.util.List;

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
		System.out.println("***************************************");
		System.out.println("                                �ŷ�ó ��ȸ                              ");
		System.out.println("***************************************");
		System.out.println("�ŷ�ó �ڵ�  | ��� ���� | �ŷ�ó �̸� | �ּ� | ��ȭ��ȣ");
		for(Dealer dealer : dealerList) {
			System.out.println(dealer);
		}
		System.out.println();
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
	 * �޼��� ���
	 * */
	public static void printMessage(String message) {
		
	}
}
