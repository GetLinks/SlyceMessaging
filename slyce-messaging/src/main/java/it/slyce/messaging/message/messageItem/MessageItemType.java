package it.slyce.messaging.message.messageItem;

/**
 * Created by John C. Hunchar on 5/12/16.
 */
public enum MessageItemType {
    INCOMING_MEDIA,
    INCOMING_TEXT,
    OUTGOING_MEDIA,
    OUTGOING_TEXT,
    SPINNER,
    GENERAL_TEXT,
    GENERAL_OPTIONS,
    INCOMING_REQUEST_INTERVIEW,
    OUTGOING_REQUEST_INTERVIEW;

    public static final MessageItemType values[] = values();
}
