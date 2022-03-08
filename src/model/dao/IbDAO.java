package model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.dto.Dealer;
import model.dto.Ib;
import model.dto.OrderLine;
import model.dto.Orders;

public interface IbDAO {
	/**
	 * 거래처 조회
	 * */
	List<Dealer> dealerSelect() throws SQLException;
	
	/**
	 * 발주
	 * */
	int ibInsert(Ib ib) throws SQLException;
	
	/**
	 * 발주 상세 등록하기
	 * */
	int[] ibLineInsert(Connection con, Orders order) throws SQLException;
	
	/**
	 * 발주 결제 (발주내역보기)
	 * */
	List<Ib> ibTotal() throws SQLException;
	
}
