package com.example.nettyserver.netty.protocol.request;

import com.example.nettyserver.netty.annotations.TransmissionPacket;
import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;

import static com.example.nettyserver.netty.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
@TransmissionPacket(name = "QUIT_GROUP_REQUEST")
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand(){
        return QUIT_GROUP_REQUEST;
    }

}
