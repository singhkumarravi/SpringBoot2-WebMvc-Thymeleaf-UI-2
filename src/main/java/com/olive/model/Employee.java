package com.olive.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	public Integer eid;
	private String  ename;
	private Double esal;
}
