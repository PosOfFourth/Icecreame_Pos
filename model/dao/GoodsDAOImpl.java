package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import model.dto.Goods;
import util.DbUtil;

public class GoodsDAOImpl implements GoodsDAO {

	private Properties proFile = DbUtil.getProFile();	

	// select * from goods order by goods_price
	public List<Goods> goodsSelectAll() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Goods> list = new ArrayList<Goods>();
		String sql = proFile.getProperty("goods.selectAll"); 

		try {

			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while(rs.next()) {
				Goods dto = new Goods(rs.getString(1) , rs.getString(2), rs.getInt(3), rs.getInt(4));

				list.add(dto);

			}

		} finally {
			DbUtil.close(con, ps, rs);
		}

		return list;
	}

	//select * from goods ????
	@Override
	public Map<Integer, String> goodsSelectByTop(String top) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Goods> list = new ArrayList<Goods>();
		String sql = proFile.getProperty("goods.selectByTop"); 

		try {

			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

		} finally {
			DbUtil.close(con, ps, rs);
		}
		return (Map<Integer, String>) list;
	}

	//select dealer_type from dealer
	@Override
	public List<Goods> goodsSelectByType(String type) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		new ArrayList<Goods>();
		String sql = proFile.getProperty("goods.SelectByType"); 

		try {

			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

		} finally {
			DbUtil.close(null, null, null);
		}
		return null;
	}


	//insert into goods (goods_id , goods_name, stock_qty, goods_price) values (board_seq.nextval,?,?,?,?)
	public int goodsInsert (Goods goods) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("goods.insert");

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			//?의 개수만큼 물음표의 순서대로 setXxx설정 필요
			ps.setString(1,goods.getGoodsId());
			ps.setInt(2,goods.getStockQty());
			ps.setInt(3,goods.getGoodsPrice());

			result = ps.executeUpdate();


		} finally {
			DbUtil.close(con, ps, null);
		}
		return result;

	}

	//update goods set stock_qty = stock_qty + ? 
	public int goodsUpdate(int stockQty) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("goods.updateByQty");

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			//? 개수만큼 물음표의 순서대로 설정 
			ps.setInt(1,goods.getStockQty());

			result = ps.executeUpdate();

		} finally {
			DbUtil.close(con, ps, null);
		}
		return result;


		//delete from goods where goods_id = ?
		public int goodsDelete(String goodsId) throws SQLException{
			Connection con = null;
			PreparedStatement ps = null;
			int result = 0;
			String sql = proFile.getProperty("goods.deleteById");


			try {
				con = DbUtil.getConnection();
				ps = con.prepareStatement(sql);


				ps.setString(1,goodsId);

				result = ps.executeUpdate();

			} finally {
				DbUtil.close(con, ps, null);
			}

			return result;
		}

	}