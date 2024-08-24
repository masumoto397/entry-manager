package yef9b;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("entryInfoForm")
public class EntryInfoContoroller {

    EntryInfoRepository entryInfoRepository;

    public EntryInfoContoroller(EntryInfoRepository entryInfoRepository) {
        this.entryInfoRepository = entryInfoRepository;
    }

    @ModelAttribute("entryInfoForm")
    public EntryInfoForm setUpForm() {
        return new EntryInfoForm();
    }

    @GetMapping("/entryInfo/index")
    private String readForm(EntryInfoForm entryInfoForm) {
        return "entryInfo/index";
    }
    
    @PostMapping("/entryInfo/confirm")
    private String confirm(EntryInfoForm entryInfoForm) {
        return "entryInfo/confirm";
    }
    
    @PostMapping("/entryInfo/register")
    @ResponseBody
    public ResponseEntity<String> register(EntryInfoForm entryInfoForm, SessionStatus sessionStatus) {
        try {
            // ここで登録処理を行う

            // セッションをクリア
            sessionStatus.setComplete();

            return ResponseEntity.ok("登録成功");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("登録失敗");
        }
    }
}