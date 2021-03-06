package com.example.nettyserver.netty.protocol.request;

import com.example.nettyserver.netty.annotations.TransmissionPacket;
import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.example.nettyserver.netty.protocol.command.Command.CREATE_GROUP_REQUEST;


@Data
@TransmissionPacket(name = "CREATE_GROUP_REQUEST")
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand(){

        return CREATE_GROUP_REQUEST;
    }

}
