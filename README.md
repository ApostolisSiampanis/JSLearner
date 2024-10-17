# Educational Software (2024) - JSLearner Android App

## Project Overview

The **JSLearner Mobile App** is a team assignment for creating an educational platform designed for the "Educational Software" course, offered in the 8th semester of the 2023-2024 academic year at the University of Piraeus, Department of Informatics. The app is an educational platform aimed at teaching JavaScript programming through a dynamic, interactive, and adaptive user interface. Developed using Kotlin and Jetpack Compose for Android, the app offers lessons, quizzes, and progress tracking to enhance learning for users at different skill levels. It supports beginners, intermediate learners, and advanced users by providing personalized content based on individual performance and progress.

In order for the app to function correctly, it requires the [JSLearner Backend](https://github.com/thkox/JSLearner-backend), which manages user data, processes experience scores, and maintains leaderboards in real-time.

## Course Information

- **Institution:** University of Piraeus
- **Department:** Department of Informatics
- **Course:** Educational Software (2024)
- **Semester:** 8th

## Technologies Used

- Kotlin
- Jetpack Compose
- Firebase Authentication
- Firebase Realtime Database
- Firestore

## App Features

### 1. Learning Modules and Difficulty Levels

The app offers three levels of learning:

- **Beginner:** Covers the basics of JavaScript, such as syntax, variables, and functions.
- **Intermediate:** Focuses on more complex topics like data manipulation, arrays, and loops.
- **Advanced:** Includes advanced JavaScript concepts like asynchronous programming and event handling.

Each module includes lessons, examples, and interactive exercises to help users reinforce their learning.

### 2. Quizzes and Self-Assessment

- **Multiple Question Types:** Quizzes feature a variety of question types, including multiple-choice, true/false, and fill-in-the-blank.
- **Instant Feedback:** Users receive immediate feedback on their answers, promoting better learning outcomes.
- **Roadmap Overview:** Users can track completed lessons and visualize their progress with a roadmap.

### 3. Progress Tracking and Leaderboard

- **Experience Points (XP):** The app tracks user progress with an XP system, where users earn or lose points based on quiz performance.
- **Leaderboard:** A global leaderboard ranks users based on their total XP, allowing for real-time competition.
- **Roadmap Overview:** The learning path and completed lessons can be visualized on a roadmap.

## Setup Instructions

1. Clone the repository:
    ```bash
    git clone https://github.com/thkox/JSLearner.git
    ```

2. Open the project in Android Studio.
3. Configure Firebase by adding the necessary credentials (Firebase configuration JSON).
4. Build and run the app on an Android device or emulator.

## Documentation and Resources

- Full project details can be found in the [Project-documentation.pdf](./docs/Project-documentation.pdf).
- A detailed walkthrough video is available: [Project-video.mp4](./video/Project-video.mp4).

## Screenshots

<table>
  <tr>
    <td align="center">
      <img src="./images/Roadmap.png" alt="Roadmap"/>
      <br/>
      <sub><b>Roadmap</b></sub>
    </td>
    <td align="center">
      <img src="./images/FillinTheBlanks.png" alt="FillinTheBlanks"/>
      <br/>
      <sub><b>Question Example</b></sub>
    </td>
    <td align="center">
      <img src="./images/LeaderboardScreen.png" alt="Leaderboard"/>
      <br/>
      <sub><b>Leaderboard</b></sub>
    </td>
  </tr>
</table>

## Contributors

<table>
  <tr>
    <td align="center"><a href="https://github.com/ApostolisSiampanis"><img src="https://avatars.githubusercontent.com/u/75365398?v=4" width="100px;" alt="Apostolis Siampanis"/><br /><sub><b>Apostolis Siampanis</b></sub></a><br /></td>
    <td align="center"><a href="https://github.com/thkox"><img src="https://avatars.githubusercontent.com/u/79880468?v=4" width="100px;" alt="Theodore Koxanoglou"/><br /><sub><b>Theodore Koxanoglou</b></sub></a><br /></td>
    <td align="center"><a href="https://github.com/AlexanderCholis"><img src="https://avatars.githubusercontent.com/u/66769337?v=4" width="100px;" alt="Alexander Cholis"/><br /><sub><b>Alexander Cholis</b></sub></a><br /></td>
  </tr>
</table>

## License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.
