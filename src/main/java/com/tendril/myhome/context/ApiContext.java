package com.tendril.myhome.context;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

@Component
@RequestScope
public class ApiContext {

    @Getter
    private String id = UUID.randomUUID().toString();
}
