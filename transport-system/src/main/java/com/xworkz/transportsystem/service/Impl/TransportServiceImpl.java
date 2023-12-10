package com.xworkz.transportsystem.service.Impl;

import com.xworkz.transportsystem.dto.TransportDTO;
import com.xworkz.transportsystem.repository.Impl.TransportRepositoryImpl;
import com.xworkz.transportsystem.repository.TransportRepository;
import com.xworkz.transportsystem.service.TransportService;

import java.util.List;

public class TransportServiceImpl implements TransportService {

    TransportRepository transportRepository;

    public  TransportServiceImpl(){

        transportRepository = new TransportRepositoryImpl();
    }

    @Override
    public void validateAndSaveTransportInfo(TransportDTO dto) {
        if(dto!=null){
            transportRepository.save(dto);
        }
    }

    @Override
    public List<TransportDTO> getLoginIdAndPassword(String loginId, String password) {
        List<TransportDTO> dtoList = null;
        if(loginId!=null || password!=null){
            dtoList = transportRepository.getLoginIdAndPassword(loginId, password);
        }
        return dtoList;
    }

    @Override
    public List<TransportDTO> getAllUsers() {

        return transportRepository.getAllUsers();
    }

    @Override
    public TransportDTO validateAndGetById(int id) {
        TransportDTO dto = null;
        if(id>0){
           dto = transportRepository.validateAndGetById(id);
        }
        return dto;
    }

    @Override
    public void updateTransportInfo(TransportDTO dto, int id) {

        transportRepository.updateTransportInfo(dto, id);

    }

    @Override
    public boolean deleteTransportInfo(int id) {
        boolean isDeleted = false;
        if(id>0){
            transportRepository.deleteTransportInfo(id);
            isDeleted=true;
        }
        return  isDeleted;
    }
}
