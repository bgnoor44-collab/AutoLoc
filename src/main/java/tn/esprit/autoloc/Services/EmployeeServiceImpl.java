package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Employee;
import tn.esprit.autoloc.Repositories.EmployeeRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service

@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployee {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee ajouterEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void supprimerEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> recupererEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Set<Employee> findEmployees() {
        return new HashSet<>(employeeRepository.findAll());
    }

    @Override
    public Employee recupererEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }
    @Override
    public Employee modifierEmployee(Employee employee) {
        if (employeeRepository.existsById(employee.getIdEmployee())) {
            return employeeRepository.save(employee);
        }
        throw new RuntimeException("Employee introuvable avec l'id : " + employee.getIdEmployee());
    }
}