package com.system.userservice.mapperstruct;

import com.system.librarymemberapi.dto.MemberDto;
import com.system.userservice.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 *
 * @author luming
 * @param
 * @return
 */
@Mapper
public interface MemberConverter {

    MemberConverter INSTANCE = Mappers.getMapper(MemberConverter.class);

    /**
     * Bean 转成 Dto
     * @param member
     * @return
     */
    MemberDto convertFrom(Member member);

    /**
     * Dto 转成 Bean
     *
     * @param memberDto
     * @return
     */
    Member convertFrom(MemberDto memberDto);

    /**
     * Bean list 转成Dto list
     *
     * @param memberList
     * @return
     */
    List<MemberDto> convertListToDto(List<Member> memberList);

    /**
     * Dto list  转成Bean list
     *
     * @param memberDtoList
     * @return
     */
    List<Member> convertListToBean(List<MemberDto> memberDtoList);

}
