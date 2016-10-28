package com.neubert.brandon;

import javax.persistence.*;

@Entity
@Table(name="app_user")
public class app_user {

    @Id
    @GeneratedValue
    private Integer id;
    private String uname;
    private String pword;
    private int active;
    private int manager_level;
    private String session;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name = "user_number",
            joinColumns = {@JoinColumn( name = "user_id")},
            inverseJoinColumns = @JoinColumn( name = "phone_id")
    )
    )
}