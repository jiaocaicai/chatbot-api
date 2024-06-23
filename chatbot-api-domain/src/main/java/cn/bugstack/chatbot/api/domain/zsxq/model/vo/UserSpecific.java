package cn.bugstack.chatbot.api.domain.zsxq.model.vo;

/**
 * ClassName: UserSpecific
 * Package: cn.bugstack.chatbot.api.domain.zsxq.model.vo
 * Description:
 *
 * @Author 佼佼
 * @Create 2024/6/22 11:54
 * @Version 1.0
 */
public class UserSpecific {

    private boolean liked;

    private boolean subscribed;

    public void setLiked(boolean liked){
        this.liked = liked;
    }
    public boolean getLiked(){
        return this.liked;
    }
    public void setSubscribed(boolean subscribed){
        this.subscribed = subscribed;
    }
    public boolean getSubscribed(){
        return this.subscribed;
    }

}
