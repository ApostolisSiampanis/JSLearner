package eu.tkacas.jslearner.domain.usecase.user

import eu.tkacas.jslearner.domain.repository.AuthRepository
import eu.tkacas.jslearner.domain.model.User
import eu.tkacas.jslearner.domain.Result

class SetUserProfileUseCase(private val authRepository: AuthRepository) {
    suspend fun execute(user: User): Result<Unit> {
        return authRepository.setUserProfile(
            firstName = user.firstName,
            lastName = user.lastName,
            experienceScore = user.experienceScore,
            learningReason = user.learningReason,
            profileCompleted = user.experienceLevel != null && user.learningReason != null,
            experienceLevel = user.experienceLevel,
            lessonsCompleted = user.lessonsCompleted,
            highScoreDaysInARow = user.highScoreDaysInARow,
            highScoreCorrectAnswersInARow = user.highScoreCorrectAnswersInARow
        )
    }
}