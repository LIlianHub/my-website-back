package com.ballejos.mywebsiteback.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Getter
public class ReceiveRequestMail {
    String msgBody;
    String subject;
    String userEmail;
}
