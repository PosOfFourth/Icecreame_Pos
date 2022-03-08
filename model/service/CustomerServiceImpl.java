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
	 * �α����ϱ�
	 * */
	@Override
	public Customer login(String cus_id, String cus_pwd) throws SQLException {
			Customer customer = CustomerDAO.login(cus_id,cus_pwd);
			if(customer==null) {
			throw new NotFoundException("������ �ٽ� Ȯ�����ּ���.");
		}
		
		//�α��� �� ���� �����ϱ�
		Session session = new Session(cus_id);
		
		SessionSet sessionSet = SessionSet.getInstance();
		sessionSet.add(session);
		
		return customer;
	}
		
}
