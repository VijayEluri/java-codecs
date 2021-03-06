/*
 * Copyright 2010-2013 Robert J. Buck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.buck.common.codec;

/**
 * Unchecked exception thrown when a string that is not a
 * <a href="Codec.html#names">legal codec name</a> is used as such.
 *
 * @author Robert J. Buck
 */
public class UnsupportedCodecException extends IllegalArgumentException {
    /**
     * Serialization version number.
     */
    private static final long serialVersionUID = 3051366477972373710L;

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public UnsupportedCodecException(String message) {
        super(message);
    }
}
