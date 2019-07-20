package com.system.userservice.apiImpl;

import com.system.common.request.RestRequest;
import com.system.common.response.RestResponse;
import com.system.librarymemberapi.api.MemberApi;
import com.system.librarymemberapi.dto.MemberDto;
import com.system.userservice.dao.MemberRepository;
import com.system.userservice.entity.Member;
import com.system.userservice.mapperstruct.MemberConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lmm
 * @date 2019/7/20 0:48
 */
@Slf4j
@RestController
public class MemberApiImpl implements MemberApi {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public RestResponse<MemberDto> getMemberByUserName(@RequestBody RestRequest<MemberDto> restRequest) {
       RestResponse<MemberDto> response = new RestResponse<>();
       MemberDto memberDto = restRequest.getBody();
       Long id= 1L;
       Member member = memberRepository.getMemberById(id);
       if(member != null && member.getAge()>0){
           response.setBody(MemberConverter.INSTANCE.convertFrom(member));;
           // 可使用枚举
           response.setCode("200");
           response.setMsg("请求成功");
       }
       return response;
    }
}
