package com.cyberobserver.Jsch;

import com.jcraft.jsch.JSch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class Jsch {
    private String ip = "10.0.0.152";
    private String USER = "cyberobserver";
    private int PORT = 22;
    private String OBSERVERPASS = "C0DBLocal!";
    private Session SESSION = null;

    public Jsch() throws Exception {

        SESSION = initSession();
    }

    private Session initSession() throws Exception {
        try {
            JSch jsch = new JSch();
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            Session session = jsch.getSession(USER, ip, PORT);
            session.setPassword(OBSERVERPASS);
            session.setConfig(config);
            session.connect(1000 * 10);
            System.out.println("Connected to host: " + ip);
            return session;
        } catch (Exception e) {
            System.out.println("failed to connect to host " + ip + " with SSH protocol");
            throw e;
        }
    }

    public String getData(String command) throws JSchException, IOException {
        Channel channel = SESSION.openChannel("exec");
        ((ChannelExec) channel).setCommand(command);
        channel.setInputStream(null);
        ((ChannelExec) channel).setErrStream(System.err);
        ((ChannelExec) channel).setPty(true);
        InputStream in = channel.getInputStream();
        OutputStream out = channel.getOutputStream();
        channel.connect(1000 * 10);
        try {
            Thread.sleep(2000L);
        } catch (Exception localException) {
        }
        String data = "";
        data = getData(channel, in, false);
        out.close();
        in.close();
        channel.disconnect();
        return data;
    }

    private String getData(Channel channel, InputStream in, boolean sleep) throws JSchException, IOException {
        byte[] tmp = new byte[1024];
        StringBuilder data = new StringBuilder();
        int sleepCount = (sleep ? 3 : 1);
        for (; ; ) {
            try {
                Thread.sleep(sleepCount * 1000L);
            } catch (Exception localException) {
            }
            if (in.available() > 0) {
                int i = in.read(tmp, 0, 1024);
                if (i >= 0) {
                    data = data.append(new String(tmp, 0, i));
                    continue;
                }
            } else
                break;
            if (channel.isClosed()) {
                System.out.println(("call exit-status: " + channel.getExitStatus()));
                break;
            }
        }
        return data.toString();
    }

    public void close() throws Exception {
        if (null != SESSION)
            SESSION.disconnect();
    }

    public Session getSession() {
        return SESSION;
    }
}


