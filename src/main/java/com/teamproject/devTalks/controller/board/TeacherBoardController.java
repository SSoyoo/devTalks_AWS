package com.teamproject.devTalks.controller.board;

import com.teamproject.devTalks.dto.response.board.teacher.GetTeacherBoardResponseDto;
import com.teamproject.devTalks.security.UserPrinciple;
import com.teamproject.devTalks.dto.request.board.teacher.PatchTeacherBoardRequestDto;
import com.teamproject.devTalks.dto.request.board.teacher.PostTeacherBoardRequestDto;
import com.teamproject.devTalks.dto.request.heart.teacher.PostTeacherHeartRequestDto;
import com.teamproject.devTalks.dto.response.ResponseDto;
import com.teamproject.devTalks.dto.response.board.teacher.GetTeacherBoardListResponseDto;
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
import com.teamproject.devTalks.service.board.TeacherBoardService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/board/teacher")
@RequiredArgsConstructor
public class TeacherBoardController {
    
    private final TeacherBoardService teacherBoardService;

    @GetMapping("{teacherBoardNumber}")
    public ResponseEntity<? super GetTeacherBoardResponseDto> getTeacherBoard(
        @Valid @PathVariable("teacherBoardNumber") Integer teacherboardNumber){
        ResponseEntity<? super GetTeacherBoardResponseDto> response =
            teacherBoardService.getTeacherBoard(teacherboardNumber);
        return response;
    }

    @GetMapping("/list/{sort}")
    public ResponseEntity<? super GetTeacherBoardListResponseDto> getTeacherBoardList(
        @Valid @PathVariable("sort") String teacherSort) {
        ResponseEntity<? super GetTeacherBoardListResponseDto> response =
            teacherBoardService.getTeacherBoardList(teacherSort);
        return response;
    }

    @PostMapping("")
    public ResponseEntity<ResponseDto> PostTeacherBoard(
        @Valid @RequestBody PostTeacherBoardRequestDto requestBody,
        @AuthenticationPrincipal UserPrinciple userPrinciple) {
        String userEmail = userPrinciple.getUserEmail();
        ResponseEntity<ResponseDto> response = 
            teacherBoardService.postTeacherBoard(userEmail, requestBody);
        return response;
    }

    @PatchMapping("")
    public ResponseEntity<ResponseDto> patchTeacherBoard(
        @Valid @RequestBody PatchTeacherBoardRequestDto requestBody,
        @AuthenticationPrincipal UserPrinciple userPrinciple) {
        String userEmail = userPrinciple.getUserEmail();
        ResponseEntity<ResponseDto> response = 
            teacherBoardService.patchTeacherBoard(userEmail, requestBody);
        return response;
    }

    @DeleteMapping("/{teacherBoardNumber}")
    public ResponseEntity<ResponseDto> deleteTeacherBoard(
        @PathVariable("teacherBoardNumber") Integer teacherBoardNumber,
        @AuthenticationPrincipal UserPrinciple userPrinciple) {
        String userEmail = userPrinciple.getUserEmail();
        ResponseEntity<ResponseDto> response =
            teacherBoardService.deleteTeacherBoard(userEmail, teacherBoardNumber);
        return response;
    }

    @PostMapping("/heart")
    public ResponseEntity<ResponseDto> postTeacherHeart(
        @Valid @RequestBody PostTeacherHeartRequestDto requestBody,
        @AuthenticationPrincipal UserPrinciple userPrinciple) {                
        String userEmail = userPrinciple.getUserEmail();
        ResponseEntity<ResponseDto> response = 
            teacherBoardService.postTeacherHeart(userEmail, requestBody);
        return response;
    }
        
    @DeleteMapping("/heart/{teacherBoardNumber}")
    public ResponseEntity<ResponseDto> deleteTeacherHeart(
        @PathVariable("teacherBoardNumber") Integer teacherBoardNumber,
        @AuthenticationPrincipal UserPrinciple userPrinciple) {
        String userEmail = userPrinciple.getUserEmail();
        ResponseEntity<ResponseDto> response = 
            teacherBoardService.deleteTeacherHeart(userEmail, teacherBoardNumber);
        return response;
    }
}
