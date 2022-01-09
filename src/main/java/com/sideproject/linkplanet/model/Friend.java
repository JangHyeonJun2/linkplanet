package com.sideproject.linkplanet.model;

import javax.persistence.*;

@Entity
public class Friend extends TimeStamped{
    @EmbeddedId
    private FriendId friendUserId;
}
