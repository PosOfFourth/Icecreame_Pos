package controller;

import model.dto.Customer;
import model.service.CustomerService;
import model.service.CustomerServiceImpl;
import view.FailView;
import view.MenuView;

public class CustomerController {
	
	static CustomerService customerService = new CustomerServiceImpl();
 /**
  * ·Î±×ÀÎ
  * */
	public static void login(String cus_id, String cus_pwd) {
		try {
			Customer customer = customerService.login(cus_id, cus_pwd);
			MenuView.printUserMenu(cus_id);
			//MenuView.menu();
		}catch (Exception e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
			
		}
	}

}
