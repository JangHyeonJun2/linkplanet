package com.sideproject.linkplanet.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
public class User extends TimeStamped{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    private String todayMood;

    private String backgroundImage;

    private String location;

    private Boolean isUseRealTimeLocation;

    private Integer siren;

    private LocalDateTime maxSirenCreatedAt;
}
