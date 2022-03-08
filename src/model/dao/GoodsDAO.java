package model.dao;

import java.sql.SQLException;
import java.util.List;

import model.dto.Goods;

public interface GoodsDAO {
	/**
	 * ��ü ��ǰ (��� ��Ȳ)
	 * */
	List<Goods> goodsSelectAll() throws SQLException;

	/**
	 *  �α� ��ǰ -> ������� top5
	 * */
	List<Goods> goodsSelectByTop(String top) throws SQLException;

	/**
	 * ������ ��ǰ
	 * */
	List<Goods> goodsSelectByType(String type) throws SQLException;


	/**
	 * ��ǰ ���
	 * */
	int goodsInsert(Goods goods) throws SQLException;

	/**
	 * ��ǰ ����
	 * */
	int goodsUpdate(int stockQty) throws SQLException;

	/**
	 * ��ǰ ����
	 * */
	int goodsDelete(String goodsId) throws SQLException;

}