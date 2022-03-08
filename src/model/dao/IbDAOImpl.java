package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.dto.Dealer;
import model.dto.Ib;
import model.dto.IbLine;
import model.dto.Orders;
import model.dto.Sku;
import util.DbUtil;

public class IbDAOImpl implements IbDAO {

	private Properties proFile = DbUtil.getProFile();
	
	@Override
	public List<Dealer> dealerSelect() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Dealer> listdealer = new ArrayList<Dealer>();
		String sql = proFile.getProperty("dealer.selectAll");
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Dealer dealer = new Dealer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				
				listdealer.add(dealer);
			}
		}finally {
			DbUtil.close(con, ps, rs);
		}
		return listdealer;
	}
	
	@Override
	public List<Sku> skuSelectByDealerId() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Sku> skulist = new ArrayList<Sku>();
		String sql = proFile.getProperty("sku.selectByDealerId");
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Sku sku = new Sku(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				
				skulist.add(sku);
			}
		}finally {
			DbUtil.close(con, ps, rs);
		}
		return skulist;
	}

	@Override
	public int ibInsert(Ib ib) throws SQLException {
		Connection con=null;
		PreparedStatement ps = null;
		String sql=proFile.getProperty("ib.insert");
		int result=0;
		
		try {
			con =DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, ib.getDealerId());
			
			result = ps.executeUpdate();
			
			if(result == 0) {
				con.rollback();
				throw new SQLException("발주가 실패하였습니다.");
			}else {
				int line [] = ibLineInsert(con,ib); //발주 상세 등록하기
				for(int i : line) {
					if(i != 1) {
						con.rollback();
						throw new SQLException("발주 할 수 없습니다.");
					}
				}
				con.commit();
			}
			
		}finally {
			con.commit();
			DbUtil.close(con, ps, null);
		}
		return result;
	}

	@Override
	public int[] ibLineInsert(Connection con, Ib ib) throws SQLException {
		PreparedStatement ps = null;
		String sql = "ibline.insert";
		int result [] = null;
		try {
			ps = con.prepareStatement(sql);
			for(IbLine ibline : ib.getIbLineList()) {
				Sku sku = ibline.getIbId()
			}
		}finally {
			DbUtil.close(con, ps, null);
		}
		return null;
	}

	@Override
	public List<Ib> ibTotal() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Sku SelectByIbId(String ibId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
