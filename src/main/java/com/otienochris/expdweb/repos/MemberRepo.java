package com.otienochris.expdweb.repos;

import com.otienochris.expdweb.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Long> {
}
