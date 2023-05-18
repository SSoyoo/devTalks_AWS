package com.teamproject.devTalks.dto.response.board.recruit;

import java.util.ArrayList;
import java.util.List;

import com.teamproject.devTalks.dto.response.ResponseDto;
import com.teamproject.devTalks.entity.resultSet.RecruitBoardListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class GetRecruitBoardListResponseDto extends ResponseDto {
    private List<RecruitBoardSummary> recruitBoardList;
    
    public GetRecruitBoardListResponseDto(List<RecruitBoardListResultSet> resultSet) {
        super("SU", "SUCCESS");

        List<RecruitBoardSummary> recruitBoardList = new ArrayList<>();

        for (RecruitBoardListResultSet result: resultSet) {
            RecruitBoardSummary recruitBoardSummary = new RecruitBoardSummary(result);
            recruitBoardList.add(recruitBoardSummary);
        }
        this.recruitBoardList = recruitBoardList;
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class RecruitBoardSummary {
    private int recruitBoardNumber;
    private String recruitBoardTitle;
    private String recruitBoardContent;
    private String recruitBoardImageUrl;
    private String writeDatetime;
    private String writerEmail;
    private String writerNickname;
    private String writerProfileImageUrl;
    private int commentCount;
    private int heartCount;
    private List<String> boardHashTag;
    private boolean recruitmentStatus;

    public RecruitBoardSummary(RecruitBoardListResultSet resultSet) {
        this.recruitBoardNumber = resultSet.getRecruitBoardNumber();
        this.recruitBoardTitle = resultSet.getRecruitBoardTitle();
        this.recruitBoardContent = resultSet.getRecruitBoardContent();
        this.recruitBoardImageUrl = resultSet.getRecruitBoardImageUrl();
        this.writeDatetime = resultSet.getWriteDatetime();
        this.writerEmail = resultSet.getWriterEmail();
        this.writerNickname = resultSet.getWriterNickname();
        this.writerProfileImageUrl = resultSet.getWriterProfileImageUrl();
        this.commentCount = resultSet.getCommentCount();
        this.heartCount = resultSet.getHeartCount();
        this.boardHashTag = resultSet.getBoardHashTag();
        this.recruitmentStatus = resultSet.isRecruitmentStatus();
    }
}