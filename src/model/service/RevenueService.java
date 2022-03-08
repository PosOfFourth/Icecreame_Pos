package model.service;

import model.dao.RevenueDAO;
import model.dao.RevenueDAOImpl;

public interface RevenueService {
	RevenueDAO revenueDao = new RevenueDAOImpl();
}
