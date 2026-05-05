package com.ag.service;



import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderImpl implements ISeasonFinderService {

	
	
	@Override
	public String findSeason() {
		
		LocalDate date = LocalDate.now();
		
		int month = date.getMonthValue();
		
		if(month>=3 && month<=6)
			return"Summer Season";
		else if(month>=7 && month<=10)
			return "Rainy Season";
		else
			return "Winter Season";
	}

}
