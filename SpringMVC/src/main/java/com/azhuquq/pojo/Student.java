package com.azhuquq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String sid;
    private String sname;
    private String spassword;
    private int sright;
    private int sflag;
}
