package com.nkSoftTech.bookland.service;


import com.nkSoftTech.bookland.dto.request_dto.RequestCreateBookDTO;

public interface BookService {
  long saveBook(RequestCreateBookDTO bookDTO);
}
