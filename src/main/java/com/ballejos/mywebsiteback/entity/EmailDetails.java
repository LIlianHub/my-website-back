package com.ballejos.mywebsiteback.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class EmailDetails {
    private String recipient;
    private String msgBody;
    private String subject;
}
