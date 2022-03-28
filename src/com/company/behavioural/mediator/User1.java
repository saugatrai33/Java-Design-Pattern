package com.company.behavioural.mediator;

public class User1 extends Participants {

    private String name;
    private ApnaChatRoom chatRoom;

    public User1(ApnaChatRoom room) {
        this.chatRoom = room;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMsg(String msg) {
        chatRoom.showMsg(msg, this);
    }
}
