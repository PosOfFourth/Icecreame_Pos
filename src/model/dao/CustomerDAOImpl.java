package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.dto.Customer;
import util.DbUtil;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer login(String cus_id, String cus_pwd) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Customer customer = null; //리턴타입 customer
		  
	  try {
		  con= DbUtil.getConnection();
		  ps = con.prepareStatement("select * from Customer where cus_id=? and cus_pwd=?");
		  ps.setString(1, cus_id);
		  ps.setString(2, cus_pwd);
		  
		  rs = ps.executeQuery();
		  
		  if(rs.next()) {
			  customer = new Customer(rs.getString(1), rs.getString(2));
		  }
		  
	  }finally {
		  DbUtil.close(con, ps, rs);
	  }
		
		return customer;
	}

}
