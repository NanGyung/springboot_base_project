package com.kh.app.domain.member.dao;

import com.kh.app.domain.entity.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberDAOImplTest {

  @Autowired
  private MemberDAO memberDAO;

  @Test
  @DisplayName("가입")
  void save() {
    Member member = new Member();
    member.setEmail("test4@kh.com");
    member.setPasswd("1128");
    member.setNickname("별칭4");
    member.setGender("남자");
    member.setHobby("축구");
    member.setRegion("울산");

    Member saveMember = memberDAO.save(member);

    Assertions.assertThat(saveMember.getMemberId()).isGreaterThan(0);
    Assertions.assertThat(saveMember.getEmail()).isEqualTo("test4@kh.com");
    Assertions.assertThat(saveMember.getPasswd()).isEqualTo("1128");
    Assertions.assertThat(saveMember.getNickname()).isEqualTo("별칭4");
    Assertions.assertThat(saveMember.getGender()).isEqualTo("남자");
    Assertions.assertThat(saveMember.getHobby()).isEqualTo("축구");
    Assertions.assertThat(saveMember.getRegion()).isEqualTo("울산");
  }
}