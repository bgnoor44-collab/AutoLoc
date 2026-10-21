package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Employee;

import java.util.List;
import java.util.Set;

public interface IEmployee {
    Employee ajouterEmployee(Employee employee);
    void supprimerEmployee(Long id);
    Employee modifierEmployee(Employee employee);
    List<Employee> recupererEmployees();
    Set<Employee> findEmployees();
    Employee recupererEmployeeById(Long id);
}