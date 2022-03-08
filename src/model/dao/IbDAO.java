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
	 * ��ü �ŷ�ó ��ȸ
	 * */
	List<Dealer> dealerSelect() throws SQLException;
	
	/**
	 *�ŷ�ó �ڵ�� sku ��ǰ �˻��ϱ� 
	 * */
	List<Sku> skuSelectByDealerId() throws SQLException;
	
	/**
	 * ����
	 * */
	int ibInsert(Ib ib) throws SQLException;
	
	/**
	 * �����ڵ�� �˻��ϱ�
	 * */
	Sku SelectByIbId(String ibId) throws SQLException;
	
	/**
	 * ���� �� ����ϱ�
	 * */
	int[] ibLineInsert(Connection con, Ib ib) throws SQLException;
	
	/**
	 * ���� ���� (���ֳ�������)
	 * */
	List<Ib> ibTotal() throws SQLException;
	
}
