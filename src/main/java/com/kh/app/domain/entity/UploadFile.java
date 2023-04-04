package com.kh.app.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UploadFile {
  private Long uploadfileId;
  private String code;
  private Long rid;
  private String store_filename;
  private String upload_filename;
  private String fsize;
  private String ftype;
  private LocalDateTime cdate;
  private LocalDateTime udate;
}
