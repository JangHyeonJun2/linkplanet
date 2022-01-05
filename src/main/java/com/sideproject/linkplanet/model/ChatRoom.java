package com.sideproject.linkplanet.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class ChatRoom extends TimeStamped{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHAT_ROOM_ID")
    private Long id;

    private String name;

    private Integer numberOfPeople;

}
