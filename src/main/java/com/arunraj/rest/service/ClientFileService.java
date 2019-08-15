package com.arunraj.rest.service;

import com.arunraj.rest.model.ClientFile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientFileService implements IClientFileService {

    @Override
    public List<ClientFile> findAllClientDetails(String clientFileName) {
        List<ClientFile> clientDetails = new ArrayList<>();

        clientDetails.add(new ClientFile(clientFileName));

        return clientDetails;
    }
}
