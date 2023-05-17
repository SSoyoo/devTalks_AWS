package com.teamproject.devTalks.entity.primaryKey.recruit;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import lombok.Data;

@Data
public class RecruitHashtagPk implements Serializable {

    @Column(name="recruit_board_number")
    private int recruitBoardNumber;
    @Column(name="hashtag")
    private String boardHashTag;


}
