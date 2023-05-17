package com.teamproject.devTalks.repository.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teamproject.devTalks.entity.board.InformationBoardEntity;
import com.teamproject.devTalks.entity.resultSet.InformationBoardListResultSet;

@Repository
public interface InformationBoardRepository extends JpaRepository<InformationBoardEntity, Integer> {
    
    public InformationBoardEntity findByInformationBoardNumber(int informationBoardNumber);

    @Query(value = "SELECT " +
        "I.information_board_number AS informationBoardNumber, " +
        "I.writer_profile_image_url AS writerProfileImageUrl, " +
        "I.writer_nickname AS writerNickname, " +
        "I.writer_email AS writerEmail, " +
        "I.information_board_title AS informationBoardTitle, " +
        "I.information_board_content AS informationBoardContent, " +
        "I.information_board_image_url AS informationBoardImageUrl, " +
        "I.content_source AS contentSource, " +
        "I.view_count AS viewCount, " +
        "I.write_datetime AS writeDatetime, " +
        "count(C.comment_number) AS informationCommentCount, " +
        "count(H.user_number) AS informationHeartCount " +
        "FROM information I, information_comment C, information_heart H, board_hashtag T " +
        "WHERE I.information_board_number = C.information_board_number " +
        "AND I.information_board_number = H.information_board_number " +
        "group by informationBoardNumber " +
        "order by writeDatetime ", nativeQuery = true 
)


    public List<InformationBoardListResultSet> getInformationBoardList();

    @Query(
        value=
        "SELECT " +
        "I.information_board_number AS informationBoardNumber," +
        "I.writer_profile_image_url AS writerProfileImageUrl," +
        "I.writer_nickname AS writerNickname," +
        "I.writer_email AS writerEmail," +
        "I.information_board_title AS informationBoardTitle," +
        "I.information_board_content AS informationBoardContent," +
        "I.information_board_image_url AS informationBoardImageUrl," +
        "I.content_source AS contentSource," +
        "I.view_count AS viewCount," +
        "I.write_datetime AS writeDatetime," +
        "count(DISTINCT C.comment_number) AS informationCommentCount," +
        "count(DISTINCT H.user_email) AS informationHeartCount " +
        "FROM information I, information_comment C, information_heart H, User U " +
        "WHERE I.information_board_number = C.information_board_number " +
        "AND I.information_board_number = H.information_board_number " +
        "AND I.writer_email = U.email " +
        "GROUP BY I.information_board_number " + 
        "ORDER BY heartCount DESC ",
        nativeQuery=true
    )

    @Transactional
    void deleteByInformationBoardNumber(int informationBoardNumber);



}
