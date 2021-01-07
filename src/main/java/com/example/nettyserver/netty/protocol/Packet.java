package com.example.nettyserver.netty.protocol;

import lombok.Data;

@Data
public abstract class Packet {
    private Byte version = 1;

    public abstract Byte getCommand();
}
