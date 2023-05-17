package com.teamproject.devTalks.dto.response.board.teacher;

import com.teamproject.devTalks.dto.response.ResponseDto;
import com.teamproject.devTalks.entity.board.TeacherBoardEntity;
import com.teamproject.devTalks.entity.heart.TeacherHeartEntity;
import com.teamproject.devTalks.entity.user.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class GetTeacherBoardResponseDto extends ResponseDto {
    
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

    public GetTeacherBoardResponseDto(
        TeacherBoardEntity teacherBoardEntity, UserEntity userEntity, int teacherHeartCount
        
        ){
            super("SU","Success");
            
            this.teacherBoardNumber = teacherBoardEntity.getTeacherBoardNumber();
            this.writerProfileImageUrl = teacherBoardEntity.getWriterProfileImageUrl();
            this.writerEmail = teacherBoardEntity.getWriterEmail();
            this.writerNickname = teacherBoardEntity.getWriterNickname();
            this.writeDatetime = teacherBoardEntity.getWriteDatetime();
            this.teacherTitle = teacherBoardEntity.getTeacherTitle();
            this.teacherContent = teacherBoardEntity.getTeacherContent();
            this.teacherBoardImageUrl = teacherBoardEntity.getTeacherBoardImageUrl();
            this.career = teacherBoardEntity.getCareer();
            this.lectureUrl = teacherBoardEntity.getLectureUrl();
            this.viewCount = teacherBoardEntity.getViewCount();
            this.category = teacherBoardEntity.getCategory();
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        class Heart {
    
            private int userNumber;
            private int teacherBoardNumber;
    
            public Heart(TeacherHeartEntity teacherHeartEntity) {
                this.userNumber = teacherHeartEntity.getUserNumber();
                this.teacherBoardNumber = teacherHeartEntity.getTeacherBoardNumber();
            }
        }
}
