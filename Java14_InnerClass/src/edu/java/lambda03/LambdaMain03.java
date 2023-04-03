package edu.java.lambda03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMain03 {

	public static void main(String[] args) {
		// Employee를 원소로 갖는 리스트를 선언, 초기화
		List<Employee> employees = Arrays.asList(
				new Employee(100, "이찬희", "개발1팀", "대리", 400.0),
				new Employee(101, "지대한", "개발2팀", "사원", 350.0),
				new Employee(200, "김다훈", "개발2팀", "과장", 380.0),
				new Employee(201, "유다한", "개발1팀", "부장", 500.0),
				new Employee(300, "강효남", "인사팀", "사원", 300.0),
				new Employee(301, "위태욱", "인사팀", "과장", 1000.0)
				);

		// 1. 모든 직원들의 정보를 한 줄에 한 명씩 출력.
		//		employees.forEach(x -> System.out.println(x));
		employees.forEach(System.out::println);

		// 2. 개발 1,2팀에서 일하는 직원들의 급여의 합계를 출력.	
		double total = employees.stream()
				.filter(x -> x.getDept().equals("개발1팀") || x.getDept().equals("개발2팀"))
				.mapToDouble(x -> x.getSalary())
				.sum();
		System.out.println("개발 1,2팀 직원 급여 합계: " + total);


		// 3. 개발1,2 팀에서 일하는 직원들의 급여의 평균을 출력.
		double develAvg = employees.stream()
				.filter(x -> x.getDept().equals("개발1팀") || x.getDept().equals("개발2팀"))
				.mapToDouble(x -> x.getSalary())
				.average()
//				.getAsDouble();
				.orElseThrow();
		System.out.println("개발 1,2팀 직원 급여 합계: " + develAvg);


		// 4. 직급이 사원인 직원들의 급여의 합계를 출력.
		double sSum = employees.stream()
				.filter(x -> x.getEmpTitle().equals("사원"))
				.mapToDouble(x -> x.getSalary())
				.sum();
		System.out.println("사원인 직원들의 급여 합계: " + sSum);


		// 5. 직급이 사원인 직원들의 급여의 평균을 출력.	
		double sAvg = employees.stream()
				.filter(x -> x.getEmpTitle().equals("사원"))
				.mapToDouble(x -> x.getSalary())
				.average()
				.getAsDouble();
		System.out.println("사원인 직원들의 급여 평균: " + sAvg);


		// 6. 급여가 400 이상인 직원들의 정보를 한 줄에 한 명씩 출력.
//		for(Employee e : employees) {
		//			if(e.getSalary() >= 400) System.out.println(e);
		//		}
		employees.stream()
		.filter(x -> x.getSalary() >= 400)
		.forEach(x -> System.out.println(x));
		//		.forEach(System.out::println);


		// 7. 개발1팀 직원들의 급여를 10% 인상하고, 그 직원들의 급여 평균을 계산하고 출력.		
		double develTenAvg = employees.stream()
				.filter(x -> x.getDept().equals("개발1팀"))
				.mapToDouble(x -> x.getSalary() * 1.1)
				.average()
//				.getAsDouble();
				.orElseThrow();
		System.out.println("10% 인상된 개발1팀 직원들의 급여 평균: " + develTenAvg);


		// 8. 직원 리스트에서 "사원"은 몇 명?
		long c = employees.stream()
				.filter(x -> x.getEmpTitle().equals("사원"))
				.count();
		System.out.println("사원의 수: " + c);

	}
}
