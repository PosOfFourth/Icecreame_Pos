package model.service;

import java.sql.SQLException;

import exception.NotFoundException;
import model.dto.Customer;

public interface CustomerService {
	
	/**
	 * �α���
	 * */
	public Customer login(String cus_id, String cus_pwd) throws SQLException, NotFoundException;
}
