package com.teamproject.devTalks.dto.request.board.information;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PatchInformationBoardRequestDto {
    @NotNull
    private Integer informationBoardNumber;
    @NotBlank
    private String informationBoardTitle;
    @NotBlank
    private String informationBoardContent;
    private String informationBoardImageUrl;
    @NotBlank
    private String contentSource;
    private String boardHashtag;

    public PatchInformationBoardRequestDto(PatchInformationBoardRequestDto dto) {
        this.informationBoardNumber = dto.getInformationBoardNumber();
        this.informationBoardTitle = dto.getInformationBoardTitle();
        this.informationBoardContent = dto.getInformationBoardContent();
        this.informationBoardImageUrl = dto.getInformationBoardImageUrl();
        this.contentSource = dto.getContentSource();
        this.boardHashtag = dto.getBoardHashtag();
    }
}
