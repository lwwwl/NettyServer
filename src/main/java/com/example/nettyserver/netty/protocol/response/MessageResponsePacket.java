package com.example.nettyserver.netty.protocol.response;

import com.example.nettyserver.netty.annotations.TransmissionPacket;
import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;

import static com.example.nettyserver.netty.protocol.command.Command.MESSAGE_RESPONSE;

@Data
@TransmissionPacket(name = "MESSAGE_RESPONSE")
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand(){
        return MESSAGE_RESPONSE;
    }

}
