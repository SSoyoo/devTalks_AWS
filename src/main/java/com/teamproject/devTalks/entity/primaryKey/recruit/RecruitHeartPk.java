package com.teamproject.devTalks.entity.primaryKey.recruit;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class RecruitHeartPk implements Serializable{

    @Column
    private int recruitBoardNumber;
    @Column
    private int userNumber;
}
