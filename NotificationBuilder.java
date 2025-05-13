package com.example.assignments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 🧪 NotificationBuilder Assignment
 *
 * In real-world systems like notifications, we often need to build dynamic, formatted messages.
 * You'll use StringBuilder and StringBuffer to do that efficiently.
 */
public class NotificationBuilder {

    /**
     * ✅ Task 1: Build a notification using StringBuilder (not thread-safe, but fast).
     *
     * @param recipient the name of the user receiving the message
     * @param event     the type of event (e.g., "payment", "login", etc.)
     * @return formatted notification string
     */
    public static String buildNotificationSingleThreaded(String recipient, String event) {
        // TODO: Create a new StringBuilder instance

        // TODO: Append "Hi <recipient>, " to the builder

        // TODO: Append "your <event> was successful. "

        // TODO: Generate current date and time as a formatted string

        // TODO: Append "Timestamp: <datetime>. "

        // TODO: Return the final string from the builder
        return null;
    }

    /**
     * ✅ Task 2: Build a thread-safe notification using StringBuffer.
     *
     * @param recipient the name of the user receiving the message
     * @param event     the type of event (e.g., "password reset", "signup", etc.)
     * @return formatted notification string
     */
    public static String buildNotificationThreadSafe(String recipient, String event) {
        // TODO: Create a new StringBuffer instance

        // TODO: Append "Hello <recipient>, " to the buffer

        // TODO: Append "this is to inform you that your <event> has been completed. "

        // TODO: Generate a timestamp string in a readable format

        // TODO: Append "Generated at: <timestamp>. "

        // TODO: Return the final string from the buffer
        return null;
    }
}