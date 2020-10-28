package com.websocket.mywebsocket.domain;

import java.io.Serializable;

public class MailBean implements Serializable {
    private static final long serialVersionUID = -2116367492649751914L;
    private String recipient;//邮件接收人
    private String subject; //邮件主题
    private String content; //邮件内容
    private String enclosurePath; // 附件路径
    // 省略setget方法

    public String getEnclosurePath() {
        return enclosurePath;
    }

    public void setEnclosurePath(String enclosurePath) {
        this.enclosurePath = enclosurePath;
    }

    public MailBean() {
    }

    public MailBean(String recipient, String subject, String content, String enclosurePath) {
        this.recipient = recipient;
        this.subject = subject;
        this.content = content;
        this.enclosurePath = enclosurePath;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
