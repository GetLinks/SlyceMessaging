package it.slyce.messaging.message.messageItem.internalUser.requestinterview;

import android.content.Context;
import android.view.View;

import com.bumptech.glide.Glide;

import it.slyce.messaging.message.RequestInterviewMessage;
import it.slyce.messaging.message.TextMessage;
import it.slyce.messaging.message.messageItem.MessageViewHolder;
import it.slyce.messaging.message.messageItem.master.requestinterview.MessageRequestInterviewItem;
import it.slyce.messaging.message.messageItem.master.requestinterview.MessageRequestInterviewViewHolder;
import it.slyce.messaging.message.messageItem.master.text.MessageTextItem;
import it.slyce.messaging.utils.DateUtils;

/**
 * Created by John C. Hunchar on 5/12/16.
 */
public class MessageInternalUserRequestInterviewItem extends MessageRequestInterviewItem {

    public MessageInternalUserRequestInterviewItem(RequestInterviewMessage requestInterviewMessage, Context context) {
        super(requestInterviewMessage, context);
    }

    @Override
    public void buildMessageItem(
            MessageViewHolder messageViewHolder) {

        if (message != null &&  messageViewHolder != null && messageViewHolder instanceof MessageRequestInterviewViewHolder) {
            final MessageRequestInterviewViewHolder messageTextViewHolder = (MessageRequestInterviewViewHolder) messageViewHolder;

            // Get content
            String date = DateUtils.getTimestamp(context, message.getDate());
//            String text = ((RequestInterviewMessage)message).getText();
            this.avatarUrl = message.getAvatarUrl();
            this.initials = message.getInitials();
//
//            // Populate views with content
//            messageTextViewHolder.initials.setText(initials  != null ? initials : "");
//            messageTextViewHolder.text.setText(text != null ? text : "");
            messageTextViewHolder.timestamp.setText(date != null ? date : "");
//
//            messageTextViewHolder.bubble.setOnLongClickListener(new View.OnLongClickListener() {
//                @Override
//                public boolean onLongClick(View view) {
//                    ClipboardManager clipboard = (ClipboardManager)
//                    context.getSystemService(Context.CLIPBOARD_SERVICE);
//                    ClipData clip = ClipData.newPlainText("simple text", ((TextMessage)MessageRequestInterviewItem.this.message).getText());
//                    clipboard.setPrimaryClip(clip);
//                    Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
//                    v.vibrate(150);
//                    String toastMessage = (String) context.getText(R.string.message_text_copied);
//                    Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
//                    return false;
//                }
//            });
//
//            messageViewHolder.avatar.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (messageTextViewHolder.customSettings.userClicksAvatarPictureListener != null)
//                        messageTextViewHolder.customSettings.userClicksAvatarPictureListener.userClicksAvatarPhoto(message.getUserId());
//                }
//            });
//

            //chat profile image
            Glide.with(context).load(avatarUrl).into(messageTextViewHolder.avatar);
            messageTextViewHolder.avatar.setVisibility(View.VISIBLE);

            //last chat time
            messageTextViewHolder.timestamp.setVisibility(View.VISIBLE);
        }
    }
}
