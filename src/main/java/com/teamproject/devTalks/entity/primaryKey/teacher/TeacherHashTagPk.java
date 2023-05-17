package com.teamproject.devTalks.entity.primaryKey.teacher;

import java.io.Serializable;
import javax.persistence.Column;
import lombok.Data;

@Data
public class TeacherHashTagPk implements Serializable{
    @Column(name = "boardHashtag")
    private String boardHashtag;

    @Column(name = "teacherBoardNumber")
    private int teacherBoardNumber;
}
