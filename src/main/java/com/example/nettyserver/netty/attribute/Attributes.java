package com.example.nettyserver.netty.attribute;

import com.example.nettyserver.netty.session.Session;
import io.netty.util.AttributeKey;

public interface Attributes {

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");

}
