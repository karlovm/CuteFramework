package ru.etysoft.cuteframework.methods.chat;

public class Chat {
  private int id;
  
  private String type;
  
  private String name;
  
  private String description;
  
  private String state;
  
  private String avatar;
  
  private int membersCount;
  
  public Chat(String name, int id, String type, String description, String state, String avatar, int membersCount) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.description = description;
    this.state = state;
    this.avatar = avatar;
    this.membersCount = membersCount;
  }
  
  public int getMembersCount() {
    return this.membersCount;
  }
  
  public String getAvatar() {
    return this.avatar;
  }
  
  public String getType() {
    return this.type;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getState() {
    return this.state;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public int getId() {
    return this.id;
  }
  
  public static class Types {
    public static final String THREAD = "T";
    
    public static final String CONVERSATION = "C";
    
    public static final String PRIVATE = "P";
  }
  
  public static class STATES {
    public static final String JOINED = "Y";
    
    public static final String LEAVED = "N";
    
    public static final String BLOCKED = "B";
  }
}
