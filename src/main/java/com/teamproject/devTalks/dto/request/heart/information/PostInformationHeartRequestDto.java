package com.teamproject.devTalks.dto.request.heart.information;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostInformationHeartRequestDto {
    
    @NotBlank
    private int informationBoardNumber;
}
