package model.service;

import java.sql.SQLException;

import exception.NotFoundException;
import model.dao.CustomerDAO;
import model.dao.CustomerDAOImpl;
import model.dto.Customer;
import session.Session;
import session.SessionSet;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAO customerDao = new CustomerDAOImpl();

	
	/**
	 * 로그인하기
	 * */
	@Override
	public Customer login(String cus_id, String cus_pwd) throws SQLException {
			Customer customer = CustomerDAO.login(cus_id,cus_pwd);
			if(customer==null) {
			throw new NotFoundException("정보를 다시 확인해주세요.");
		}
		
		//로그인 된 정보 저장하기
		Session session = new Session(cus_id);
		
		SessionSet sessionSet = SessionSet.getInstance();
		sessionSet.add(session);
		
		return customer;
	}
		
}
