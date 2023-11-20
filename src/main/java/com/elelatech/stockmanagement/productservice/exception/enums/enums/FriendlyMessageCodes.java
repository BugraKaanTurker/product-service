package com.elelatech.stockmanagement.productservice.exception.enums.enums;

public enum FriendlyMessageCodes implements IFriendlyMessageCode{
    OK(1000);
    private final int value;

    FriendlyMessageCodes(int value){
        this.value = value;
    }

    @Override
    public int getFriendlyMessageCode() {
        return value;
    }
}
