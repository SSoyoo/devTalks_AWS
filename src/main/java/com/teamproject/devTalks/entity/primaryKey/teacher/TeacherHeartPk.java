package com.teamproject.devTalks.entity.primaryKey.teacher;

import java.io.Serializable;
import javax.persistence.Column;
import lombok.Data;

@Data
public class TeacherHeartPk implements Serializable{
    @Column(name = "userNumber")
    private int userNumber;
    @Column(name = "teacherBoardNumber")
    private int teacherBoardNumber;
}
