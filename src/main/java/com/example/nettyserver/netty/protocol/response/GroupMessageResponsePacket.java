package com.example.nettyserver.netty.protocol.response;

import com.example.nettyserver.netty.protocol.Packet;
import com.example.nettyserver.netty.session.Session;
import lombok.Data;

import static com.example.nettyserver.netty.protocol.command.Command.GROUP_MESSAGE_RESPONSE;

@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;
    private Session fromUser;
    private String message;

    @Override
    public Byte getCommand(){
        return GROUP_MESSAGE_RESPONSE;
    }

}
