package com.company.behavioural.mediator;

public class User2 extends Participants {
    private String name;
    private ApnaChatRoom chatRoom;

    public User2(ApnaChatRoom room) {
        this.chatRoom = room;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMsg(String msg) {
        chatRoom.showMsg(msg, this);
    }
}
