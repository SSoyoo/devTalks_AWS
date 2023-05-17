package com.teamproject.devTalks.repository.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamproject.devTalks.entity.board.RecruitBoardEntity;

@Repository
public interface RecruitBoardRepository extends JpaRepository<RecruitBoardEntity, Integer >{

    public RecruitBoardEntity findByRecruitBoardNumber(int recruitBoardNumber);
    
}
