package com.xworkz.passportsystem.service.Impl;

import com.xworkz.passportsystem.dto.PassportDTO;
import com.xworkz.passportsystem.repository.Impl.PassportRepositoryImpl;
import com.xworkz.passportsystem.service.PassportService;

import java.util.List;

public class PassportServiceImpl implements PassportService {

    PassportRepositoryImpl passportRepository;

    public  PassportServiceImpl(){

        passportRepository = new PassportRepositoryImpl();
    }

    @Override
    public void validateAndSavePassportInfo(PassportDTO dto) {

        if(dto!=null){
            passportRepository.save(dto);
        }

    }

    @Override
    public List<PassportDTO> getLoginIdAndPassword(String loginId, String password) {

        List<PassportDTO> dtoList = null;
        if(loginId!=null && password!=null) {
            dtoList = passportRepository.getLoginIdAndPassword(loginId, password);
        }
        return dtoList;
    }

    @Override
    public List<PassportDTO> getUsersInfo() {

        return passportRepository.getUsersInfo();
    }

    @Override
    public PassportDTO getUserById(int id) {
        PassportDTO dto = null;
        if(id>0){
            dto = passportRepository.getUserById(id);
        }
        return dto;
    }

    @Override
    public void updatePassportInfo(PassportDTO dto,int id) {

        passportRepository.updatePassportInfo(dto, id);



    }

    @Override
    public boolean deletePassportInfo(int id) {

        boolean isDeleted = false;
        if(id>0){
            passportRepository.deletePassportInfo(id);
            isDeleted = true;
        }

        return isDeleted;
    }
}
