package com.prime.primenumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prime.primenumber.pojo.ErrorPOJO;
import com.prime.primenumber.pojo.PrimeNumberPOJO;
import com.prime.primenumber.service.PrimeNumberService;

@RestController
@RequestMapping(value = "/")
public class PrimeNumberContoller {

	@Autowired
	PrimeNumberService primeNumberService;

	@GetMapping(value = "/primes/{number}")
	public ResponseEntity<?> displayPrimeNumber(@PathVariable("number") int number) {

		if (number > 0) {
			PrimeNumberPOJO primeNumberPOJO = primeNumberService.returnPrime(number);
			return ResponseEntity.accepted().body(primeNumberPOJO);
		} else {
			return ResponseEntity
		            .status(HttpStatus.BAD_REQUEST)
		            .body(new ErrorPOJO("400","Enter positive number or Greater that Zero"));
			
			
		}

	}

}
