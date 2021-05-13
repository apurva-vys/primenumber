package com.prime.primenumber.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.prime.primenumber.pojo.PrimeNumberPOJO;
import com.prime.primenumber.service.PrimeNumberServiceIMPL;

public class PrimeNumberContollerTest {
	
	 @InjectMocks
	 PrimeNumberContoller primeNumberContoller;
	 
	 @Mock
	 PrimeNumberPOJO primeNumberPOJO;
	 
	 @Mock
	 PrimeNumberServiceIMPL primeNumberServiceIMPL;
	 
	 @Before
	 public void init() {
	      MockitoAnnotations.initMocks(this);
	      
	  
	 }
	 
	 @Test
	  public void displayPrimeNumberTest() {
		 PrimeNumberPOJO primeNumberPOJO = returnPrimeNumberPOJO();
		 when(primeNumberServiceIMPL.returnPrime(10)).thenReturn(primeNumberPOJO);
		 ResponseEntity<?> responseObj = primeNumberContoller.displayPrimeNumber(10);
		 PrimeNumberPOJO PrimeNumberPOJO2 = (PrimeNumberPOJO) responseObj.getBody();
		 assertEquals(primeNumberPOJO.getPrimesList().size(), PrimeNumberPOJO2.getPrimesList().size());
		 
	 }
	 
	 private PrimeNumberPOJO returnPrimeNumberPOJO() {
			PrimeNumberPOJO primeNumberPOJO = new PrimeNumberPOJO();
			List<Integer> mList = new ArrayList<>();
			
			mList.add(2);
			mList.add(3);
			mList.add(5);
			mList.add(7);
			
			primeNumberPOJO.setInitial(10);
			primeNumberPOJO.setPrimesList(mList);
			return primeNumberPOJO;
		}

	 
	 

}
