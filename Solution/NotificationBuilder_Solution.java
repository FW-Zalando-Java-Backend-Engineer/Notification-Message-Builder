package com.example.assignments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ✅ Official Solution: NotificationBuilder Assignment
 *
 * Demonstrates how to build formatted notification strings using:
 * - StringBuilder for efficient single-threaded string manipulation
 * - StringBuffer for thread-safe operations
 */
public class NotificationBuilder {

    /**
     * ✅ Builds a notification message using StringBuilder.
     *
     * <p>This method uses StringBuilder to efficiently construct a message for a user
     * regarding a completed event. It is designed for single-threaded environments.</p>
     *
     * @param recipient the name of the user receiving the message
     * @param event     the event type (e.g., "payment", "login")
     * @return formatted notification string with timestamp
     */
    public static String buildNotificationSingleThreaded(String recipient, String event) {
        // Step 1: Create a StringBuilder instance
        StringBuilder sb = new StringBuilder();

        // Step 2: Append greeting and event
        sb.append("Hi ").append(recipient).append(", ");
        sb.append("your ").append(event).append(" was successful. ");

        // Step 3: Append formatted timestamp
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        sb.append("Timestamp: ").append(timestamp).append(".");

        // Step 4: Return final string
        return sb.toString();
    }

    /**
     * ✅ Builds a thread-safe notification message using StringBuffer.
     *
     * <p>This method constructs a formatted message using StringBuffer, ideal for
     * use in multi-threaded contexts where safety is required.</p>
     *
     * @param recipient the name of the user receiving the message
     * @param event     the event type (e.g., "password reset", "signup")
     * @return formatted, thread-safe notification string
     */
    public static String buildNotificationThreadSafe(String recipient, String event) {
        // Step 1: Create a StringBuffer instance
        StringBuffer sb = new StringBuffer();

        // Step 2: Append greeting and event message
        sb.append("Hello ").append(recipient).append(", ");
        sb.append("this is to inform you that your ").append(event).append(" has been completed. ");

        // Step 3: Append formatted timestamp
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEE MMM dd yyyy HH:mm:ss"));
        sb.append("Generated at: ").append(timestamp).append(".");

        // Step 4: Return final string
        return sb.toString();
    }
}