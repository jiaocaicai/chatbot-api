package cn.bugstack.chatbot.api.domain.zsxq.model.aggregates;

import cn.bugstack.chatbot.api.domain.zsxq.model.res.RespData;

/**
 * ClassName: UnAnsweredQuestionsAggregates
 * Package: cn.bugstack.chatbot.api.domain.zsxq.model.aggregates
 * Description:
 * 未回答问题的聚合信息
 * @Author 佼佼
 * @Create 2024/6/22 19:01
 * @Version 1.0
 */
public class UnAnsweredQuestionsAggregates {

    private boolean succeeded;
    private RespData resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }

}