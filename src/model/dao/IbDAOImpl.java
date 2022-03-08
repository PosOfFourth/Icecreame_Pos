package model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.dto.Dealer;
import model.dto.Ib;
import model.dto.Orders;

public class IbDAOImpl implements IbDAO {

	@Override
	public List<Dealer> dealerSelect() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ibInsert(Ib ib) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] ibLineInsert(Connection con, Orders order) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ib> ibTotal() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
