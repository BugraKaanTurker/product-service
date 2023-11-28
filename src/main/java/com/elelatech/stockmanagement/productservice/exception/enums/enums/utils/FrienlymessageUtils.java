package com.elelatech.stockmanagement.productservice.exception.enums.enums.utils;

import com.elelatech.stockmanagement.productservice.enums.Language;
import com.elelatech.stockmanagement.productservice.exception.enums.enums.IFriendlyMessageCode;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

@Slf4j
@UtilityClass
public class FrienlymessageUtils {

    private static final String RESOURCE_BUNDLE_NAME = "FriendlyMessage";
    private static final String SPECIAL_CHARACTER = "__";
    private static  String getFriendlyMessage(Language language, IFriendlyMessageCode messageCode){
        String messageKey = null;
        try {
            Locale locale = new Locale(language.name());
            ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, locale);
            messageKey = messageCode.getClass().getSimpleName() + SPECIAL_CHARACTER + messageCode;
            return resourceBundle.getString(messageKey);
        } catch (MissingResourceException missingResourceException){
            log.error("Friendly message not found for key: {}",messageKey);
            return null;
        }
    }

}
