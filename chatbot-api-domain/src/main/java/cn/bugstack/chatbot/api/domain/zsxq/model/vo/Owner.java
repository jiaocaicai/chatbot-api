package cn.bugstack.chatbot.api.domain.zsxq.model.vo;

/**
 * ClassName: Owner
 * Package: cn.bugstack.chatbot.api.domain.zsxq.model.vo
 * Description:
 *
 * @Author 佼佼
 * @Create 2024/6/22 11:52
 * @Version 1.0
 */
public class Owner {

    private String user_id;

    private String name;

    private String avatar_url;

    private String location;

    public void setUser_id(String user_id){
        this.user_id = user_id;
    }
    public String getUser_id(){
        return this.user_id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAvatar_url(String avatar_url){
        this.avatar_url = avatar_url;
    }
    public String getAvatar_url(){
        return this.avatar_url;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }

}