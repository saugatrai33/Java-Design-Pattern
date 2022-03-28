package com.company.behavioural.mediator;

public class ApnaChatRoomImpl implements ApnaChatRoom {
    @Override
    public void showMsg(String msg, Participants participants) {
        System.out.println(msg + " " + participants.getName());
    }
}
