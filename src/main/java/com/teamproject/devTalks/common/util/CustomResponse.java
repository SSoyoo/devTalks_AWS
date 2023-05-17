package com.teamproject.devTalks.common.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.teamproject.devTalks.dto.response.ResponseDto;

public class CustomResponse {
    public static ResponseEntity<ResponseDto> success(){
        ResponseDto body = new ResponseDto("SU", "SUCCESS");
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    public static ResponseEntity<ResponseDto> databaseError() {

        ResponseDto errorBody =
            new ResponseDto("DE", "Database Error");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> validationFailed() {

        ResponseDto errorBody =
            new ResponseDto("VF", "Validation Failed");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> notExistBoardNumber() {

        ResponseDto errorBody =
            new ResponseDto("NB", "Non-Existent Board Number");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> notExistCommentNumber() {

        ResponseDto errorBody = 
            new ResponseDto("NC", "Non-Existent Comment Number");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> noExistUser() {

        ResponseDto errorBody =
            new ResponseDto("NU", "Non-Existent User");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> authenticationFailed() {

        ResponseDto errorBody =
            new ResponseDto("AF", "Authentication failed");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> noPermission() {

        ResponseDto errorBody =
            new ResponseDto("NP", "No permissions");
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> existEmail() {

        ResponseDto errorBody =
            new ResponseDto("EM", "Existent User Emails");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> existNickname() {

        ResponseDto errorBody =
            new ResponseDto("EN", "Existent User Nickname");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);

    }


    public static ResponseEntity<ResponseDto> existPhoneNumber() {

        ResponseDto errorBody =
            new ResponseDto("EP", "Existent User Phone Number");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> signInFailed() {

        ResponseDto errorBody =
            new ResponseDto("SF", "Sign In failed");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);

    }


    public static ResponseEntity<ResponseDto> passwordMismatch() {

        ResponseDto errorBody =
            new ResponseDto("PM", "Password mismatch");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorBody);

    }

    public static ResponseEntity<ResponseDto> expiredJwt(){

        ResponseDto errorBody =
                new ResponseDto("ET","expired Token");

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> alreadyRecommended(){
        ResponseDto body = new ResponseDto("AR", "ALREADY RECOMMENDED");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    public static ResponseEntity<ResponseDto> noExistRecommendation() {
        ResponseDto body = new ResponseDto("NR","Non-Exist Recommendation");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    public static ResponseEntity<ResponseDto> cannotRecommendToSelf() {
        ResponseDto body = new ResponseDto("CR", "You cannot recommend yourself.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    public static ResponseEntity<ResponseDto> alreadyBlacklisted(){
        ResponseDto body = new ResponseDto("AB", "ALREADY BLACKLISTED");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }
}
