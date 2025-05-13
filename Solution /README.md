# 📢 Assignment Solution: NotificationBuilder

## 🧠 Objective

This assignment demonstrated how to construct rich notification messages using:

- `StringBuilder` → for efficient single-threaded operations
- `StringBuffer` → for thread-safe message building
- `String` methods → for clean formatting and composition

---

## ✅ What We Built

| Method                             | Purpose                              | Thread Safety |
|------------------------------------|--------------------------------------|---------------|
| `buildNotificationSingleThreaded`  | Fast message creation with timestamp | ❌ No          |
| `buildNotificationThreadSafe`      | Safe string building in multithreaded environments | ✅ Yes         |

---

## 📄 Method Summary

### `buildNotificationSingleThreaded(String recipient, String event)`

✔ Uses `StringBuilder`  
✔ Appends greeting, event details, and a formatted timestamp  
✔ Efficient for backend services where no thread safety is required

```text
Hi Sarah, your login was successful. Timestamp: 2025-05-13 10:15:22.
````

---

### `buildNotificationThreadSafe(String recipient, String event)`

✔ Uses `StringBuffer`
✔ Ensures safe operations when accessed by multiple threads
✔ Returns a fully formatted message with timestamp

```text
Hello Sarah, this is to inform you that your signup has been completed. Generated at: Tue May 13 2025 10:16:07.
```

---

## 🧪 What You Practiced

* String concatenation with `.append()`
* When to use `StringBuilder` vs `StringBuffer`
* Dynamic content generation using Java's time API
* Building real backend utility logic

---

## 📚 References

* [StringBuilder vs StringBuffer – Baeldung](https://www.baeldung.com/java-string-builder-string-buffer)
* [Java StringBuilder Docs](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html)
* [Java StringBuffer Docs](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuffer.html)

---

✅ Great job applying mutable string handling like a backend pro! Next step: try simulating both methods inside a multi-threaded environment for bonus practice!


