package com.teamproject.devTalks.service.user;

import com.teamproject.devTalks.dto.request.user.*;
import com.teamproject.devTalks.dto.response.ResponseDto;
import com.teamproject.devTalks.dto.response.user.GetMyInfoResponseDto;
import com.teamproject.devTalks.dto.response.user.GetUserInformationResponseDto;
import com.teamproject.devTalks.dto.response.user.SignInResponseDto;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<ResponseDto> userSignUp(UserSignUpRequestDto dto);

    ResponseEntity<? super SignInResponseDto> userSignIn(UserSignInRequestDto dto);

    ResponseEntity<ResponseDto> updateUser(String userEmail, UpdateUserRequestDto dto);

    ResponseEntity<ResponseDto> userDelete(String userEmail, DeleteUserRequestDto dto);

    ResponseEntity<ResponseDto> updateUserPassword(String userEmail, UpdateUserPasswordRequestDto dto);

    ResponseEntity<? super GetMyInfoResponseDto> getMyInfo(String userNumber);

    ResponseEntity<? super GetUserInformationResponseDto> getUserInformation(Integer userNumber);
}
