package com.bespokesoft.api.unit;

import com.bespokesoft.api.dto.APIResponse;
import com.bespokesoft.api.services.HealthService;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class HealthServiceUnitTest {

    @InjectMocks
    private HealthService healthService;

    private static final String SUCCESS_MESSAGE = "success";

    @Test
    public void shouldGetHealthResponse() {

        APIResponse healthResponse = healthService.getHealthResponse();

        MatcherAssert.assertThat(healthResponse,
                Matchers.hasProperty("message",is(SUCCESS_MESSAGE))
        );

    }
}
