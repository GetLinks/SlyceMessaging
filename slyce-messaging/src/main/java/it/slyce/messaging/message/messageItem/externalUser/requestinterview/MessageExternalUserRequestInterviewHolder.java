package it.slyce.messaging.message.messageItem.externalUser.requestinterview;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import it.slyce.messaging.R;
import it.slyce.messaging.message.messageItem.master.requestinterview.MessageRequestInterviewViewHolder;
import it.slyce.messaging.utils.CustomSettings;

/**
 * Created by John C. Hunchar on 5/12/16.
 */
public class MessageExternalUserRequestInterviewHolder extends MessageRequestInterviewViewHolder {

    public MessageExternalUserRequestInterviewHolder(View itemView, CustomSettings customSettings) {
        super(itemView, customSettings);

        avatar = (ImageView) itemView.findViewById(R.id.message_scout_text_image_view_avatar);
        initials = (TextView) itemView.findViewById(R.id.message_scout_text_text_view_initials);
        text = (TextView) itemView.findViewById(R.id.message_scout_text_text_view_text);
        timeslot = (TextView) itemView.findViewById(R.id.message_scout_text_time_slot);
        timestamp = (TextView) itemView.findViewById(R.id.message_scout_text_text_view_timestamp);
        avatarContainer = (ViewGroup) itemView.findViewById(R.id.message_scout_text_image_view_avatar_group);
        bubble = (RelativeLayout) itemView.findViewById(R.id.message_scout_text_view_group_bubble);

        Drawable drawable = ContextCompat.getDrawable(itemView.getContext(), R.drawable.shape_rounded_rectangle_white);
        // Drawable drawable = itemView.getContext().getDrawable();
        drawable.setColorFilter(customSettings.externalRequestInterviewBackgroundColor, PorterDuff.Mode.SRC_ATOP);
        bubble.setBackground(drawable);
        text.setTextColor(customSettings.externalRequestInterviewTextColor);
        timeslot.setTextColor(customSettings.externalRequestInterviewTextColor);
        timestamp.setTextColor(customSettings.timestampColor);
    }
}
