package com.spring.basecurd.Controller;

import com.spring.basecurd.Model.Constant.MessageConstants;
import com.spring.basecurd.Model.TechStack;
import com.spring.basecurd.Service.TechService;
import com.spring.basecurd.Utils.UuidUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("tech")
public class TechController {

    @Autowired
    private TechService techService;

    private final String BACK_TO_HOMEPAGE = "redirect:/";

    @ModelAttribute("tech")
    public TechStack setUpUserForm() {
        return new TechStack();
    }

    @GetMapping("create")
    public String create() {
        return "create";
    }

    @PostMapping("save")
    public String save(TechStack techStack, RedirectAttributes redirect) {
        techStack.setId(UuidUtils.generateUUID());
        techService.create(techStack);
        redirect.addFlashAttribute(MessageConstants.SUCCESS, "Save tech successfully!");
        return BACK_TO_HOMEPAGE;
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("tech", techService.findById(id));
        return "edit";
    }

    @PostMapping("update")
    public String update(TechStack techStack, RedirectAttributes redirect) {
        techService.update(techStack.getId(), techStack);
        redirect.addFlashAttribute(MessageConstants.SUCCESS, "Modify tech successfully!");
        return BACK_TO_HOMEPAGE;
    }

    @GetMapping("{id}/remove")
    public String remove(@PathVariable String id, Model model) {
        model.addAttribute("tech", techService.findById(id));
        return "remove";
    }

    @PostMapping("remove")
    public String remove(TechStack techStack, RedirectAttributes redirect) {
        techService.remove(techStack.getId());
        redirect.addFlashAttribute(MessageConstants.SUCCESS, "Removed tech successfully!");
        return BACK_TO_HOMEPAGE;
    }

    @GetMapping("{id}")
    public String detail(@PathVariable String id, Model model) {
        model.addAttribute( "tech", techService.findById(id));
        return "detail";
    }
}
