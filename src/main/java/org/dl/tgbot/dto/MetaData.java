package org.dl.tgbot.dto;

import org.telegram.telegrambots.meta.api.objects.Message;

public class MetaData implements Component {
    public static Long userId;

    public MetaData(Message message) {
        this.userId = message.getFrom().getId();
    }

    public MetaData(MetaData metaData) {
        this.userId = metaData.userId;
    }

    public Long getUserId() {
        return userId;
    }
}
