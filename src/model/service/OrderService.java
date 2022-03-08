package model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.dao.OrderDAO;
import model.dao.OrderDAOImpl;
import model.dto.OrderLine;
import model.dto.Orders;

public interface OrderService {
	OrderDAO orderDao = new OrderDAOImpl();
	
	public int orderInsert(Orders order) throws SQLException;
	
	public int[] orderLineInsert(Connection con, Orders order) throws SQLException;
	
	public int[] decrementStock(Connection con, List<OrderLine> orderLineList) throws SQLException;
	
	public List<Orders> orderTotal(String cusPhone) throws SQLException;
}
