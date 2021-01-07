package com.example.nettyserver.netty.protocol.request;

import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.example.nettyserver.netty.protocol.command.Command.GROUP_MESSAGE_REQUEST;

@Data
@NoArgsConstructor
public class GroupMessageRequestPacket extends Packet {

    private String toGroupId;
    private String message;

    public GroupMessageRequestPacket(String toGroupId, String message){
        this.toGroupId = toGroupId;
        this.message = message;
    }

    @Override
    public Byte getCommand(){
        return GROUP_MESSAGE_REQUEST;
    }

}
