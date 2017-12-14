package com.moez.QKSMS.presentation.main

import com.moez.QKSMS.presentation.common.base.QkView
import io.reactivex.Observable
import io.reactivex.subjects.Subject

interface MainView : QkView<MainState> {

    val composeIntent: Observable<Unit>
    val drawerOpenIntent: Observable<Boolean>
    val inboxIntent: Observable<Unit>
    val archivedIntent: Observable<Unit>
    val scheduledIntent: Observable<Unit>
    val blockedIntent: Observable<Unit>
    val settingsIntent: Observable<Unit>
    val deleteConversationIntent: Subject<Long>
    val archiveConversationIntent: Observable<Long>

}