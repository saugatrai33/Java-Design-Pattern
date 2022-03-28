package com.company.behavioural.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        var chatRoom = new ApnaChatRoomImpl();
        var user1 = new User1(chatRoom);
        user1.setName("Ram");
        user1.sendMsg("Hello");
        var user2 = new User2(chatRoom);
        user2.setName("Sita");
        user2.sendMsg("World");
    }
}
