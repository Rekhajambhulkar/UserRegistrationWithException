package com.junituserregistration;

@FunctionalInterface
public interface IUser {
boolean validation(String input, String regex);
}

