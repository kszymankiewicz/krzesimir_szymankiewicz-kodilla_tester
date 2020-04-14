package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;


class AlertServiceTestSuite {
    private AlertService alertService = new AlertService();
    private Subscriber subscriberMock = Mockito.mock(Subscriber.class);
    private Alert alert = Mockito.mock(Alert.class);
    private Subscriber secondSubscriberMock = Mockito.mock(Subscriber.class);
    private Subscriber thirdSubscriberMock = Mockito.mock(Subscriber.class);
    private String location = "Puławy";
    private String secondLocation = "Klikawa";
    private Set<Subscriber> subscriberSet = new HashSet<>();

    @Test
    public void subscriberShouldReceiveAnAlertFromASpecificLocation() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, location);
        //then
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscriberShouldReceiveAnAlertOnlyFromASpecificLocation() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, location);
        //then
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldNotSendAnAlertWhenALocationHasNoSubscribers() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, location);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        //then
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void nonSubscriberShouldNotReceiveAnyAlerts() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.sendAlertToUniqueSubscribers(alert);
        alertService.sendAlertFromASpecificLocation(alert, location);
        //then
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);
    }

    @Test
    public void shouldNotSendAnAlertWhenThereAreNoSubscribers() {
        //when
        alertService.sendAlertToUniqueSubscribers(alert);
        alertService.sendAlertFromASpecificLocation(alert, location);
        //then
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);
    }

    @Test
    public void multipleSubscriberShouldReceiveOnlyOneAlert() {
        //when
        subscriberSet.add(subscriberMock);
        subscriberSet.add(secondSubscriberMock);
        subscriberSet.add(thirdSubscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertToUniqueSubscribers(alert);
        //then
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void removedSubscriberFromASpecificLocationShouldNotReceiveAnAlertFromThisLocation() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, location);
        alertService.removeSubscriberFromASpecificLocation(subscriberMock, secondLocation);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        //then
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void removedSubscriberShouldNotReceiveAnyAlerts() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.removeSubscriber(subscriberMock);
        alertService.sendAlertFromASpecificLocation(alert, location);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        alertService.sendAlertToUniqueSubscribers(alert);
        //then
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);
    }

    @Test
    public void shouldNotSendAnAlertFromRemovedLocation() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.removeLocation(location);
        alertService.sendAlertFromASpecificLocation(alert, location);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        //then
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldNotSendAnAlertFromALocationWhichDoesNotExist() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, "Radom");
        //then
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);
    }

    @Test
    public void shouldNotRemoveNonExistentLocation() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.removeLocation(secondLocation);
        alertService.sendAlertFromASpecificLocation(alert, location);
        //then
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscriberShouldNotReceiveAnAlertFromLocationWhichDoesNotExist() {
        //when
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.removeSubscriberFromASpecificLocation(subscriberMock, secondLocation);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        //then
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);
    }

}