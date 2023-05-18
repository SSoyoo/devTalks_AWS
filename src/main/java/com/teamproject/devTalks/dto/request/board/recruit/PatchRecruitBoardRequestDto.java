package com.teamproject.devTalks.dto.request.board.recruit;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class PatchRecruitBoardRequestDto {
    
    @NotNull
    private int recruitBoardNumber;
    @NotBlank
    private String recruitBoardTitle;
    @NotBlank
    private String recruitBoardContent;
    private String recruitBoardImageUrl;
    private List<String> boardHashTag;
    private boolean recruitmentStatus;
    
}
