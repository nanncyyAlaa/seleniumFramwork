---

# Selenium Automation Framework

A **Java-based Selenium framework** providing reusable utilities for browser automation, waits, element interactions, navigation, alerts, and drag & drop. Designed for **clean, maintainable, and scalable test automation**.

---

## Project Structure

```
src/main/java/utiles
├── DriverManager.java   # Browser setup & teardown
├── waitUtils.java       # Explicit & fluent waits
├── ElementUtils.java    # Element actions, dropdowns, checkboxes, drag & drop
└── BrowserUtils.java    # Navigation, alerts, windows handling
App.java             # Example usage
```

---

## Features

* **Browser Control**: Open, maximize, navigate, back, forward, refresh, close.
* **Waits**: Implicit, explicit, and fluent waits for stable automation.
* **Element Actions**: Click, sendKeys, hover, right-click, drag & drop.
* **Dropdowns, Checkbox, Radio**: Select by text, value, or index; check/uncheck safely.
* **Alerts & Windows**: Handle pop-ups, switch windows by title or handle.
* **Reusable & Extensible**: Easy to add new utilities and tests.

---

