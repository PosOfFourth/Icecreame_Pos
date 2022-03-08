package model.service;

import java.sql.SQLException;
import java.util.List;

import exception.NotFoundException;
import model.dao.IbDAO;
import model.dao.IbDAOImpl;
import model.dto.Dealer;
import model.dto.Ib;

public class IbServiceImpl implements IbService {
	IbDAO ibDao = new IbDAOImpl();
	
	@Override
	public List<Dealer> dealerSelect() throws NotFoundException, SQLException {
		List<Dealer> dealerlist = ibDao.dealerSelect();
		if(dealerlist.size()==0) throw new NotFoundException("거래처가 없습니다.");
		return dealerlist;
	}

	@Override
	public int ibInsert(Ib ib) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Ib> ibTotal() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
