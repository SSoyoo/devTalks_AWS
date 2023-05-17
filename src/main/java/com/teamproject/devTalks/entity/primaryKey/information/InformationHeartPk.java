package com.teamproject.devTalks.entity.primaryKey.information;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class InformationHeartPk implements Serializable {
    @Column
    private int informationBoardNumber;
    @Column
    private int userNumber;
}
