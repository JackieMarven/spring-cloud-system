package com.system.userservice.dao;

import com.system.userservice.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lmm
 * @date 2019/7/20 0:45
 */
@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    Member getMemberById(Long id);

}
