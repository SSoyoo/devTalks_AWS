package com.teamproject.devTalks.repository.heart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teamproject.devTalks.entity.heart.InformationHeartEntity;
import com.teamproject.devTalks.entity.primaryKey.information.InformationHeartPk;

@Repository
public interface InformationHeartRepository  extends JpaRepository<InformationHeartEntity, InformationHeartPk> {


    List<InformationHeartEntity> findByInformationBoardNumber(int informationBoardNumber);

    @Transactional
    void deleteByInformationBoardNumber(int informationBoardNumber);

    @Transactional
    void deleteByUserNumberAndInformationBoardNumber(int userNumber, int informationBoardNumber);

}
