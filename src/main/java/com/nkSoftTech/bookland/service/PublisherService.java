package com.nkSoftTech.bookland.service;


import com.nkSoftTech.bookland.dto.request_response_dto.RRPublisherDTO;

public interface PublisherService {
  long savePublisher(RRPublisherDTO publisherDTO);
}
