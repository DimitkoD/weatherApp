package com.example.springbootproject.NEW.Domain.Service.Implementation;

import com.example.springbootproject.NEW.Domain.Service.RestTemplateProvider;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateProviderImpl implements RestTemplateProvider {
    public RestTemplateProviderImpl() {
        System.out.println("RestTemplateImpl has been created");
    }

    @Override
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
