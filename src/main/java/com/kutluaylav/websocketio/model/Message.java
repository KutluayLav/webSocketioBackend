package com.kutluaylav.websocketio.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.awt.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Message extends BaseModel{
    @Enumerated(EnumType.STRING)
    private MessageType messageType;

    private String content;
    private String room;

    private String username;
}
