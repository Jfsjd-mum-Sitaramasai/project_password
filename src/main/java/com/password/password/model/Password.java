package com.password.password.model;

import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;
    import lombok.Data;
    @Data
    @Entity
    @Table(name="Password_DETAILS")

public class Password {
    
    
    
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;
        @Column(name="FirstName")
        private String firstname;
        @Column(name="MiddleName")
        private String middlename;
        @Column(name="LastName")
        private String lastname;
        
        
        
    }
    



    


