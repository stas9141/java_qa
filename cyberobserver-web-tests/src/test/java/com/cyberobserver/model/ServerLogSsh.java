package com.cyberobserver.model;

import java.io.File;

public class ServerLogSsh {
    private File serverLog;

    public ServerLogSsh withServerLog(File serverLog) {
        this.serverLog = serverLog;
        return this;
    }

    public File getServerLog() {
        return serverLog;
    }
}
