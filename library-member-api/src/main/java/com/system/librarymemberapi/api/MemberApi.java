package com.system.librarymemberapi.api;


import com.system.common.request.RestRequest;
import com.system.common.response.RestResponse;
import com.system.librarymemberapi.dto.MemberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lmm
 * @date 2019/7/20 0:49
 */
@Component
@FeignClient("library-member-service")
public interface MemberApi {

    @RequestMapping(value = "/getMemberByName")
    RestResponse<MemberDto> getMemberByUserName(@RequestBody RestRequest<MemberDto> request);
}
