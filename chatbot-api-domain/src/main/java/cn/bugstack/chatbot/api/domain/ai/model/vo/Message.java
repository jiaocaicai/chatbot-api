package cn.bugstack.chatbot.api.domain.ai.model.vo;

/**
 * ClassName: Message
 * Package: cn.bugstack.chatbot.api.domain.ai.model.vo
 * Description:
 *
 * @Author 佼佼
 * @Create 2024/6/23 15:10
 * @Version 1.0
 */
public class Message
{
    private String content;

    private String role;

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }
}
