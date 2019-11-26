package com.Romit.SpringStudy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.Romit.SpringStudy.entity.Pudc;
import com.Romit.SpringStudy.mapper.PudcMapper;
import com.Romit.SpringStudy.Service.PudcService;

import java.util.List;

@Service
public class PudcServiceImpl implements PudcService {

    @Autowired
    private PudcMapper pudcMapper;

    @Override
    public int deleteByPrimaryKey(Integer pudcId) {
        return pudcMapper.deleteByPrimaryKey(pudcId);
    }

    @Override
    public int insert(Pudc record) {
        return pudcMapper.insert(record);
    }

    @Override
    public int insertSelective(Pudc record) {
        return pudcMapper.insertSelective(record);
    }

    @Override
    public Pudc selectByPrimaryKey(Integer pudcId) {
        return pudcMapper.selectByPrimaryKey(pudcId);
    }

    @Override
    public int updateByPrimaryKeySelective(Pudc record) {
        return pudcMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Pudc record) {
        return pudcMapper.updateByPrimaryKey(record);
    }

    public int insertList(List<Pudc> list) {
        return pudcMapper.insertList(list);
    }


    public Integer countByPudcNameAndPudcId(String pudcName, Integer pudcId) {
        return pudcMapper.countByPudcNameAndPudcId(pudcName, pudcId);
    }



    public List<Pudc> selectAllByPudcName(String pudcName) {
        return pudcMapper.selectAllByPudcName(pudcName);
    }
}

