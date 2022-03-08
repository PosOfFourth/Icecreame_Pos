package model.service;

import java.sql.SQLException;
import java.util.List;

import exception.NotFoundException;
import model.dao.GoodsDAO;
import model.dao.GoodsDAOImpl;
import model.dto.Goods;

public interface GoodsService {
	GoodsDAO goodsDao = new GoodsDAOImpl();
	
	public List<Goods> goodsSelect() throws NotFoundException, SQLException;
	
	public List<Goods> goodsSelectByTop() throws SQLException;
	
	public void goodsInsert(Goods goods) throws SQLException;
	
	public void goodsUpdate(String goodsId, String goodsName, int price) throws SQLException;
	
	public void goodsDelete(Goods goods) throws SQLException;
}
