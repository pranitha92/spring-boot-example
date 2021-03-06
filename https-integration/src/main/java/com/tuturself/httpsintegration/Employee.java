package com.tuturself.httpsintegration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {

	private UUID employeeId;
	private String name;
}
