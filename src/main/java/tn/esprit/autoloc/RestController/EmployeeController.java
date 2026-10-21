package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Employee;
import tn.esprit.autoloc.Services.IEmployee;

import java.util.List;

@RestController
@RequestMapping("/api/Employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final IEmployee iEmployee;

    @PostMapping("/AddEmployee")
    public Employee ajouterEmployee(@RequestBody Employee employee) {
        return iEmployee.ajouterEmployee(employee);
    }

    @GetMapping("/GetALL")
    public List<Employee> getAll() {
        return iEmployee.recupererEmployees();
    }

    @GetMapping("/GetEmployee/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return iEmployee.recupererEmployeeById(id);
    }

    @DeleteMapping("/DeleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        iEmployee.supprimerEmployee(id);
    }

    @PutMapping("/UpdateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return iEmployee.modifierEmployee(employee);
    }
}