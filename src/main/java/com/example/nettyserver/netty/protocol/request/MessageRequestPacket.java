package com.example.nettyserver.netty.protocol.request;

import com.example.nettyserver.netty.annotations.TransmissionPacket;
import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;

import static com.example.nettyserver.netty.protocol.command.Command.MESSAGE_REQUEST;

@Data
@TransmissionPacket(name = "MESSAGE_REQUEST")
public class MessageRequestPacket extends Packet {

    private String toUserId;

    private String message;

    public MessageRequestPacket(String toUserId, String message){
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand(){
        return MESSAGE_REQUEST;
    }

}
