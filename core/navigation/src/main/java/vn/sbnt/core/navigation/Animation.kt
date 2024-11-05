package vn.sbnt.core.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.navigation.NavBackStackEntry

object Animation {
    private val default = 1000

    fun slideToLeft( scope: AnimatedContentTransitionScope<NavBackStackEntry>, timeMillis: Int = default ) : EnterTransition {
        return scope.slideIntoContainer(
            AnimatedContentTransitionScope.SlideDirection.Right,
            animationSpec = tween(timeMillis)
        )
    }

    fun slideToRight( scope: AnimatedContentTransitionScope<NavBackStackEntry> , timeMillis: Int = default ) : EnterTransition {
        return scope.slideIntoContainer(
            AnimatedContentTransitionScope.SlideDirection.Left,
            animationSpec = tween(timeMillis)
        )

    }

    fun slideToBottom(scope: AnimatedContentTransitionScope<NavBackStackEntry>, timeMillis: Int = default  ) : EnterTransition {
        return scope.slideIntoContainer(
            AnimatedContentTransitionScope.SlideDirection.Down,
            animationSpec = tween(timeMillis)
        )
    }

    fun slideToTop(scope: AnimatedContentTransitionScope<NavBackStackEntry>, timeMillis: Int = default  ) : EnterTransition {
        return scope.slideIntoContainer(
            AnimatedContentTransitionScope.SlideDirection.Up,
            animationSpec = tween(timeMillis)
        )
    }

    fun slideOutToLeft( scope: AnimatedContentTransitionScope<NavBackStackEntry> , timeMillis: Int = default ) : ExitTransition {
        return scope.slideOutOfContainer(
            AnimatedContentTransitionScope.SlideDirection.Right,
            animationSpec = tween(timeMillis)
        )
    }

    fun fadeIn(scope: AnimatedContentTransitionScope<NavBackStackEntry>, durationMillis: Int = default): EnterTransition {
        return fadeIn(animationSpec = tween(durationMillis))
    }

    fun fadeOut(scope: AnimatedContentTransitionScope<NavBackStackEntry>, durationMillis: Int = default): ExitTransition {
        return fadeOut(animationSpec = tween(durationMillis))
    }

    fun  scaleIn(scope: AnimatedContentTransitionScope<NavBackStackEntry>, durationMillis: Int = default): EnterTransition {
        return scaleIn(
            animationSpec = tween(durationMillis)
        )
    }

    fun scaleOut(scope: AnimatedContentTransitionScope<NavBackStackEntry>, targetScale: Float = 0.9f, durationMillis: Int = default): ExitTransition {
        return scaleOut(
            targetScale = targetScale, // kết thúc ở 90% kích thước bình thường
            animationSpec = tween(durationMillis)
        )
    }

}