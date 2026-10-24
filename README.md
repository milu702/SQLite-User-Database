
# SQLite User Database Android Application

## Description
This Android application uses Java, XML, and SQLiteOpenHelper to store user names in a local SQLite database and display all saved names.

## Features
- Add a user name to the SQLite database.
- Display all saved names.
- Validate empty name input.
- Show messages for successful or failed insertion.
- Display a message when no names are saved.

## Technologies Used
- Java
- XML
- SQLite
- SQLiteOpenHelper
- Android SDK
- Gradle

## Project Structure
```text
SQLite-User-Database/
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/example/database/
│       │   ├── MainActivity.java
│       │   └── DatabaseHelper.java
│       └── res/layout/
│           └── activity_main.xml
├── build.gradle
└── settings.gradle
```

## How It Works
1. Enter a name in the input field.
2. Press **Add Name** to save the name.
3. Press **Display All Names** to view the saved names.
4. If the input is empty, the application displays a validation message.

## Database
- Database name: `UserDB`
- Table name: `Users`
- Columns: `id`, `uname`

## Testing Status
The source code has been added to this repository. The application still needs to be built and tested in Android Studio.
