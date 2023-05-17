package com.teamproject.devTalks.entity.board;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.teamproject.devTalks.dto.request.board.recruit.PostRecruitBoardRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="recruit")
@Table(name="recruit")
public class RecruitBoardEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recruitBoardNumber;
    private String writerProfileImageUrl;
    private String writerEmail;
    private String writerNickname;
    private String writeDatetime;
    private String recruitBoardTitle;
    private String recruitBoardContent;
    private String recruitBoardImageUrl;
    private int viewCount;
    private boolean recruitmentStatus;

    public RecruitBoardEntity(String userEmail, PostRecruitBoardRequestDto dto) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);

        this.writerProfileImageUrl = getWriterProfileImageUrl();
        this.writerEmail = getWriterEmail();
        this.writerNickname = getWriterNickname();
        this.recruitBoardTitle = dto.getRecruitBoardTitle();
        this.recruitBoardContent = dto.getRecruitBoardContent();
        this.recruitBoardImageUrl = dto.getRecruitBoardImageUrl();
        this.viewCount = 0;
        this.recruitmentStatus = dto.isRecruitmentStatus();
        this.writeDatetime = writeDatetime;


    }

}
