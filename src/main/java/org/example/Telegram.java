package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Telegram extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage()
                    .setChatId(update.getMessage().getChatId())
                    .setText("El partido de hoy se trata de la final de la Champions League del año 1998 que enfrentaba al Real Madrid contra la Juventus de Turin " +
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Real_Madrid_vs_Juventus_1998-05-20.svg/300px-Real_Madrid_vs_Juventus_1998-05-20.svg.png")
                    .setChatId(update.getMessage().getChatId());
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        }

        @Override
        public String getBotUsername(){
            return "Football_Match_Bot";
        }

        @Override
        public String getBotToken () {
            return "806162198:AAHPR8u0aAoaVzki0oVMz4UtgTgzu5lL8us";
        }
    }

