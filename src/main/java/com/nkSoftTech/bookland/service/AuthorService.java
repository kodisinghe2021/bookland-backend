package com.nkSoftTech.bookland.service;


import com.nkSoftTech.bookland.dto.request_response_dto.RRAuthorDTO;

public interface AuthorService {
  long saveAuthor(RRAuthorDTO authorDTO);
}
