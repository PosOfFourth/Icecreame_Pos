package model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.dto.Dealer;
import model.dto.Ib;
import model.dto.OrderLine;
import model.dto.Orders;
import model.dto.Sku;

public interface IbDAO {
	/**
	 * 전체 거래처 조회
	 * */
	List<Dealer> dealerSelect() throws SQLException;
	
	/**
	 *거래처 코드로 sku 상품 검색하기 
	 * */
	List<Sku> skuSelectByDealerId() throws SQLException;
	
	/**
	 * 발주
	 * */
	int ibInsert(Ib ib) throws SQLException;
	
	/**
	 * 발주코드로 검색하기
	 * */
	Sku SelectByIbId(String ibId) throws SQLException;
	
	/**
	 * 발주 상세 등록하기
	 * */
	int[] ibLineInsert(Connection con, Ib ib) throws SQLException;
	
	/**
	 * 발주 결제 (발주내역보기)
	 * */
	List<Ib> ibTotal() throws SQLException;
	
}
