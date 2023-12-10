package com.xworkz.transportsystem.repository;

import com.xworkz.transportsystem.dto.TransportDTO;

import java.util.List;

public interface TransportRepository {

    public void save(TransportDTO dto);

    public List<TransportDTO> getLoginIdAndPassword(String loginId, String password);

    public List<TransportDTO> getAllUsers();

    public TransportDTO validateAndGetById(int id);

    public void updateTransportInfo(TransportDTO dto, int id);

    public  boolean deleteTransportInfo(int id);


}
