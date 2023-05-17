package com.teamproject.devTalks.dto.request.heart.recruit;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRecruitHeartRequestDto {

    @NotBlank
    private int recruitBoardNumber;

}
