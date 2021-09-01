package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Member;

import java.util.List;
/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */
public interface MemberService {
    List<Member> getAllMembers();

    Member getMemberById(Long id);

    Member addMember(Member event);

    void deleteMemberById(Long id);

    void updateMember(Long id, Member newMember);
}
