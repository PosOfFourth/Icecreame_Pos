package model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.dto.OrderLine;
import model.dto.Orders;

public interface OrderDAO {
	/**
	 * 주문?���?
	 * */
	int orderInsert(Orders order) throws SQLException;
	
	/**
	 * 주문?��?�� ?��록하�?
	 * */
	int[] orderLineInsert(Connection con, Orders order) throws SQLException;
	
	/**
	 * ?��고량 감소?��?���?
	 * */
	int[] decrementStock(Connection con, List<OrderLine> orderLineList) throws SQLException;
	
	/**
	 * 결제?���?(주문?��?��보기)
	 * */
	List<Orders> orderTotal(String cusPhone) throws SQLException;
}