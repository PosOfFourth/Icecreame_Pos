package model.dao;

import java.sql.SQLException;

import model.dto.Customer;

public interface CustomerDAO {
	/**
	 * �α����ϱ�
	 * */
	Customer login(String cus_id, String cus_pwd)throws SQLException;
}
