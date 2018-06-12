package com.bespokesoft.api.services;

import com.bespokesoft.api.dto.APIResponse;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    private static final String SUCCESS_MESSAGE = "success";

    public APIResponse getHealthResponse() {
        return new APIResponse(SUCCESS_MESSAGE);
    }
}
