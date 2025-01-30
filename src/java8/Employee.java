package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeeBean> employeeList = new ArrayList<EmployeeBean>();
		
		employeeList.add(new EmployeeBean(1, "Rahim", 23, 50000, "Male", "Dev"));
		employeeList.add(new EmployeeBean(2, "Venkat", 23, 60000, "Male", "Prods"));
		employeeList.add(new EmployeeBean(3, "Naveen", 23, 40000, "Male", "Ops"));
		employeeList.add(new EmployeeBean(4, "Amit", 23, 70000, "Male", "Devops"));
		employeeList.add(new EmployeeBean(5, "Kapil", 23, 80000, "Male", "Prods"));
		employeeList.add(new EmployeeBean(6, "RajPriyan", 23, 90000, "Male", "Wmg"));
		employeeList.add(new EmployeeBean(7, "Hamsa", 23, 30000, "Female", "HR"));
		employeeList.add(new EmployeeBean(8, "NagaLakshmi", 23, 55000, "Female", "Dev"));
		employeeList.add(new EmployeeBean(9, "Jaya", 23, 45000, "Female", "Prods"));
		
		
		Map<String, Optional<EmployeeBean>> higestSalaryByEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeBean::getDepartment,
														Collectors.maxBy(Comparator.comparingInt(EmployeeBean::getSalary))));
		higestSalaryByEachDepartment.forEach((dept, name)->{
			System.out.println(dept+"-->"+name);
		});
		
		List<EmployeeBean> list = employeeList.stream().filter(p->p.getSalary()>50000).collect(Collectors.toList());
		list.forEach(p->System.err.println(p));
	}

}
