package com.teamproject.devTalks.repository.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teamproject.devTalks.entity.board.RecruitBoardEntity;
import com.teamproject.devTalks.entity.resultSet.RecruitBoardListResultSet;

@Repository
public interface RecruitBoardRepository extends JpaRepository<RecruitBoardEntity, Integer >{

    public RecruitBoardEntity findByRecruitBoardNumber(Integer recruitBoardNumber);

    @Query(value = "SELECT " +
        "R.recruit_board_number AS recruitBoardNumber, " + 
        "R.recruit_board_title AS recruitBoardTitle, " +
        "R.recruit_board_content AS recruitBoardContent, " +
        "R.recruit_board_image_url AS recruitBoardImageUrl, " +
        "U.user_nickname AS writerNickname, " +
        "U.user_profile_image_url AS writerProfileImageUrl," +
        "R.write_datetime AS writeDatetime, " +
        "R.view_count AS viewCount, " +
        "R.recruitment_status AS recruitmentStatus, " +
        "count(C.recruit_comment_number) AS recruitCommentCount, " +
        "count(H.user_number) AS recruitHeartCount " +
        "FROM recruit R , recruit_comment C, recruit_heart H, recruit_hashtag HT, user U " +
        "WHERE R.recruit_board_number = C.recruit_board_number " +
        "AND R.recruit_board_number = H.recruit_board_number " +
        "AND R.recruit_board_number = HT.recruit_board_number " +
        "AND R.writer_email = U.user_email " +
        "GROUP BY recruitBoardNumber " +
        "ORDER BY writeDatetime ", nativeQuery = true
    )

    public List<RecruitBoardListResultSet> getRecruitBoardList();
    

    @Transactional
    public void deleteByRecruitBoardNumber(int recruitBoardNumber);



}
