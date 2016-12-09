package it.slyce.messaging.message;

import android.content.Context;

import it.slyce.messaging.message.messageItem.MessageItem;
import it.slyce.messaging.message.messageItem.MessageRequestInterviewItemType;
import it.slyce.messaging.message.messageItem.externalUser.text.MessageExternalUserTextItem;
import it.slyce.messaging.message.messageItem.internalUser.text.MessageInternalUserTextItem;
import it.slyce.messaging.message.messageItem.master.requestinterview.MessageRequestInterviewItem;

/**
 * Created by jirapong on 12/9/16.
 */

public class RequestInterviewMessage extends Message {

    private MessageRequestInterviewItemType requestInterviewStatus;

    public MessageRequestInterviewItemType getRequestInterviewStatus() {
        return requestInterviewStatus;
    }

    public void setRequestInterviewStatus(MessageRequestInterviewItemType requestInterviewStatus) {
        this.requestInterviewStatus = requestInterviewStatus;
    }

    @Override
    public MessageItem toMessageItem(Context context) {
        if (this.source == MessageSource.EXTERNAL_USER){
            return new MessageRequestInterviewItem(this, context);
        } else {
            return new MessageRequestInterviewItem(this, context);
        }
    }
}
