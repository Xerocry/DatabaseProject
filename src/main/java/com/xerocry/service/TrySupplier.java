package com.xerocry.service;

@FunctionalInterface
public interface TrySupplier<T> {
    T tryGet() throws Throwable;
}