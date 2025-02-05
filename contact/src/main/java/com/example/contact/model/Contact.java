package com.example.contact.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;       // 姓名
    private String message;    // 留言
    private String gender;     // 性别
    private String hobbies;    // 爱好
    private String country;    // 国家
}