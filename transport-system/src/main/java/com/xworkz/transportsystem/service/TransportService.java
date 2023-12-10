package com.xworkz.transportsystem.service;

import com.xworkz.transportsystem.dto.TransportDTO;

import java.util.List;

public interface TransportService {

    public void validateAndSaveTransportInfo(TransportDTO dto);

    public List<TransportDTO> getLoginIdAndPassword(String loginId, String password);

    public List<TransportDTO> getAllUsers();

    public TransportDTO validateAndGetById(int id);

    public void updateTransportInfo(TransportDTO dto, int id);

    public  boolean deleteTransportInfo(int id);
}
