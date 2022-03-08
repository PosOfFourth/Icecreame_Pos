package model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import exception.NotFoundException;
import model.dao.GoodsDAO;
import model.dao.GoodsDAOImpl;
import model.dto.Goods;

public interface GoodsService {
	GoodsDAO goodsDao = new GoodsDAOImpl();
	
	public List<Goods> goodsSelectAll() throws NotFoundException, SQLException;
	
	public Map<Integer, String> goodsSelectByTop(String top) throws SQLException;
	
	public void goodsInsert(Goods goods) throws SQLException;
	
	public void goodsUpdate(int qty) throws SQLException;
	
	public void goodsDelete(String goodId) throws SQLException;
}
