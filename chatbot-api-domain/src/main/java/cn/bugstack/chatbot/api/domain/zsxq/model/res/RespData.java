package cn.bugstack.chatbot.api.domain.zsxq.model.res;

import cn.bugstack.chatbot.api.domain.zsxq.model.vo.Topics;

import java.util.List;

/**
 * ClassName: RespData
 * Package: cn.bugstack.chatbot.api.domain.zsxq.model.res
 * Description:
 *
 * @Author 佼佼
 * @Create 2024/6/22 18:59
 * @Version 1.0
 */
public class RespData {

    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

}
