/*
 * Copyright 2022 u004
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.u004.steamid.exceptions;

/**
 * An invalid Steam invite code state exception.
 *
 * <p>Describes that the Steam invite code is invalid.
 * <b>Stands for illegal state usage.</b>
 *
 * @since 0.1.0
 */
public final class InvalidSteamInviteCodeStateException extends IllegalStateException {

	/**
	 * Initialize an {@code InvalidSteamInviteCodeException} instance.
	 *
	 * <p>Default exception message: "Steam invite code has an invalid state".
	 */
	public InvalidSteamInviteCodeStateException() {
		super("Steam invite code has an invalid state");
	}
}
