package com.rest.first.restapplication;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins="http://127.0.0.1:5501")
public class Amount {
	@GetMapping("/amount")
	
	public ResponseEntity<String> amount()
	{
		return new ResponseEntity<String>(" the amount is recevied sucessfully thank you",HttpStatusCode.valueOf(200));
	}
	

}
