package com.kh.app.domain.common.svc;

import com.kh.app.domain.common.dao.CodeDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.kh.app.domain.entity.Code;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CodeSVCImpl implements CodeSVC{

  private final CodeDAO codeDAO;

  /**
   * 하위코드 반환 by 부모 코드
   *
   * @param pcodeId 부모 코드
   * @return 하위 코드
   */
  @Override
  public List<Code> findCodesByPcodeId(String pcodeId) {
    return codeDAO.findCodesByPcodeId(pcodeId);
  }
}
