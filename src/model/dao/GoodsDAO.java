package model.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import model.dto.Goods;

public interface GoodsDAO {
	/**
	 * 전체 상품 (재고 현황)
	 * */
	List<Goods> goodsSelectAll() throws SQLException;

	/**
	 *  인기 상품 -> 매출순위 top5
	 * */
	Map<Integer, String> goodsSelectByTop(String top) throws SQLException;

	/**
	 * 종류별 상품
	 * */
	List<Goods> goodsSelectByType(String type) throws SQLException;


	/**
	 * 상품 등록
	 * */
	int goodsInsert(Goods goods) throws SQLException;

	/**
	 * 상품 수정
	 * */
	int goodsUpdate(int stockQty) throws SQLException;

	/**
	 * 상품 삭제
	 * */
	int goodsDelete(String goodsId) throws SQLException;

}