package yef9b;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "entry_info")
@IdClass(value = EntryInfoKey.class)
@Data
public class EntryInfo {

    @Id
    @Column(name = "entry_id")
    private Integer entryId;

    @Id
    @Column(name = "req_date")
    private String reqDate;

    @Column(name = "entry_date")
    private String entryDate;

    @Column(name = "entry_time_s")
    private Integer entryTimeS;

    @Column(name = "entry_time_e")
    private Integer entryTimeE;

    @Column(name = "req_user")
    private String reqUser;

    @Column(name = "req_group")
    private String reqGroup;

    @Column(name = "entry_user1")
    private String entryUser1;

    @Column(name = "entry_user2")
    private String entryUser2;

    @Column(name = "entry_user3")
    private String entryUser3;

    @Column(name = "entry_user4")
    private String entryUser4;

    @Column(name = "entry_user5")
    private String entryUser5;

    @Column(name = "req_reason")
    private String reqReason;

    @Column(name = "remark")
    private String remark;

    @Column(name = "status")
    private String status;

    @Column(name = "conform_user1")
    private String conformUser1;

    @Column(name = "conform_user2")
    private String conformUser2;

    @Column(name = "conform_user3")
    private String conformUser3;
}
