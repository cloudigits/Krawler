package solutions.dreamforge.krawler.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlin.time.Clock

fun currentTimeMillis(): Long = Clock.System.now().toEpochMilliseconds()

expect val IoDispatacher : CoroutineDispatcher

