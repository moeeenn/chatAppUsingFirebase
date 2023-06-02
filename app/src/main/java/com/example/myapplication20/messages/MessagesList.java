package com.example.myapplication20.messages;

public class MessagesList {

    private String name,mobile,lastMessage,profilePic,chatKey;
    private  int unseenMessage;

    public MessagesList(String name, String mobile, String lastMessage,String profilePic, int unseenMessage,String chatKey) {
        this.name = name;
        this.mobile = mobile;
        this.lastMessage = lastMessage;
        this.profilePic=profilePic;
        this.unseenMessage = unseenMessage;
        this.chatKey = chatKey;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public int getUnseenMessage() {
        return unseenMessage;
    }

    public String getChatKey() {
        return chatKey;
    }
}
