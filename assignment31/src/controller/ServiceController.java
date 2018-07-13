package controller;

/**
 * Created by ADMIN on 7/29/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServiceController {

    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public ModelAndView service() {
        return new ModelAndView("ServiceForm", "command", new Service());
    }

    @RequestMapping(value = "/addService", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("SpringWeb")Service service, ModelMap model) {
        model.addAttribute("id", service.getId());
        model.addAttribute("cName", service.getcName());
        model.addAttribute("vNo", service.getvNo());
        model.addAttribute("vName", service.getvName());
        model.addAttribute(" type", service.getType());
        return "ServiceDetail";
    }
}

