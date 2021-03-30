package com.dbdemo.rdbms.service;

import com.dbdemo.rdbms.model.ApiVersion;
import com.dbdemo.rdbms.repository.VersionRdbmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersionServiceRdbmsImpl implements VersionServiceRdbms {

    @Autowired
    private VersionRdbmsRepository versionRepository;

    @Override
    public ApiVersion getVersion() {
        //Save data first
        ApiVersion apiVersion = new ApiVersion(1L,"Rdbms version 1.00");
        versionRepository.save(apiVersion);

        //Return the first and only element in the list. Value can be changed from data.sql
        return versionRepository.findAll().get(0);
    }
}
