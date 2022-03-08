package model.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.NotFoundException;
import model.dao.GoodsDAO;
import model.dao.GoodsDAOImpl;
import model.dto.Goods;

public class GoodsServiceImpl implements GoodsService {
	
	private GoodsDAO goodsDAO = new GoodsDAOImpl();

	@Override
	public List<Goods> goodsSelect() throws SQLException {
		List<Goods> list = goodsDAO.goodsSelectAll();
		if(list.size() == 0 || list.isEmpty()) {
			throw new SQLException("��ǰ�� ������ ���� �˻��� �� �����ϴ�");
			
		}
		
		return list;
	}

	@Override
	public goodsSelectByTop(int , String) throws SQLException {
		int [] rank = new int[]; 
		return null;
	}
	

	@Override
	public void goodsInsert(Goods goods) throws SQLException {
	 int result = goodsDAO.goodsInsert(goods);
	 if(result == 0) throw new SQLException("��ǰ�� ��ϵ��� �ʾҽ��ϴ�");
		
	}

	@Override
	public void goodsUpdate(int qty) throws SQLException {
		int result = goodsDao.goodsUpdate(qty);
		if(result == 0) throw new SQLException("������ �������� �ʾҽ��ϴ�");
		
	}

	@Override
	public void goodsDelete(int goodsId) throws SQLException {
		int result = goodsDAO.goodsDelete(goodsId);
		if(result == 0) throw new SQLException("��ǰ�� �������� �ʾҽ��ϴ�");
			
	}

}

