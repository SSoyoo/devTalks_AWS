package com.teamproject.devTalks.repository.board;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teamproject.devTalks.entity.board.TeacherBoardEntity;
import com.teamproject.devTalks.entity.resultSet.TeacherBoardListResultSet;

@Repository
public interface TeacherBoardRepository extends JpaRepository<TeacherBoardEntity,Integer> {
        public TeacherBoardEntity findByTeacherBoardNumber(int boardNumber);
        public TeacherBoardEntity findByWriterEmail(String email);


        @Transactional
        void deleteByteacherBoardNumber(int teacherBoardNumber);

        @Query
        (value = "SELECT " +
                "T.teacher_board_number AS teacherBoardNumber, " +
                "T.teacher_title AS teacherTitle, " +
                "T.teacher_content AS teacherContent, " +
                "T.teacher_board_image_url AS teacherBoardImageUrl, " +
                "T.write_datetime AS writeDatetime, " +
                "T.view_count AS viewCount, " +
                "T.writer_email AS writerEmail, " +
                "T.writer_nickname AS writerNickname, " +
                "T.writer_profile_image_url AS writerProfileImageUrl, " +
                "count(C.comment_number) AS teacherCommentCount, " +
                "count(H.user_number) AS teacherHeartCount " +
                "FROM teacher T " +
                "LEFT JOIN teacher_comment C " +
                "ON T.teacher_board_number = C.teacher_board_number " +
                "LEFT JOIN teacher_heart H " +
                "ON T.teacher_board_number = H.teacher_board_number " +
                "group by teacherBoardNumber " +
                "order by writeDatetime DESC ", nativeQuery = true)
        public List<TeacherBoardListResultSet> getListOrderByWriteDatetime();

        @Query
        (value = "SELECT " +
                "T.teacher_board_number AS teacherBoardNumber, " +
                "T.teacher_title AS teacherTitle, " +
                "T.teacher_content AS teacherContent, " +
                "T.teacher_board_image_url AS teacherBoardImageUrl, " +
                "T.write_datetime AS writeDatetime, " +
                "T.view_count AS viewCount, " +
                "T.writer_email AS writerEmail, " +
                "T.writer_nickname AS writerNickname, " +
                "T.writer_profile_image_url AS writerProfileImageUrl, " +
                "count(C.comment_number) AS teacherCommentCount, " +
                "count(H.user_number) AS teacherHeartCount " +
                "FROM teacher T " +
                "LEFT JOIN teacher_comment C " +
                "ON T.teacher_board_number = C.teacher_board_number " +
                "LEFT JOIN teacher_heart H " +
                "ON T.teacher_board_number = H.teacher_board_number " +
                "group by teacherBoardNumber " +
                "order by teacherHeartCount DESC ", nativeQuery = true)
        public List<TeacherBoardListResultSet> getListOrderByHeartCount();

        @Query
        (value = "SELECT " +
                "T.teacher_board_number AS teacherBoardNumber, " +
                "T.teacher_title AS teacherTitle, " +
                "T.teacher_content AS teacherContent, " +
                "T.teacher_board_image_url AS teacherBoardImageUrl, " +
                "T.write_datetime AS writeDatetime, " +
                "T.view_count AS viewCount, " +
                "T.writer_email AS writerEmail, " +
                "T.writer_nickname AS writerNickname, " +
                "T.writer_profile_image_url AS writerProfileImageUrl, " +
                "count(C.comment_number) AS teacherCommentCount, " +
                "count(H.user_number) AS teacherHeartCount " +
                "FROM teacher T " +
                "LEFT JOIN teacher_comment C " +
                "ON T.teacher_board_number = C.teacher_board_number " +
                "LEFT JOIN teacher_heart H " +
                "ON T.teacher_board_number = H.teacher_board_number " +
                "group by teacherBoardNumber " +
                "order by viewCount DESC ", nativeQuery = true)
        public List<TeacherBoardListResultSet> getListOrderByViewCount();
}
