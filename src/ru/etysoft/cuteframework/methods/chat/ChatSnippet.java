package ru.etysoft.cuteframework.methods.chat;

public class ChatSnippet {
    private int id;
    private int accountId;
    private int lastMessageSenderId;
    private String type;
    private String name;
    private String description;
    private String selfStatus;
    private String lastMessageText;
    private String lastMessageSenderDisplayName;
    private String lastMessageTime;
    private boolean isRead;
    private String messageType;
    private String avatarPath;
    private ServiceData serviceData;

    public ChatSnippet(int id, int accountId, String type, String name, String description, String selfStatus,
                       String lastMessageText, String lastMessageSenderDisplayName, String lastMessageTime, boolean isRead, String messageType, ServiceData serviceData,
                       int lastMessageSenderId, String avatarPath) {
        this.id = id;
        this.accountId = accountId;
        this.type = type;
        this.name = name;
        this.description = description;
        this.selfStatus = selfStatus;
        this.lastMessageText = lastMessageText;
        this.lastMessageSenderDisplayName = lastMessageSenderDisplayName;
        this.lastMessageTime = lastMessageTime;
        this.isRead = isRead;
        this.messageType = messageType;
        this.serviceData = serviceData;
        this.lastMessageSenderId = lastMessageSenderId;
        this.avatarPath = avatarPath;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public int getLastMessageSenderId() {
        return lastMessageSenderId;
    }

    public String getLastMessageText() {
        return lastMessageText;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getLastMessageSenderDisplayName() {
        return lastMessageSenderDisplayName;
    }

    public String getLastMessageTime() {
        return lastMessageTime;
    }

    public boolean isRead() {
        return isRead;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSelfStatus() {
        return selfStatus;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public ServiceData getServiceData() {
        return serviceData;
    }


    public static class Types
    {
        public static final String THREAD = "T";
        public static final String CONVERSATION = "C";
        public static final String PRIVATE = "P";
    }

    public static class Status
    {
        public static final String JOINED = "Y";
        public static final String LEAVED = "N";
        public static final String BLOCKED = "B";
    }
}
