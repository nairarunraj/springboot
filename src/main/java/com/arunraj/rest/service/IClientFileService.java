package com.arunraj.rest.service;

import com.arunraj.rest.model.ClientFile;

import java.util.List;

public interface IClientFileService {
    List<ClientFile> findAllClientDetails(String clientFileName);
}
