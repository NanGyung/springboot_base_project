package com.kh.app.domain.common.dao;

import com.kh.app.domain.entity.Code;

import java.util.List;

public interface CodeDAO {
  /**
   * 하위코드 반환 by 부모 코드
   * @param pcodeId 부모 코드
   * @return 하위 코드
   */
  List<Code> findCodesByPcodeId(String pcodeId);

  /**
   * 전체코드
   * @return
   */
  List<Code> find();
}
