package com.teamproject.devTalks.entity.board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.teamproject.devTalks.dto.request.board.teacher.PatchTeacherBoardRequestDto;
import com.teamproject.devTalks.dto.request.board.teacher.PostTeacherBoardRequestDto;
import com.teamproject.devTalks.entity.user.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "teacher")
@Table(name = "teacher")
public class TeacherBoardEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherBoardNumber;
    private String writerProfileImageUrl;
    private String writerEmail;
    private String writerNickname;
    private String writeDatetime;
    private String teacherTitle;
    private String teacherContent;
    private String teacherBoardImageUrl;
    private String career;
    private String lectureUrl;
    private int viewCount;
    private String category;

    public TeacherBoardEntity(String userEmail, PostTeacherBoardRequestDto dto) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        this.writerEmail = getWriterEmail();
        this.writerNickname = getWriterNickname();
        this.writeDatetime = now.format(formatter);
        this.teacherTitle = dto.getTeacherTitle();
        this.teacherContent = dto.getTeacherContent();
        this.teacherBoardImageUrl = dto.getTeacherBoardImageUrl();
        this.career = dto.getCareer();
        this.lectureUrl = dto.getLectureUrl();
        
    }

    public TeacherBoardEntity(UserEntity userEntity, PatchTeacherBoardRequestDto dto) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        this.teacherBoardNumber = getTeacherBoardNumber();
        this.writerEmail = getWriterEmail();
        this.writerNickname = getWriterNickname();
        this.writeDatetime = now.format(formatter);
        this.teacherTitle = dto.getTeacherTitle();
        this.teacherContent = dto.getTeacherContent();
        this.teacherBoardImageUrl = dto.getTeacherBoardImageUrl();
        this.career = dto.getCareer();
        this.lectureUrl = dto.getLectureUrl();
    }
}
