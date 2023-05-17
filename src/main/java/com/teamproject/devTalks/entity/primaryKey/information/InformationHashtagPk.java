package com.teamproject.devTalks.entity.primaryKey.information;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class InformationHashtagPk implements Serializable {

    @Column(name="information_board_number")
    private int informationBoardNumber;
    @Column(name="hashtag")
    private String boardHashtag;


}