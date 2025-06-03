```markdown
🎁 Voucher Reward APK

A simple Java-based app that rewards users with a 200 voucher every hour!

🌟 Features
- 1-hour cooldown per reward
- Terminal-based testing (Termux or PC)
- No login or database needed
- Designed to be built into an APK later

🛠 How to Run
```bash
javac -d . app/src/utils/TimerUtils.java app/src/Main.java
java app.Main
```

📦 Future Plans
- Build Android APK version
- Add AdMob integration
- Firebase backend support (optional)
```

---

*STEP 5: Run the Java App in Termux*

In Termux, go to your repo folder and run:

```bash
pkg install openjdk -y
javac -d . app/src/utils/TimerUtils.java app/src/Main.java
java app.Main
```

Let me know once it's working, then we’ll prepare the Android version.
