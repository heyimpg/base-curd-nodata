package com.spring.basecurd.Controller;


import com.spring.basecurd.Service.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    @Autowired
    private TechService techService;

    @GetMapping("/")
    public ModelAndView home(RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("techs", techService.findAll());
        redirect.addFlashAttribute("success", "");
        return  modelAndView;
    }
}
