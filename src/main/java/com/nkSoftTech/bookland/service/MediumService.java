package com.nkSoftTech.bookland.service;


import com.nkSoftTech.bookland.dto.request_response_dto.RRMediumDTO;

public interface MediumService {
  long saveMedium(RRMediumDTO mediumDTO);
}
