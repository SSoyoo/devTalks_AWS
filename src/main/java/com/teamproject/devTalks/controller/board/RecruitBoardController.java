package com.teamproject.devTalks.controller.board;

import java.nio.file.attribute.UserPrincipal;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamproject.devTalks.dto.request.board.recruit.PatchRecruitBoardRequestDto;
import com.teamproject.devTalks.dto.request.board.recruit.PostRecruitBoardRequestDto;
import com.teamproject.devTalks.dto.response.ResponseDto;
import com.teamproject.devTalks.dto.response.board.recruit.GetRecruitBoardListResponseDto;
import com.teamproject.devTalks.dto.response.board.recruit.GetRecruitBoardResponseDto;
import com.teamproject.devTalks.security.UserPrinciple;
import com.teamproject.devTalks.service.board.RecruitBoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/board/recruit")
@RequiredArgsConstructor
public class RecruitBoardController {
    
    private final RecruitBoardService recruitBoardService;

    // 게시물 작성
    @PostMapping("")
    public ResponseEntity<ResponseDto> postRecruitBoard(
        @AuthenticationPrincipal UserPrinciple userPrinciple ,
        @Valid @RequestBody PostRecruitBoardRequestDto requestBody
    ) {
        String userEmail = userPrinciple.getUserEmail();
        ResponseEntity<ResponseDto> response = recruitBoardService.postRecruitBoard(userEmail, requestBody);
        return response;
    }

    // 특정 게시물 조회
    @GetMapping("/{recruitBoardNumber}")
    public  ResponseEntity<? super GetRecruitBoardResponseDto> getRecruitBoard(
        @PathVariable("recruitBoardNumber") Integer recruitBoardNumber
    ) {
        ResponseEntity<? super GetRecruitBoardResponseDto> response = recruitBoardService.getRecruitBoard(recruitBoardNumber);
        return response;
    }

    // 특정 게시물 리스트 조회
    @GetMapping("/list")
    public ResponseEntity<? super GetRecruitBoardListResponseDto> getRecruitBoardList() {
    
        ResponseEntity<? super GetRecruitBoardListResponseDto> response = 
            recruitBoardService.getRecruitBoardList();
        return response;
    
    }

    // 특정 게시물 수정
    @PatchMapping("")
    public ResponseEntity<ResponseDto> patchRecruitBoard(
        @Valid @RequestBody PatchRecruitBoardRequestDto requestBody,
        @AuthenticationPrincipal UserPrinciple userPrinciple
    ) {
        String userEmail = userPrinciple.getUserEmail();
        ResponseEntity<ResponseDto> response = 
        recruitBoardService.patchRecruitBoard(userEmail, requestBody);
        return response;
    }

    // 특정 게시물 삭제
    @DeleteMapping("/{recruitBoardNumber}")
    public ResponseEntity<ResponseDto> deleteRecruitBoard(
        @AuthenticationPrincipal UserPrinciple userPrinciple,
        @PathVariable("recruitBoardNumber") Integer recruitBoardNumber
    ) {
        String userEmail = userPrinciple.getUserEmail();
        ResponseEntity<ResponseDto> response = 
        recruitBoardService.deleteRecruitBoard(userEmail, recruitBoardNumber);
        return response;
    }

}

    
