package com.arunraj.rest.controller;

import com.arunraj.rest.model.ClientFile;
import com.arunraj.rest.service.IClientFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClientDetailsController {

    @Autowired
    private IClientFileService clientFileService;

    @GetMapping(value = "/details")
    @ResponseBody
    public List<ClientFile> getClientDetails(@RequestParam String clientFileName) {
        return clientFileService.findAllClientDetails(clientFileName);
    }
}
