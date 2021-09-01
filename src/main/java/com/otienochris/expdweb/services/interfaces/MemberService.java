package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Member;

import java.util.List;

public interface MemberService {
    List<Member> getAllMembers();

    Member getMemberById(Long id);

    Member addMember(Member event);

    void deleteMemberById(Long id);

    void updateMember(Long id, Member newMember);
}
