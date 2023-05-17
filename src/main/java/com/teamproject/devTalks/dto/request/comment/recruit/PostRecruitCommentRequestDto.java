package com.teamproject.devTalks.dto.request.comment.recruit;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostRecruitCommentRequestDto {
    
    @NotBlank
    private int recruitBoardNumber;
    @NotBlank
    private String recruitCommentContent;

}
