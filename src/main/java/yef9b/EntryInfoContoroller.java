package yef9b;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EntryInfoContoroller {
    @GetMapping("/entryInfo/index")
    private String readForm(@ModelAttribute EntryInfoForm entryInfoForm) {
        return "entryInfo/index";
    }
    
    @PostMapping("/entryInfo/confirm")
    private String confirm(@ModelAttribute EntryInfoForm entryInfoForm) {
        return "entryInfo/confirm";
    }
}