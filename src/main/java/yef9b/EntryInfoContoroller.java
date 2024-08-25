package yef9b;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
            EntryInfo entryInfo = new EntryInfo();
            entryInfo.setReqDate(DateFormatUtils.format(new Date(), "yyyyMMdd"));
            entryInfo.setEntryDate(entryInfoForm.getEntryDate());
            entryInfo.setEntryTimeS(entryInfoForm.getEntryTimeS());
            entryInfo.setEntryTimeE(entryInfoForm.getEntryTimeE());
            entryInfo.setReqUser(entryInfoForm.getReqUser());
            entryInfo.setReqGroup(entryInfoForm.getReqGroup());
            entryInfo.setEntryUser1(entryInfoForm.getEntryUser1());
            entryInfo.setEntryUser2(entryInfoForm.getEntryUser2());
            entryInfo.setEntryUser3(entryInfoForm.getEntryUser3());
            entryInfo.setEntryUser4(entryInfoForm.getEntryUser4());
            entryInfo.setEntryUser5(entryInfoForm.getEntryUser5());
            entryInfo.setReqReason(entryInfoForm.getReqReason());
            entryInfo.setRemark(entryInfoForm.getRemark());
            entryInfo.setStatus("0");
            entryInfo.setConformUser1(null);
            entryInfo.setConformUser2(null);
            entryInfo.setConformUser3(null);
            entryInfoRepository.save(entryInfo);
            // セッションをクリア
            sessionStatus.setComplete();

            return ResponseEntity.ok("登録成功");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("登録失敗");
        }
    }
}