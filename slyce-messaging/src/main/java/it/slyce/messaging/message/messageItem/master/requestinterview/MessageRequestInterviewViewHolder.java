package it.slyce.messaging.message.messageItem.master.requestinterview;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import it.slyce.messaging.message.messageItem.MessageViewHolder;
import it.slyce.messaging.utils.CustomSettings;

/**
 * Created by matthewpage on 6/27/16.
 */
public abstract class MessageRequestInterviewViewHolder extends MessageViewHolder {
    public TextView text;
    public FrameLayout bubble;

    public MessageRequestInterviewViewHolder(View itemView, CustomSettings customSettings) {
        super(itemView, customSettings);
    }
}