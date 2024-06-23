package cn.bugstack.chatbot.api.domain.ai;

import java.io.IOException;

/**
 * ClassName: IOpenAI
 * Package: cn.bugstack.chatbot.api.domain.ai
 * Description:
 *
 * @Author 佼佼
 * @Create 2024/6/23 11:25
 * @Version 1.0
 */
public interface IOpenAI {
    String doChatGPT(String question) throws IOException;
}
