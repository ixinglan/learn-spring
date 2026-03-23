package org.example.service;


import org.springframework.stereotype.Service;

/**
 * @author zhaojianqiang
 */
@Service
public class BoringServiceImpl implements IBoringService {
    @Override
    public String getExample() {
        String data = "getExample!";
        return data;
    }

    @Override
    public String postExample() {
        String responseBody = "postExample";
        return responseBody;
    }
}
