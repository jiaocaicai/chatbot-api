package cn.bugstack.chatbot.api.domain.zsxq;

import cn.bugstack.chatbot.api.domain.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;

import java.io.IOException;

/**
 * ClassName: IZsxqApi
 * Package: cn.bugstack.chatbot.api.domain.zsxq
 * Description:
 *
 * @Author 佼佼
 * @Create 2024/6/22 11:35
 * @Version 1.0
 */
public interface IZsxqApi {
    //根据groupId和cookie返回未回答的信息
    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionsTopicId(String groupId, String cookie) throws IOException;

    //topicId是这个组下的哪个问题，text是回答的信息，silenced指回答是否大家都可见
    boolean answer(String groupId, String cookie, String topicId, String text, boolean silenced) throws IOException;

}
