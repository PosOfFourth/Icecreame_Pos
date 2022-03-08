package model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.dto.OrderLine;
import model.dto.Orders;

public interface OrderDAO {
	/**
	 * ì£¼ë¬¸?•˜ê¸?
	 * */
	int orderInsert(Orders order) throws SQLException;
	
	/**
	 * ì£¼ë¬¸?ƒ?„¸ ?“±ë¡í•˜ê¸?
	 * */
	int[] orderLineInsert(Connection con, Orders order) throws SQLException;
	
	/**
	 * ?¬ê³ ëŸ‰ ê°ì†Œ?‹œ?‚¤ê¸?
	 * */
	int[] decrementStock(Connection con, List<OrderLine> orderLineList) throws SQLException;
	
	/**
	 * ê²°ì œ?•˜ê¸?(ì£¼ë¬¸?‚´?—­ë³´ê¸°)
	 * */
	List<Orders> orderTotal(String cusPhone) throws SQLException;
}