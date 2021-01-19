package com.example.nettyserver.netty.protocol.response;

import com.example.nettyserver.netty.annotations.TransmissionPacket;
import com.example.nettyserver.netty.protocol.Packet;
import com.example.nettyserver.netty.session.Session;
import lombok.Data;

import java.util.List;

import static com.example.nettyserver.netty.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

@Data
@TransmissionPacket(name = "LIST_GROUP_MEMBERS_RESPONSE")
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {
        return LIST_GROUP_MEMBERS_RESPONSE;
    }

}
