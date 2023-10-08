package com.ballejos.mywebsiteback.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReceivePostMail {

    String msgBody;
    String subject;
    String userEmail;
}
