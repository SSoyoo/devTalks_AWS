package com.teamproject.devTalks.dto.request.comment.information;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostInformationCommentRequestDto {
    @NotNull
    private int informationBoardNumber;
    @NotBlank
    private String informationCommentContent;

    public PostInformationCommentRequestDto(PostInformationCommentRequestDto dto) {
        this.informationBoardNumber = dto.getInformationBoardNumber();
        this.informationCommentContent = dto.getInformationCommentContent();
    }
}