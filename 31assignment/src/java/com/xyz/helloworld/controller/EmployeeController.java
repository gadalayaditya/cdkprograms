package java.com.xyz.helloworld.controller;

/**
 * Created by ADMIN on 7/29/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static javax.swing.text.StyleConstants.ModelAttribute;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView employee() {
        return new ModelAndView("EmployeeForm", "command", new Employee());
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("SpringWeb")Employee employee, ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("age", employee.getAge());
        model.addAttribute("empId", employee.getEmpId());
        model.addAttribute("salary", employee.getSalary());
        return "EmployeeDetail";
    }
}

