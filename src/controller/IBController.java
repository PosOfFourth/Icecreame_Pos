package controller;

import java.util.List;

import model.dto.Dealer;
import model.service.IbService;
import model.service.IbServiceImpl;
import view.EndView;
import view.FailView;

public class IBController {
	static IbService ibService = new IbServiceImpl();
	
	public static void dealerSelect() {
		try {
			List<Dealer> dealerlist = ibService.dealerSelect();
			EndView.printDealerList(dealerlist);
		}catch(Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}
}
