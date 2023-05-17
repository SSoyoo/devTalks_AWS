package com.teamproject.devTalks.service.board;

import org.springframework.http.ResponseEntity;

import com.teamproject.devTalks.dto.request.board.recruit.PatchRecruitBoardRequestDto;
import com.teamproject.devTalks.dto.request.board.recruit.PostRecruitBoardRequestDto;
import com.teamproject.devTalks.dto.request.comment.recruit.PatchRecruitCommentRequestDto;
import com.teamproject.devTalks.dto.request.comment.recruit.PostRecruitCommentRequestDto;
import com.teamproject.devTalks.dto.request.heart.recruit.PostRecruitHeartRequestDto;
import com.teamproject.devTalks.dto.response.ResponseDto;
import com.teamproject.devTalks.dto.response.board.recruit.GetRecruitBoardListResponseDto;
import com.teamproject.devTalks.dto.response.board.recruit.GetRecruitBoardResponseDto;


public interface RecruitBoardService {

    public ResponseEntity<? super GetRecruitBoardResponseDto> getRecruitBoard(Integer recruitBoardNumber);
    public ResponseEntity<? super GetRecruitBoardListResponseDto> getRecruitBoardList();
    
    public ResponseEntity<ResponseDto> postRecruitBoard(String userEmail, PostRecruitBoardRequestDto dto);
    public ResponseEntity<ResponseDto> patchRecruitBoard(String userEmail, PatchRecruitBoardRequestDto dto);
    public ResponseEntity<ResponseDto> deleteRecruitBoard(String userEmail, Integer recruitBoardNumber);

    public ResponseEntity<ResponseDto> postRecruitComment(String userEmail, PostRecruitCommentRequestDto dto);
    public ResponseEntity<ResponseDto> patchRecruitComment(String userEmail, PatchRecruitCommentRequestDto dto);
    public ResponseEntity<ResponseDto> deleteRecruitComment(String userEmail, Integer recruitBoardNumber, Integer recruitCommentNumber);

    public ResponseEntity<ResponseDto> postRecruitHeart(String userEmail, PostRecruitHeartRequestDto dto);
    public ResponseEntity<ResponseDto> deleteRecruitHeart(String userEmail, Integer recruitBoardNumber);


    
}
