package model.service;

import java.sql.SQLException;
import java.util.List;

import exception.NotFoundException;
import model.dao.IbDAO;
import model.dao.IbDAOImpl;
import model.dto.Dealer;
import model.dto.Ib;

public interface IbService {
	IbDAO ibDao = new IbDAOImpl();
	
	public List<Dealer> dealerSelect() throws SQLException, NotFoundException;
	
	public int ibInsert(Ib ib) throws SQLException;
	
	public List<Ib> ibTotal() throws SQLException;
}
