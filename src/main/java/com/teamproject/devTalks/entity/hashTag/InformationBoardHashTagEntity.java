package com.teamproject.devTalks.entity.hashTag;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.teamproject.devTalks.entity.primaryKey.information.InformationHashtagPk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="InformationHashtag")
@Table(name="InformationHashtag")
@IdClass(InformationHashtagPk.class)
public class InformationBoardHashTagEntity {
    @Id
    private int informationBoardNumber;
    @Id
    private String boardHashtag;


}
