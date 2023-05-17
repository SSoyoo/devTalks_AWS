package com.teamproject.devTalks.repository.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teamproject.devTalks.entity.board.QnaBoardEntity;
import com.teamproject.devTalks.entity.resultSet.QnaBoardListResultSet;

@Repository
public interface QnaBoardRepository extends JpaRepository<QnaBoardEntity, Integer> {

        public QnaBoardEntity findByQnaBoardNumber(int qnaBoardNumber);

        @Query(value = "SELECT " +
                        "Q.qna_board_number AS qnaBoardNumber, " +
                        "Q.qna_title AS qnaTitle, " +
                        "Q.qna_board_image_url AS qnaBoardImageUrl, " +
                        "Q.write_datetime AS writeDatetime, " +
                        "Q.view_count AS viewCount, " +
                        "Q.writer_email AS writerEmail, " +
                        "Q.writer_nickname AS writerNickname, " +
                        "Q.writer_profile_image_url AS writerProfileImageUrl, " +
                        "count(C.qna_comment_number) AS qnaCommentCount, " +
                        "count(H.user_number) AS qnaHeartCount " +
                        "FROM qna Q " +
                        "LEFT JOIN qna_comment C " +
                        "ON Q.qna_board_number = C.qna_board_number " +
                        "LEFT JOIN qna_heart H " +
                        "ON Q.qna_board_number = H.qna_board_number " +
                        "group by qnaBoardNumber " +
                        "order by writeDatetime DESC ", nativeQuery = true // sql문법그대로 jpa에서 쓸수 있게 해주는거
        )
        public List<QnaBoardListResultSet> getListOrderByWriteDatetime();

        @Query(value = "SELECT " +
                        "Q.qna_board_number AS qnaBoardNumber, " +
                        "Q.qna_title AS qnaTitle, " +
                        "Q.qna_content AS qnaContent, " +
                        "Q.qna_board_image_url AS qnaBoardImageUrl, " +
                        "Q.write_datetime AS writeDatetime, " +
                        "Q.view_count AS viewCount, " +
                        "Q.writer_email AS writerEmail, " +
                        "Q.writer_nickname AS writerNickname, " +
                        "Q.writer_profile_image_url AS writerProfileImageUrl, " +
                        "count(C.qna_comment_number) AS qnaCommentCount, " +
                        "count(H.user_number) AS qnaHeartCount " +
                        "FROM qna Q " +
                        "LEFT JOIN qna_comment C " +
                        "ON Q.qna_board_number = C.qna_board_number " +
                        "LEFT JOIN qna_heart H " +
                        "ON Q.qna_board_number = H.qna_board_number " +
                        "group by qnaBoardNumber " +
                        "order by qnaHeartCount DESC ", nativeQuery = true)
        public List<QnaBoardListResultSet> getListOrderByHeartCount();

        @Query(value = "SELECT " +
                        "Q.qna_board_number AS qnaBoardNumber, " +
                        "Q.qna_title AS qnaTitle, " +
                        "Q.qna_content AS qnaContent, " +
                        "Q.qna_board_image_url AS qnaBoardImageUrl, " +
                        "Q.write_datetime AS writeDatetime, " +
                        "Q.view_count AS viewCount, " +
                        "Q.writer_email AS writerEmail, " +
                        "Q.writer_nickname AS writerNickname, " +
                        "Q.writer_profile_image_url AS writerProfileImageUrl, " +
                        "count(C.qna_comment_number) AS qnaCommentCount, " +
                        "count(H.user_number) AS qnaHeartCount " +
                        "FROM qna Q " +
                        "LEFT JOIN qna_comment C " +
                        "ON Q.qna_board_number = C.qna_board_number " +
                        "LEFT JOIN qna_heart H " +
                        "ON Q.qna_board_number = H.qna_board_number " +
                        "group by qnaBoardNumber " +
                        "order by viewCount DESC ", nativeQuery = true)
        public List<QnaBoardListResultSet> getListOrderByViewCount();

        @Query(value = "SELECT " +
                        "Q.qna_board_number AS qnaBoardNumber, " +
                        "Q.qna_title AS qnaTitle, " +
                        "Q.qna_content AS qnaContent, " +
                        "Q.qna_board_image_url AS qnaBoardImageUrl, " +
                        "Q.write_datetime AS writeDatetime, " +
                        "Q.view_count AS viewCount, " +
                        "Q.writer_email AS writerEmail, " +
                        "Q.writer_nickname AS writerNickname, " +
                        "Q.writer_profile_image_url AS writerProfileImageUrl, " +
                        "count(C.qna_comment_number) AS qnaCommentCount, " +
                        "count(H.user_number) AS qnaHeartCount " +
                        "FROM qna Q " +
                        "LEFT JOIN qna_comment C " +
                        "ON Q.qna_board_number = C.qna_board_number " +
                        "LEFT JOIN qna_heart H " +
                        "ON Q.qna_board_number = H.qna_board_number " +
                        "group by qnaBoardNumber " +
                        "order by qnaCommentCount DESC ", nativeQuery = true)

        public List<QnaBoardListResultSet> getListOrderByCommentCount();

}
