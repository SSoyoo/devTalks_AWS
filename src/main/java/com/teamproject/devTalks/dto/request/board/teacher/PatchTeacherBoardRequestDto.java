package com.teamproject.devTalks.dto.request.board.teacher;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchTeacherBoardRequestDto {
    @NotNull
    private int teacherBoardNumber;
    @NotBlank
    private String teacherTitle;
    @NotBlank
    private String teacherContent;
    private String teacherBoardImageUrl;
    private String career;
    private String lectureUrl;
    private String category;
    private List<String> boardHashtag;

    public PatchTeacherBoardRequestDto(PatchTeacherBoardRequestDto dto){

        this.teacherBoardNumber = dto.getTeacherBoardNumber();
        this.teacherTitle = dto.getTeacherTitle();
        this.teacherContent = dto.getTeacherContent();
        this.teacherBoardImageUrl = dto.getTeacherBoardImageUrl();
        this.career = dto.getCareer();
        this.lectureUrl = dto.getLectureUrl();
        this.category = dto.getCategory();
    }
}
