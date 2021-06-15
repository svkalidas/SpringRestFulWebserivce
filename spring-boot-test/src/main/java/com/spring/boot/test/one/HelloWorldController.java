package com.spring.boot.test.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello/{name}")
	public String getName(@PathVariable String name) {
		
		return "Hellow "+name;
	}
	
	private boolean testInput(String input1, String input2) {
		
		
		if(input1.length() == input2.length()) {
			
			for(int i =0; i<input2.length(); i++) {
				String c1 = String.valueOf(input1.charAt(i));
				if(StringUtils.countOccurrencesOf(input1, c1) != StringUtils.countOccurrencesOf(input2, c1)) {
					return false;
				}
			}
		}else {
			return false;
		}
		
		
		return true;
	}
	
	private List<String> findDuplicate(List<String> input, List<Employee> employees) {
		
		employees.stream().map(emp-> emp.getEmpId());
		
		List<String> duplicates = new ArrayList<>();
		
		for(int i = 0; i <input.size(); i++) {
			
			String data = input.get(i);
			
			if(i != input.lastIndexOf(data)) {
				duplicates.add(data);
			}
			
		}
		
		return duplicates;
	}
	
	 class Employee{
		
		public Employee() {
		}
		
		private Integer empId;
		private String name;
		
		public Integer getEmpId() {
			return empId;
		}

		public String getName() {
			return name;
		}

		public void setEmpId(Integer empId) {
			this.empId = empId;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
}
