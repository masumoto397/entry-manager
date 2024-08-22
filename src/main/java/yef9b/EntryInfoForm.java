package yef9b;


import javax.persistence.Column;

import lombok.Data;

@Data
public class EntryInfoForm {
    
    private String entryDate;

    private Integer entryTimeS;

    private Integer entryTimeE;

    private String reqUser;

    private String reqGroup;

    private String entryUser1;

    private String entryUser2;

    private String entryUser3;

    private String entryUser4;

    private String entryUser5;

    private String reqReason;

    private String remark;

}
