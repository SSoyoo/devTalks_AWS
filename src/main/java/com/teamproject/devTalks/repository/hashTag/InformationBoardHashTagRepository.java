package com.teamproject.devTalks.repository.hashTag;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamproject.devTalks.entity.hashTag.InformationBoardHashTagEntity;
import com.teamproject.devTalks.entity.primaryKey.information.InformationHashtagPk;

@Repository
public interface InformationBoardHashTagRepository extends JpaRepository<InformationBoardHashTagEntity, InformationHashtagPk> {

    List<InformationBoardHashTagEntity> findAllByBoardHashtag(String boardHashtag);


}
