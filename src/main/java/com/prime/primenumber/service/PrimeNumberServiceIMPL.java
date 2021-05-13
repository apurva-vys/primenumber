package com.prime.primenumber.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prime.primenumber.pojo.PrimeNumberPOJO;

@Service
public class PrimeNumberServiceIMPL implements PrimeNumberService {

	@Override
	public PrimeNumberPOJO returnPrime(int number) {
		PrimeNumberPOJO PrimeNumberPOJO = new PrimeNumberPOJO();
		List<Integer> pList = new ArrayList<>();
		int i = 0;
		int num = 0;
		
		

		for (i = 1; i <= number; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				
				pList.add(i);
				
			}
		}
		
		PrimeNumberPOJO.setInitial(number);  
		PrimeNumberPOJO.setPrimesList(pList);
		return PrimeNumberPOJO;
	}

}
