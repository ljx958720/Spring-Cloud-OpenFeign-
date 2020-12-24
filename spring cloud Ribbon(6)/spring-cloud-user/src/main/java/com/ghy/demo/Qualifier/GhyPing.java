package com.ghy.demo.Qualifier;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;

public class GhyPing implements IPing {
    public boolean isAlive(Server server) {
        System.out.println(server.getPort()+"自己定义的"+server.getHost());
        return true;
    }
}
