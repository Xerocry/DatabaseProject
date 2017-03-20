package com.xerocry.service;

@FunctionalInterface
public interface TryRunnable {
    void run() throws Throwable;
}