package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.springs_scopes.homework.Clock;
import sun.security.krb5.internal.crypto.ArcFourHmacEType;

public interface Car {

    boolean hasHeadlightsTurnedOn();
    String getCarType();
    boolean setLight(boolean value);
}