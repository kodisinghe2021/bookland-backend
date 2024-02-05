package com.nkSoftTech.bookland.utils.key_maker;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KeyMaker {

  public String createBookCode(String bookName, long authorId, long publisherId, long mediumId, long gradeId) {
    return bookName+"a"+authorId+"p"+publisherId+"m"+mediumId+"g"+gradeId;
  }
}
