package com.example.nettyserver.netty.protocol.response;

import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;

import static com.example.nettyserver.netty.protocol.command.Command.MESSAGE_RESPONSE;

@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand(){
        return MESSAGE_RESPONSE;
    }

}
