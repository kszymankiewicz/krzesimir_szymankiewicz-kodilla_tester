package com.kodilla.spring.basic.springs_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Clock {

    public Clock () {
            System.out.println("Time: ");
        }



}
