package it.slyce.messaging.message.messageItem.externalUser.requestinterview;

import android.content.Context;
import android.view.View;

import com.bumptech.glide.Glide;

import it.slyce.messaging.message.RequestInterviewMessage;
import it.slyce.messaging.message.messageItem.MessageViewHolder;
import it.slyce.messaging.message.messageItem.master.requestinterview.MessageRequestInterviewItem;
import it.slyce.messaging.message.messageItem.master.requestinterview.MessageRequestInterviewViewHolder;
import it.slyce.messaging.utils.DateUtils;

/**
 * Created by John C. Hunchar on 5/12/16.
 */
public class MessageExternalUserRequestInterviewItem extends MessageRequestInterviewItem {

    public MessageExternalUserRequestInterviewItem(RequestInterviewMessage requestInterviewMessage, Context context) {
        super(requestInterviewMessage, context);
    }

    @Override
    public void buildMessageItem(
            MessageViewHolder messageViewHolder) {
        super.buildMessageItem(messageViewHolder);

        if (message != null &&  messageViewHolder != null && messageViewHolder instanceof MessageRequestInterviewViewHolder) {
            final MessageRequestInterviewViewHolder messageTextViewHolder = (MessageRequestInterviewViewHolder) messageViewHolder;

            // Get content
            String date = DateUtils.getTimestamp(context, message.getDate());
//            String text = ((RequestInterviewMessage)message).getText();
            this.avatarUrl = message.getAvatarUrl();

            messageTextViewHolder.timestamp.setText(date != null ? date : "");

            //chat profile image
            Glide.with(context).load(avatarUrl).into(messageTextViewHolder.avatar);
            messageTextViewHolder.avatar.setVisibility(View.VISIBLE);

            //last chat time
            messageTextViewHolder.timestamp.setVisibility(isLastConsecutiveMessageFromSource ? View.VISIBLE : View.GONE);
        }
    }
}
