package com.system.library.controller.member;

import com.system.common.request.RestRequest;
import com.system.common.response.RestResponse;
import com.system.librarymemberapi.api.MemberApi;
import com.system.librarymemberapi.dto.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lmm
 * @date 2019/7/20 8:16
 */
@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberApi memberApi;

    @PostMapping(value = "/getMemberByName" )
    public RestResponse<MemberDto> getMemberByName(@RequestBody RestRequest<MemberDto> request){
        RestResponse<MemberDto> restResponse = null;
        try {
            restResponse = memberApi.getMemberByUserName(request);
        }catch (Exception e){
            e.printStackTrace();
        }
        return restResponse;
    }
}
