package com.ballejos.mywebsiteback.entity;

import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class ReceivePostMail {
    String msgBody;
    String subject;
    String userEmail;
}
