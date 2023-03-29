package com.kh.app.domain.member.dao;

import com.kh.app.domain.entity.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberDAOImpl implements MemberDAO{

  private final NamedParameterJdbcTemplate template;

//  public MemberDAOImpl(NamedParameterJdbcTemplate template) {
//    this.template = template;
//  }

  /**
   * 가입
   * @param member 회원정보
   * @return
   */
  @Override
  public Member save(Member member) {
    StringBuffer sql = new StringBuffer();
    sql.append("insert into member(member_id, email, passwd, nickname, gender, hobby, region) ");
    sql.append("values(member_member_id_seq.nextval, :email, :passwd, :nickname, :gender, :hobby, :region ) ");

    SqlParameterSource param = new BeanPropertySqlParameterSource(member);
    KeyHolder keyHolder = new GeneratedKeyHolder(); //insert 된 레코드에서 컬럼값 추출
    template.update(sql.toString(),param,keyHolder,new String[]{"member_id"});

    long memberId = keyHolder.getKey().longValue();

    member.setMemberId(memberId);
    return member;
  }

  /**
   * 수정
   * @param memberId 회원아이디
   * @param member 회원정보
   */
  @Override
  public void update(Long memberId, Member member) {

  }

  /**
   * @param email
   * @return
   */
  @Override
  public Optional<Member> findByEmail(String email) {
    return null;
  }

  /**
   * @param memberId
   * @return
   */
  @Override
  public Optional<Member> findById(String memberId) {
    return null;
  }

  /**
   * @return
   */
  @Override
  public List<Member> findAll() {
    return null;
  }

  /**
   * @param email
   */
  @Override
  public void delete(String email) {

  }

  /**
   * @param email
   * @return
   */
  @Override
  public boolean isExist(String email) {
    return false;
  }

  /**
   * @param email
   * @param passwd
   * @return
   */
  @Override
  public Optional<Member> login(String email, String passwd) {
    return null;
  }

  /**
   * @param nickname
   * @return
   */
  @Override
  public Optional<String> findEmailByNickname(String nickname) {
    return null;
  }


}
