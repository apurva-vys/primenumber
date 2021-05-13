package com.prime.primenumber.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.prime.primenumber.pojo.PrimeNumberPOJO;

@RunWith(MockitoJUnitRunner.class)
public class PrimeNumberServiceIMPLTest {
	
	 @InjectMocks
	 PrimeNumberServiceIMPL primeNumberServiceIMPL;
	 
	 @Mock
	 PrimeNumberPOJO primeNumberPOJO;
	 
	 @Before
	 public void init() {
	      MockitoAnnotations.initMocks(this);
	  
	 }
	 
	 @Test
	 public void testPrimeNumber() {
		 
		 PrimeNumberPOJO primeNumberPOJO = returnPrimeNumberPOJO();
		 
		 
		 PrimeNumberPOJO primeNumberPOJO1 = primeNumberServiceIMPL.returnPrime(10);
		 
		 assertEquals(primeNumberPOJO.getPrimesList().size(), primeNumberPOJO1.getPrimesList().size());
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
