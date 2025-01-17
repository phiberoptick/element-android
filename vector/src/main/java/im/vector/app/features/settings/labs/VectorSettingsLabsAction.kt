/*
 * Copyright 2022-2024 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package im.vector.app.features.settings.labs

import im.vector.app.core.platform.VectorViewModelAction

sealed class VectorSettingsLabsAction : VectorViewModelAction {
    object UpdateClientInfo : VectorSettingsLabsAction()
    object DeleteRecordedClientInfo : VectorSettingsLabsAction()
}