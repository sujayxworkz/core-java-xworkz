package com.xworkz.passportsystem.service;

import com.xworkz.passportsystem.dto.PassportDTO;

import java.util.List;

public interface PassportService {

    public void validateAndSavePassportInfo(PassportDTO dto);

    public List<PassportDTO> getLoginIdAndPassword(String loginId, String password);

    public List<PassportDTO> getUsersInfo();

    public PassportDTO getUserById(int id);

    public void updatePassportInfo(PassportDTO dto,int id);

    public boolean deletePassportInfo(int id);
}
