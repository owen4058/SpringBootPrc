package com.springboot.prc.jykim.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Certificate {
    //자격증
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    // PK

    @Column(name = "name", nullable = false, unique = false)
    private String name;
    // 자격증 이름

    @Column(name = "image", nullable = false, unique = false)
    private String image;
    // 자격증 사진

}
