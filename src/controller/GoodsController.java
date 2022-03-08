package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kosta.exam.model.dto.Board;
import model.dto.Goods;
import model.service.GoodsService;
import model.service.GoodsServiceImpl;
import view.EndView;
import view.FailView;

public class GoodsController {

	static GoodsService goodsService = new GoodsServiceImpl();


	//��ü��ǰ�˻�
	public static void goodsSelectAll() {
		try {
			List<Goods> list = goodsService.goodsSelectAll();
			EndView.printGoodsList(list);
		} catch (SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}

	}

	//���� ���� �ȸ� ���� 5�� 
	public static void goodsSelectByTop(String top) {
		try {
			Map<Integer, String> map = goodsService.goodsSelectByTop(top);
			EndView.printMessage(map);
		} catch (Exception e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}	

	}


	//��ǰ���
	public static void goodsInsert(Goods goods) {
		try {
			goodsService.goodsInsert(goods);
			EndView.printMessage("��ǰ�� ��ϵǾ����ϴ�");
		} catch (SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}

	}

	//��ǰ����
	public static void goodsUpdate(int stockQty) {
		try {
			goodsService.goodsUpdate(stockQty);
			EndView.printMessage("��ǰ�� �����Ǿ����ϴ�");
		} catch (SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
	}

	//��ǰ����
	public static void goodsDelete(String goodsId) {
		try {
			goodsService.goodsDelete(goodsId);
			EndView.printMessage("��ǰ�� �����Ǿ����ϴ�");
		} catch (SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());;
		}


	}

}