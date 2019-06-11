package pl.lodz.p.miasi.controller;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.lodz.p.miasi.model.Faktura;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    private final RuntimeService runtimeService;

    @Autowired
    public HomeController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/viewForm")
    public String viewForm(Model model) {
        model.addAttribute(new Faktura());
        return "form";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("faktura") Faktura faktura) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("assignee", "admin");
        variables.put("faktura", faktura);
        runtimeService.startProcessInstanceByKey("testProcess", variables);
        return "redirect:/";
    }

}
