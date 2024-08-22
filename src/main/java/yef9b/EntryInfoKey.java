package yef9b;

import javax.persistence.Column;

import lombok.Data;
import java.io.Serializable;

@Data
public class EntryInfoKey implements Serializable{

    @Column(name = "entry_id")
    private Integer entryId;

    @Column(name = "req_date")
    private String reqDate;
}
