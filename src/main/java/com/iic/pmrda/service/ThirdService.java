package com.iic.pmrda.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.iic.pmrda.metaData.MetaDataDashBoardBean;
import com.iic.pmrda.metaData.MetaDataInfo;
import com.iic.pmrda.metaData.MetaDataInfoFactory;

@Service
public class ThirdService {

	
	public DashBoardResponseData getData(String talukaI,String villageI) {
		
		
	   String   taluka= (talukaI==null||talukaI.trim().length()==0 )? "taluka-1": talukaI;
		String village=(villageI==null||villageI.trim().length()==0) ? "village-1": villageI;
		
		ArrayList<MetaDataDashBoardBean> data = MetaDataInfoFactory.getHODDashBoardData();
		
		 Optional<MetaDataDashBoardBean> findFirst = data.stream().filter(e -> e.getTaluka().equals(taluka)&& e.getVillage().equals(village)).findFirst();
		
		List<MetaDataDashBoardBean> talukaList = data.stream().filter(e -> e.getTaluka().equals(taluka)).collect(Collectors.toList());
	
		
		Long illegalBuildingsCount = talukaList.stream().map(e -> e.getIllegalBuildingsCount()).reduce(0L, Long::sum);
		Double areaUnderIllegalORConstructionCount = talukaList.stream().map(e -> e.getAreaUnderIllegalORConstructionCount()).reduce(0d, Double::sum);
		
		Long verifiedIllegalBuildingsCount = talukaList.stream().map(e -> e.getVerifiedIllegalBuildingsCount()).reduce(0L, Long::sum);
		
		Long unverifiedIllegalBuildingsCount = talukaList.stream().map(e -> e.getUnverifiedIllegalBuildingsCount()).reduce(0L, Long::sum);
		
		Long regularizedFromVerifiedIllegalBuildingsCount = talukaList.stream().map(e -> e.getRegularizedFromVerifiedIllegalBuildingsCount()).reduce(0L, Long::sum);
		
		Long demolishedFromVerifiedIllegalBuildings = talukaList.stream().map(e -> e.getDemolishedFromVerifiedIllegalBuildings()).reduce(0L, Long::sum);
		
		Long pendingActionsAgainstVerifiedCount = talukaList.stream().map(e -> e.getPendingActionsAgainstVerifiedCount()).reduce(0L, Long::sum);
		
		
		DashBoardResponseData finalOut = new DashBoardResponseData();
		
		if (findFirst.isPresent())
			finalOut.setVillageData(findFirst.get());
		
		
		MetaDataDashBoardBean bean=	new MetaDataDashBoardBean(taluka,village,illegalBuildingsCount,areaUnderIllegalORConstructionCount,verifiedIllegalBuildingsCount,
				unverifiedIllegalBuildingsCount,regularizedFromVerifiedIllegalBuildingsCount,demolishedFromVerifiedIllegalBuildings,pendingActionsAgainstVerifiedCount
				);
		finalOut.setTalukaData(bean);
		
return finalOut;
		
		
	}
}
