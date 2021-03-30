package com.dbdemo.nosql.service;

import com.dbdemo.nosql.model.ApiVersion;
import com.dbdemo.nosql.repository.VersionNoSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersionServiceNoSqlImpl implements VersionServiceNoSql{
    @Autowired
    private VersionNoSqlRepository versionRepository;

    @Override
    public ApiVersion getVersion() {
        //Save data first
        ApiVersion apiVersion = new ApiVersion(1L,"Mongo version 1.00");
        versionRepository.save(apiVersion);

        //Return the first and only element in the list. Value can be changed from data.sql
        return versionRepository.findAll().get(0);
    }
}
