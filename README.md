# LingoSnacks App – Phase 2

A language learning app designed to support both teachers and students. In this phase, we enhanced a template app with cloud-based data storage, offline functionality, media syncing, and user authentication.

## 🚀 Features

### 🔹 Cloud Firestore Integration
- Designed and implemented Firestore schema to manage learning packages and activities.
- Repository methods interact with Firestore using optimized queries.
- Support for real-time updates and server-side filtering.

### 🔹 Firebase Cloud Storage
- Media files (images, videos) can be uploaded when creating/editing packages.
- Deleted packages automatically remove associated media files from storage.

### 🔹 Local SQLite Storage (Offline Mode)
- Download learning packages and media files for offline use.
- Uses Room with Type Converters to store complex data structures.
- Automatically syncs with newer online versions if detected.

### 🔹 User Authentication
- Signup and login using Firebase Authentication.
- Stores user profiles in a Firestore `users` collection.

### 🔹 Offline Score Sync
- Supports offline gameplay.
- Scores are saved locally and synced to Firestore when internet is restored.

## 📦 Getting Started

> Make sure Firebase is properly configured with your app.

1. Clone the repo
2. Connect Firebase project and enable Firestore, Storage, and Authentication.
3. Run the app on an emulator or physical Android device.