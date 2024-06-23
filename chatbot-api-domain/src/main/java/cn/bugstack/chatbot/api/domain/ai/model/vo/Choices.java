package cn.bugstack.chatbot.api.domain.ai.model.vo;

/**
 * ClassName: Choices
 * Package: cn.bugstack.chatbot.api.domain.ai.model.vo
 * Description:
 *
 * @Author 佼佼
 * @Create 2024/6/23 11:26
 * @Version 1.0
 */
public class Choices {
    private String finish_reason;

    private int index;

    private Message message;

    public void setFinish_reason(String finish_reason){
        this.finish_reason = finish_reason;
    }
    public String getFinish_reason(){
        return this.finish_reason;
    }
    public void setIndex(int index){
        this.index = index;
    }
    public int getIndex(){
        return this.index;
    }
    public void setMessage(Message message){
        this.message = message;
    }
    public Message getMessage(){
        return this.message;
    }
}
