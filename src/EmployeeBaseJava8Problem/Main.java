package EmployeeBaseJava8Problem;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Yanksha", 28, 123L, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Francesca", 29, 120L, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 115L, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 125L, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "Padma", 22, 150L, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 140L, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 130L, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 145L, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "Ram", 25, 160L, "M", "IT", "Blore", 2010));

        //Group the employee by city
        System.out.println("===================================GroupByCity=========================================================");
        Map<String, List<Employee>> employeeByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(employeeByCity);


        //Group the employee by age
        System.out.println("=======================================GroupByAge=====================================================");
        Map<Integer, List<Employee>> employeeByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(employeeByAge);

        //Find the count of male and female is present in organization
        System.out.println("=======================================Male And Female================================================");
        Map<String, Long> countOfGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countOfGender);

        //Find the count of male and female present in each department
        System.out.println("=====================================empByGenderAndDepartmentWise===================================");
        Map<String, Map<String, Long>> empByGenderAndDepartmentWise = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println(empByGenderAndDepartmentWise);

        //Print the names of all distinct departments in the organization.
        System.out.println("====================Print the names of all distinct departments in the organization.================");
        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        //Print employee details whose age is greater than 28 in the organisation.
        System.out.println("==================Print employee details whose age is greater than 28 in the organisation.=========");
        empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList()).forEach(System.out::println);

        //Find maximum age/oldest of employee in the organisation.
        System.out.println("============Find maximum age/oldest of employee in the organisation.=======================================");
        Optional<Employee> oldestEmp = empList.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println(oldestEmp);
//Print Average age of Male and Female Employees in the organisation
        System.out.println("================================Print Average age of Male and Female Employees in the organisation.====");
        Map<String, Double> avgOfMaleAndFemale = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgOfMaleAndFemale);
//Print Average age of Male and Female Employees in each department.
        System.out.println("================================Print Average age of Male and Female Employees in each department.======");
        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))).forEach((dept, genderMap) -> genderMap.forEach((gender, avgAge) -> System.out.println(dept + " - " + gender + ": " + avgAge)));
//Print the number of employees in each department
        System.out.println("==================Print the number of employees in each department.==================");
        Map<String, Long> countOfEmployeeeachDepatment = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println(countOfEmployeeeachDepatment);
//Find longest serving employees in the organization
        System.out.println("==================Find longest serving employees in the organization.===================");
        Optional<Employee> sinorEmployee = empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println(sinorEmployee);
//Find longest serving employee in each department
        System.out.println("==================Find longest serving employee in each department=======================");
        Map<String, Optional<Employee>> longest = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))));
        System.out.println(longest);
//Find average age of gender in each department
        System.out.println("==================Find average age of gender in each department=======================");
        Map<String, java.lang.Double> averageAgeGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAgeGender);
//Find youngest female employee in the organisation
        System.out.println("=================Find youngest female employee in the organisation.====================");
        Optional<Employee> youngestFemale = empList.stream().filter(e -> e.getGender() == "F").min(Comparator.comparingInt(Employee::getAge));
        System.out.println(youngestFemale);

        //Find the youngest employee in each Department
        System.out.println("=================Find the youngest employee in each Department===========================");
        Map<String, Optional<Employee>> youngestEmployeeDepartment = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))));
        System.out.println(youngestEmployeeDepartment);

        //Find the Higest salary in the organization
        System.out.println("================Find the Higest salary in the organization");
        Optional<Employee> higestsalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();
        System.out.println(higestsalary);

        //Find the second Higest salary in the organization
        System.out.println("===============Find the second Higest salary in the organization==============");
        java.util.Optional<Employee> secondHigestSalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(secondHigestSalary);


    }


}
