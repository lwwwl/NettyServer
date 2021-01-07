package com.example.nettyserver.netty.protocol.request;

import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;

import static com.example.nettyserver.netty.protocol.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_REQUEST;
    }

}
